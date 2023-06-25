package moreExercises3And4FirstStepsInCoding;

import java.util.Scanner;

public class P02TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //страна и височина на триъгълник - реални числа
        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double area = a * h / 2;
        System.out.printf("%.2f", area);
    }
}
