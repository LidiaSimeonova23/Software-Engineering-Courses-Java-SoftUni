package moreExercises7And8ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P10MultiplyBy2Version2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //на всяка итерация на цикъла ще се чете реално число

        double number = Double.parseDouble(scanner.nextLine());
        while (number >= 0) {
            System.out.printf("Result: %.2f%n", number * 2);

            number = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Negative number!");
    }
}
