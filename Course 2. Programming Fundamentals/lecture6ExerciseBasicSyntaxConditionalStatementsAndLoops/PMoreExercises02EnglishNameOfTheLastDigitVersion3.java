package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PMoreExercises02EnglishNameOfTheLastDigitVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();    //четем от първия ред на конзолата едно цяло число  (но в случая това число може да остане като текст, защото няма да извършваме аритметични операции и сревнения с него)

        char lastSymbol = number.charAt(number.length() - 1);     //намираме (взимаме) последния символ от текста

        switch (lastSymbol) {                //проверяваме кой е последният символ от текста (тоест, коя е последната цифра от числото) и казваме какво да се принтира
            case '0':
                System.out.println("zero");
                break;
            case '1':
                System.out.println("one");
                break;
            case '2':
                System.out.println("two");
                break;
            case '3':
                System.out.println("three");
                break;
            case '4':
                System.out.println("four");
                break;
            case '5':
                System.out.println("five");
                break;
            case '6':
                System.out.println("six");
                break;
            case '7':
                System.out.println("seven");
                break;
            case '8':
                System.out.println("eight");
                break;
            case '9':
                System.out.println("nine");
                break;
        }


    }
}
