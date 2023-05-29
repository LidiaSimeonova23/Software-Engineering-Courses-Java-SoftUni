package lecture4ExerciseStacksAndQueues;

import java.util.*;

public class P03MaximumElementVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());      //от първия ред на конзолата четем цяло число, което е брой команди, които ще четем

        Deque<Integer> numbersStack = new ArrayDeque<>();    //създаваме празен Stack от цели числа (не може да е от текстове, защото ще търсим най-голямото число - ще извършваме сравнения на числа)

        //четем командите
        for (int counter = 1; counter <= numberOfCommands; counter++) {
            int[] commandPartsArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();      //четем всеки ред като масив от цели числа (не може масив от текстове), защото ще сравняваме числата (ще търсим най-голямото)
            int command = commandPartsArray[0];

            switch (command) {
                case 1:
                    int element = commandPartsArray[1];
                    numbersStack.push(element);
                    break;
                case 2:
                    numbersStack.pop();
                    break;
                case 3:
                    System.out.println(Collections.max(numbersStack));
                    break;
            }

        }


    }
}
