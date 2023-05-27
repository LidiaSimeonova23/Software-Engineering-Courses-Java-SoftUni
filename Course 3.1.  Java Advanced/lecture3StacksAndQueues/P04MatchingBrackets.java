package lecture3StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Deque<Integer> indexesStack = new ArrayDeque<>();   //създаваме си stack, в който ще прибавяме индексите на отварящите скоби

        for (int index = 0; index <= input.length() - 1; index++) {          //for (int index = 0; index < input.length(); index++)
            char currentSymbol = input.charAt(index);
            if (currentSymbol == '(') {
                indexesStack.push(index);
            } else if (currentSymbol == ')') {
                int openingBracketIndex = indexesStack.pop();
                String expressionInBrackets = input.substring(openingBracketIndex, index + 1);
                System.out.println(expressionInBrackets);
            }
        }

    }
}
