package moreExercises3And4FirstStepsInCoding;

import java.util.Scanner;

public class P03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degreesInCelsius = Double.parseDouble(scanner.nextLine());   //градуси по скалата на Целзий (°C)

        double degreesInFahrenheit = (degreesInCelsius * 9 / 5) + 32;

        System.out.printf("%.2f", degreesInFahrenheit);
    }
}
