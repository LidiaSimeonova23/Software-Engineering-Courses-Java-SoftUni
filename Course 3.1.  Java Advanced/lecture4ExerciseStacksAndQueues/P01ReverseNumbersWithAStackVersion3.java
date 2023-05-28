package lecture4ExerciseStacksAndQueues;

import java.util.*;
import java.util.stream.Collectors;

public class P01ReverseNumbersWithAStackVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> numbersStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(element -> numbersStack.push(element));


        while (numbersStack.size() >= 1) {
            System.out.print(numbersStack.pop() + " ");      // System.out.printf("%d ", numbersStack.pop());
        }

    }
}
