package moreExercises11And12WhileLoop;

import java.util.Scanner;

public class P05AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCount = Integer.parseInt(scanner.nextLine());        //число, което ще показва броя на числата, които ще прочетем (цяло число)

        //програма, която прочита едно число n, след това прочита n на брой цели числа и принтира средно аритметичното на тяхната сума число, форматирано до втората цифра след десетичния знак

        int sumOfNumbers = 0;
        for (int i = 1; i <= numbersCount; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            sumOfNumbers = sumOfNumbers + currentNumber;
        }

        double averageNumber = sumOfNumbers * 1.0 / numbersCount;
        System.out.printf("%.2f", averageNumber);
    }
}
