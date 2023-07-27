package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P09SumOfOddNumbersVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //On the first line, you will receive a number – n. This number shows how many odd numbers you should print.
        int n = Integer.parseInt(scanner.nextLine());         //променливата n е броят на нечетните числа, които трябва да принтираме

        //Write a program that prints n odd numbers (starting from 1) and on the last row prints the sum of them.
        int numberOfPrintedOddNumbers = 0;      //създаваме си променлива за броя на принтираните нечетни числа
        int currentNumber = 1;      //по условие е дадено, че първото принтирано нечетно число ще бъде 1
        int sumOfOddNumbers = 0;            //създаваме си променлива за сумата от нечетните числа (с начална стойност 0) - сума от цели числа е цяло число, затова я определяме като int, а не double
        while (numberOfPrintedOddNumbers < n) {         //докато броят на принтираните нечетни числа е по-малък от числото n, прочетено от конзолата

            if (currentNumber % 2 != 0) {         //ако текущото число е нечетно      //if (currentNumber % 2 == 1)
                //System.out.println(currentNumber);
                System.out.printf("%d%n", currentNumber);
                numberOfPrintedOddNumbers++;         //броят на принтираните нечетни числа се увеличава с единица         //numberOfPrintedOddNumbers = numberOfPrintedOddNumbers + 1;          //numberOfPrintedOddNumbers += 1;
                sumOfOddNumbers += currentNumber;       //sumOfOddNumbers = sumOfOddNumbers + currentNumber;       //намираме сумата от нечетните числа (на всяка итерация към домоментната сума прибавяме текущото нечетно число)
            }

            currentNumber++;        //update на текущото число
        }

        System.out.printf("Sum: %d", sumOfOddNumbers);       //принтираме сумата от нечетните числа (принтирането трябва да е само веднъж, затова е извън цикъла)
    }
}
