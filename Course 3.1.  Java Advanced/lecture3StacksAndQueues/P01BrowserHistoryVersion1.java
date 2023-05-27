package lecture3StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01BrowserHistoryVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<String> historyStack = new ArrayDeque<>();

        String currentInput = scanner.nextLine();
        while (!currentInput.equals("Home")) {

            if (currentInput.equals("back")) {
                if (historyStack.isEmpty() || historyStack.size() == 1) {   //ако stack-ът е празен (в него няма URL address-и) или ако URL address-ът е само един, нямаме предишен URL address
                    System.out.println("no previous URLs");
                } else {
                    historyStack.pop();     //премахваме най-горния (най-последния) елемент (URL address), за да се върнем към предишния
                    System.out.println(historyStack.peek());
                }
            } else {
                historyStack.push(currentInput);
                System.out.println(historyStack.peek());
                //System.out.println(currentInput);
            }


            currentInput = scanner.nextLine();    //update
        }


    }
}
