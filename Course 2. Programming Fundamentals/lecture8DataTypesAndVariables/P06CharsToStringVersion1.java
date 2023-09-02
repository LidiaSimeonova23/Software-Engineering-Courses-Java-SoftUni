package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P06CharsToStringVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that reads 3 lines of input. On each line, you get a single character.
        //Combine all the characters into one string and print it on the console.

        char symbol1 = scanner.nextLine().charAt(0);   //на първия ред от конзолата четем един символ
        char symbol2 = scanner.nextLine().charAt(0);   //на втория ред от конзолата четем един символ
        char symbol3 = scanner.nextLine().charAt(0);   //на третия ред от конзолата четем един символ

        System.out.printf("%c%c%c", symbol1, symbol2, symbol3);   //принтираме трите символа на един ред, залепени един за друг (и те стават String)
    }
}
