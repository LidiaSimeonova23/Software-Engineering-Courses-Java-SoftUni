package moreExercises3And4FirstStepsInCoding;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfKiloOfVegetables = Double.parseDouble(scanner.nextLine());     //Цена за килограм зеленчуци – реално число[0.00… 1000.00]
        double priceOfKiloOfFruits = Double.parseDouble(scanner.nextLine());        //Цена за килограм плодове – реално число[0.00… 1000.00]
        int totalKilosOfVegetables = Integer.parseInt(scanner.nextLine());      //Общо килограми на зеленчуците – цяло число[0… 1000]
        int totalKilosOfFruits = Integer.parseInt(scanner.nextLine());        //Общо килограми на плодовете – цяло число[0… 1000]

        double totalPriceInBGN = (totalKilosOfVegetables * priceOfKiloOfVegetables) + (totalKilosOfFruits * priceOfKiloOfFruits);

        //едно евро е равно на 1.94 лв
        double totalPriceInEUR = totalPriceInBGN / 1.94;
        System.out.printf("%.2f", totalPriceInEUR);
    }
}
