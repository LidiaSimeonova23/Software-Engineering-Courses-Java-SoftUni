package lecture4ExerciseStacksAndQueues;

import java.util.*;

public class P03MaximumElementVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        Deque<Integer> numbersStack = new ArrayDeque<>();      //създаваме празен Stack от цели числа (не може да е от текстове, защото ще търсим най-голямото число - ще извършваме сравнения на числа)

        for (int counter = 1; counter <= numberOfCommands; counter++) {
            int[] commandPartsArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();      //четем всеки ред като масив от цели числа (не може масив от текстове), защото ще сравняваме числата (ще търсим най-голямото)
            int command = commandPartsArray[0];

            if (command == 1) {
                int element = commandPartsArray[1];
                numbersStack.push(element);
            } else if (command == 2) {
                numbersStack.pop();
            } else if (command == 3) {
                System.out.println(Collections.max(numbersStack));
            }

        }


    }
}
