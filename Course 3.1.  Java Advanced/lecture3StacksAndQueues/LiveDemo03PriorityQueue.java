package lecture3StacksAndQueues;

import java.util.PriorityQueue;

public class LiveDemo03PriorityQueue {
    public static void main(String[] args) {


        PriorityQueue<Integer> numbersPriorityQueue = new PriorityQueue<>();

        numbersPriorityQueue.offer(10);
        numbersPriorityQueue.offer(50);
        numbersPriorityQueue.offer(2);
        numbersPriorityQueue.offer(47);

//        System.out.println(numbersPriorityQueue.poll());
//        System.out.println(numbersPriorityQueue.poll());
//        System.out.println(numbersPriorityQueue.poll());
//        System.out.println(numbersPriorityQueue.poll());

        while (!numbersPriorityQueue.isEmpty()) {
            System.out.println(numbersPriorityQueue.poll());
        }


        PriorityQueue<String> namesPriorityQueue = new PriorityQueue<>();

        namesPriorityQueue.offer("Pesho");
        namesPriorityQueue.offer("Gosho");
        namesPriorityQueue.offer("Alex");
        namesPriorityQueue.offer("Martina");

        while (!namesPriorityQueue.isEmpty()) {
            System.out.println(namesPriorityQueue.poll());
        }

    }
}
