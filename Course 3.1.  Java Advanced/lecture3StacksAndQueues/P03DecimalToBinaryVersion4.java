package lecture3StacksAndQueues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P03DecimalToBinaryVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //АКО РЕШИМ ЗАДАЧАТА ИЗЦЯЛО С ЛИСТОВЕ  -> ТОЕСТ, АКО ВМЕСТО ДА СЪХРАНЯВАМЕ ОСТАТЪЦИТЕ (О-и и 1-ци) В Stack-ОВЕ РЕШИМ ДА ГИ СЪХРАНЯВАМЕ В List-ове
        int decimalNumber = Integer.parseInt(scanner.nextLine());

        List<Integer> binaryNumberList = new ArrayList<>();

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
            binaryNumberList.add(reminder);

            decimalNumber = decimalNumber / 2;      // decimalNumber /= 2;    //update
        }

        Collections.reverse(binaryNumberList);     //обръщаме реда на елементите в листа

        for (int element : binaryNumberList) {     //принтираме елементите в листа
            System.out.print(element);
        }

    }
}
