package lecture8ExerciseConditionalStatementsAdvanced;

import java.util.Scanner;

public class P06OperationsBetweenNumbersVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());    //•	N1 – цяло число в интервала [0...40 000]
        int number2 = Integer.parseInt(scanner.nextLine());      //•	N2 – цяло число в интервала [0...40 000]
        String operator = scanner.nextLine();        //•	Оператор – един символ измеду: "+", "-", "*", "/", "%"

        double result = 0;   //определихме резултата като double, защото е казано, че резултатът е форматиран до втория знак след дес. запетая
        if (operator.equals("+")) {
            result = number1 + number2;
        } else if (operator.equals("-")) {
            result = number1 - number2;
        } else if (operator.equals("*")) {
            result = number1 * number2;
        } else if (operator.equals("/")) {
            if (number2 != 0) {
                result = number1 * 1.0 / number2;
            } else {
                System.out.printf("Cannot divide %d by zero", number1);
            }
        } else if (operator.equals("%")) {
            if (number2 != 0) {
                result = number1 % number2;
            } else {
                System.out.printf("Cannot divide %d by zero", number1);
            }
        }


        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %.0f - even", number1, operator, number2, result);
            } else {         //else if (result % 2 != 0)         //else if (result % 2 == 1)
                System.out.printf("%d %s %d = %.0f - odd", number1, operator, number2, result);
            }
        } else if (operator.equals("/") && number2 != 0) {
            System.out.printf("%d %s %d = %.2f", number1, operator, number2, result);
        } else if (operator.equals("%") && number2 != 0) {
            System.out.printf("%d %s %d = %.0f", number1, operator, number2, result);
        }

    }
}
