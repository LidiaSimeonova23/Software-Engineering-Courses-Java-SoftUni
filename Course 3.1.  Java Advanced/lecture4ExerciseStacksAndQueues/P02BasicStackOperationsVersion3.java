package lecture4ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P02BasicStackOperationsVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] indicatorsArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();       //четем първия ред от конзолата като масив от цели числа
        //всеки елемент от масива го изнасяме в променлива
        int numberOfElementsToPushIntoTheStack = indicatorsArray[0];      //числото N по условие
        int numberOfElementsToPopFromTheStack = indicatorsArray[1];       //числото S по условие
        int elementToCheckIfExistsInTheStack = indicatorsArray[2];        //числото X по условие

        int[] numbersArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();         //четем втория ред от конзолата като масив от цели числа

        Deque<Integer> numbersStack = new ArrayDeque<>();       //създаваме Stack - празен

        //елементите от масива ги присъединяваме към Stack-а
        for (int element : numbersArray) {
            numbersStack.push(element);
            if (numbersStack.size() == numberOfElementsToPushIntoTheStack) {       //за да се застраховаме в случай че масивът се състои от повече елементи, отколкото е стойността на прочетеното от конзолата число за брой елементи, които да се присъединят към Stack
                break;
            }
        }

        int counterOfRemovedElementsFromTheStack = 0;      //създаваме си променлива за броя на премахнатите елементи
        while (counterOfRemovedElementsFromTheStack < numberOfElementsToPopFromTheStack) {
            numbersStack.pop();
            counterOfRemovedElementsFromTheStack++;     //counterOfRemovedElementsFromTheStack = counterOfRemovedElementsFromTheStack + 1;
        }

        if (numbersStack.size() == 0) {       //if (numbersStack.isEmpty())
            System.out.println("0");          //System.out.println(0);
        } else if (numbersStack.contains(elementToCheckIfExistsInTheStack)) {
            System.out.println("true");
        } else {
            int smallestNumber = Integer.MAX_VALUE;
            while (!numbersStack.isEmpty()) {         //обхождаме всички елементи вStack-а, за да намерим най-малкото число
                int currentUpperElement = numbersStack.pop();
                if (currentUpperElement < smallestNumber) {
                    smallestNumber = currentUpperElement;
                }
            }
            System.out.println(smallestNumber);
        }


    }
}
