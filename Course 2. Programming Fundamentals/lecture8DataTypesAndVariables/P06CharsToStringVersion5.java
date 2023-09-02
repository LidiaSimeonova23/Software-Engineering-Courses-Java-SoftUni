package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P06CharsToStringVersion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that reads 3 lines of input. On each line, you get a single character.
        //Combine all the characters into one string and print it on the console.


        char symbol1 = scanner.nextLine().charAt(0);   //от първия ред от конзолата четем един символ
        char symbol2 = scanner.nextLine().charAt(0);   //от втория ред от конзолата четем един символ
        char symbol3 = scanner.nextLine().charAt(0);   //от третия ред от конзолата четем един символ

        //можем да ползваме конкатенация, но за целта трябва да имаме поне една променлива от тип String - в случая до момента няма такава, но пък винаги можем да си създадем ->
        String additionalSymbol = "";       //създаваме си допълнителна String променлива, на която присвояваме като начална стойност празен String
        System.out.println("" + symbol1 + symbol2 + symbol3);   //принтираме трите символа на един ред, залепени един за друг (и те стават String) чрез конкатенация (долепяне)
        //System.out.println(additionalSymbol + symbol1 + symbol2 + symbol3);
    }
}
