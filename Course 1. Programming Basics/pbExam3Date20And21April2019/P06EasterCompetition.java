package pbExam3Date20And21April2019;

import java.util.Scanner;

public class P06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEasterLoavesOfBread = Integer.parseInt(scanner.nextLine());      //броят на козунаците – цяло число в интервала [1… 100]

        //за всеки козунак се прочита име и оценки ->  знаем колко ще са итерациите (колкото са козунаците)  -> имаме for цикъл
        //обаче не знаем за текущия пекар колко оценки ще се прочетат  -> ще имаме вложен while цикъл
        String winnerName = "";     //създаваме си променлива за победителя (пекаря с най-много точки) - в началото не знаем кой ще е той, затова задаваме начална стойност празен String
        int maxPoints = Integer.MIN_VALUE;    //в случая може да ползваме и това:  int maxPoints = 0;
        for (int currentLoafOfBread = 1; currentLoafOfBread <= numberOfEasterLoavesOfBread; currentLoafOfBread++) {
            String nameOfBakerOfCurrentLoafOfBread = scanner.nextLine();      //Името на пекаря, който е направил козунака – текст

            int totalPointsOfCurrentBaker = 0;        //създаваме си променлива за точките на текущия пекар
            String input = scanner.nextLine();
            while (!input.equals("Stop")) {       //До получаване на командата "Stop" се прочита оценка за козунак от един човек  – цяло число в интервала [1... 10]
                int currentPoints = Integer.parseInt(input);         //оценка за козунак от един човек  – цяло число в интервала [1... 10]

                //намираме сумата от всичките точки на текущия пекар:
                totalPointsOfCurrentBaker = totalPointsOfCurrentBaker + currentPoints;

                input = scanner.nextLine();      //update
            }

            //преди да преминем на следващия пекар, принтираме точките на текущия пекар
            System.out.printf("%s has %d points.%n", nameOfBakerOfCurrentLoafOfBread, totalPointsOfCurrentBaker);

            //ако сумата от точките на текущия пекар е най-голямата сума до момента, принтираме, че текущият пекар е новият № 1
            if (totalPointsOfCurrentBaker > maxPoints) {
                maxPoints = totalPointsOfCurrentBaker;
                System.out.printf("%s is the new number 1!%n", nameOfBakerOfCurrentLoafOfBread);
                winnerName = nameOfBakerOfCurrentLoafOfBread;          //така намираме кой е победителят
            }

        }

        System.out.printf("%s won competition with %d points!", winnerName, maxPoints);
    }
}
