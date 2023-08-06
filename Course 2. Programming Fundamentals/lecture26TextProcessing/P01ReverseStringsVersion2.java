package lecture26TextProcessing;

import java.util.Scanner;

public class P01ReverseStringsVersion2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //с 2 вложени цикъла - във външния взимаме текущата дума, а във вътрешния итерираме по всички символи на текущата дума
        String input = scanner.nextLine();
        while (!input.equals("end")) {

            StringBuilder reversedWordSb = new StringBuilder();       //създаваме празен StringBuilder (създаваме нов обект в паметта от клас StringBuilder)
            for (int index = input.length() - 1; index >= 0; index--) {
                char currentSymbol = input.charAt(index);       //създаваме си променлива за текущия символ
                reversedWordSb.append(currentSymbol);       //на всяка итерация на вътрешния цикъл към StringBuilder-а добавяме/долепяме текущия символ
            }

            System.out.printf("%s = %s%n", input, reversedWordSb);     //принтираме текущата дума наобратно (преди да преминем към следващата итерация на външния цикъл)
            //System.out.println(input + " = " + reversedWordSb.toString());

            input = scanner.nextLine();           //update
        }

    }
}
