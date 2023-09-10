package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P04SumOfCharsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ТОВА РЕШЕНИЕ Е КАТО ВЕРСИЯ 1, НО Е ПО-НАКРАТКО НАПИСАНО (сумирането в цикъла е написано директно само с 1 ред код):

        byte numberOfSymbols = Byte.parseByte(scanner.nextLine());      //може и така: int numberOfSymbols = Integer.parseInt(scanner.nextLine());   //от първия ред на конзолата четем едно цяло число в интервал от 1 до 20 вкл.

        //многократно ще четем входни данни - толкова пъти, колкото е числото, прочетено от първия ред на конзолата -> значи имаме типичен FOR LOOP
        int sum = 0;    //създаваме си променлива за сумата от целочислените стойности на всички символи
        for (int i = 1; i <= numberOfSymbols; i++) {
            sum += scanner.nextLine().charAt(0);       //sum = sum + scanner.nextLine().charAt(0);     //на всяка итерация на цикъла към домоментната сума от символите добавяме целочислената стойност (ASCII кода) на текущия символ
        }

        System.out.printf("The sum equals: %d", sum);   //извън цикъла (само веднъж) принтираме крайната сума от всички символи
    }
}
