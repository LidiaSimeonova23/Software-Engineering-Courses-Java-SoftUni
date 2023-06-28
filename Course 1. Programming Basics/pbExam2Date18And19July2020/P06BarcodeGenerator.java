package pbExam2Date18And19July2020;

import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат две четирицифрени числа, които показват обхвата на баркодовете, които трябва да промените.
        //•	Първи ред – четирицифрено число – началото на обхвата. Цяло число в интервала [1000…9999]
        //•	Втори ред – четирицифрено число – края на обхвата. Цяло число в интервала [1000…9999]

        //тъй като знаем, че числата са читирицифрени, можем да разглеждаме числата като текстове и да взимаме всеки символ чрез неговия уникален индекс:
        String startNumber = scanner.nextLine();
        String endNumber = scanner.nextLine();

        //трябва да генерираме четирицифрени числа -> ще имаме четири вложени цикъла
        //знаем, че числото е четирицифрено (тоест, знаем дължината на текста) и можем да взимаме всеки символ чрез неговия уникален индекс:
        for (int i = startNumber.charAt(0); i <= endNumber.charAt(0); i++) {
            for (int j = startNumber.charAt(1); j <= endNumber.charAt(1); j++) {
                for (int k = startNumber.charAt(2); k <= endNumber.charAt(2); k++) {
                    for (int l = startNumber.charAt(3); l <= endNumber.charAt(3); l++) {             //for (int l = startNumber.charAt(startNumber.length() - 1); l <= endNumber.charAt(endNumber.length() - 1); l++)

                        //полученият текст (числото, разглеждано като текст) да се принтира само ако всичките му символи и i, и j, и k, и l са нечетни цифри
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%c%c%c%c ", i, j, k, l);
                        }

                    }
                }
            }
        }


    }
}
