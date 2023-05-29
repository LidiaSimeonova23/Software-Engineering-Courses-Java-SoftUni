package lecture4ExerciseStacksAndQueues;

import java.util.*;

public class P02BasicStackOperationsVersion1 {
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
            numbersStack.pop();       //на всяка итер. на цикъла премахваме най-горното число от Stack-а
        }

        //проверка дали Stack-ът съдържа прочетеното число elementToCheckIfExistsInTheStack от конзолата
        if (numbersStack.contains(elementToCheckIfExistsInTheStack)) {       //ако числото се съдържа в Stack-а
            System.out.println("true");
        } else {            //в противен случай (ако не се съдържа)
            if (numbersStack.isEmpty()) {     //ако Stack-ът е празен
                System.out.println(0);
            } else {                          //ако не е празен
                System.out.println(Collections.min(numbersStack));      //чрез  Collections.min(numbersStack)   намираме и принтираме най-малкото число в Stack-а
            }
        }

    }
}

