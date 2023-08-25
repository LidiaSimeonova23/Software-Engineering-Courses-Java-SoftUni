package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PMoreExercises02EnglishNameOfTheLastDigitVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();    //четем от първия ред на конзолата едно цяло число  (но в случая това число може да остане като текст, защото няма да извършваме аритметични операции и сревнения с него)

        char lastSymbol = number.charAt(number.length() - 1);     //намираме (взимаме) последния символ от текста

        //проверяваме кой е последният символ от текста (тоест, коя е последната цифра от числото) и казваме какво да се принтира
        if (lastSymbol == '0') {
            System.out.println("zero");
        } else if (lastSymbol == '1') {
            System.out.println("one");
        } else if (lastSymbol == '2') {
            System.out.println("two");
        } else if (lastSymbol == '3') {
            System.out.println("three");
        } else if (lastSymbol == '4') {
            System.out.println("four");
        } else if (lastSymbol == '5') {
            System.out.println("five");
        } else if (lastSymbol == '6') {
            System.out.println("six");
        } else if (lastSymbol == '7') {
            System.out.println("seven");
        } else if (lastSymbol == '8') {
            System.out.println("eight");
        } else if (lastSymbol == '9') {
            System.out.println("nine");
        }


    }
}
