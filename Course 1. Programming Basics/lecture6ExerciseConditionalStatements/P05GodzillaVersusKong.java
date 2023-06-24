package lecture6ExerciseConditionalStatements;

import java.util.Scanner;

public class P05GodzillaVersusKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());       //Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
        int numberOfExtras = Integer.parseInt(scanner.nextLine());         //Брой на статистите – цяло число в интервала [1 … 500]
        double clothingPriceOf1Extra = Double.parseDouble(scanner.nextLine());      //Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]

        //•	Декорът за филма е на стойност 10% от бюджета.
        double decorationPrice = budget * 10 / 100;

        double priceOfClothingOfAllExtras = numberOfExtras * clothingPriceOf1Extra;

        //•	При повече от 150 статисти има отстъпка за облеклото на стойност 10%.
        if (numberOfExtras > 150) {
            priceOfClothingOfAllExtras = priceOfClothingOfAllExtras - (priceOfClothingOfAllExtras * 10 / 100);
        }

        double allExpenses = decorationPrice + priceOfClothingOfAllExtras;

        double differenceInMoney = Math.abs(budget - allExpenses);
        if (allExpenses > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", differenceInMoney);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", differenceInMoney);
        }

    }
}
