package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P08TriangleOfNumbersVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that receives a number – n and prints a triangle from 1 to n as in the examples.
        //Constraints
        //•	n will be in the interval [1...20].

        int number = Integer.parseInt(scanner.nextLine());       //от конзолата ще прочетем едно цяло число, което ще е в диапазона от 1 до 20 включително

        for (int currentNumber = 1; currentNumber <= number; currentNumber++) {         // знаем, че цикълът ще се върти от 1 до прочетеното от конзолата число
            for (int counter = 1; counter <= currentNumber; counter++) {            //по този начин определяме колко пъти да се принтира едно и също нещо на един ред - от 1 до стойността на променливата currentNumber
                System.out.print(currentNumber + " ");      //искаме еднаквите стойности на променливата currentNumber да се принтират на един ред с разстояние между тях
            }

            System.out.println();        //сваляме курсора на следващия ред, за да може следващата поредица от числа да се принтира на нов ред
        }

    }
}
