package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PMoreExercises05MessagesVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());       //от първия ред на конзолата четем едно цяло число n, което е броят на числата, които ще прочетем

        //ще прочетем n на брой числа -> знаем колко пъти  -> имаме for-цикъл (от 1 до n включително)
        //на всяка итерация на цикъла четем текущото число и принтираме съответния текст (искаме всички текстове да се принтират на 1 ред, залепени един за друг)
        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            //проверяваме кое е числото и принтираме съответния текст (някоя буква или space/интервал)
            if (currentNumber == 2) {
                System.out.print("a");
            } else if (currentNumber == 22) {
                System.out.print("b");
            } else if (currentNumber == 222) {
                System.out.print("c");
            } else if (currentNumber == 3) {
                System.out.print("d");
            } else if (currentNumber == 33) {
                System.out.print("e");
            } else if (currentNumber == 333) {
                System.out.print("f");
            } else if (currentNumber == 4) {
                System.out.print("g");
            } else if (currentNumber == 44) {
                System.out.print("h");
            } else if (currentNumber == 444) {
                System.out.print("i");
            } else if (currentNumber == 5) {
                System.out.print("j");
            } else if (currentNumber == 55) {
                System.out.print("k");
            } else if (currentNumber == 555) {
                System.out.print("l");
            } else if (currentNumber == 6) {
                System.out.print("m");
            } else if (currentNumber == 66) {
                System.out.print("n");
            } else if (currentNumber == 666) {
                System.out.print("o");
            } else if (currentNumber == 7) {
                System.out.print("p");
            } else if (currentNumber == 77) {
                System.out.print("q");
            } else if (currentNumber == 777) {
                System.out.print("r");
            } else if (currentNumber == 7777) {
                System.out.print("s");
            } else if (currentNumber == 8) {
                System.out.print("t");
            } else if (currentNumber == 88) {
                System.out.print("u");
            } else if (currentNumber == 888) {
                System.out.print("v");
            } else if (currentNumber == 9) {
                System.out.print("w");
            } else if (currentNumber == 99) {
                System.out.print("x");
            } else if (currentNumber == 999) {
                System.out.print("y");
            } else if (currentNumber == 9999) {
                System.out.print("z");
            } else if (currentNumber == 0) {
                System.out.print(" ");
            }

        }


    }
}
