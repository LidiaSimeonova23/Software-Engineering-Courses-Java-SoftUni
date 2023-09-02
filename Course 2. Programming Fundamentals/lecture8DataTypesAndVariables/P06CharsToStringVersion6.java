package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P06CharsToStringVersion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that reads 3 lines of input. On each line, you get a single character.
        //Combine all the characters into one string and print it on the console.

        //щом 3 пъти ще четем някакъв символ, можем да ползваме for-цикъл (знаем колко ще са завъртанията/повторенията/итерациите на цикъла)
        String textFromAllSymbols = "";      //създаваме си променлива от тип String - в нея ще съхраняваме всички символи - в началото не знаем кой ще е текстът от символи, затова задаваме като начална стойност празен String
        for (int symbolInOrder = 1; symbolInOrder <= 3; symbolInOrder++) {        //symbolInOrder - пореден символ
            char currentSymbol = scanner.nextLine().charAt(0);   //на всяко завъртане на цикъла четем някакъв символ (четем цял ред от конзолата като текст и го превръщаме в символ)

            //събираме всички символи в един текст (вместо на всяка итерация на цикъла да притираме текущия символ)   - КОНКАТЕНАЦИЯ (ДОЛЕПЯНЕ)  - String + нещо (int/double/char/String) -> получава се String
            textFromAllSymbols += currentSymbol;        //textFromAllSymbols = textFromAllSymbols + currentSymbol;
        }

        //накрая само веднъж (извън цикъла) принтираме получения текст от символи:
        System.out.println(textFromAllSymbols);
        //System.out.printf("%s", textFromAllSymbols);
    }
}
