package lecture3StacksAndQueues;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P07MathPotatoVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //toss - хвърляне

        String[] namesArray = scanner.nextLine().split("\\s+");        //String[] namesArray = scanner.nextLine().split(" ");
        int tosses = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> kidsPriorityQueue = new PriorityQueue<>();

        Collections.addAll(kidsPriorityQueue, namesArray);      //добавяме всички елементи на масива към приоритетната опашка


        //докато в опашката има повече от 1 елемент (1 дете), на всяка итерация на while цикъла (външния цикъл) ще принтираме кое дете е било премахнато от играта
        int currentStep = 1;
        while (kidsPriorityQueue.size() > 1) {
            for (int currentToss = 1; currentToss < tosses; currentToss++) {      //for (int currentToss = 0; currentToss < steps - 1; currentToss++)
                String child = kidsPriorityQueue.poll();         //премахваме първото дете от приоритетната опашка
                kidsPriorityQueue.offer(child);                 //добавяме премахнатото дете - слагаме го в края на приоритетната опашка
                //вместо предишните два реда може само с един ред:    kidsPriorityQueue.offer(kidsPriorityQueue.poll());
            }

            //проверка - ако числото е просто
            if (isPrime(currentStep)) {
                System.out.println("Prime " + kidsPriorityQueue.peek());
            } else {
                String removedKid = kidsPriorityQueue.poll();       //System.out.println("Removed " + kidsPriorityQueue.poll());
                //System.out.printf("Removed %s%n", removedKid);
                System.out.println("Removed " + removedKid);
            }

            currentStep++;    //currentToss = currentToss + 1;
        }


        //когато while цикълът се прекрати, значи че децата вече не са повече от 1 (тоест, в играта е останало само 1 дете)
        String lastKid = kidsPriorityQueue.poll();
        System.out.println("Last is " + lastKid);        //System.out.print("Last is " + lastKid);
        //System.out.println("Last is " + kidsPriorityQueue.poll());
        //System.out.printf("Last is %s%n", lastKid);        //System.out.printf("Last is %s", lastKid);
    }


    private static boolean isPrime(int number) {       //създаваме си метод за определяне дали едно число е просто, или не
        if (number == 1) {
            return false;
        }

        for (int divisor = 2; divisor < number; divisor++) {      //по този начин изключваме 1 и самото число      //по принцип цикълът трябваше да е for (int divisor = 1; divisor <= number; divisor++)
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

}
