package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PMoreExercises05MessagesVersion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());       //от първия ред на конзолата четем едно цяло число n, което е броят на числата, които ще прочетем

        //ще прочетем n на брой числа -> знаем колко пъти  -> имаме for-цикъл (от 1 до n включително)
        //на всяка итерация на цикъла четем текущото число (но в случая четем текст) и принтираме съответния символ (искаме всички символи да се принтират на 1 ред, залепени един за друг)
        for (int i = 1; i <= n; i++) {
            String currentNumber = scanner.nextLine();       //в случая не е нужно да превръщаме текста в число (няма да извършваме аритм. операции и/или сравнения с него), оставяме си го като текст

            //проверяваме кое е числото (кой е текстът в случая) и принтираме съответния символ (някоя буква или space/интервал)
            if (currentNumber.equals("2")) {
                System.out.print('a');
            } else if (currentNumber.equals("22")) {
                System.out.print('b');
            } else if (currentNumber.equals("222")) {
                System.out.print('c');
            } else if (currentNumber.equals("3")) {
                System.out.print('d');
            } else if (currentNumber.equals("33")) {
                System.out.print('e');
            } else if (currentNumber.equals("333")) {
                System.out.print('f');
            } else if (currentNumber.equals("4")) {
                System.out.print('g');
            } else if (currentNumber.equals("44")) {
                System.out.print('h');
            } else if (currentNumber.equals("444")) {
                System.out.print('i');
            } else if (currentNumber.equals("5")) {
                System.out.print('j');
            } else if (currentNumber.equals("55")) {
                System.out.print('k');
            } else if (currentNumber.equals("555")) {
                System.out.print('l');
            } else if (currentNumber.equals("6")) {
                System.out.print('m');
            } else if (currentNumber.equals("66")) {
                System.out.print('n');
            } else if (currentNumber.equals("666")) {
                System.out.print('o');
            } else if (currentNumber.equals("7")) {
                System.out.print('p');
            } else if (currentNumber.equals("77")) {
                System.out.print('q');
            } else if (currentNumber.equals("777")) {
                System.out.print('r');
            } else if (currentNumber.equals("7777")) {
                System.out.print('s');
            } else if (currentNumber.equals("8")) {
                System.out.print('t');
            } else if (currentNumber.equals("88")) {
                System.out.print('u');
            } else if (currentNumber.equals("888")) {
                System.out.print('v');
            } else if (currentNumber.equals("9")) {
                System.out.print('w');
            } else if (currentNumber.equals("99")) {
                System.out.print('x');
            } else if (currentNumber.equals("999")) {
                System.out.print('y');
            } else if (currentNumber.equals("9999")) {
                System.out.print('z');
            } else if (currentNumber.equals("0")) {
                System.out.print(' ');    //символ space (интервал)
            }

        }


    }
}
