package lecture4ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P01ReverseNumbersWithAStackVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> numbersStack = new ArrayDeque<>();

        for (int index = 0; index <= numbersArray.length - 1; index++) {          //for (int index = 0; index < numbersArray.length; index++)
            int currentNumber = numbersArray[index];
            numbersStack.push(currentNumber);
        }

        while (!numbersStack.isEmpty()) {
            int upperElement = numbersStack.pop();
            System.out.print(upperElement + " ");         //System.out.printf("%d ", upperElement);
            //вместо предишните два реда може само един ред код:      System.out.print(numbersStack.pop() + " ");      или  System.out.printf("%d ", numbersStack.pop());
        }

    }
}
