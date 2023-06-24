package lecture3FirstStepsInCoding;

import java.util.Scanner;

public class P04InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inches = Double.parseDouble(scanner.nextLine());

        double centimeters = inches * 2.54;
        System.out.println(centimeters);
        //System.out.println(inches * 2.54);
    }
}
