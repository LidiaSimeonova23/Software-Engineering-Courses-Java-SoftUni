package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PMoreExercises03FloatingEqualityVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //трябва да сравним 2 floating-point numbers (дробни числа) - те са от тип double
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        //по условие е дадено, че за да проверим дали дробните числа са еднакви, трябва да ползваме прецизност eps = 0.000001 (прецизност до шестия знак след десетичната точка)
        double eps = 0.000001;

        //в случая е важно разликата между двете числа да е по-малка от този епсилон
        //няма значение дали разликата е положително, или е отрицатателно число

        //ако разликата от двете числа (без значение дали разликата е положително, или отрицателно число) има стойност, която е по-малка от допустимия епсилон (допустимата грешка), то приемаме, че числата са еднакви
        //в противен случай /ако разликата от двете числа (без значение дали разликата е положително, или отрицателно число) има стойност, която е по-голяма или равна на допустимия епсилон (допустимата грешка)/ се приема, че числата са различни
        if (Math.abs(firstNumber - secondNumber) < eps) {     //с метода Math.abs()   си осигуряваме, че резултатът е положително число
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
