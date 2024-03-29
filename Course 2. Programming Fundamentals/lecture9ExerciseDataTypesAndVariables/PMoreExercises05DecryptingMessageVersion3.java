package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PMoreExercises05DecryptingMessageVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte key = Byte.parseByte(scanner.nextLine());      //от първия ред на конзолата четем едно цяло число в диапазона [1 ..... 20] - ключ  -> можем да определим типа на данните като byte (вместо int), тъй като се побират в диапазона от -128 до 127
        byte symbolsCount = Byte.parseByte(scanner.nextLine());     //от втория ред на конзолата четем едно цяло число в диапазона [1 ..... 20] - брой символи в съобщение  -> можем да определим типа на данните като byte (вместо int), тъй като се побират в диапазона от -128 до 127

        //много пъти ще прочетем текущия символ (знаем колко пъти - толкова пъти, колкото е броят на символите) - ще ползваме for цикъл
        //към всеки текущ символ ще прибавяме ключа, за да открием истинския символ
        for (byte orderOfSymbols = 1; orderOfSymbols <= symbolsCount; orderOfSymbols++) {    //за цикъла ми е по-удобно да си кръстя променливата orderOfSymbols (поредност на символите) вместо i
            char currentSymbol = scanner.nextLine().charAt(0);    //на всяка итерация на цикъла четем текущия символ (четем го като текст и го превръщаме в символ)

            //на всяка итерация на цикъла ще търсим истинския символ от съобщението (този истински символ е резултат от сбора на текущия символ и ключа)
            //създаваме си променлива за истинския символ (тъй като ще събираме символ с цяло число, а символът има и целочислена стойност (ASCII code), резултатът ще е цяло число - затова ще определим променливата да е от тип int):
            int decryptedSymbol = currentSymbol + key;     //напр. на символ 'P' целочислената стойност е 80       80 + 3 = 83, което е символ 'S'  (S е истинският символ на мястото на P)

            //на всяка итерация на цикъла принтираме истинския символ от съобщението, като уточняваме, че искаме символната му стойност (а не целочислената му стойност)  - всички символи да са на 1 ред, залепени един за друг (без разстояние между тях)
            System.out.print((char) decryptedSymbol);
            //System.out.printf("%c", (char) decryptedSymbol);
        }

    }
}
