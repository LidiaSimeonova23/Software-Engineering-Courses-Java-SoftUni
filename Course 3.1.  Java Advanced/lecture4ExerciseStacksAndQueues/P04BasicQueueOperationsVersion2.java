package lecture4ExerciseStacksAndQueues;

import java.util.*;

public class P04BasicQueueOperationsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] indicatorsArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();       //четем първия ред от конзолата като масив от цели числа
        //всеки елемент от масива го изнасяме в променлива
        int n = indicatorsArray[0];
        int s = indicatorsArray[1];
        int x = indicatorsArray[2];

        int[] numbersArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();         //четем втория ред от конзолата като масив от цели числа

        Deque<Integer> numbersQueue = new ArrayDeque<>();       //създаваме опашка - празен

        //елементите от масива ги присъединяваме към опашката
        for (int element : numbersArray) {
            numbersQueue.offer(element);
            if (numbersQueue.size() == n) {       //за да се застраховаме в случай че масивът се състои от повече елементи, отколкото е стойността на прочетеното от конзолата число за брой елементи, които да се присъединят към опашката
                break;
            }
        }

        int counterOfRemovedElementsFromTheQueue = 0;      //създаваме си променлива за броя на премахнатите елементи от опашката
        while (counterOfRemovedElementsFromTheQueue < s) {
            numbersQueue.pop();
            counterOfRemovedElementsFromTheQueue++;     //counterOfRemovedElementsFromTheQueue = counterOfRemovedElementsFromTheQueue + 1;
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
