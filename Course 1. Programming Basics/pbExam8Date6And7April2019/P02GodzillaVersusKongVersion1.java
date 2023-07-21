package pbExam8Date6And7April2019;

import java.util.Scanner;

public class P02GodzillaVersusKongVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        double availableBudget = Double.parseDouble(scanner.nextLine());    //Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
        int numberOfExtras = Integer.parseInt(scanner.nextLine());        //Брой на статистите – цяло число в интервала [1 … 500]
        double priceOfClothingOf1Extra = Double.parseDouble(scanner.nextLine());     //Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]

        //•	Декорът за филма е на стойност 10% от бюджета.
        double priceOfDecor = availableBudget * 10 / 100;

        //намираме цената на облеклото за всички статисти:
        double priceOfClothingOfAllExtras = numberOfExtras * priceOfClothingOf1Extra;

        //•	При повече от 150 статисти има отстъпка за облеклото на стойност 10%.
        if (numberOfExtras > 150) {
            priceOfClothingOfAllExtras = priceOfClothingOfAllExtras - (priceOfClothingOfAllExtras * 10 / 100);
        }

        //намираме общите разходи:
        double totalSumOfAllExpenses = priceOfDecor + priceOfClothingOfAllExtras;


        double differenceInMoney = Math.abs(availableBudget - totalSumOfAllExpenses);      //намираме разликата между парите (с Math.abs си осигуряваме, че ще е положително число)
        if (availableBudget < totalSumOfAllExpenses) {        //Ако  бюджетът не е достатъчен  (парите за декора и дрехите са повече от бюджета)
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", differenceInMoney);
        } else {         //else if (availableBudget >= totalSumOfAllExpenses )        //Ако бюджетът е достатъчен (парите за декора и дрехите са по-малко или равни на бюджета)
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", differenceInMoney);
        }

    }
}
