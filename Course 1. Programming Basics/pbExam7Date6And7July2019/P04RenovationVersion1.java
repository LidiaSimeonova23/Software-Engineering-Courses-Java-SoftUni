package pbExam7Date6And7July2019;

import java.util.Scanner;

public class P04RenovationVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heightOfWall = Integer.parseInt(scanner.nextLine());     //Височина на стената - цяло число [0… 100]
        int widthOfWall = Integer.parseInt(scanner.nextLine());        //Ширина на стената - цяло число [0… 100]
        int percentageOfAreaThatWillNotBePainted = Integer.parseInt(scanner.nextLine());    //Процент от общата площ на стените, който няма да бъде боядисан - цяло число [5… 95]

        //намираме площта на 1 стена
        int areaOf1Wall = heightOfWall * widthOfWall;

        //Холът на Пешо има 4 стени с еднакви размери - >
        int areaOfAll4Walls = 4 * areaOf1Wall;

        //определен процент от площта на четирите стени се заема от прозорци и врати, които няма да бъдат боядисвани ->
        int areaThatWillNotBePainted = areaOfAll4Walls * percentageOfAreaThatWillNotBePainted / 100;        //намираме площта, която няма да се боядисва (тази на прозорците и вратите)

        //намираме общата площ (на четирите стени), която трябва да бъде боядисана
        int areaThatHasToBePainted = areaOfAll4Walls - areaThatWillNotBePainted;

        //На следващите редове - до получаване на командата "Tired!" или докато не бъдат боядисани всички стени, се чете по едно число:
        String input = scanner.nextLine();
        while (!input.equals("Tired!")) {
            int currentLitresOfPaint = Integer.parseInt(input);    //Литри боя – цяло число [0…100]:

            //с един литър боя се боядисва един квадратен метър от стената -> намираме площта, която за момента остава да бъде боядисана:
            if (currentLitresOfPaint <= areaThatHasToBePainted) {
                areaThatHasToBePainted -= currentLitresOfPaint;        //areaThatHasToBePainted = areaThatHasToBePainted - currentLitresOfPaint;
                if (areaThatHasToBePainted == 0) {      //проверка - ако не е останала площ за боядисване
                    System.out.println("All walls are painted! Great job, Pesho!");
                    return;    //прекъсваме цялата програма
                }
            } else {      //else if (currentLitresOfPaint > areaThatHasToBePainted)
                int remainingLitresOfPaint = currentLitresOfPaint - areaThatHasToBePainted;
                System.out.printf("All walls are painted and you have %d l paint left!", remainingLitresOfPaint);
                return;      //прекъсваме цялата програма
            }


            input = scanner.nextLine();     //update
        }


        //ако компилаторът не е срещнал оператор return, значи все някога се е стигнало до прочитане на входни данни "Tired!"
        System.out.printf("%d quadratic m left.", areaThatHasToBePainted);
    }
}
