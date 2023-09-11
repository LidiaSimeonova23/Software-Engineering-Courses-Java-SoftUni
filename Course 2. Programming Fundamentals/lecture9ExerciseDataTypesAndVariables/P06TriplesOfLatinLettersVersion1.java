package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P06TriplesOfLatinLettersVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от първия ред на конзолата четем 1 цяло число - то е броят букви (само малки) от латинската азбука, които трябва да комбинираме (комбинацията винаги ще е от три малки букви)
        int numberOfLetters = Integer.parseInt(scanner.nextLine());

        //например, ако числото е 3 -> тройки от символи: {буква1}{буква2}{буква3}    - комбинацията, която трябва да се принтира, винаги ще е от три малки букви (затова ще имаме 3 вложени цикъла), без значение колко на брой са самите букви -> for loop
        //например, ако числото е 5 -> тройки от символи: {буква1}{буква2}{буква3}    - комбинацията, която трябва да се принтира, винаги ще е от три малки букви (затова ще имаме 3 вложени цикъла), без значение колко на брой са самите букви -> for loop
        //латинската азбука винаги почва от буква a -> 1 символ -> 'a'   -> определяме променливата да е от тип char
        for (char letter1 = 'a'; letter1 < 'a' + numberOfLetters; letter1++) {        //за първия символ
            for (char letter2 = 'a'; letter2 < 'a' + numberOfLetters; letter2++) {         //за втория символ
                for (char letter3 = 'a'; letter3 < 'a' + numberOfLetters; letter3++) {         //за третия символ

                    System.out.printf("%c%c%c%n", letter1, letter2, letter3);   //на всяка итерация на цикъла принтираме текущата стойност на всяка една от променливите  - всяка поредица от три символа да е на нов ред
                }
            }
        }

    }
}
