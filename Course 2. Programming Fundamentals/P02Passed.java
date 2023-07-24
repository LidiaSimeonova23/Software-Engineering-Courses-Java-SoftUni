package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P02Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that takes as an input a grade - a single floating-point number
        double grade = Double.parseDouble(scanner.nextLine());

        //If the grade is equal or more than 3.00, the output should be "Passed!", otherwise, you should print nothing.
        if (grade >= 3) {         //if (grade >= 3.00)
            System.out.println("Passed!");
        }

    }
}
