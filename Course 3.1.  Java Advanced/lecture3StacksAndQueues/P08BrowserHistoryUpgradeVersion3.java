package lecture3StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08BrowserHistoryUpgradeVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> backwardHistoryStack = new ArrayDeque<>();
        ArrayDeque<String> forwardHistoryQueue = new ArrayDeque<>();

        String input = scanner.nextLine();
        while (!input.equals("Home")) {

            //ако входните данни не са "Home", значи са или URL address, или "back", или "forward"
            if (input.equals("back")) {
                if (backwardHistoryStack.size() >= 2) {       //ако можем да се върнем назад
                    String removedURL = backwardHistoryStack.pop();     //премахваме най-горния елемент от stack-а
                    forwardHistoryQueue.addFirst(removedURL);           //добавяме премахнатия елемент от stack-а към опашката - слагаме го на първо място
                    System.out.println(backwardHistoryStack.peek());     //принтираме стойността на най-горния елемент в stack-а
                } else {       //в противен случай не можем да се върнем назад
                    System.out.println("no previous URLs");
                }
            } else if (input.equals("forward")) {
                if (!forwardHistoryQueue.isEmpty()) {             //условието, когато можем да преминем напред
                    System.out.println(forwardHistoryQueue.peek());            //наамираме стойността на първия елемент в опашката и я принтираме
                    backwardHistoryStack.push(forwardHistoryQueue.poll());   //премахваме първия елемент в опашката и го добавяме най-отгоре в stack-а
                } else {          //във всички останали случаи не можем да преминем напред
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
