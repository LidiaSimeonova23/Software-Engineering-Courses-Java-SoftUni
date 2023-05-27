package lecture3StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P06HotPotatoVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kidsArray = scanner.nextLine().split("\\s+");
        int steps = Integer.parseInt(scanner.nextLine());

        Deque<String> kidsQueue = new ArrayDeque<>();

        Collections.addAll(kidsQueue, kidsArray);

        //докато в опашката има повече от 1 елемент (1 дете), на всяка итерация на while цикъла (външния цикъл) ще принтираме кое дете е било премахнато от играта
        while (kidsQueue.size() > 1) {
            for (int currentStep = 1; currentStep < steps; currentStep++) {      //for (int currentStep = 0; currentStep < steps - 1; currentStep++)
                String child = kidsQueue.poll();
                kidsQueue.offer(child);
                //вместо предишните два реда може само с един ред:    kidsQueue.offer(kidsQueue.poll());
            }


            //след като се извършат всичките steps на брой хвърляния
            String removedKid = kidsQueue.poll();
            //System.out.printf("Removed %s%n", removedKid);
            System.out.println("Removed " + removedKid);
        }


        //когато while цикълът се прекрати, значи че децата вече не са повече от 1 (тоест, в играта е останало само 1 дете)
        String lastKid = kidsQueue.poll();
        System.out.println("Last is " + lastKid);
        //System.out.println("Last is " + kidsQueue.poll());
        //System.out.printf("Last is %s%n", lastKid);        //System.out.printf("Last is %s", lastKid);
    }
}
