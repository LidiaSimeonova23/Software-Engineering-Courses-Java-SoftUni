package lecture8ExerciseConditionalStatementsAdvanced;

import java.util.Scanner;

public class P06OperationsBetweenNumbersVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата четем
        int number1 = Integer.parseInt(scanner.nextLine());            //N1 – цяло число в интервала [0...40 000]
        int number2 = Integer.parseInt(scanner.nextLine());            //N2 – цяло число в интервала [0...40 000]
        String operator = scanner.nextLine();                          //Оператор – един символ измеду: "+", "-", "*", "/", "%"

        double result = 0;              //създаваме си променлива за резултата (от тип double), после ще й приравняваме различни стойности

        boolean isZero = false;         //създаваме си булева променлива, която поначало да ни казва, че делителят не е нула

        String evenOrOdd = "";          //създаваме си променлива за резултата (от тип String), после ще й приравняваме различни стойности


        switch (operator) {
            case "+":                                //ако операцията е събиране, резултатът е число1 + число2
                result = number1 + number2;
                break;
            case "-":                                //ако операцията е изваждане, резултатът е число1 - число2
                result = number1 - number2;
                break;
            case "*":                                //ако операцията е умножение, резултатът е число1 * число2
                result = number1 * number2;
                break;
            case "/":                                //ако операцията е деление
                if (number2 == 0) {                             //ако делителят (който е второто число) е равен на 0
                    isZero = true;
                } else {            //if (number2 != 0)                                   //в противен случай, резултатът е число 1 / число 2
                    result = number1 * 1.0 / number2;
                }
                break;
            case "%":                                //ако операцията е модулно деление (тоест, деление с остатък)
                if (number2 == 0) {                              //ако делителят (който е второто число) е равен на 0
                    isZero = true;
                } else {                                         //в противен случай, резултатът е число 1 % число 2
                    result = number1 % number2;
                }
                break;
        }


        if (result % 2 == 0) {                           //ако резултатът е четно число
            evenOrOdd = "even";
        } else {                                         //ако резултатът е нечетно число
            evenOrOdd = "odd";
        }

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            System.out.printf("%d %s %d = %.0f - %s", number1, operator, number2, result, evenOrOdd);
        } else if (operator.equals("/") && !isZero) {
            System.out.printf("%d %s %d = %.2f", number1, operator, number2, result );
        } else if (operator.equals("%") && !isZero) {
            System.out.printf("%d %s %d = %.0f", number1, operator, number2, result);
        } else {
            System.out.printf("Cannot divide %d by zero", number1);
        }


    }
}



