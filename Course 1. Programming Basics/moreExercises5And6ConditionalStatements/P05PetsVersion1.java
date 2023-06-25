package moreExercises5And6ConditionalStatements;

import java.util.Scanner;

public class P05PetsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = Integer.parseInt(scanner.nextLine());         //брой дни – цяло число в интервал [1…5000]
        int availableFoodInKilosForAllDays = Integer.parseInt(scanner.nextLine());        //оставена храна в килограми – цяло число в интервал [0…100000]
        double dogFoodPerDayInKilos = Double.parseDouble(scanner.nextLine());     //храна на ден за кучето в килограми – реално число в интервал [0.00…100.00]
        double catFoodPerDayInKilos = Double.parseDouble(scanner.nextLine());        //храна на ден за котката в килограми – реално число в интервал [0.00…100.00]
        double tortoiseFoodPerDayInGrams = Double.parseDouble(scanner.nextLine());      //храна на ден за костенурката в грамове – реално число в интервал [0.00…10000.00]

        //1 kg = 1000 g
        double tortoiseFoodPerDayInKilos = tortoiseFoodPerDayInGrams / 1000;

        //double necessaryFoodInKilosForAllDays = (numberOfDays * dogFoodPerDayInKilos) + (numberOfDays * catFoodPerDayInKilos) + (numberOfDays * tortoiseFoodPerDayInKilos);
        double necessaryFoodInKilosForAllDays = numberOfDays * (dogFoodPerDayInKilos + catFoodPerDayInKilos + tortoiseFoodPerDayInKilos);

        double differenceInFood = Math.abs(availableFoodInKilosForAllDays - necessaryFoodInKilosForAllDays);
        if (availableFoodInKilosForAllDays >= necessaryFoodInKilosForAllDays) {
            differenceInFood = Math.floor(differenceInFood);
            System.out.printf("%.0f kilos of food left.", differenceInFood);
        } else {
            differenceInFood = Math.ceil(differenceInFood);
            System.out.printf("%.0f more kilos of food are needed.", differenceInFood);
        }

    }
}
