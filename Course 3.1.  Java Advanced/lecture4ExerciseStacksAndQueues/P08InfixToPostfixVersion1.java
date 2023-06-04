package lecture4ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P08InfixToPostfixVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputPartsArray = scanner.nextLine().split("\\s+");    //вх. данни са и числа, и текст; първоначално ги четем като масив от текстове

        Deque<String> operatorsStack = new ArrayDeque<>();

        //обхождаме всеки елемент от масива
        for (int index = 0; index < inputPartsArray.length; index++) {        //for (int index = 0; index <= inputPartsArray.length - 1; index++)
            String currentOperator = inputPartsArray[index];

            //по условие в изразите няма степенуване, но сме добавили и него за всеки случай  //"^"
            switch (currentOperator) {
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                case "(":
                    if (operatorsStack.isEmpty() || hasLowerPrecedence(operatorsStack.peek(), currentOperator)) {
                        operatorsStack.push(currentOperator);
                    } else {
                        while (!hasLowerPrecedence(operatorsStack.peek(), currentOperator)) {
                            System.out.print(operatorsStack.pop() + " ");      //принтиране на един ред с разстояние между отделните елементи
                            if (operatorsStack.isEmpty()) {
                                break;
                            }
                        }

                        operatorsStack.push(currentOperator);
                    }
                    break;
                case ")":
                    while (!operatorsStack.peek().equals("(")) {
                        System.out.print(operatorsStack.pop() + " ");
                    }
                    operatorsStack.pop();
                    break;
                default:
                    System.out.print(currentOperator + " ");
            }
        }

        while (!operatorsStack.isEmpty()) {
            System.out.print(operatorsStack.pop() + " ");
        }

    }


    private static boolean hasLowerPrecedence(String current, String next) {        //създаваме си метод, с който определяме по-нисък приоритет на математическите операции
        int currentOperatorPrecedence = precedence(current);
        int nextOperatorPrecedence = precedence(next);
        if (currentOperatorPrecedence < nextOperatorPrecedence) {
            return true;
        } else if (currentOperatorPrecedence == nextOperatorPrecedence) {
            if (currentOperatorPrecedence == 3 || currentOperatorPrecedence == 4) {
                return true;
            } else {
                return false;
            }
        } else {
            if (currentOperatorPrecedence == 4) {
                return true;
            } else {
                return false;
            }
        }
    }

    private static int precedence(String operator) {          //създаваме си метод, с който определяме приоритет на математическите операции   (скобите дават най-голям приоритет, после са коренуване и степенуване, после - умножение и деление, накрая - събиране и изваждане)
        int precedence = 0;
        if (operator.equals("+") || operator.equals("-")) {
            precedence = 1;
        } else if (operator.equals("*") || operator.equals("/")) {
            precedence = 2;
        } else if (operator.equals("^")) {
            precedence = 3;
        } else if (operator.equals("(")) {
            precedence = 4;
        }

        return precedence;
    }

}
