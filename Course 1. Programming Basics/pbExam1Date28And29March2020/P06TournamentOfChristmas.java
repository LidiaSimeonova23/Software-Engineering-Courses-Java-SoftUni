package pbExam1Date28And29March2020;

import java.util.Scanner;

public class P06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата се прочита броят дни на турнира – цяло число в интервала [1… 20]
        int numberOfDays = Integer.parseInt(scanner.nextLine());


        //Ще имаме два вложени цикъла:
        // във външния (for цикъл, защото знаем колко ще са итерациите -> колкото са дните) ще итерираме по дните
        // във вътрешния (while цикъл, защото не знаем колко ще са итерациите) ще итерираме по типа спорт и съответно дали имаме победа, или загуба
        int numberOfDaysInWhichWeAreWinners = 0;      //създаваме си променлива за брой дни, в които сме победители
        int numberOfDaysInWhichWeAreLosers = 0;        //създаваме си променлива за брой дни, в които сме губещи
        double totalSumForAllDays = 0;     //създаваме си променлива за събраната сума общо от всичките дни на турнира
        for (int currentDay = 1; currentDay <= numberOfDays; currentDay++) {

            //До получаване на командата "Finish" се чете спорт (текст)
            //За всеки спорт се прочита резултат  (текст с възможности: "win" или "lose")
            int numberOfWinsForCurrentDay = 0;       //създаваме си променлива за брой победи за текущия ден (с начална стойност 0, защото ще участва в аритм. операция събиране)
            int numberOfLosesForCurrentDay = 0;        //създаваме си променлива за брой загуби за текущия ден (с начална стойност 0, защото ще участва в аритм. операция събиране)
            double gatheredSumForCurrentDay = 0;     //int gatheredSumForCurrentDay = 0;       //събраната сума за текущия ден

            String input = scanner.nextLine();
            while (!input.equals("Finish")) {
                String typeOfSport = input;
                String result = scanner.nextLine();

                switch (result) {
                    case "win":        //в случай че сме спечелили играта
                        numberOfWinsForCurrentDay++;     //броят на спечелените игри за текущия ден нараства с единица
                        gatheredSumForCurrentDay = gatheredSumForCurrentDay + 20;        //gatheredSumForCurrentDay += 20;     //Със спечелването на всяка една игра печелите по 20 лв. за благотворителност.
                        break;
                    case "lose":       //в случай че сме загубили играта
                        numberOfLosesForCurrentDay++;     //броят на загубените игри за текущия ден нараства с единица
                        break;
                }

                input = scanner.nextLine();    //update
            }


            //Ако имате повече спечелени игри, отколкото загубени – вие сте победители този ден и увеличавате парите от него с 10%.
            if (numberOfWinsForCurrentDay > numberOfLosesForCurrentDay) {
                numberOfDaysInWhichWeAreWinners++;
                gatheredSumForCurrentDay = gatheredSumForCurrentDay + (gatheredSumForCurrentDay * 10 / 100);
            } else {
                numberOfDaysInWhichWeAreLosers++;
            }

            totalSumForAllDays = totalSumForAllDays + gatheredSumForCurrentDay;
        }

        // При приключване на турнира, ако през повечето дни сте били победители, печелите турнира и увеличавате всичките спечелени пари с 20%.
        if (numberOfDaysInWhichWeAreWinners > numberOfDaysInWhichWeAreLosers) {
            totalSumForAllDays = totalSumForAllDays + (totalSumForAllDays * 20 / 100);
            System.out.printf("You won the tournament! Total raised money: %.2f", totalSumForAllDays);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalSumForAllDays);
        }

    }
}
