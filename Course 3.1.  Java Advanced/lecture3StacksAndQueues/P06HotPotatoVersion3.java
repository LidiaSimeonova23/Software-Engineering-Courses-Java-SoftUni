package lecture3StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P06HotPotatoVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //toss - хвърляне

        String[] kidsArray = scanner.nextLine().split(" ");
        int numberOfTosses = Integer.parseInt(scanner.nextLine());

        Deque<String> kidsQueue = new ArrayDeque<>();

        //с for цикъл обхождаме елементите на масива и ги прибавяме към опашката
        for (int index = 0; index <= kidsArray.length - 1; index++) {      //for (int index = 0; index < kidsArray.length; index++)
            String currentKid = kidsArray[index];
            kidsQueue.offer(currentKid);
        }


        while (kidsQueue.size() != 1) {
            for (int currentToss = 1; currentToss < numberOfTosses; currentToss++) {      //for (int currentToss = 1; currentToss < numberOfTosses; currentToss++)
                String child = kidsQueue.poll();
                kidsQueue.offer(child);
                //вместо предишните два реда може само този ред:    kidsQueue.offer(kidsQueue.poll());
            }

            String removedKid = kidsQueue.poll();
            System.out.println("Removed " + removedKid);
            // System.out.printf("Removed %s%n", removedKid);
        }


        String lastKid = kidsQueue.peek();
        System.out.println("Last is " + lastKid);       //може и System.out.print("Last is " + lastKid);
        //System.out.println("Last is " + kidsQueue.peek());
        //System.out.printf("Last is %s%n", lastKid);        //System.out.printf("Last is %s", lastKid);
    }
}
