package pbExam7Date6And7July2019;

import java.util.Scanner;

public class P05FootballTournamentVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат два реда:
        String nameOfFootballClub = scanner.nextLine();       //Името на футболния отбор, за който водим статистика - текст
        int numberOfPlayedMatches = Integer.parseInt(scanner.nextLine());    //Броят изиграни срещи през настоящия сезон - цяло число в интервала [0… 100]

        //Ако отборът не е изиграл нито един мач
        if (numberOfPlayedMatches < 1) {      //(numberOfPlayedMatches == 0)
            System.out.printf("%s hasn't played any games during this season.", nameOfFootballClub);
            return;      //прекъсваме цялата програма (целия main метод) и повече няма да се изпълни нито един ред код
        }


        //За всяка изиграна среща (ние знаем колко са срещите -> имаме for цикъл) се прочита отделен ред:
        int numberOfWins = 0;       //създаваме си променлива за брой победи (спечелени мачове)
        int numberOfDraws = 0;         //създаваме си променлива за брой равенства
        int numberOfLosses = 0;          //създаваме си променлива за брой загуби (загубени мачове)
        int totalNumberOfPointsFromAllMatches = 0;       //създаваме си променлива за общ брой точки от всички мачове (спечелени, загубени, равенства)
        for (int currentMatch = 1; currentMatch <= numberOfPlayedMatches; currentMatch++) {
            char resultFromCurrentMatch = scanner.nextLine().charAt(0);    //Резултатът от изиграната среща в един от горепосочените формати – символ с възможности 'W', 'D' и 'L'

            int pointsFromCurrentMatch = 0;       //създаваме си променлива за брой спечелени точки от текущия мач
            if (resultFromCurrentMatch == 'W') {               //при победа броят на спечелените мачове се увеличава с единица и отборът печели 3 точки
                numberOfWins++;      //numberOfWins = numberOfWins + 1;       //numberOfWins += 1;
                pointsFromCurrentMatch = 3;
            } else if (resultFromCurrentMatch == 'D') {        //при равенство броят на равенствата се увеличава с единица и отборът печели 1 точка
                numberOfDraws++;
                pointsFromCurrentMatch = 1;
            } else if (resultFromCurrentMatch == 'L') {        //при загуба броят на загубите се увеличава с единица и отборът не печели точки
                numberOfLosses++;
                // pointsFromCurrentMatch = 0;
            }

            //намираме събрания общ брой точки от абсолютно всички мачове
            totalNumberOfPointsFromAllMatches += pointsFromCurrentMatch;       //totalNumberOfPointsFromAllMatches = totalNumberOfPointsFromAllMatches + pointsFromCurrentMatch;
        }


        //намираме процента на победите спрямо общия брой мачове
        double percentageOfWins = numberOfWins * 1.0 / numberOfPlayedMatches * 100;

        //щом компилаторът не е срещнал оператор return (за прекъсване на програмата), значи е изигран поне 1 мач и извеждаме статистика за изиграните мачове:
        System.out.printf("%s has won %d points during this season.%n", nameOfFootballClub, totalNumberOfPointsFromAllMatches);
        System.out.println("Total stats:");
        System.out.printf("## W: %d%n", numberOfWins);
        System.out.printf("## D: %d%n", numberOfDraws);
        System.out.printf("## L: %d%n", numberOfLosses);
        System.out.printf("Win rate: %.2f%%", percentageOfWins);
    }
}
