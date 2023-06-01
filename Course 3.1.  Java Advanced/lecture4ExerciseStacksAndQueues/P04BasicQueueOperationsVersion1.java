package lecture4ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P04BasicQueueOperationsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //всичките ни данни са цели числа и можем да ги четем директно със scanner.nextInt()
        int n = scanner.nextInt();      //n - брой елементи, които да прибавим към опашка
        int s = scanner.nextInt();      //s - брой елементи, които да премахнем от опашката
        int x = scanner.nextInt();      //x - конкретно число, за което да проверим дали съществува в опашката

        Deque<Integer> numbersQueue = new ArrayDeque<>();

        for (int counter = 1; counter <= n; counter++) {              //for (int counter = 0; counter < n; counter++)
            int currentNumber = scanner.nextInt();
            numbersQueue.offer(currentNumber);
        }

        for (int counter = 1; counter <= s; counter++) {             //for (int counter = 0; counter < s; counter++)
            numbersQueue.poll();
        }

        if (numbersQueue.contains(x)) {
            System.out.println("true");
        } else {
            if (numbersQueue.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(numbersQueue));
            }
        }

    }
}
