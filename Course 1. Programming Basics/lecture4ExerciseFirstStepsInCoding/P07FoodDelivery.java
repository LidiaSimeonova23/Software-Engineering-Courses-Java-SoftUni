package lecture4ExerciseFirstStepsInCoding;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Пилешко меню –  10.35 лв.
        //•	Меню с риба – 12.40 лв.
        //•	Вегетарианско меню  – 8.15 лв.
        //десерт, чиято цена е равна на 20% от общата сметка (без доставката).
        //Цената на доставка е 2.50 лв и се начислява най-накрая.

        int chickenMenus = Integer.parseInt(scanner.nextLine());           //Брой пилешки менюта – цяло число в интервала [0 … 99]
        int fishMenus = Integer.parseInt(scanner.nextLine());           //Брой менюта с риба – цяло число в интервала [0 … 99]
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());        //Брой вегетариански менюта – цяло число в интервала [0 … 99]

        double sumOfAllMenus = (chickenMenus * 10.35) + (fishMenus * 12.40) + (vegetarianMenus * 8.15);
        double priceOfDessert = sumOfAllMenus * 20 / 100;

        double totalSumIncludingDelivery = sumOfAllMenus + priceOfDessert + 2.50;
        System.out.println(totalSumIncludingDelivery);
        //System.out.printf("%f", totalSumIncludingDelivery);
    }
}
