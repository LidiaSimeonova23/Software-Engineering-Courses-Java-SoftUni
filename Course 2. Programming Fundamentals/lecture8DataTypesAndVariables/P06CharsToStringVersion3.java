package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P06CharsToStringVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that reads 3 lines of input. On each line, you get a single character.
        //Combine all the characters into one string and print it on the console.

        //щом 3 пъти ще четем някакъв символ, можем да ползваме for-цикъл (знаем колко ще са завъртанията/повторенията/итерациите на цикъла)
        for (int symbolInOrder = 1; symbolInOrder <= 3; symbolInOrder++) {        //symbolInOrder - пореден символ
            char currentSymbol = scanner.nextLine().charAt(0);   //на всяко завъртане на цикъла четем някакъв символ (четем цял ред от конзолата като текст и го превръщаме в символ)

            System.out.printf("%c", currentSymbol);    //на всяка итерация на цикъла притираме текущия символ  //принтираме символите на един ред, залепени един за друг
            //System.out.print(currentSymbol);
        }

    }
}
