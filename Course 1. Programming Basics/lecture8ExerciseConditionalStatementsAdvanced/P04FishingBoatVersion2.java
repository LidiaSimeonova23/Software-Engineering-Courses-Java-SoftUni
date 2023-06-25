package lecture8ExerciseConditionalStatementsAdvanced;

import java.util.Scanner;

public class P04FishingBoatVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int availableBudget = Integer.parseInt(scanner.nextLine());        //•	Бюджет на групата – цяло число в интервала [1…8000]
        String season = scanner.nextLine();      //•	Сезон –  текст : "Spring", "Summer", "Autumn", "Winter"
        int numberOfFishermen = Integer.parseInt(scanner.nextLine());          //•	Брой рибари – цяло число в интервала [4…18]

        //•	Цената за наем на кораба през пролетта е  3000 лв.
        //•	Цената за наем на кораба през лятото и есента е  4200 лв.
        //•	Цената за наем на кораба през зимата е  2600 лв.

        //•	Ако групата е до 6 човека включително  –  отстъпка от 10%.
        //•	Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
        //•	Ако групата е от 12 нагоре  –  отстъпка от 25%.

        //Рибарите ползват допълнително 5% отстъпка, ако са четен брой освен ако не е есен - тогава нямат допълнителна отстъпка.

        double rentPriceOfShip = 0;
        if (season.equals("Spring")) {
            rentPriceOfShip = 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            rentPriceOfShip = 4200;
        } else if (season.equals("Winter")) {
            rentPriceOfShip = 2600;
        }


        if (numberOfFishermen <= 6) {
            rentPriceOfShip = rentPriceOfShip - (rentPriceOfShip * 10 / 100);
        } else if (numberOfFishermen <= 11) {
            rentPriceOfShip = rentPriceOfShip - (rentPriceOfShip * 15 / 100);
        } else {          //else if (numberOfFishermen >= 12)            //else if (numberOfFishermen > 11)
            rentPriceOfShip = rentPriceOfShip - (rentPriceOfShip * 25 / 100);
        }


        if (numberOfFishermen % 2 == 0 && !season.equals("Autumn")) {
            rentPriceOfShip = rentPriceOfShip - (rentPriceOfShip * 5 / 100);
        }


        if (availableBudget >= rentPriceOfShip) {
            System.out.printf("Yes! You have %.2f leva left.", availableBudget - rentPriceOfShip);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", rentPriceOfShip - availableBudget);
        }

    }
}


