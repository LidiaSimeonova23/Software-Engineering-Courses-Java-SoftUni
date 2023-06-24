package lecture4ExerciseFirstStepsInCoding;

import java.util.Scanner;

public class P02RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radians = Double.parseDouble(scanner.nextLine());
        //градус = радиан * 180 / π

        double degrees = radians * 180 / Math.PI;
        System.out.println(degrees);
        //System.out.println(radians * 180 / Math.PI);
    }
}
