package lecture26TextProcessing;

import java.util.Scanner;

public class P01ReverseStringsVersion1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //с 2 вложени цикъла - във външния взимаме текущата дума, а във вътрешния итерираме по всички символи на текущата дума
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String currentWord = input;

            String reversedWord = "";
            for (int index = currentWord.length() - 1; index >= 0; index--) {
                reversedWord += currentWord.charAt(index);      //reversedWord = reversedWord + currentWord.charAt(index);       //конкатенация
            }

            System.out.printf("%s = %s%n", currentWord, reversedWord);       //принтираме текущата дума наобратно (преди да преминем към следващата итерация на външния цикъл)
            //System.out.println(currentWord + " = " + reversedWord);

            input = scanner.nextLine();     //update
        }

    }
}
