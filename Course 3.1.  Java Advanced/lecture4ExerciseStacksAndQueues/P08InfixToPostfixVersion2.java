package lecture4ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P08InfixToPostfixVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String infixExpression = scanner.nextLine();
        String postfixExpression = convertInfixToPostfix(infixExpression);   //извикваме си метода (който създадохме) convertInfixToPostfix
        System.out.println(postfixExpression);
    }


    public static String convertInfixToPostfix(String expression) {      //създаваме си метод, който превръща infixExpression в postfixExpression
        StringBuilder postfixSb = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();

        String[] inputPartsArray = expression.split("\\s+");
        for (String element : inputPartsArray) {
            char symbol = element.charAt(0);    //превръщаме всеки текст от масива в символ
            if (Character.isDigit(symbol) || Character.isLetter(symbol)) {
                postfixSb.append(element).append(" ");
            } else if (symbol == '(') {
                stack.push(symbol);
            } else if (symbol == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfixSb.append(stack.pop()).append(" ");
                }
                stack.pop(); // Discard the opening parenthesis
            } else {
                while (!stack.isEmpty() && precedence(symbol) <= precedence(stack.peek())) {
                    postfixSb.append(stack.pop()).append(" ");
                }
                stack.push(symbol);
            }
        }

        while (!stack.isEmpty()) {
            postfixSb.append(stack.pop()).append(" ");
        }

        return postfixSb.toString().trim();
    }


    private static int precedence(char operator) {       //създаваме си метод, с който определяме приоритет на математическите операции
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }

        return 0;
    }

}
