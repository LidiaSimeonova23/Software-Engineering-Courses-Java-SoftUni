package lecture4ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P06RecursiveFibonacciVersion2 {
    public static long[] memoryForFib;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Deque<Long> numbersStack = new ArrayDeque<>();

        numbersStack.push(0L);
        numbersStack.push(1L);

        if (n < 2) {
            System.out.println(1);
            return;
        }


        for (int i = 0; i < n; i++) {
            long number1 = numbersStack.pop();
            long number2 = numbersStack.pop();
            //презаписваме number1
            numbersStack.push(number1);
            //изчисляваме number2
            numbersStack.push(number1 + number2);
        }

        System.out.println(numbersStack.pop());
    }
}
