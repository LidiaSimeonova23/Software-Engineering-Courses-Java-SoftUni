package lecture3StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03DecimalToBinaryVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int decimalNumber = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> bitsStack = new ArrayDeque<>();

        if (decimalNumber < 0) {
            System.out.println("Cannot handle negative integers");
            return;
        }

        if (decimalNumber == 0) {
            System.out.println(0);
            return;
        }

        while (decimalNumber > 0) {
            int bit = decimalNumber % 2;
            bitsStack.push(String.valueOf(bit));     //превръщаме остатъка от тип int в тип String и го добавяме към stack-а
            //bitsStack.push("" + bit);

            decimalNumber = decimalNumber / 2;     //update    - с целочислено деление на 2 намираме половината (като int, а не като double)
        }


        while (!bitsStack.isEmpty()) {
            System.out.print(bitsStack.pop());
        }

//        while (bitsStack.size() > 0) {
//            System.out.print(bitsStack.pop());
//        }

//        while (bitsStack.size() >= 1) {
//            System.out.print(bitsStack.pop());
//        }

    }
}
