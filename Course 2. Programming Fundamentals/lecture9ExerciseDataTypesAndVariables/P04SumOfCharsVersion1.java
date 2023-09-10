package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P04SumOfCharsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numberOfSymbols = Byte.parseByte(scanner.nextLine());      //може и така: int numberOfSymbols = Integer.parseInt(scanner.nextLine());   //от първия ред на конзолата четем едно цяло число в интервал от 1 до 20 вкл.

        //многократно ще четем входни данни - толкова пъти, колкото е числото, прочетено от първия ред на конзолата -> значи имаме типичен FOR LOOP
        int sum = 0;     //създаваме си променлива за сумата от целочислените стойности на всички символи
        for (int i = 1; i <= numberOfSymbols; i++) {
            char currentSymbol = scanner.nextLine().charAt(0);    //на всяка итерация на цикъла четем текущия символ     //символът ще е малка или главна буква от англ. азбука

            sum += currentSymbol;      //sum = sum + currentSymbol;    //на всяка итерация на цикъла към домоментната сума от символите добавяме целочислената стойност (ASCII кода) на текущия символ
        }

        System.out.printf("The sum equals: %d", sum);   //извън цикъла (само веднъж) принтираме крайната сума от всички символи
    }
}
