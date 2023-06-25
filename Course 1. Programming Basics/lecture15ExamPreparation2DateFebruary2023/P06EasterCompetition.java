package lecture15ExamPreparation2DateFebruary2023;

import java.util.Scanner;

public class P06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEasterBreads = Integer.parseInt(scanner.nextLine());      //броят на козунаците – цяло число в интервала [1… 100]

        //за всеки козунак се прочита:
        //•	Името на пекаря, който е направил козунака – текст
        //•	До получаване на командата "Stop" се прочита оценка за козунак от един човек  – цяло число в интервала [1... 10]

        //във вътрешния цикъл (while цикъла) ще събираме всички точки на даден готвач, а във външния цикъл (for цикъла) ще принтираме точките на всеки от готвачите и ще сравняваме кой има най-много точки
        //за да преминем към следващия готвач, трябва да сме събрали всичките точки на текущия готвач
        String winnerName = "";         //създаваме си променлива за името на победителя с начална стойност празен String (защото още не знаем кой е той)
        int maxPoints = Integer.MIN_VALUE;    //в случая може да ползваме и това:  int maxPoints = 0;

        for (int currentEasterBread = 1; currentEasterBread <= numberOfEasterBreads; currentEasterBread++) {
            String nameOfCurrentBaker = scanner.nextLine();

            int totalPointsOfTheCurrentBaker = 0;
            String input = scanner.nextLine();
            while (!input.equals("Stop")) {
                int currentPoints = Integer.parseInt(input);         //оценка за козунак от един човек  – цяло число в интервала [1... 10]

                totalPointsOfTheCurrentBaker = totalPointsOfTheCurrentBaker + currentPoints;

                input = scanner.nextLine();
            }


            System.out.printf("%s has %d points.%n", nameOfCurrentBaker, totalPointsOfTheCurrentBaker);          //на всяка итерация на външния цикъл принтираме всички точки на текущия готвач

            if (totalPointsOfTheCurrentBaker > maxPoints) {
                maxPoints = totalPointsOfTheCurrentBaker;
                System.out.printf("%s is the new number 1!%n", nameOfCurrentBaker);
                winnerName = nameOfCurrentBaker;          //така намираме кой е победителят
            }

        }

        //извън циклите принтираме името на победителя и неговите точки
        System.out.printf("%s won competition with %d points!", winnerName, maxPoints);
    }
}
