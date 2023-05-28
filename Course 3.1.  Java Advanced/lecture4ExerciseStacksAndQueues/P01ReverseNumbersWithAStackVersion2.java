package lecture4ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P01ReverseNumbersWithAStackVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> numbersStack = new ArrayDeque<>();

        for (int element : numbersArray) {
            numbersStack.push(element);
        }


        while (numbersStack.size() > 0) {
            System.out.print(numbersStack.pop() + " ");      // System.out.printf("%d ", numbersStack.pop());
        }

    }
}
