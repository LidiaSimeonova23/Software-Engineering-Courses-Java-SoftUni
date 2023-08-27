package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PMoreExercises04ReverseStringVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //В ТОВА РАШЕНИЕ НА ЗАДАЧАТА ПОЛЗВАМ StringBuilder (УЧИ СЕ В ЛЕКЦИИ 26 и 28 - Textprocessing)
        //вместо конкатенация (която е бавен процес, защото при нея се създава нов String) ползвам StringBuilder, който е много функционален (има много готови методи) и е по-бърз (при него създаваме един StringBuilder и после просто долепяме символи)

        String input = scanner.nextLine();    //от първия ред на конзолата прочитаме един текст

        //трябва да получим текста, но в обратен ред на символите
        StringBuilder reversedInputSb = new StringBuilder();        //създаваме си допълнителен обект от клас StringBuilder  - този обект ще ни държи обърнатия текст, прочетен от конзолата     (в началото този StringBuilder ще е празен)
        for (int index = input.length() - 1; index >= 0; index--) {
            char currentSymbol = input.charAt(index);
            //пълним създадения StringBuilder - на всяка итерация към StringBuilder-а до момента долепяме /чрез метода .append()/ текущия символ и накрая намираме текста, но в обратен ред (след всички итерации намираме кой е обърнатият текст, без да го принтираме)
            reversedInputSb.append(currentSymbol);
        }

        //накрая само веднъж (извън цикъла) принтираме намерения текст наобратно:
        //System.out.println(reversedInputSb.toString());      //чрез метода .toString()   превръщаме StringBuilder-а в String
        System.out.printf("%s", reversedInputSb.toString());       //чрез метода .toString()   превръщаме StringBuilder-а в String
    }
}
