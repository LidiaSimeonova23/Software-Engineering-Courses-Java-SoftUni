package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P09SumOfOddNumbersVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //On the first line, you will receive a number – n. This number shows how many odd numbers you should print.
        int n = Integer.parseInt(scanner.nextLine());      //променливата n е броят на нечетните числа, които трябва да принтираме

        //Write a program that prints n odd numbers (starting from 1) and on the last row prints the sum of them.
        int sumOfOddNumbers = 0;    //създаваме си променлива за сумата от нечетните числа (с начална стойност 0) - сума от цели числа е цяло число, затова я определяме като int, а не double

        for (int currentNumber = 1; currentNumber <= n * 2; currentNumber++) {      //пишем n * 2 като крайна стойност, защото след всяко нечетно число има четно число
            if (currentNumber % 2 != 0) {         //if (currentNumber % 2 == 1)
                System.out.println(currentNumber);        //принтираме текущото нечетно число
                //System.out.printf("%d%n", currentNumber);
                sumOfOddNumbers = sumOfOddNumbers + currentNumber;                 //намираме сумата от нечетните числа
            }
        }

        System.out.printf("Sum: %d", sumOfOddNumbers);     //принтираме сумата от нечетните числа (принтирането трябва да е само веднъж, затова е извън цикъла)
    }
}
