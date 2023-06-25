package moreExercises9And10ForLoop;

import java.util.Scanner;

public class P07FootballLeagueVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityOfStadium = Integer.parseInt(scanner.nextLine());         //Капацитетът на стадиона – цяло число в интервала [1 … 10000];
        int numberOfFans = Integer.parseInt(scanner.nextLine());         //Броят на всички фенове – цяло число в интервала [1 … 10000].

        int numberOfFansInSectorA = 0;
        int numberOfFansInSectorB = 0;
        int numberOfFansInSectorV = 0;
        int numberOfFansInSectorG = 0;
        for (int fan = 1; fan <= numberOfFans; fan++) {          //за да си построя цикъла, за име на променливата съм използвала fan вместо i
            char sectorOfCurrentFan = scanner.nextLine().charAt(0);            //за всеки фен се чете секторът, в който се намира - можем да го прочетем като символ с възможности 'A', 'B', 'V' или 'G'.

            if (sectorOfCurrentFan == 'A') {
                numberOfFansInSectorA++;     //numberOfFansInSectorA = numberOfFansInSectorA + 1;     //numberOfFansInSectorA += numberOfFansInSectorA;
            } else if (sectorOfCurrentFan == 'B') {
                numberOfFansInSectorB++;
            } else if (sectorOfCurrentFan == 'V') {
                numberOfFansInSectorV++;
            } else if (sectorOfCurrentFan == 'G') {
                numberOfFansInSectorG++;
            }

        }

        //процентите фенове в съответния сектор (спрямо общия брой фенове) са равни на брой фенове в съответния сектор, делено на общия брой фенове, дошли на стадиона, умножено по 100
        double percentageOfFansInSectorA = numberOfFansInSectorA * 1.0 / numberOfFans * 100;
        System.out.printf("%.2f%%%n", percentageOfFansInSectorA);

        double percentageOfFansInSectorB = numberOfFansInSectorB * 1.0 / numberOfFans * 100;
        System.out.printf("%.2f%%%n", percentageOfFansInSectorB);

        double percentageOfFansInSectorV = numberOfFansInSectorV * 1.0 / numberOfFans * 100;
        System.out.printf("%.2f%%%n", percentageOfFansInSectorV);

        double percentageOfFansInSectorG = numberOfFansInSectorG * 1.0 / numberOfFans * 100;
        System.out.printf("%.2f%%%n", percentageOfFansInSectorG);

        //Процентът на всички фенове (спрямо капацитета на стадиона) е равен на броя на всички фенове, делено на капацитета на стадиона, умножено по 100
        double percentageOfAllFans = numberOfFans * 1.0 / capacityOfStadium * 100;
        System.out.printf("%.2f%%", percentageOfAllFans);
    }
}
