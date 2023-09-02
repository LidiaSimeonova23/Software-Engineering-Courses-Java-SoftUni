package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P07ReversedCharsVersion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that takes 3 lines of characters and prints them in reversed order with a space between them.

        char firstSymbol = scanner.nextLine().charAt(0);   //от първия ред от конзолата четем един символ
        char secondSymbol = scanner.nextLine().charAt(0);   //от втория ред от конзолата четем един символ
        char thirdSymbol = scanner.nextLine().charAt(0);   //от третия ред от конзолата четем един символ

        //като версия 2 на тази задача, но с три команди за принтиране вместо една
        //ползваме конкатенация (долепяне)
        System.out.print(thirdSymbol + " ");     //принтираме третия символ и интервал и курсорът остава на същия ред
        System.out.print(secondSymbol + " ");     //принтираме втория символ и интервал и курсорът остава на същия ред
        System.out.print(firstSymbol);     //принтираме първия символ и курсорът остава на същия ред
    }
}
