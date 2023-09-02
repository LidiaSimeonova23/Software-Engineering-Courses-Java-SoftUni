package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P06CharsToStringVersion7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that reads 3 lines of input. On each line, you get a single character.
        //Combine all the characters into one string and print it on the console.

        //ЗА ТОВА РЕШЕНИЕ НА ЗАДАЧАТА ПОЛЗВАМ StringBuilder (ТОЙ Е МНОГО ПО-БЪРЗ ОТ КОНКАТЕНАЦИЯТА; УЧИ СЕ В ЛЕКЦИИТЕ ЗА Text Processing)
        //StringBuilder-ът е много по-функционален (тоест, има повече готови методи) от String-а

        //щом 3 пъти ще четем някакъв символ, можем да ползваме for-цикъл (знаем колко ще са завъртанията/повторенията/итерациите на цикъла)
        StringBuilder textFromAllSymbolsSb = new StringBuilder();      //създаваме си празен StringBuilder - в него ще съхраняваме (прибавяме) всички символи
        for (int symbolInOrder = 1; symbolInOrder <= 3; symbolInOrder++) {        //symbolInOrder - пореден символ
            char currentSymbol = scanner.nextLine().charAt(0);   //на всяко завъртане на цикъла четем някакъв символ (четем цял ред от конзолата като текст и го превръщаме в символ)

            //събираме всички символи в един StringBuilder (вместо на всяка итерация на цикъла да притираме текущия символ)   ->
            textFromAllSymbolsSb.append(currentSymbol);        //на всяка итерация към StringBuilder-а долепяме текущия символ
        }

        //накрая само веднъж (извън цикъла) принтираме получения StringBuilder, превърнат в текст:
        System.out.println(textFromAllSymbolsSb.toString());
        //System.out.printf("%s", textFromAllSymbolsSb.toString());
    }
}
