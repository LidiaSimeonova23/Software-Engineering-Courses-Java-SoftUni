package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PMoreExercises05MessagesVersion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());       //от първия ред на конзолата четем едно цяло число n, което е броят на числата, които ще прочетем

        //ще прочетем n на брой числа -> знаем колко пъти  -> имаме for-цикъл (от 1 до n включително)
        //на всяка итерация на цикъла четем текущото число (но в случая четем текст) и принтираме съответния символ (искаме всички символи да се принтират на 1 ред, залепени един за друг)
        for (int i = 1; i <= n; i++) {
            String currentNumberAsText = scanner.nextLine();       //в случая не е нужно да превръщаме текста в число (няма да извършваме аритм. операции и/или сравнения с него), оставяме си го като текст

            //проверяваме кое е числото (кой е текстът в случая) и принтираме съответния символ (някоя буква или space/интервал)
            if (currentNumberAsText.contains("2")) {
                if (currentNumberAsText.length() == 1) {            //прочетеният текст е "2"
                    System.out.print('a');
                } else if (currentNumberAsText.length() == 2) {     //прочетеният текст е "22"
                    System.out.print('b');
                } else if (currentNumberAsText.length() == 3) {     //прочетеният текст е "222"
                    System.out.print('c');
                }
            } else if (currentNumberAsText.contains("3")) {
                if (currentNumberAsText.length() == 1) {
                    System.out.print('d');
                } else if (currentNumberAsText.length() == 2) {
                    System.out.print('e');
                } else if (currentNumberAsText.length() == 3) {
                    System.out.print('f');
                }
            } else if (currentNumberAsText.contains("4")) {
                if (currentNumberAsText.length() == 1) {
                    System.out.print('g');
                } else if (currentNumberAsText.length() == 2) {
                    System.out.print('h');
                } else if (currentNumberAsText.length() == 3) {
                    System.out.print('i');
                }
            } else if (currentNumberAsText.contains("5")) {
                if (currentNumberAsText.length() == 1) {
                    System.out.print('j');
                } else if (currentNumberAsText.length() == 2) {
                    System.out.print('k');
                } else if (currentNumberAsText.length() == 3) {
                    System.out.print('l');
                }
            } else if (currentNumberAsText.contains("6")) {
                if (currentNumberAsText.length() == 1) {
                    System.out.print('m');
                } else if (currentNumberAsText.length() == 2) {
                    System.out.print('n');
                } else if (currentNumberAsText.length() == 3) {
                    System.out.print('o');
                }
            } else if (currentNumberAsText.contains("7")) {
                if (currentNumberAsText.length() == 1) {
                    System.out.print('p');
                } else if (currentNumberAsText.length() == 2) {
                    System.out.print('q');
                } else if (currentNumberAsText.length() == 3) {
                    System.out.print('r');
                } else if (currentNumberAsText.length() == 4) {
                    System.out.print('s');
                }
            } else if (currentNumberAsText.contains("8")) {
                if (currentNumberAsText.length() == 1) {
                    System.out.print('t');
                } else if (currentNumberAsText.length() == 2) {
                    System.out.print('u');
                } else if (currentNumberAsText.length() == 3) {
                    System.out.print('v');
                }
            } else if (currentNumberAsText.contains("9")) {
                if (currentNumberAsText.length() == 1) {
                    System.out.print('w');
                } else if (currentNumberAsText.length() == 2) {
                    System.out.print('x');
                } else if (currentNumberAsText.length() == 3) {
                    System.out.print('y');
                } else if (currentNumberAsText.length() == 4) {
                    System.out.print('z');
                }
            } else if (currentNumberAsText.equals("0")) {
                System.out.print(' ');    //символ space (интервал)
            }

        }


    }
}
