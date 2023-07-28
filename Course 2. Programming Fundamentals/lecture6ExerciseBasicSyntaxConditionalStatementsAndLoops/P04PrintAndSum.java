package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program to display numbers from given start to given end and their sumOfAllNumbers. All the numbers will be integers.
        //On the first line, you will receive the start number, on the second the end number.
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int sumOfAllNumbers = 0;      //създаваме си променлива за сумата от числата, задаваме й начална стойност 0
        for (int currentNumber = startNumber; currentNumber <= endNumber; currentNumber++) {            //за име на променливата ползвам currentNumber вместо i
            System.out.printf("%d ", currentNumber);     //принтираме всички стойности на променливата currentNumber на един ред с 1 интервал между тях
            //System.out.print(currentNumber + " ");    //- чрез конкатенация (долепяне)   - тя е бавен процес, затова в случая форматираното принтиране е по-добрият вариант
            sumOfAllNumbers += currentNumber;   //sumOfAllNumbers = sumOfAllNumbers + currentNumber;       //намираме сумата от всички стойности на променливата currentNumber
        }

        System.out.println();            //сваляме курсора на следващия ред (за да може следващото принтиране да е на нов ред)
        System.out.printf("Sum: %d", sumOfAllNumbers);          //принтираме сумата от стойностите на променливата i
    }
}
