package moreExercises9And10ForLoop;

import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPairs = Integer.parseInt(scanner.nextLine());        //брой двойки - цяло числа


        //на всяка итерация на цикъла ще четем по две числа, които са в една двойка
        //int currentSumOfTheTwoNumbers = 0;
        int previousSum = 0;
        int difference = 0;
        int maxDifference = Integer.MIN_VALUE;
        for (int pair = 1; pair <= numberOfPairs; pair++) {      //за да си построя цикъла, съм ползвала като име на променлива pair вместо i
            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());

            int currentSumOfTheTwoNumbers = number1 + number2;

            if (pair > 1) {
                difference = Math.abs(previousSum - currentSumOfTheTwoNumbers);
            }

            previousSum = currentSumOfTheTwoNumbers;
        }


        if (difference == 0) {
            System.out.printf("Yes, value=%s", previousSum);
        } else {
            System.out.printf("No, maxdiff=%s", difference);
        }


    }
}
