package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P07ReversedCharsVersion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that takes 3 lines of characters and prints them in reversed order with a space between them.

        //щом 3 пъти ще четем някакъв символ, можем да ползваме for-цикъл (знаем колко ще са завъртанията/повторенията/итерациите на цикъла)
        String textFromAllSymbols = "";      //създаваме си променлива от тип String - в нея ще съхраняваме всички символи - в началото не знаем кой ще е текстът от символи, затова задаваме като начална стойност празен String
        for (int symbolInOrder = 1; symbolInOrder <= 3; symbolInOrder++) {        //symbolInOrder - пореден символ
            char currentSymbol = scanner.nextLine().charAt(0);   //на всяко завъртане на цикъла четем някакъв символ (четем цял ред от конзолата като текст и го превръщаме в символ)

            //събираме всички символи в един текст (вместо на всяка итерация на цикъла да притираме текущия символ)   - КОНКАТЕНАЦИЯ (ДОЛЕПЯНЕ)  - String + нещо (int/double/char/String) -> получава се String
            textFromAllSymbols += currentSymbol;        //textFromAllSymbols = textFromAllSymbols + currentSymbol;
        }

        //вече имаме текста от символите (в нарастващ ред -> от първия до последния, без интервал между тях)     //например "ABC"

        //искаме да принтираме текста, но в обратен ред и с интервал между символите -> ще обходим всички символи на текста, но в обратен ред (с намаляващ for цикъл) - от последния символ към първия символ:
        for (int index = textFromAllSymbols.length() - 1; index >= 0; index--) {
            char currentSymbol = textFromAllSymbols.charAt(index);

            System.out.print(currentSymbol + " ");      //на всяка итерация принтираме текущия символ и интервал след него      //и след всички итерации получаваме "C B A "
            //System.out.printf("%c ", currentSymbol);
        }

    }
}
