package lecture3StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;

public class LiveDemo01Stack {
    public static void main(String[] args) {

        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        numbersStack.push(10);
        numbersStack.push(5);
        numbersStack.push(12);
        numbersStack.push(70);
        numbersStack.pop();
        numbersStack.peek();
        numbersStack.pop();

        boolean isTheStackEmpty = numbersStack.isEmpty();
        System.out.println(isTheStackEmpty);
        //System.out.println(numbersStack.isEmpty());    //вместо горните два реда, можем да ползваме само този ред

        System.out.println(numbersStack.size());
        //int sizeOfNumbersStack = numbersStack.size();
        //System.out.println(sizeOfNumbersStack);


        System.out.println(numbersStack.contains(10));
        //boolean theStackContains10 = numbersStack.contains(10);
        //System.out.println(theStackContains10);

        Integer upperElement = numbersStack.peek();
        System.out.println(upperElement);
        //System.out.println(numbersStack.peek());

        while (!numbersStack.isEmpty()) {
            System.out.print(numbersStack.pop() + " ");
        }


        System.out.println();
        System.out.println("******************************");

        String input = "13 42 69 73";
        ArrayDeque<Integer> numsStack = new ArrayDeque<>();


        Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).forEach(element -> numsStack.push(element));

        while (!numsStack.isEmpty()) {
            System.out.print(numsStack.pop() + " ");
        }


    }
}



