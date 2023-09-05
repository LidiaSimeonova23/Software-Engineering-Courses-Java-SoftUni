package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //в условието на задачата е написан код, в който има грешки и ние трябва да ги поправим
        //това е верният код:

        int number = Integer.parseInt(scanner.nextLine());   //от първия ред на конзолата четем едно цяло число


        for (int i = 1; i <= number; i++) {

            int currentNumber = i;   //текущо число на while цикъла е стойността на променливата i
            int sum = 0;
            while (currentNumber > 0) {
                int lastDigit = currentNumber % 10;
                sum = sum + lastDigit;
                currentNumber = currentNumber / 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }

        }


    }
}
