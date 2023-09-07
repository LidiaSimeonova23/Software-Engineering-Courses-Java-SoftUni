package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P02SumDigitsVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ще прочетем едно цяло число (не знаем колко цифрено е то); трябва да намерим сумата от всичките му цифри

        String numberAsText = scanner.nextLine();    //от първия ред на конзолата четем едно число (но в случая ще го прочетем като текст, без да го превръщаме в число, и ще го разглеждаме като текст)

        //с for цикъл обхождаме всички символи от текста (тоест, това са цифрите на числото)
        int sumOfAllDigits = 0;         //създаваме си променлива за сумата от всички цифри на числото (с начална стойност 0)
        for (int index = 0; index <= numberAsText.length() - 1; index++) {
            char currentSymbol = numberAsText.charAt(index);        //създаваме си променлива за текущия символ от текста

            //символът ни трябва като число, за да намерим сумата - не можем директно да го превърнем в число, следователно, първо превръщаме текущия символ в текст, а после превръщаме текста в число:
            String currentSymbolAsText = currentSymbol + "";        //превръщаме текущия символ в текст (чрез конкатенация с празен String)
            int currentTextAsInteger = Integer.parseInt(currentSymbolAsText);       //превръщаме текста в число (чрез parse-ване)

            sumOfAllDigits += currentTextAsInteger;     //sumOfAllDigits = sumOfAllDigits + currentTextAsInteger;      //намираме (след всички итерации на цикъла) сумата от всички цифри на прочетеното от конзолата число
        }


        System.out.printf("%d", sumOfAllDigits);      //извън цикъла принтираме сумата от всички цифри на прочетеното от конзолата число
        // System.out.println(sumOfAllDigits);
    }
}
