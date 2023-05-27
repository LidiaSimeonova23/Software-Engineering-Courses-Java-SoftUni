package lecture3StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01BrowserHistoryVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<String> historyStack = new ArrayDeque<>();

        String currentURL = "";
        String input = scanner.nextLine();
        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (!historyStack.isEmpty()) {   //ако stack-ът не е празен
                    currentURL = historyStack.pop();
                } else {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();    //update
                    continue;    //прекъсваме текущата итерация на цикъла (защото целта е да не се принтира най-горният елемент в стека)
                }
            } else {
                if (!currentURL.equals("")) {
                    historyStack.push(currentURL);
                }

                currentURL = input;
            }

            System.out.println(currentURL);

            input = scanner.nextLine();    //update
        }


    }
}
