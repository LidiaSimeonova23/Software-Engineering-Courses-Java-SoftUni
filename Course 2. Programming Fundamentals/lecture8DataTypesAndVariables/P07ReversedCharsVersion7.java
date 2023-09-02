package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P07ReversedCharsVersion7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that takes 3 lines of characters and prints them in reversed order with a space between them.

        //ЗА ТОВА РЕШЕНИЕ НА ЗАДАЧАТА ПОЛЗВАМ StringBuilder (ТОЙ Е МНОГО ПО-БЪРЗ ОТ КОНКАТЕНАЦИЯТА; УЧИ СЕ В ЛЕКЦИИТЕ ЗА Text Processing)
        //StringBuilder-ът е много по-функционален (тоест, има повече готови методи) от String-а

        //щом 3 пъти ще четем някакъв символ, можем да ползваме for-цикъл (знаем колко ще са завъртанията/повторенията/итерациите на цикъла)
        StringBuilder textFromAllSymbolsSb = new StringBuilder();      //създаваме си празен StringBuilder - в него ще съхраняваме (прибавяме) всички символи
        for (int symbolInOrder = 1; symbolInOrder <= 3; symbolInOrder++) {        //symbolInOrder - пореден символ
            char currentSymbol = scanner.nextLine().charAt(0);   //на всяко завъртане на цикъла четем някакъв символ (четем цял ред от конзолата като текст и го превръщаме в символ)

            //събираме всички символи в един StringBuilder (вместо на всяка итерация на цикъла да притираме текущия символ)   ->
            textFromAllSymbolsSb.append(currentSymbol);        //на всяка итерация към StringBuilder-а долепяме текущия символ
        }

        //вече имаме StringBuilder от символите (в нарастващ ред -> от първия до последния, без интервал между тях)
        //превръщаме StringBuilder-а в String:
        String textFromAllSymbols = textFromAllSymbolsSb.toString();         //получаваме текст - например: "ABC"

        //искаме да принтираме получения текст, но в обратен ред и с интервал между символите -> ще обходим всички символи на текста, но в обратен ред (с намаляващ for цикъл) - от последния символ към първия символ:
        for (int index = textFromAllSymbols.length() - 1; index >= 0; index--) {
            char currentSymbol = textFromAllSymbols.charAt(index);

            System.out.print(currentSymbol + " ");      //на всяка итерация принтираме текущия символ и интервал след него      //и след всички итерации получаваме "C B A "
            //System.out.printf("%c ", currentSymbol);
        }


    }
}
