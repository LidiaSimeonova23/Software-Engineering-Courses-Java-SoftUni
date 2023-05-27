package lecture3StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P06HotPotatoVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kidsArray = scanner.nextLine().split(" ");
        int steps = Integer.parseInt(scanner.nextLine());

        Deque<String> kidsQueue = new ArrayDeque<>();

        //с foreach цикъл обхождаме елементите на масива и ги прибавяме към опашката
        for (String element : kidsArray) {
            kidsQueue.offer(element);
        }


        while (kidsQueue.size() > 1) {
            for (int currentStep = 0; currentStep < steps - 1; currentStep++) {      //for (int currentStep = 1; currentStep < steps; currentStep++)
                String child = kidsQueue.poll();
                kidsQueue.offer(child);
                //вместо предишните два реда може само този ред:    kidsQueue.offer(kidsQueue.poll());
            }

            String removedKid = kidsQueue.poll();
            System.out.println("Removed " + removedKid);
            // System.out.printf("Removed %s%n", removedKid);
        }


        String lastKid = kidsQueue.peek();
        System.out.println("Last is " + lastKid);
        //System.out.println("Last is " + kidsQueue.peek());
        //System.out.printf("Last is %s%n", lastKid);        //System.out.printf("Last is %s", lastKid);
    }
}
