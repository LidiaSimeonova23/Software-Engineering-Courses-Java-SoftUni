package lecture4ExerciseStacksAndQueues;

import java.util.*;
import java.util.stream.Collectors;

public class P01ReverseNumbersWithAStackVersion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersAsTextList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        Deque<Integer> numbersStack = new ArrayDeque<>();

        for (Integer element : numbersAsTextList) {
            numbersStack.push(element);
        }

        while (!numbersStack.isEmpty()) {
            System.out.print(numbersStack.pop() + " ");        // System.out.printf("%d ", numbersStack.pop());
        }

    }
}
