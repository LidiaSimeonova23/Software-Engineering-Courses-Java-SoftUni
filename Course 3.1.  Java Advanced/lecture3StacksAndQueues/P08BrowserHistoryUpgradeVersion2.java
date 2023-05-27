package lecture3StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08BrowserHistoryUpgradeVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> backwardHistoryStack = new ArrayDeque<>();
        ArrayDeque<String> forwardHistoryQueue = new ArrayDeque<>();

        String input = scanner.nextLine();
        while (!input.equals("Home")) {

            //ако входните данни не са "Home", значи са или URL address, или "back", или "forward"
            if (input.equals("back")) {
                if (backwardHistoryStack.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    forwardHistoryQueue.addFirst(backwardHistoryStack.pop());
                    System.out.println(backwardHistoryStack.peek());
                }
            } else if (input.equals("forward")) {
                if (!forwardHistoryQueue.isEmpty()) {
                    System.out.println(forwardHistoryQueue.peek());
                    backwardHistoryStack.push(forwardHistoryQueue.poll());
                } else {
                    System.out.println("no next URLs");
                }
            } else {
                backwardHistoryStack.push(input);
                forwardHistoryQueue.clear();
                System.out.println(input);
            }

            input = scanner.nextLine();
        }

    }
}
