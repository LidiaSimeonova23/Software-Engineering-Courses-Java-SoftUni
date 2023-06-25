package moreExercises3And4FirstStepsInCoding;

import java.util.Scanner;

public class P08CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());      //радиус на кръг / окръжност

        double circleArea = Math.PI * r * r;
        //double circleArea = Math.PI * Math.pow(r, 2);


        double circlePerimeter = Math.PI * 2 * r;

        System.out.printf("%.2f%n", circleArea);
        System.out.printf("%.2f", circlePerimeter);
    }
}
