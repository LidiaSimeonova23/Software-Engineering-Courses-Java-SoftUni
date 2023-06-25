package lecture9ForLoop;

import java.util.Scanner;

public class P03NumbersFrom1ToNWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете число n, въведено от потребителя, и отпечатва числата от 1 до n през 3

        int number = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = 1; currentNumber <= number; currentNumber += 3) {
            System.out.println(currentNumber);
            //System.out.printf("%d%n", currentNumber);
        }

    }
}
