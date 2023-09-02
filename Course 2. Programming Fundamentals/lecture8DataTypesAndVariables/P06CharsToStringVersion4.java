package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P06CharsToStringVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that reads 3 lines of input. On each line, you get a single character.
        //Combine all the characters into one string and print it on the console.


        char symbol1 = scanner.nextLine().charAt(0);   //от първия ред от конзолата четем един символ
        char symbol2 = scanner.nextLine().charAt(0);   //от втория ред от конзолата четем един символ
        char symbol3 = scanner.nextLine().charAt(0);   //от третия ред от конзолата четем един символ

        String result = String.format("%c%c%c", symbol1, symbol2, symbol3);    //създаваме си допълнителна променлива (result) от тип String, която да държи цялата информация - чрез метода String.format
        System.out.println(result);   //принтираме променливата
    }
}
