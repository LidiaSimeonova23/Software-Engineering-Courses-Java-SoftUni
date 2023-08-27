package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PMoreExercises04ReverseStringVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();    //от първия ред на конзолата прочитаме един текст

        //трябва да получим текста, но в обратен ред на символите
        String reversedInput = "";        //създаваме си допълнителна променлива, която да ни държи обърнатия текст, прочетен от конзолата     (в началото не знаем кой ще е обърнатият текст, затова задаваме като начална стойност празен String)
        for (int index = input.length() - 1; index >= 0; index--) {
            char currentSymbol = input.charAt(index);
            //на всяка итерация към текста до момента долепяме (конкатенираме) текущия символ и накрая намираме текста, но в обратен ред (след всички итерации намираме кой е обърнатият текст, без да го принтираме)
            reversedInput += currentSymbol;        //reversedInput = reversedInput + currentSymbol;       //String + нещо (текст, символ, число) ни връща String
            //конкатенацията е един от начините данни от един тип (int, double, char) да се превърнат в данни от тип String
        }

        //накрая само веднъж (извън цикъла) принтираме намерения текст наобратно
        System.out.println(reversedInput);
        //System.out.printf("%s", reversedInput);
    }
}
