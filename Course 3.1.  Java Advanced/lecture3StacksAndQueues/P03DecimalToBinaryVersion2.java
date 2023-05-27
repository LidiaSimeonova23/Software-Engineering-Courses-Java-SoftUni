package lecture3StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P03DecimalToBinaryVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int decimalNumber = Integer.parseInt(scanner.nextLine());

        Deque<Integer> binaryNumberStack = new ArrayDeque<>();

        if (decimalNumber < 0) {
            System.out.println("Cannot handle negative integers");
            return;    //за да прекъснем програмата (main метода)
        }

        if (decimalNumber == 0) {
            System.out.println(0);
            return;
        }

        while (decimalNumber > 0) {
            //binaryNumberStack.push(decimalNumber % 2);
            int reminder = decimalNumber % 2;
            binaryNumberStack.push(reminder);

            decimalNumber = decimalNumber / 2;      // decimalNumber /= 2;    //update
        }


        while (binaryNumberStack.size() > 0) {         //принтираме елементите на stack-а   - първи начин
            System.out.print(binaryNumberStack.pop());
        }

//        while (binaryNumberStack.size() >= 1) {        //принтираме елементите на stack-а   - втори начин
//            System.out.print(binaryNumberStack.pop());
//        }

//        while (!binaryNumberStack.isEmpty()) {          //принтираме елементите на stack-а   - трети начин
//            System.out.print(binaryNumberStack.pop());
//        }

    }
}
