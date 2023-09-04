package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P08LowerOrUpperVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that prints whether a given character is upper-case or lower-case.

        char symbol = scanner.nextLine().charAt(0);     //от първия ред от конзолата четем един символ

        //в случая входните данни винаги са валидни - тоест, или ще е главна буква, или ще е малка буква (няма случай, в който входните данни да са нещо друго) ->
        if (symbol >= 'A' && symbol <= 'Z') {        //проверяваме чрез символната стойност на символа
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }

    }
}
