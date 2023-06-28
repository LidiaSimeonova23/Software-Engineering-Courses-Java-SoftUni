package pbExam3Date20And21April2019;

import java.util.Scanner;

public class P01EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 5 реда:
        double priceOf1KiloOfFlour = Double.parseDouble(scanner.nextLine());    //Цена на брашното за един килограм – реално число в интервала [0.00 … 10000.00]
        double kilosOfFlour = Double.parseDouble(scanner.nextLine());    //Килограми на брашното – реално число в интервала [0.00 … 10000.00]
        double kilosOfSugar = Double.parseDouble(scanner.nextLine());    //Килограми на захарта – реално число в интервала [0.00 … 10000.00]
        int numberOfEggShelves = Integer.parseInt(scanner.nextLine());    //Брой кори с яйца – цяло число в интервала [0 … 10000]
        int numberOfPackagesOfYeast = Integer.parseInt(scanner.nextLine());    //Пакети мая  – цяло число в интервала [0 … 10000]

        //•	цената на килограм захар е с 25% по-ниска от тази на килограм брашно
        double priceOf1KiloOfSugar = priceOf1KiloOfFlour - (priceOf1KiloOfFlour * 25 / 100);

        //•	цената на една кора с яйца е с 10% по-висока от цената на килограм брашно
        double priceOf1EggShelf = priceOf1KiloOfFlour + (priceOf1KiloOfFlour * 10 / 100);

        //•	цената на един пакет мая е с 80% по-ниска от цената на килограм захар
        double priceOf1PackageOfYeast = priceOf1KiloOfSugar - (priceOf1KiloOfSugar * 80 / 100);

        //намираме общата цена за всички продукти и я принтираме
        double totalPriceOfAllProducts = (kilosOfFlour * priceOf1KiloOfFlour) + (kilosOfSugar * priceOf1KiloOfSugar) + (numberOfEggShelves * priceOf1EggShelf) + (numberOfPackagesOfYeast * priceOf1PackageOfYeast);
        System.out.printf("%.2f", totalPriceOfAllProducts);
    }
}
