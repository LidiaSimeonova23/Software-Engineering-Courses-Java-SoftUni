package pbExam7Date6And7July2019;

import java.util.Scanner;

public class P06TheMostPowerfulWordVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //До получаване на команда "End of words" (тоест, не знаем колко ще са повторенията -> while цикъл) се чете по един ред от конзолата:
        double maxSum = Double.MIN_VALUE;       //създаваме си променлива за максимална сума (сбор) от целочислените стойности на символи
        String mostPowerfulWord = "";        //създаваме си променлива за най-силната дума (думата с най-голям сбор от целочислени стойности на символите)

        String input = scanner.nextLine();
        while (!input.equals("End of words")) {
            String currentWord = input;         //•	дума – текст

            //трябва да итерираме по всеки символ от текущия текст, за да видим кой е символът (съответно - каква е неговата целочислена стойност) -> for loop
            double sumOfASCIIValuesOfAllSymbolsOfCurrentWord = 0;       //сумата от целочислените стойности по принцип е цяло число, но в случая ще е дробно число, защото по-надолу в условието е казано, че ще трябва да закръгляме сбора, ако думата започва със съгласна буква
            for (int index = 0; index <= currentWord.length() - 1; index++) {         //for (int index = 0; index < currentWord.length(); index++)
                char currentSymbol = currentWord.charAt(index);    //създаваме си променлива за текущия символ на всяка итерация на цикъла

                //трябва да се намери сборът от ASCII стойностите на символите, от които се състои думата
                sumOfASCIIValuesOfAllSymbolsOfCurrentWord += (int) currentSymbol;        //sumOfASCIIValuesOfAllSymbolsOfCurrentWord = sumOfASCIIValuesOfAllSymbolsOfCurrentWord + currentSymbol;
            }

            //Ако текущата дума започва с гласна буква - 'a', 'e', 'i', 'o', 'u', 'y' (или техните еквивалентни главни букви), полученият сбор трябва да се умножи по дължината на думата
            //в противен случай, да се раздели на дължината и да се закръгли до най-близкото цяло число надолу.
            if (currentWord.charAt(0) == 'a' || currentWord.charAt(0) == 'e' || currentWord.charAt(0) == 'i' || currentWord.charAt(0) == 'o' || currentWord.charAt(0) == 'u' || currentWord.charAt(0) == 'y' ||
                    currentWord.charAt(0) == 'A' || currentWord.charAt(0) == 'E' || currentWord.charAt(0) == 'I' || currentWord.charAt(0) == 'O' || currentWord.charAt(0) == 'U' || currentWord.charAt(0) == 'Y') {
                sumOfASCIIValuesOfAllSymbolsOfCurrentWord = sumOfASCIIValuesOfAllSymbolsOfCurrentWord * currentWord.length();         //sumOfASCIIValuesOfAllSymbolsOfCurrentWord *= currentWord.length();
            } else {
                sumOfASCIIValuesOfAllSymbolsOfCurrentWord = sumOfASCIIValuesOfAllSymbolsOfCurrentWord / currentWord.length();      //sumOfASCIIValuesOfAllSymbolsOfCurrentWord /= currentWord.length();
                sumOfASCIIValuesOfAllSymbolsOfCurrentWord = Math.floor(sumOfASCIIValuesOfAllSymbolsOfCurrentWord);
            }


            //намираме най-силната дума:
            if (sumOfASCIIValuesOfAllSymbolsOfCurrentWord > maxSum) {
                maxSum = sumOfASCIIValuesOfAllSymbolsOfCurrentWord;     //намираме най-голямата сума от целочислени стойности на символи на текуща дума
                mostPowerfulWord = currentWord;         //намираме коя е най-силната дума (думата с най-голяма сума от целочислени стойности на символи)
            }

            input = scanner.nextLine();    //update
        }


        System.out.printf("The most powerful word is %s - %.0f", mostPowerfulWord, maxSum);
    }
}
