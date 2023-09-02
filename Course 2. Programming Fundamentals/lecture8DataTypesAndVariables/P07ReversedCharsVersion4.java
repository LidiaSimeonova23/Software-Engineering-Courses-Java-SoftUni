package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P07ReversedCharsVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that takes 3 lines of characters and prints them in reversed order with a space between them.

        String firstSymbol = scanner.nextLine();   //от първия ред от конзолата четем  един символ  (но в случая можем да го четем и като String, а не като char)
        String secondSymbol = scanner.nextLine();   //от втория ред от конзолата четем  един символ (но в случая можем да го четем и като String, а не като char)
        String thirdSymbol = scanner.nextLine();     //от третия ред от конзолата четем един символ (но в случая можем да го четем и като String, а не като char)

        System.out.printf("%s %s %s", thirdSymbol, secondSymbol, firstSymbol);   //принтираме символите на един ред с разстояние между тях, като почваме от последния и вървим към първия
        //System.out.println(thirdSymbol + " " + secondSymbol + " " + firstSymbol);        //може и чрез конкатенация (долепяне)
    }
}
