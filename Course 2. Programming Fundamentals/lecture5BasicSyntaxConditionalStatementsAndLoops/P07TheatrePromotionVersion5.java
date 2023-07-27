package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P07TheatrePromotionVersion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //The input comes in two lines. On the first line, you will receive the type of day. On the second – is the age of the person.
        String typeOfDay = scanner.nextLine();    //възможностите са: "Weekday", "Weekend"  or "Holiday"
        int age = Integer.parseInt(scanner.nextLine());        //The age will be in the interval [-1000…1000].

        double priceOf1Ticket = 0;    //създаваме си променлива за цената с начална стойност 0, после ще я променяме      //в случая може и int priceOf1Ticket = 0;   (тъй като в условието на задачата всички цени са цели числа)
        boolean isValidAge = true;   //създаваме си булева променлива с начална стойност true, после ще я променим

        switch (typeOfDay) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    priceOf1Ticket = 12;
                } else if (age > 18 && age <= 64) {
                    priceOf1Ticket = 18;
                } else if (age > 64 && age <= 122) {
                    priceOf1Ticket = 12;
                } else {
                    isValidAge = false;
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    priceOf1Ticket = 15;
                } else if (age > 18 && age <= 64) {
                    priceOf1Ticket = 20;
                } else if (age > 64 && age <= 122) {
                    priceOf1Ticket = 15;
                } else {
                    isValidAge = false;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    priceOf1Ticket = 5;
                } else if (age > 18 && age <= 64) {
                    priceOf1Ticket = 12;
                } else if (age > 64 && age <= 122) {
                    priceOf1Ticket = 10;
                } else {
                    isValidAge = false;
                }
                break;
        }

        //Print the ticket price according to the table, or "Error!" if the age is not in the table.
        if (!isValidAge) {
            System.out.println("Error!");
        } else {
            System.out.printf("%.0f$", priceOf1Ticket);
        }


    }
}
