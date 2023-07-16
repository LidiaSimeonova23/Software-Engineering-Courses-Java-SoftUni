package pbExam7Date6And7July2019;

import java.util.Scanner;

public class P04RenovationVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heightOfWall = Integer.parseInt(scanner.nextLine());      //Височина на стената - цяло число [0… 100]
        int widthOfWall = Integer.parseInt(scanner.nextLine());        //Ширина на стената - цяло число [0… 100]
        int percentageOfAreaThatWillNotBePainted = Integer.parseInt(scanner.nextLine());        //Процент от общата площ на стените, който няма да бъде боядисан - цяло число [5… 95]

        //Холът на Пешо има 4 стени с еднакви размери - >
        double areaOfAll4Walls = heightOfWall * widthOfWall * 4;

        //Намираме площта за боядисване:
        double areaThatHasToBePainted = areaOfAll4Walls * (1 - percentageOfAreaThatWillNotBePainted / 100.0);
        //Площта за боядисване да бъде закръглена нагоре до най-близкото цяло число.
        areaThatHasToBePainted = Math.ceil(areaThatHasToBePainted);

        String input = scanner.nextLine();
        while (!input.equals("Tired!")) {
            int currentLitresOfPaint = Integer.parseInt(input);

            //площта за боядисване намалява  ->
            areaThatHasToBePainted -= currentLitresOfPaint;     //areaThatHasToBePainted = areaThatHasToBePainted - currentLitresOfPaint;

            //ако не остане площ за боядисване:
            if (areaThatHasToBePainted <= 0) {
                break;    //прекъсваме цикъла само
            }

            input = scanner.nextLine();        //update
        }

        if (areaThatHasToBePainted == 0) {           //ако не остане площ за боядисване и нако не остане от боята
            System.out.println("All walls are painted! Great job, Pesho!");
        } else if (areaThatHasToBePainted > 0) {         //или ако остане площ за боядисване - когато входните данни са били "Tired!"
            System.out.printf("%.0f quadratic m left.", areaThatHasToBePainted);
        } else {     //във всички останали случаи - ако не остане площ за боядисване, но остане от боята
            System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(areaThatHasToBePainted));
        }

    }
}
