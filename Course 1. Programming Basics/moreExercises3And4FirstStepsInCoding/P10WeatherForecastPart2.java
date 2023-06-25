package moreExercises3And4FirstStepsInCoding;

import java.util.Scanner;

public class P10WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degrees = Double.parseDouble(scanner.nextLine());       //въведени градуси (реално число)

        if (degrees >= 5.00 && degrees <= 11.9) {
            System.out.println("Cold");
        } else if (degrees >= 12.00 && degrees <= 14.9) {
            System.out.println("Cool");
        } else if (degrees >= 15.00 && degrees <= 20.00) {
            System.out.println("Mild");
        } else if (degrees >= 20.1 && degrees <= 25.9) {
            System.out.println("Warm");
        } else if (degrees >= 26.00 && degrees <= 35.00) {
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }

    }
}
