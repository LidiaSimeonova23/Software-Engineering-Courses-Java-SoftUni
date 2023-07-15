package pbExam7Date6And7July2019;

import java.util.Scanner;

public class P03CoffeeMachineVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входът се чете от конзолата и се състои от три реда:
        String drink = scanner.nextLine();       //напитка - текст с възможности: "Espresso", "Cappuccino" или "Tea"
        String additivesToDrink = scanner.nextLine();     //захар - текст  с възможности: "Without", "Normal" или "Extra"
        int numberOfDrinks = Integer.parseInt(scanner.nextLine());       //брой напитки - цяло число в интервала [1… 50]

        double unitPrice = 0;       //създаваме си променлива за цената на 1 напитка
        switch (drink) {
            case "Espresso":
                if (additivesToDrink.equals("Without")) {
                    unitPrice = 0.90;
                } else if (additivesToDrink.equals("Normal")) {
                    unitPrice = 1;
                } else if (additivesToDrink.equals("Extra")) {
                    unitPrice = 1.20;
                }
                break;
            case "Cappuccino":
                if (additivesToDrink.equals("Without")) {
                    unitPrice = 1.00;
                } else if (additivesToDrink.equals("Normal")) {
                    unitPrice = 1.20;
                } else if (additivesToDrink.equals("Extra")) {
                    unitPrice = 1.60;
                }
                break;
            case "Tea":
                if (additivesToDrink.equals("Without")) {
                    unitPrice = 0.50;
                } else if (additivesToDrink.equals("Normal")) {
                    unitPrice = 0.60;
                } else if (additivesToDrink.equals("Extra")) {
                    unitPrice = 0.70;
                }
                break;
        }

        //следните отстъпки:
        //При избрана напитка без захар има 35% отстъпка.
        if (additivesToDrink.equals("Without")) {
            unitPrice = unitPrice - (unitPrice * 35 / 100);
        }

        //При избрана напитка "Espresso" и закупени поне 5 броя, има 25% отстъпка.
        if (drink.equals("Espresso") && numberOfDrinks >= 5) {
            unitPrice = unitPrice - (unitPrice * 25 / 100);
        }

        //намираме цената на всичките напитки
        double totalPriceOfAllDrinks = numberOfDrinks * unitPrice;

        //При сума, надвишаваща 15 лева, 20% отстъпка от крайната цена.
        if (totalPriceOfAllDrinks > 15) {
            totalPriceOfAllDrinks = totalPriceOfAllDrinks - (totalPriceOfAllDrinks * 20 / 100);
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", numberOfDrinks, drink, totalPriceOfAllDrinks);
    }
}
