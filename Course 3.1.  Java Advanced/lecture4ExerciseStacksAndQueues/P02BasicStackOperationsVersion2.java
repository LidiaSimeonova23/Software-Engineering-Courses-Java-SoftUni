package lecture4ExerciseStacksAndQueues;

import java.util.*;

public class P02BasicStackOperationsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfElementsToPushIntoTheStack = scanner.nextInt();      //числото N по условие - брой числа, които да се добавят към Stack
        int numberOfElementsToPopFromTheStack = scanner.nextInt();       //числото S по условие - брой числа, които да се премахнат от Stack-а
        int elementToCheckIfExistsInTheStack = scanner.nextInt();        //числото X по условие - да се провери дали това число се съдържа в Stack-а

        Deque<Integer> numbersStack = new ArrayDeque<>();

        for (int count = 1; count <= numberOfElementsToPushIntoTheStack; count++) {
            numbersStack.push(scanner.nextInt());      //на всяка итерация на for цикъла сканираме следващото цяло число и едновременно  с това го добавяме към Stack-а
        }

        for (int count = 1; count <= numberOfElementsToPopFromTheStack; count++) {
            numbersStack.pop();
        }

        if (numbersStack.contains(elementToCheckIfExistsInTheStack)) {
            System.out.println("true");
        } else {
            if (!numbersStack.isEmpty()) {
                System.out.println(Collections.min(numbersStack));            //чрез  Collections.min(numbersStack)   намираме най-малкото число в Stack-а
            } else {
                System.out.println("0");       //System.out.println(0);
            }
        }


    }
}

