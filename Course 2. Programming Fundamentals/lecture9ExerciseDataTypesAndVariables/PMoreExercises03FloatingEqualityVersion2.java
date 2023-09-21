package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PMoreExercises03FloatingEqualityVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //трябва да сравним 2 floating-point numbers (дробни числа) - те са от тип double
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        //по условие е дадено, че за да проверим дали дробните числа са еднакви, трябва да ползваме прецизност eps = 0.000001 (прецизност до шестия знак след десетичната точка)
        double eps = 0.000001;

        //в случая е важно разликата между двете числа да е по-малка от този епсилон
        //няма значение дали разликата е положително, или е отрицатателно число

        //създаваме си допълнителна булева променлива, която да ни държи условието за равенство на двете числа - числата са равни, когато разликата от тях (без значение дали разликата е положително, или отрицателно число) има стойност, която е по-малка от допустимия епсилон (допустимата грешка)
        boolean isEqual = Math.abs(firstNumber - secondNumber) < eps;       //с метода Math.abs()   си осигуряваме, че резултатът е положително число

        if (isEqual) {          //ако са равни е истина (тоест, ако числата са равни, а за да са равни, то разликата им е по-малка от допустимия епсилон), да се принтира "True"
            System.out.println("True");
        } else {      //в противен случай (тоест, ако числата не са равни, а за да не са равни, то разликата им е по-голяма или равна на допустимия епсилон), да се принтира "False"
            System.out.println("False");
        }


    }
}
