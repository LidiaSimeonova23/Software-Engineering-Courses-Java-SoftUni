package lecture9ForLoop;

import java.util.Scanner;

public class P08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете n на брой цели числа. Принтирайте най-голямото и най-малкото число сред въведените

        int numbersCount = Integer.parseInt(scanner.nextLine());


        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        for (int positionOfNumber = 1; positionOfNumber <= numbersCount; positionOfNumber++) {      //positionOfNumber вместо i
            int numberOfTheCurrentPosition = Integer.parseInt(scanner.nextLine());

            if (numberOfTheCurrentPosition > maxNumber) {
                maxNumber = numberOfTheCurrentPosition;
            }

            if (numberOfTheCurrentPosition < minNumber) {
                minNumber = numberOfTheCurrentPosition;
            }

        }

        System.out.printf("Max number: %d%n", maxNumber);
        System.out.printf("Min number: %d", minNumber);
    }
}
