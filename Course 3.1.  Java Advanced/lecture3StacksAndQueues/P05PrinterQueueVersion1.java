package lecture3StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P05PrinterQueueVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> filesQueue = new ArrayDeque<>();


        String currentInput = scanner.nextLine();
        while (!currentInput.equals("print")) {

            if (currentInput.equals("cancel")) {
                if (filesQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    String firstElement = filesQueue.poll();
                    System.out.printf("Canceled %s%n", firstElement);
                    //вместо предишните два реда може само този ред:   System.out.println("Canceled " + filesQueue.poll());
                }
            } else {
                filesQueue.offer(currentInput);
            }

            currentInput = scanner.nextLine();
        }


        //обхождаме елементите в опашката и ги принтираме   - имаме достъп само до първия елемент в опашката
        while (!filesQueue.isEmpty()) {
            System.out.println(filesQueue.poll());
        }

    }
}

