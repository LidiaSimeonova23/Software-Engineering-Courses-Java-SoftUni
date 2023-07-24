package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P03PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //The input comes as a single double number - grade.
        double grade = Double.parseDouble(scanner.nextLine());

        //The output is either "Passed!" if the grade is more than 2.99, otherwise, you should print "Failed!".
        if (grade > 2.99) {                 //if (grade >= 3.00)
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

    }
}
