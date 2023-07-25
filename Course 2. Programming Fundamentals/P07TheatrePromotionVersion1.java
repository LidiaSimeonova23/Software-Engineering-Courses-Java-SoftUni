package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P07TheatrePromotionVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //The input comes in two lines. On the first line, you will receive the type of day. On the second – is the age of the person.
        String typeOfDay = scanner.nextLine();    //възможностите са: "Weekday", "Weekend"  or "Holiday"
        int age = Integer.parseInt(scanner.nextLine());        //The age will be in the interval [-1000…1000].

        double priceOf1Ticket = 0;    //създаваме си променлива за цената с начална стойност 0, после ще я променяме      //в случая може и int priceOf1Ticket = 0;

        if (age >= 0 && age <= 18) {
            if (typeOfDay.equals("Weekday")) {
                priceOf1Ticket = 12;
            } else if (typeOfDay.equals("Weekend")) {
                priceOf1Ticket = 15;
            } else if (typeOfDay.equals("Holiday")) {
                priceOf1Ticket = 5;
            }
        } else if (age > 18 && age <= 64) {
            if (typeOfDay.equals("Weekday")) {
                priceOf1Ticket = 18;
            } else if (typeOfDay.equals("Weekend")) {
                priceOf1Ticket = 20;
            } else if (typeOfDay.equals("Holiday")) {
                priceOf1Ticket = 12;
            }
        } else if (age > 64 && age <= 122) {
            if (typeOfDay.equals("Weekday")) {
                priceOf1Ticket = 12;
            } else if (typeOfDay.equals("Weekend")) {
                priceOf1Ticket = 15;
            } else if (typeOfDay.equals("Holiday")) {
                priceOf1Ticket = 10;
            }
        }


        boolean isValidAge = age >= 0 && age <= 122;   //създаваме си булева променлива, която да ни държи условието за валидност на възрастта

        //Print the ticket price according to the table, or "Error!" if the age is not in the table.
        if (!isValidAge) {             //ако възрастта е невалидна
            System.out.println("Error!");
        } else {         //в противен случай (ако възрастта е валидна)
            System.out.printf("%.0f$", priceOf1Ticket);
        }


    }
}
