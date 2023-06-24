package lecture6ExerciseConditionalStatements;

import java.util.Scanner;

public class P07ShoppingVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());       //Бюджетът на Петър - реално число в интервала [0.0…100000.0]
        int videoCardsCount = Integer.parseInt(scanner.nextLine());      //Броят видеокарти - цяло число в интервала [0…100]
        int processorsCount = Integer.parseInt(scanner.nextLine());      //Броят процесори - цяло число в интервала [0…100]
        int ramMemoriesCount = Integer.parseInt(scanner.nextLine());       //Броят рам памет - цяло число в интервала [0…100]

        //•	Видеокарта – 250 лв./бр.
        //•	Процесор – 35% от цената на закупените видеокарти/бр.
        //•	Рам памет – 10% от цената на закупените видеокарти/бр.

        double allVideoCardsPrice = videoCardsCount * 250;
        double priceOf1Processor = allVideoCardsPrice * 35 / 100;
        double priceOf1RamMemory = allVideoCardsPrice * 10 / 100;

        double sumOfAllGoods = allVideoCardsPrice + (processorsCount * priceOf1Processor) + (ramMemoriesCount * priceOf1RamMemory);

        //Ако броят на видеокартите е по-голям от този на процесорите, получава 15% отстъпка от крайната сметка.
        if (videoCardsCount > processorsCount) {
            sumOfAllGoods = sumOfAllGoods - (sumOfAllGoods * 15 / 100);
        }

        double differenceInMoney = Math.abs(budget - sumOfAllGoods);
        if (budget >= sumOfAllGoods) {              //•	Ако бюджетът е достатъчен:
            System.out.printf("You have %.2f leva left!", differenceInMoney);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", differenceInMoney);
        }

    }
}
