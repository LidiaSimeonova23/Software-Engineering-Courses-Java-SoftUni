package lecture4ExerciseStacksAndQueues;

import java.util.*;
import java.util.stream.Collectors;

public class P01ReverseNumbersWithAStackVersion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //с числата (входните данни) няма да извършваме аритметични операции и/или сравнения, затова не ни трябват като числа, тоест, ще си ги прочетем като текст
        String[] numbersAsTextArray = scanner.nextLine().split(" ");
        List<String> numbersAsTextList = Arrays.asList(numbersAsTextArray);
        //вместо предишните 2 реда можеше да е само този ред от код: List<String> numbersAsTextList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Deque<String> numbersStack = new ArrayDeque<>();

        for (String element : numbersAsTextList) {
            numbersStack.push(element);
        }


        while (numbersStack.size() > 0) {
            System.out.print(numbersStack.pop() + " ");        // System.out.printf("%s ", numbersStack.pop());
        }

    }
}
