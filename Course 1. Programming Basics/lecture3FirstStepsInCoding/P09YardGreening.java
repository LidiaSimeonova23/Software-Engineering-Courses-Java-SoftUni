package lecture3FirstStepsInCoding;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double squareMetersToBeGreened = Double.parseDouble(scanner.nextLine());

        double priceFor1SquareMeter = 7.61;

        double priceForAllSquareMeters = squareMetersToBeGreened * 7.61;
        double finalPriceForAllSquareMeters = priceForAllSquareMeters - (priceForAllSquareMeters * 18 / 100);    //priceForAllSquareMeters * 18 / 100    - това е отстъпката от цената
        System.out.printf("The final price is: %f lv.%n", finalPriceForAllSquareMeters);
        System.out.printf("The discount is: %f lv.", priceForAllSquareMeters * 18 / 100);
    }
}
