package lecture4ExerciseStacksAndQueues;

import java.util.*;
import java.util.stream.Collectors;

public class P01ReverseNumbersWithAStackVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> numbersStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(numbersStack::push);


        while (!numbersStack.isEmpty()) {
            System.out.print(numbersStack.pop() + " ");      // System.out.printf("%s ", numbersStack.pop());
        }

    }
}

