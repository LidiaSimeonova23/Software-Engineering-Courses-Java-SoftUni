package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PMoreExercises05DecryptingMessageVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());      //от първия ред на конзолата четем едно цяло число в диапазона [1 ..... 20] - ключ
        int symbolsCount = Integer.parseInt(scanner.nextLine());     //от втория ред на конзолата четем едно цяло число в диапазона [1 ..... 20] - брой символи в съобщение

        //много пъти ще прочетем текущия символ (знаем колко пъти - толкова пъти, колкото е броят на символите) - ще ползваме for цикъл
        //към всеки текущ символ ще прибавяме ключа, за да открием истинския символ
        for (int orderOfSymbols = 1; orderOfSymbols <= symbolsCount; orderOfSymbols++) {     //за цикъла ми е по-удобно да си кръстя променливата orderOfSymbols (поредност на символите) вместо i
            int currentSymbol = scanner.nextLine().charAt(0);    //на всяка итерация на цикъла четем текущия символ (четем го като текст и го превръщаме в символ)
            //можем да си определим променливата currentSymbol като int (вместо char), тъй като ще търсим сбор на символ + число, а знаем, че символът освен символна има и целочислена стойност (ASCII code) и в случая ползваме целочислената стойност на символа

            //на всяка итерация на цикъла ще търсим истинския символ от съобщението (този истински символ е резултат от сбора на текущия символ и ключа)
            int decryptedSymbol = currentSymbol + key;          //създаваме си променлива за сбора на текущия символ и ключа

            //на всяка итерация на цикъла принтираме истинския символ от съобщението, като уточняваме, че искаме символната му стойност (а не целочислената му стойност)  - всички символи да са на 1 ред, залепени един за друг (без разстояние между тях)
            System.out.print((char) decryptedSymbol);
            //System.out.printf("%c", (char) decryptedSymbol);
        }

    }
}
