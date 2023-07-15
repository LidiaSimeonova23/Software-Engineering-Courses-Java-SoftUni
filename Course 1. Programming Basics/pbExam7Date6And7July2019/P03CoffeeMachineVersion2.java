package pbExam7Date6And7July2019;

import java.util.Scanner;

public class P03CoffeeMachineVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входът се чете от конзолата и се състои от три реда:
        String drink = scanner.nextLine();       //напитка - текст с възможности: "Espresso", "Cappuccino" или "Tea"
        String additivesToDrink = scanner.nextLine();     //захар - текст  с възможности: "Without", "Normal" или "Extra"
        int numberOfDrinks = Integer.parseInt(scanner.nextLine());       //брой напитки - цяло число в интервала [1… 50]

        double unitPrice = 0;       //създаваме си променлива за цената на 1 напитка
        if (drink.equals("Espresso")) {
            if (additivesToDrink.equals("Without")) {
                unitPrice = 0.90;
            } else if (additivesToDrink.equals("Normal")) {
                unitPrice = 1;
            } else if (additivesToDrink.equals("Extra")) {
                unitPrice = 1.20;
            }
        } else if (drink.equals("Cappuccino")) {
            if (additivesToDrink.equals("Without")) {
                unitPrice = 1.00;
            } else if (additivesToDrink.equals("Normal")) {
                unitPrice = 1.20;
            } else if (additivesToDrink.equals("Extra")) {
                unitPrice = 1.60;
            }
        } else if (drink.equals("Tea")) {
            if (additivesToDrink.equals("Without")) {
                unitPrice = 0.50;
            } else if (additivesToDrink.equals("Normal")) {
                unitPrice = 0.60;
            } else if (additivesToDrink.equals("Extra")) {
                unitPrice = 0.70;
            }
        }

        //следните отстъпки:
        //При избрана напитка без захар има 35% отстъпка.      -> цената е 65% от цената
        if (additivesToDrink.equals("Without")) {
            unitPrice = unitPrice * 65 * 0.01;
        }

        //При избрана напитка "Espresso" и закупени поне 5 броя, има 25% отстъпка.   -> цената е 75% от цената
        if (drink.equals("Espresso") && numberOfDrinks >= 5) {
            unitPrice = unitPrice * 75 * 0.01;
        }

        //намираме цената на всичките напитки
        double totalPriceOfAllDrinks = numberOfDrinks * unitPrice;

        //При сума, надвишаваща 15 лева, 20% отстъпка от крайната цена.     -> цената е 80% от цената
        if (totalPriceOfAllDrinks > 15) {
            totalPriceOfAllDrinks = totalPriceOfAllDrinks * 80 * 0.01;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", numberOfDrinks, drink, totalPriceOfAllDrinks);
    }
}
