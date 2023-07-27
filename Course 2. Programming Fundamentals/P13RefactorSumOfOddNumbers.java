package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P13RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //On the first line, you will receive a number – n. This number shows how many odd numbers you should print.
        int number = Integer.parseInt(scanner.nextLine());

        //Write a program that prints the next n odd numbers (starting from 1) and on the last row prints the sum of them.
        int sum = 0;    //създаваме си променлива за сумата с начална стойност 0 - сума от цели числа е цяло число, затова я определяме като int, а не double
        for (int i = 1; i <= number * 2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);        //принтираме всяко нечетно число
                sum = sum + i;                 //намираме сумата от нечетните числа
            }
        }

        System.out.printf("Sum: %d", sum);     //принтирането на сумата трябва да е само веднъж, затова е извън цикъла
    }
}
