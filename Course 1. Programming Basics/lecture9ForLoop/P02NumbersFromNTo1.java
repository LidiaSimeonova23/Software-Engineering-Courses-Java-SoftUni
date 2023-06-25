package lecture9ForLoop;

import java.util.Scanner;

public class P02NumbersFromNTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете цяло положително число n, въведено от потребителя, и печата числата от n до 1 в обратен ред. Въведеното число n, винаги ще бъде по-голямо от 1.

        int number = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = number; currentNumber >= 1; currentNumber--) {
            System.out.println(currentNumber);
            //System.out.printf("%d%n", currentNumber);
        }

    }
}



