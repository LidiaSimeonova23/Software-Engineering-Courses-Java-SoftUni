package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P07TheatrePromotionVersion8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //The input comes in two lines. On the first line, you will receive the type of day. On the second – is the age of the person.
        String typeOfDay = scanner.nextLine();    //възможностите са: "Weekday", "Weekend"  or "Holiday"
        int age = Integer.parseInt(scanner.nextLine());        //The age will be in the interval [-1000…1000].

        double priceOf1Ticket = 0;    //създаваме си променлива за цената с начална стойност 0, после ще я променяме      //в случая може и int priceOf1Ticket = 0;   (тъй като в задачата всички цени са цели числа)

        if (typeOfDay.equals("Weekday")) {
            if (age >= 0 && age <= 18) {
                priceOf1Ticket = 12;
            } else if (age > 18 && age <= 64) {
                priceOf1Ticket = 18;
            } else if (age > 64 && age <= 122) {
                priceOf1Ticket = 12;
            }
        } else if (typeOfDay.equals("Weekend")) {
            if (age >= 0 && age <= 18) {
                priceOf1Ticket = 15;
            } else if (age > 18 && age <= 64) {
                priceOf1Ticket = 20;
            } else if (age > 64 && age <= 122) {
                priceOf1Ticket = 15;
            }
        } else if (typeOfDay.equals("Holiday")) {
            if (age >= 0 && age <= 18) {
                priceOf1Ticket = 5;
            } else if (age > 18 && age <= 64) {
                priceOf1Ticket = 12;
            } else if (age > 64 && age <= 122) {
                priceOf1Ticket = 10;
            }
        }


        //Print the ticket price according to the table, or "Error!" if the age is not in the table.
        if ((age >= 0 && age <= 18) || (age > 18 && age <= 64) || (age > 64 && age <= 122)) {       //ако възрастта е валидна
            System.out.printf("%.0f$", priceOf1Ticket);
        } else {
            System.out.println("Error!");
        }

    }
}
