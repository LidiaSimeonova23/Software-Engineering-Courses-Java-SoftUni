package pbExam1Date28And29March2020;

import java.util.Scanner;

public class P01BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rentForTheHall = Double.parseDouble(scanner.nextLine());           //•	Наем за залата – реално число в интервала [100.00..10000.00]

        //какъв бюджет ще бъде необходим за организиране на тържеството

        //следната информация за допълнителните неща, необходими за тържеството:
        //•	Торта  – цената ѝ е 20% от наема на залата
        //•	Напитки – цената им е 45% по-малко от тази на тортата
        //•	Аниматор – цената му е 1/3 от цената за наема на залата

        double birthdayCakePrice = rentForTheHall * 20 / 100;
        double drinksPrice = birthdayCakePrice - (birthdayCakePrice * 45 / 100);
        double moneyForAnimator = rentForTheHall * 1 / 3;

        double necessaryBudget = rentForTheHall + birthdayCakePrice + drinksPrice + moneyForAnimator;
        System.out.println(necessaryBudget);
        //System.out.printf("%.1f", necessaryBudget);
    }
}
