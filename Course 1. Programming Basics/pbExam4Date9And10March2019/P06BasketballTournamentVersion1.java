package pbExam4Date9And10March2019;

import java.util.Scanner;

public class P06BasketballTournamentVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат поредица от турнири до получаване на командата "End of tournaments" (не знаем колко ще са повторенията -> while цикъл):
        int winsCount = 0;      //създаваме си променлива за броя на победите
        int lossesCount = 0;      //създаваме си променлива за броя на загубите
        int totalNumberOfGamesFromAllTournaments = 0;       //създаваме си променлива за общия брой мачове от всички турнири

        String input = scanner.nextLine();
        while (!input.equals("End of tournaments")) {
            String nameOfCurrentTournament = input;          //Име на турнира – текст
            int numberOfGamesOfCurrentTournament = Integer.parseInt(scanner.nextLine());          //За всеки турнир n на брой мача – цяло число в интервала [1…15]

            //намираме общия брой мачове от абсолютно всички турнири
            totalNumberOfGamesFromAllTournaments += numberOfGamesOfCurrentTournament;        //totalNumberOfGamesFromAllTournaments = totalNumberOfGamesFromAllTournaments + numberOfGamesOfCurrentTournament;

            //За всеки мач (а ние знаем колко са мачовете -> имаме for цикъл) се четат по два реда:
            for (int currentGame = 1; currentGame <= numberOfGamesOfCurrentTournament; currentGame++) {
                int numberOfPointsOfTeamOfDesi = Integer.parseInt(scanner.nextLine());         //Точки, вкарани от отбора на Деси – цяло число в интервала от [0…150]
                int numberOfPointsOfOpposingTeam = Integer.parseInt(scanner.nextLine());       //Точки, вкарани от противниковия отбор – цяло число в интервала от [0…150]

                //Няма да има случаи на равенство. -> няма да имаме проверка за ревенство == на точките на двата отбора
                int differenceBetweenPoints = Math.abs(numberOfPointsOfTeamOfDesi - numberOfPointsOfOpposingTeam);
                if (numberOfPointsOfTeamOfDesi > numberOfPointsOfOpposingTeam) {         //Ако отборът на Деси е спечелил
                    winsCount++;      //winsCount += 1;        //winsCount = winsCount + 1;     //броят на победите се увеличава с единица
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", currentGame, nameOfCurrentTournament, differenceBetweenPoints);
                } else {      //else if (numberOfPointsOfTeamOfDesi < numberOfPointsOfOpposingTeam)       //Ако отборът на Деси е загубил:
                    lossesCount++;        //броят на загубите се увеличава с единица
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", currentGame, nameOfCurrentTournament, differenceBetweenPoints);
                }

            }


            input = scanner.nextLine();        //update
        }


        //намираме и принтираме процент спечелени мачове от всички турнири:
        double percentageOfWonGamesFromAllTournaments = winsCount * 1.0 / totalNumberOfGamesFromAllTournaments * 100;
        System.out.printf("%.2f%% matches win%n", percentageOfWonGamesFromAllTournaments);

        //намираме и принтираме процент загубени мачове от всички турнири:
        double percentageOfLostGamesFromAllTournaments = lossesCount * 1.0 / totalNumberOfGamesFromAllTournaments * 100;
        System.out.printf("%.2f%% matches lost", percentageOfLostGamesFromAllTournaments);
    }
}
