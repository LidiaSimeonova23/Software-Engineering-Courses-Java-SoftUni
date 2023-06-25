package moreExercises3And4FirstStepsInCoding;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOf1KiloOfMackerel = Double.parseDouble(scanner.nextLine());       //цена на скумрията на килограм. Реално число в интервала [0.00…40.00]
        double priceOf1KiloOfSprinkle = Double.parseDouble(scanner.nextLine());        //цена на цацата на килограм. Реално число в интервала [0.00…30.00]
        double kilosOfBonito = Double.parseDouble(scanner.nextLine());        //килограма паламуд. Реално число в интервала [0.00…50.00]
        double kilosOfSafrid = Double.parseDouble(scanner.nextLine());       //килограма сафрид. Реално число в интервала [0.00… 70.00]
        int kilosOfMussels = Integer.parseInt(scanner.nextLine());          //килограма миди. Цяло число в интервала [0 ... 100]

        //•	Паламуд – 60% по-скъп от скумрията
        double priceOf1KiloOfBonito = priceOf1KiloOfMackerel + (priceOf1KiloOfMackerel * 60 / 100);

        //•	Сафрид – 80% по-скъп от цацата
        double priceOf1KiloOfSafrid = priceOf1KiloOfSprinkle + (priceOf1KiloOfSprinkle * 80 / 100);

        //•	Миди – 7.50 лв. за килограм

        double totalSum = (kilosOfBonito * priceOf1KiloOfBonito) + (kilosOfSafrid * priceOf1KiloOfSafrid) + (kilosOfMussels * 7.50);
        System.out.printf("%.2f", totalSum);
    }
}
