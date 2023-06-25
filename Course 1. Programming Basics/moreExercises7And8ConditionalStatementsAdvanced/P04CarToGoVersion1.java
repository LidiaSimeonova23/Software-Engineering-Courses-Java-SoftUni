package moreExercises7And8ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P04CarToGoVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableBudget = Double.parseDouble(scanner.nextLine());        //Бюджет – реално число в интервала [10.00...10000.00]
        String season = scanner.nextLine();         //Сезон – текст "Summer" или "Winter"

        //Типът коли са кабрио и джип – "Cabrio" и "Jeep".

        String typeOfClass = "";
        String carType = "";
        double priceOfCar = 0;
        if (availableBudget <= 100) {
            typeOfClass = "Economy class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                priceOfCar = availableBudget * 35 / 100;           //35% от бюджета
            } else if (season.equals("Winter")) {
                carType = "Jeep";
                priceOfCar = availableBudget * 65 / 100;           //65% от бюджета
            }
        } else if (availableBudget <= 500) {
            typeOfClass = "Compact class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                priceOfCar = availableBudget * 45 / 100;           //45% от бюджета
            } else if (season.equals("Winter")) {
                carType = "Jeep";
                priceOfCar = availableBudget * 80 / 100;           //80% от бюджета
            }
        } else if (availableBudget > 500) {
            typeOfClass = "Luxury class";
            carType = "Jeep";      //За всеки сезон колата ще е джип
            priceOfCar = availableBudget * 90 / 100;               //90% от бюджета
        }


        System.out.printf("%s%n", typeOfClass);
        System.out.printf("%s - %.2f", carType, priceOfCar);
    }
}
