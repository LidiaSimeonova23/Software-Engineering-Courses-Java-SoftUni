package moreExercises7And8ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P10MultiplyBy2Version1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //на всяка итерация на цикъла ще се чете реално число

        double number = Double.parseDouble(scanner.nextLine());
        while (number >= 0) {
            double result = number * 2;
            System.out.printf("Result: %.2f%n", result);

            number = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Negative number!");
    }
}
