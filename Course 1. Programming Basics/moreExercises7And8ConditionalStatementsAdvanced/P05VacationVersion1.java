package moreExercises7And8ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P05VacationVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableBudget = Double.parseDouble(scanner.nextLine());        //Бюджет – реално число в интервала [10.00...10000.00]
        String season = scanner.nextLine();       //Сезон – текст "Summer" или "Winter"

        //Локациите са – "Alaska" и "Morocco".
        //Възможните места за настаняване – "Hotel", "Hut" или "Camp".

        String typeOfStay = "";
        String destination = "";
        double price = 0;
        if (availableBudget <= 1000) {
            typeOfStay = "Camp";
            if (season.equals("Summer")) {
                destination = "Alaska";
                price = availableBudget * 65 / 100;           //65% от бюджета
            } else if (season.equals("Winter")) {
                destination = "Morocco";
                price = availableBudget * 45 / 100;           //45% от бюджета
            }
        } else if (availableBudget <= 3000) {
            typeOfStay = "Hut";
            if (season.equals("Summer")) {
                destination = "Alaska";
                price = availableBudget * 80 / 100;           //80% от бюджета
            } else if (season.equals("Winter")) {
                destination = "Morocco";
                price = availableBudget * 60 / 100;           //60% от бюджета
            }
        } else if (availableBudget > 3000) {
            typeOfStay = "Hotel";
            if (season.equals("Summer")) {
                destination = "Alaska";
            } else if (season.equals("Winter")) {
                destination = "Morocco";
            }
            price = availableBudget * 90 / 100;           //90% от бюджета
        }


        System.out.printf("%s - %s - %.2f", destination, typeOfStay, price);
    }
}
