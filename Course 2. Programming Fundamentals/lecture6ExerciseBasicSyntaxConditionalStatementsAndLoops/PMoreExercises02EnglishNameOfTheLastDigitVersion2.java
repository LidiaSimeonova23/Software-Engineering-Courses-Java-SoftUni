package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PMoreExercises02EnglishNameOfTheLastDigitVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());    //четем от първия ред на конзолата едно цяло число

        int lastDigit = number % 10;    //с модулно деление на 10 намираме (взимаме) коя е последната цифра от дадено число

        //проверяваме коя е последната цифра от числото и казваме какво да се принтира
        if (lastDigit == 0) {
            System.out.println("zero");
        } else if (lastDigit == 1) {
            System.out.println("one");
        } else if (lastDigit == 2) {
            System.out.println("two");
        } else if (lastDigit == 3) {
            System.out.println("three");
        } else if (lastDigit == 4) {
            System.out.println("four");
        } else if (lastDigit == 5) {
            System.out.println("five");
        } else if (lastDigit == 6) {
            System.out.println("six");
        } else if (lastDigit == 7) {
            System.out.println("seven");
        } else if (lastDigit == 8) {
            System.out.println("eight");
        } else if (lastDigit == 9) {
            System.out.println("nine");
        }


    }
}
