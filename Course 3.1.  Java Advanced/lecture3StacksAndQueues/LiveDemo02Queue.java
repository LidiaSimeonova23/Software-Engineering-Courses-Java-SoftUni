package lecture3StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class LiveDemo02Queue {
    public static void main(String[] args) {

        Deque<Integer> numbersQueue = new ArrayDeque<>();

        numbersQueue.offer(50);
        numbersQueue.offer(5);
        numbersQueue.offer(150);
        numbersQueue.offer(40);

        numbersQueue.poll();

        int firstElement = numbersQueue.peek();
        System.out.println(firstElement);

        System.out.println(numbersQueue.isEmpty());

        System.out.println(numbersQueue.size());

        System.out.println(numbersQueue.contains(150));

        while (!numbersQueue.isEmpty()) {
            //System.out.println(numbersQueue.poll());
            System.out.print(numbersQueue.poll() + " ");
        }

//        while (numbersQueue.size() > 0) {
//            //System.out.println(numbersQueue.poll());
//            System.out.print(numbersQueue.poll() + " ");
//        }

//        while (numbersQueue.size() >= 1) {
//            //System.out.println(numbersQueue.poll());
//            System.out.print(numbersQueue.poll() + " ");
//        }


    }
}
