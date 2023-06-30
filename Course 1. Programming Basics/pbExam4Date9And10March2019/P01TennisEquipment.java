package pbExam4Date9And10March2019;

import java.util.Scanner;

public class P01TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се прочитат 3 реда:
        double priceOf1TennisRacquet = Double.parseDouble(scanner.nextLine());       //Цена на една тенис ракета – реално число в интервала [0.00…100000.00]
        int numberOfTennisRacquets = Integer.parseInt(scanner.nextLine());       //Брой тенис ракети - цяло число в интервала [0…100]
        int numberOfPairsOfSnickers = Integer.parseInt(scanner.nextLine());       //Брой чифтове маратонки - цяло число в интервала [0…100]

        //Известно е, че 1 чифт маратонки = 1/6 от цената на една тенис ракета
        double priceOf1PairOfSnickers = priceOf1TennisRacquet * 1 / 6;

        //намираме общата сума за тенис ракетите и маратонките
        double priceOfAllTennisRacquetsAndAllPairsOfSnickers = (numberOfTennisRacquets * priceOf1TennisRacquet) + (numberOfPairsOfSnickers * priceOf1PairOfSnickers);

        //Тенисистът иска да купи и друга екипировка, която е на стойност 20% от общата цена на закупените ракети и маратонки
        double priceOfOtherEquipment = priceOfAllTennisRacquetsAndAllPairsOfSnickers * 20 / 100;

        //намираме общата цена на абсолютно всичко, което тенисистът иска да купи
        double finalPriceOfEverything = priceOfAllTennisRacquetsAndAllPairsOfSnickers + priceOfOtherEquipment;

        //Тенисистът трябва да плати 1/8 от цената, а останалите 7/8 трябва да бъдат платени от неговите спонсори  ->
        double priceThatThePlayerHasToPay = finalPriceOfEverything * 1 / 8;         //намираме сумата, която трябва да плати тенисистът
        //закръглена към по-малкото цяло число
        priceThatThePlayerHasToPay = Math.floor(priceThatThePlayerHasToPay);
        System.out.printf("Price to be paid by Djokovic %.0f%n", priceThatThePlayerHasToPay);       //принтираме сумата, която трябва да плати тенисистът


        double priceThatTheSponsorsHaveToPay = finalPriceOfEverything * 7 / 8;      //намираме сумата, която трябва да платят спонсорите
        //ако пробваме да намерим сумата по този начин ->  double priceThatTheSponsorsHaveToPay = finalPriceOfEverything - priceThatThePlayerHasToPay;     -> няма да се получи желаният резултат заради закръглянията
        //закръглена към по-голямото цяло число
        priceThatTheSponsorsHaveToPay = Math.ceil(priceThatTheSponsorsHaveToPay);
        System.out.printf("Price to be paid by sponsors %.0f", priceThatTheSponsorsHaveToPay);      //принтираме сумата, която трябва да платят спонсорите
    }
}
