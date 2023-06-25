package moreExercises7And8ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P01MatchTicketsVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableBudget = Double.parseDouble(scanner.nextLine());        //бюджетът – реално число в интервала [1 000.00 ... 1 000 000.00]
        String ticketType = scanner.nextLine();         //категорията – "VIP" или "Normal"
        int numberOfPeopleInTheGroup = Integer.parseInt(scanner.nextLine());        //броят на хората в групата – цяло число в интервала [1 ... 200]

        //процент от бюджета трябва да се задели за транспорт:
        //Ако броят хора в групата е от 1 до 4 – 75% от бюджета.
        //От 5 до 9 – 60% от бюджета.
        //От 10 до 24 – 50% от бюджета.
        //От 25 до 49 – 40% от бюджета.
        //50 или повече – 25% от бюджета.

        //намираме цената на транспорта:
        double transportPrice = 0;
        if (numberOfPeopleInTheGroup >= 1 && numberOfPeopleInTheGroup <= 4) {
            transportPrice = availableBudget * 75 / 100;
        } else if (numberOfPeopleInTheGroup <= 9) {
            transportPrice = availableBudget * 60 / 100;
        } else if (numberOfPeopleInTheGroup <= 24) {
            transportPrice = availableBudget * 50 / 100;
        } else if (numberOfPeopleInTheGroup <= 49) {
            transportPrice = availableBudget * 40 / 100;
        } else {       //else if (numberOfPeopleInTheGroup >= 50)
            transportPrice = availableBudget * 25 / 100;
        }

        //на наличния бюджет ще му присвоим нова стойност (от първоначалния наличен бюджет ще извадим цената на транспорта)
        availableBudget = availableBudget - transportPrice;

        //2 вида билети: 	VIP – 499.99 лева    и   Normal – 249.99 лева.
        double ticketPrice = 0;
        double necessarySumForTickets = 0;
        if (ticketType.equals("VIP")) {
            ticketPrice = 499.99;
            necessarySumForTickets = numberOfPeopleInTheGroup * ticketPrice;
        } else if (ticketType.equals("Normal")) {
            ticketPrice = 249.99;
            necessarySumForTickets = numberOfPeopleInTheGroup * ticketPrice;
        }


        if (availableBudget >= necessarySumForTickets) {        //•	Ако бюджетът е достатъчен
            System.out.printf("Yes! You have %.2f leva left.", availableBudget - necessarySumForTickets);
        } else {         //•	Ако бюджетът НЕ Е достатъчен
            System.out.printf("Not enough money! You need %.2f leva.", necessarySumForTickets - availableBudget);
        }

    }
}
