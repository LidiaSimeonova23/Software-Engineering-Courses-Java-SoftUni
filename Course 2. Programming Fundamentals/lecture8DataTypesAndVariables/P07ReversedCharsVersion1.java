package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P07ReversedCharsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that takes 3 lines of characters and prints them in reversed order with a space between them.

        char firstSymbol = scanner.nextLine().charAt(0);   //от първия ред от конзолата четем  един символ
        char secondSymbol = scanner.nextLine().charAt(0);    //от втория ред от конзолата четем  един символ
        char thirdSymbol = scanner.nextLine().charAt(0);      //от третия ред от конзолата четем един символ

        System.out.printf("%c %c %c", thirdSymbol, secondSymbol, firstSymbol);   //принтираме символите на един ред с разстояние между тях, като почваме от последния и вървим към първия символ
    }
}
