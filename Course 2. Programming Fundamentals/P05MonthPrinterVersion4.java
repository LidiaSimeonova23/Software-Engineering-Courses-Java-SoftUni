package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P05MonthPrinterVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that takes an integer from the console and prints the corresponding month. If the number is more than 12 or less than 1, print "Error!".
        String number = scanner.nextLine();

        if (number.equals("1")) {
            System.out.println("January");
        } else if (number.equals("2")) {
            System.out.println("February");
        } else if (number.equals("3")) {
            System.out.println("March");
        } else if (number.equals("4")) {
            System.out.println("April");
        } else if (number.equals("5")) {
            System.out.println("May");
        } else if (number.equals("6")) {
            System.out.println("June");
        } else if (number.equals("7")) {
            System.out.println("July");
        } else if (number.equals("8")) {
            System.out.println("August");
        } else if (number.equals("9")) {
            System.out.println("September");
        } else if (number.equals("10")) {
            System.out.println("October");
        } else if (number.equals("11")) {
            System.out.println("November");
        } else if (number.equals("12")) {
            System.out.println("December");
        } else {
            System.out.println("Error!");
        }

    }
}


