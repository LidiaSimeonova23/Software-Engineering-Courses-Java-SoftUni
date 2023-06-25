package moreExercises5And6ConditionalStatements;

import java.util.Scanner;

public class P03HarvestVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squareMetresOfVineyard = Integer.parseInt(scanner.nextLine());         //кв.м е лозето – цяло число в интервала [10 … 5000]
        double grapesFrom1SquareMetre = Double.parseDouble(scanner.nextLine());        //добито грозде от един кв.м – реално число в интервала [0.00 … 10.00]
        int neededLitresOfWine = Integer.parseInt(scanner.nextLine());         //нужни литри вино – цяло число в интервала [10 … 600]
        int numberOfWorkers = Integer.parseInt(scanner.nextLine());        //брой работници – цяло число в интервала [1 … 20]

        double grapesFromTheWholeVineyard = squareMetresOfVineyard * grapesFrom1SquareMetre;   //намираме реколтата от цялото лозе

        //се заделя 40% от реколтата за производство на вино
        double grapesForProductionOfWine = grapesFromTheWholeVineyard * 40 / 100;       //намираме колко е гроздето за вино

        //За 1 литър вино са нужни 2,5 кг. грозде
        double producedLitresOfWine = grapesForProductionOfWine / 2.5;

        if (producedLitresOfWine < neededLitresOfWine) {           //•	Ако произведеното вино е по-малко от нужното
            double missingWine = Math.floor(neededLitresOfWine - producedLitresOfWine);           //	Резултатът трябва да е закръглен към по-ниско цяло число
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", missingWine);
        } else {       //else if (producedLitresOfWine >= neededLitresOfWine)
            producedLitresOfWine = Math.floor(producedLitresOfWine);              //	Резултатът трябва да е закръглен към по-ниско цяло число
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", producedLitresOfWine);
            double remainingWine = Math.ceil(producedLitresOfWine - neededLitresOfWine);        //трябва да са закръглени към по-високото цяло число
            double wineFor1Worker = (producedLitresOfWine - neededLitresOfWine) / numberOfWorkers;        //намираме по колко вино е получил всеки от работниците
            wineFor1Worker = Math.ceil(wineFor1Worker);              //трябва да са закръглени към по-високото цяло число
            System.out.printf("%.0f liters left -> %.0f liters per person.", producedLitresOfWine - neededLitresOfWine, wineFor1Worker);
        }


    }
}
