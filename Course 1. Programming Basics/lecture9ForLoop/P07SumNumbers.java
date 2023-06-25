package lecture9ForLoop;

import java.util.Scanner;

public class P07SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Да се напише програма, която чете n-на брой цели числа, въведени от потребителя и ги сумира.

        int numbersCount = Integer.parseInt(scanner.nextLine());

        int sumOfAllNumbers = 0;
        for (int position = 1; position <= numbersCount; position++) {           //за да си построя цикъла, за име на променливата използвам position вместо i
            int numberOnTheCurrentPosition = Integer.parseInt(scanner.nextLine());

            sumOfAllNumbers = sumOfAllNumbers + numberOnTheCurrentPosition;
        }

        System.out.println(sumOfAllNumbers);
        //System.out.printf("%d", sumOfAllNumbers);
    }
}
