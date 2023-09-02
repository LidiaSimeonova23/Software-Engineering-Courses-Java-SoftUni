package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P07ReversedCharsVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that takes 3 lines of characters and prints them in reversed order with a space between them.

        char firstSymbol = scanner.nextLine().charAt(0);   //от първия ред от конзолата четем  един символ
        char secondSymbol = scanner.nextLine().charAt(0);    //от втория ред от конзолата четем  един символ
        char thirdSymbol = scanner.nextLine().charAt(0);      //от третия ред от конзолата четем един символ

        String result = String.format("%c %c %c", thirdSymbol, secondSymbol, firstSymbol);    //създаваме си допълнителна променлива от тип String, която да държи цялата информация, и ползваме метода String.format
        System.out.println(result);   //принтираме променливата
    }
}
