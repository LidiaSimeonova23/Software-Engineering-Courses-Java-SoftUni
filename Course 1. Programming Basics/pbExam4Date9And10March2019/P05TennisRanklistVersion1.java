package pbExam4Date9And10March2019;

import java.util.Scanner;

public class P05TennisRanklistVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата първо се четат два реда:
        int numberOfTournaments = Integer.parseInt(scanner.nextLine());       //Брой турнири, в които е участвал – цяло число в интервала [1…20]
        int availablePoints = Integer.parseInt(scanner.nextLine());          //Начален брой точки в ранглистата - цяло число в интервала [1...4000]


        //За всеки турнир (а ние знаем колко са турнирите, следователно имаме for цикъл) се прочита отделен ред:
        int totalPointsFromCurrentTournaments = 0;         //създаваме си променлива за общия брой точки от всички текущи турнири
        int numberOfWins = 0;      //създаваме си променлива за брой спечелени турнири (брой победи)
        for (int currentTournament = 1; currentTournament <= numberOfTournaments; currentTournament++) {
            String stageAtCurrentTournament = scanner.nextLine();        //Достигнат етап от турнира – текст – "W", "F" или "SF"

            //Има три варианта за завършване на турнир: "W", "F" или "SF"   ->
            int currentPoints = 0;       //създаваме си променлива за точките само от текущия турнир
            switch (stageAtCurrentTournament) {
                case "W":          //	W - ако е победител получава 2000 точки
                    numberOfWins++;           //numberOfWins += 1;         //numberOfWins = numberOfWins + 1;      //броят на победите (спечелените турнири) се увеличава с единица
                    currentPoints = 2000;
                    break;
                case "F":          //	F - ако е финалист получава 1200 точки
                    currentPoints = 1200;
                    break;
                case "SF":         //	SF - ако е полуфиналист получава 720 точки
                    currentPoints = 720;
                    break;
            }

            //намираме общите точки от текущите турнири (без първоначалните точки, които е имал от предишни турнири)
            totalPointsFromCurrentTournaments += currentPoints;           //totalPointsFromCurrentTournaments = totalPointsFromCurrentTournaments + currentPoints;
        }


        //намираме общо всичките спечелени точки от Григор (и от предишни турнири, и от текущите турнири)
        availablePoints = availablePoints + totalPointsFromCurrentTournaments;
        System.out.printf("Final points: %d%n", availablePoints);          //принтираме  всичките спечелени точки от Григор (и от предишни турнири, и от текущите турнири)

        //намираме колко точки средно печели от всички изиграни турнири
        double averagePointsFromCurrentTournaments = totalPointsFromCurrentTournaments * 1.0 / numberOfTournaments;
        //Средните точки да бъдат закръглени към най-близкото цяло число надолу
        averagePointsFromCurrentTournaments = Math.floor(averagePointsFromCurrentTournaments);
        System.out.printf("Average points: %.0f%n", averagePointsFromCurrentTournaments);       //принтираме средно спечелени точки от изиграни (текущите) турнири

        //намираме процента на спечелените турнири  –равен е на броя на спечелените турнири, делено на общия брой турнири, умножено по 100)
        double percentageOfWonTournaments = numberOfWins * 1.0 / numberOfTournaments * 100;
        System.out.printf("%.2f%%", percentageOfWonTournaments);
    }
}
