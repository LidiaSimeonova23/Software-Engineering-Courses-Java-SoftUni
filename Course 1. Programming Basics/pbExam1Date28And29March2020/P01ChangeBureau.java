package pbExam1Date28And29March2020;

import java.util.Scanner;

public class P01ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBitcoins = Integer.parseInt(scanner.nextLine());     //броят биткойни - цяло число в интервала [0…20]
        double numberOfChineseYuans = Double.parseDouble(scanner.nextLine());      //броят китайски юана - реално число в интервала [0.00… 50 000.00]
        double commission = Double.parseDouble(scanner.nextLine());        //комисионната - реално число в интервала [0.00 ... 5.00]


        //Напишете програма, която да пресмята колко евро може да купи спрямо следните валутни курсове:
        //•	1 биткойн = 1168 лева.
        //•	1 китайски юан = 0.15 долара.
        //•	1 долар = 1.76 лева.
        //•	1 евро = 1.95 лева.


        double valueOfBitcoinsInLeva = numberOfBitcoins * 1168;
        double valueOfChineseYuansInDollars = numberOfChineseYuans * 0.15;
        double valueOfChineseYuansInLeva = valueOfChineseYuansInDollars * 1.76;
        double totalValueInLeva = valueOfBitcoinsInLeva + valueOfChineseYuansInLeva;
        double valueOfLevaInEuro = totalValueInLeva / 1.95;

        //първи начин за намиране на еврото, което може да купи
        double euroToBuy = valueOfLevaInEuro - (valueOfLevaInEuro * commission / 100);

        //втори начин за намиране на еврото, което може да купи (мога да го използвам вместо първия начин):
        //double moneyForCommissionInEuro = valueOfLevaInEuro * commission / 100;
        //double euroToBuy = valueOfLevaInEuro - moneyForCommissionInEuro;

        System.out.printf("%.2f", euroToBuy);
    }
}
