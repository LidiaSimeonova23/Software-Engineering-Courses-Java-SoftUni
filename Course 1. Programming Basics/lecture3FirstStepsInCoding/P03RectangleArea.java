package lecture3FirstStepsInCoding;

import java.util.Scanner;

public class P03RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int rectangleArea = a * b;
        System.out.println(rectangleArea);
        //System.out.println(a * b);
    }
}
