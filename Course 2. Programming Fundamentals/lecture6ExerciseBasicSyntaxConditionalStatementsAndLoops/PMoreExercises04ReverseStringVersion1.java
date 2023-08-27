package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PMoreExercises04ReverseStringVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();    //от първия ред на конзолата прочитаме един текст

        //трябва да принтираме текста, но в обратен ред на символите
        for (int index = input.length() - 1; index >= 0; index--) {
            char currentSymbol = input.charAt(index);
            System.out.print(currentSymbol);
            //вместо предишните два реда код може само този ред:    System.out.print(input.charAt(index));
            //System.out.printf("%c", currentSymbol);
        }

    }
}
