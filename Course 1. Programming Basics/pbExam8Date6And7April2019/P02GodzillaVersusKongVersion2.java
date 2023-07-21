package pbExam8Date6And7April2019;

import java.util.Scanner;

public class P02GodzillaVersusKongVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        double availableBudget = Double.parseDouble(scanner.nextLine());    //Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
        int numberOfExtras = Integer.parseInt(scanner.nextLine());        //Брой на статистите – цяло число в интервала [1 … 500]
        double priceOfClothingOf1Extra = Double.parseDouble(scanner.nextLine());     //Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]

        //•	Декорът за филма е на стойност 10% от бюджета.
        double priceOfDecor = availableBudget * 10 * 0.01;

        //намираме цената на облеклото за всички статисти:
        double priceOfClothingOfAllExtras = numberOfExtras * priceOfClothingOf1Extra;

        //•	При повече от 150 статисти има отстъпка за облеклото на стойност 10%.  -> сумата ще е 90% от сумата
        if (numberOfExtras > 150) {
            priceOfClothingOfAllExtras = priceOfClothingOfAllExtras * 90 * 0.01;
        }

        //намираме общите разходи:
        double totalSumOfAllExpenses = priceOfDecor + priceOfClothingOfAllExtras;


        if (availableBudget < totalSumOfAllExpenses) {        //Ако  бюджетът не е достатъчен  (парите за декора и дрехите са повече от бюджета)
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalSumOfAllExpenses - availableBudget);
        } else {         //else if (availableBudget >= totalSumOfAllExpenses )        //Ако бюджетът е достатъчен (парите за декора и дрехите са по-малко или равни на бюджета)
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", availableBudget - totalSumOfAllExpenses);
        }

    }
}
