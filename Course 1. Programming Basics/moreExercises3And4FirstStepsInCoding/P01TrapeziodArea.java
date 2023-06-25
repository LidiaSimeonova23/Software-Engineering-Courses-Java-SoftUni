package moreExercises3And4FirstStepsInCoding;

import java.util.Scanner;

public class P01TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четем от конзолата три дробни числа b1, b2 (основите на трапеца) и h (височината му)
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        //Формулата за лице на трапец е (b1 + b2) * h / 2

        double area = (b1 + b2) * h / 2;

        System.out.printf("%.2f", area);
    }
}
