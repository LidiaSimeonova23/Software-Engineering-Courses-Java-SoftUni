package moreExercises7And8ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P02BikeRaceVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorsCount = Integer.parseInt(scanner.nextLine());        //броят младши велосипедисти. Цяло число в интервала [1…100]
        int seniorsCount = Integer.parseInt(scanner.nextLine());        //броят старши велосипедисти. Цяло число в интервала [1… 100]
        String trackType = scanner.nextLine();      //вид трасе – "trail", "cross-country", "downhill" или "road"

        double juniorsFee = 0;
        double seniorsFee = 0;
        switch (trackType) {
            case "trail":
                juniorsFee = 5.50;
                seniorsFee = 7;
                break;
            case "cross-country":
                juniorsFee = 8;
                seniorsFee = 9.50;
                if (juniorsCount + seniorsCount >= 50) {     //Ако в "cross-country" състезанието се съберат 50 или повече участници (общо младши и старши), таксата  намалява с 25%.
                    juniorsFee = juniorsFee - (juniorsFee * 25 / 100);
                    seniorsFee = seniorsFee - (seniorsFee * 25 / 100);
                }
                break;
            case "downhill":
                juniorsFee = 12.25;
                seniorsFee = 13.75;
                break;
            case "road":
                juniorsFee = 20;
                seniorsFee = 21.50;
                break;
        }

        double totalSumFromFees = (juniorsCount * juniorsFee) + (seniorsCount * seniorsFee);

        //Организаторите отделят 5% от събраната сума за разходи.
        double donatedSum = totalSumFromFees - (totalSumFromFees * 5 / 100);
        System.out.printf("%.2f", donatedSum);
    }
}
