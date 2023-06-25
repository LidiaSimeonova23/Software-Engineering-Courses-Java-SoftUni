package moreExercises7And8ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P06TruckDriverVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();      //Сезон – текст "Spring", "Summer", "Autumn" или "Winter"
        double kilometresPerMonth = Double.parseDouble(scanner.nextLine());       //Километри на месец – реално число в интервала [10.00...20000.00]

        double pricePerKilometre = 0;
        if (kilometresPerMonth <= 5000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                pricePerKilometre = 0.75;
            } else if (season.equals("Summer")) {
                pricePerKilometre = 0.90;
            } else if (season.equals("Winter")) {
                pricePerKilometre = 1.05;
            }
        } else if (kilometresPerMonth <= 10000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                pricePerKilometre = 0.95;
            } else if (season.equals("Summer")) {
                pricePerKilometre = 1.10;
            } else if (season.equals("Winter")) {
                pricePerKilometre = 1.25;
            }
        } else if (kilometresPerMonth <= 20000) {
            pricePerKilometre = 1.45;
        }

        //Един сезон е 4 месеца.
        double totalPriceOfAllKilometresPerSeason = 4 * (kilometresPerMonth * pricePerKilometre);   //намираме цената на всички км за 4 месеца (което би трябвало да е заплатата за 1 сезон)

        //извадени са 10% за данъци
        totalPriceOfAllKilometresPerSeason = totalPriceOfAllKilometresPerSeason - (totalPriceOfAllKilometresPerSeason * 10 / 100);
        System.out.printf("%.2f", totalPriceOfAllKilometresPerSeason);
    }
}
