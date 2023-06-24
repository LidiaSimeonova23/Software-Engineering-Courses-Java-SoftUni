package lecture4ExerciseFirstStepsInCoding;

import java.util.Scanner;

public class P01USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 USD = 1.79549 BGN
        String input = scanner.nextLine();    //четем входните данни като текст
        double usd = Double.parseDouble(input);     //ще извършваме аритметични операции, затова превръщаме текста в число (дробно)

        double bgn = usd * 1.79549;
        System.out.println(bgn);
        //System.out.println(usd * 1.79549);
    }
}
