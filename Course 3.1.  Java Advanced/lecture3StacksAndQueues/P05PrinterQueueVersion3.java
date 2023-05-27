package lecture3StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P05PrinterQueueVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> filesQueue = new ArrayDeque<>();


        String currentInput = scanner.nextLine();
        while (!currentInput.equals("print")) {

            if (currentInput.equals("cancel")) {
                if (filesQueue.size() > 0) {          //if (filesQueue.size() >= 1)
                    String firstElement = filesQueue.poll();
                    System.out.printf("Canceled %s%n", firstElement);
                } else {
                    System.out.println("Printer is on standby");
                }
            } else {
                filesQueue.offer(currentInput);
            }

            currentInput = scanner.nextLine();
        }


        while (!filesQueue.isEmpty()) {
            System.out.println(filesQueue.poll());
        }

    }
}
