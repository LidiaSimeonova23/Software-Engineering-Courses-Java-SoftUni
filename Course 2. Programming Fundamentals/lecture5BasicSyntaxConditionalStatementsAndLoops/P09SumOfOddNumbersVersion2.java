package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P09SumOfOddNumbersVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //On the first line, you will receive a number – n. This number shows how many odd numbers you should print.
        int n = Integer.parseInt(scanner.nextLine());      //променливата n е броят на нечетните числа, които трябва да принтираме

        //Write a program that prints n odd numbers (starting from 1) and on the last row prints the sum of them.
        int sumOfOddNumbers = 0;    //създаваме си променлива за сумата с начална стойност 0 - сума от цели числа е цяло число, затова я определяме като int, а не double

        for (int currentOddNumber = 1; currentOddNumber <= n * 2; currentOddNumber += 2) {     //промяната стойността на променливата става с 2 (1, 3, 5 и т. нат. са нечетните числа)    //спестяваме си ненужните итерации (взимаме само нечетните числа чрез стъпка += 2)
            System.out.println(currentOddNumber);        //принтираме всяко нечетно число      //няма нужда от проверка дали текущото число е нечетно, защото в условието на цикъла сме си осигурили, че ще взимаме само нечетните числа
            //System.out.printf("%d%n", currentOddNumber);
            sumOfOddNumbers = sumOfOddNumbers + currentOddNumber;                 //намираме сумата от нечетните числа
        }

        System.out.printf("Sum: %d", sumOfOddNumbers);     //принтираме сумата от нечетните числа (принтирането трябва да е само веднъж, затова е извън цикъла)
    }
}
