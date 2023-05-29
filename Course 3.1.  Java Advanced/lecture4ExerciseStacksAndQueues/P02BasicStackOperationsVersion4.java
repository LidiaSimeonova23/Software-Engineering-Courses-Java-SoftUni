package lecture4ExerciseStacksAndQueues;

import java.util.*;

public class P02BasicStackOperationsVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] indicatorsArray = scanner.nextLine().split(" ");         //четем първия ред от конзолата като масив от текстове

        //всеки елемент от прочетения масив го превръщаме в цяло число
        int numberOfElementsToPushIntoTheStack = Integer.parseInt(indicatorsArray[0]);      //числото N по условие
        int numberOfElementsToPopFromTheStack = Integer.parseInt(indicatorsArray[1]);       //числото S по условие
        int elementToCheckIfExistsInTheStack = Integer.parseInt(indicatorsArray[2]);        //числото X по условие

        Deque<Integer> numbersStack = new ArrayDeque<>();

        //четем масив от цели числа и ги добавяме към Stack-а
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(element -> numbersStack.push(element));

        //премахваме елементи от Stack-а
        for (int count = 1; count <= numberOfElementsToPopFromTheStack; count++) {       //for (int count = 0; count < numberOfElementsToPopFromTheStack; count++)
            numbersStack.pop();
        }


        if (numbersStack.size() == 0) {           //if (numbersStack.isEmpty())
            System.out.println("0");              //System.out.println(0);
        } else if (numbersStack.contains(elementToCheckIfExistsInTheStack)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(numbersStack));
        }


    }
}
