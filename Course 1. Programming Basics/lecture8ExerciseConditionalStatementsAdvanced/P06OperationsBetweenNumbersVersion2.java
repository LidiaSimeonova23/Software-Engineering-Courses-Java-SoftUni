package lecture8ExerciseConditionalStatementsAdvanced;

import java.util.Scanner;

public class P06OperationsBetweenNumbersVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четем от конзолата:
        int number1 = Integer.parseInt(scanner.nextLine());              //цяло число в интервала [0...40 000]
        int number2 = Integer.parseInt(scanner.nextLine());              //цяло число в интервала [0...40 000]
        char operator = scanner.nextLine().charAt(0);                    //Оператор – един символ измеду: "+", "-", "*", "/", "%"    - в случая това сме го написали като char, а не String

        double result = 0;
        String evenOrOdd = "";
        boolean isZero = false;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 == 0) {
                    isZero = true;
                } else {        //if (number2 != 0)
                    result = number1 * 1.0 / number2;
                }
                break;
            case '%':
                if (number2 == 0) {
                    isZero = true;
                } else {
                    result = number1 % number2;
                }
                break;
        }


        if (result % 2 == 0) {
            evenOrOdd = "even";
        } else {
            evenOrOdd = "odd";
        }


        if (operator == '+' || operator == '-' || operator == '*') {
            System.out.printf("%d %c %d = %.0f - %s", number1, operator, number2, result, evenOrOdd);
        } else if (operator == '/' && !isZero) {
            System.out.printf("%d %c %d = %.2f", number1, operator, number2, result);
        } else if (operator == '%' && !isZero) {
            System.out.printf("%d %c %d = %.0f", number1, operator, number2, result);
        } else {
            System.out.printf("Cannot divide %d by zero", number1);
        }

    }
}


