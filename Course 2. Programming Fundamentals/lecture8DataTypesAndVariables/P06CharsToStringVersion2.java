package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P06CharsToStringVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that reads 3 lines of input. On each line, you get a single character.
        //Combine all the characters into one string and print it on the console.


        char symbol1 = scanner.nextLine().charAt(0);   //от първия ред от конзолата четем един символ
        char symbol2 = scanner.nextLine().charAt(0);   //от втория ред от конзолата четем един символ
        char symbol3 = scanner.nextLine().charAt(0);   //от третия ред от конзолата четем един символ

        System.out.print(symbol1);     //принтираме първия символ и курсорът остава на същия ред
        System.out.print(symbol2);     //принтираме втория символ и курсорът остава на същия ред
        System.out.print(symbol3);     //принтираме третия символ и курсорът остава на същия ред
    }
}
