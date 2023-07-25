package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P07TheatrePromotionVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //The input comes in two lines. On the first line, you will receive the type of day. On the second – is the age of the person.
        String typeOfDay = scanner.nextLine();    //възможностите са: "Weekday", "Weekend"  or "Holiday"
        int age = Integer.parseInt(scanner.nextLine());        //The age will be in the interval [-1000…1000].

        int priceOf1Ticket = 0;    //създаваме си променлива за цената с начална стойност 0, после ще я променяме      //в случая може и double priceOf1Ticket = 0;
        boolean isValidAge = true;   //създаваме си булева променлива с начална стойност true, после ще я променим

        if (age >= 0 && age <= 18) {
            switch (typeOfDay) {
                case "Weekday":
                    priceOf1Ticket = 12;
                    break;
                case "Weekend":
                    priceOf1Ticket = 15;
                    break;
                case "Holiday":
                    priceOf1Ticket = 5;
                    break;
            }
        } else if (age > 18 && age <= 64) {
            switch (typeOfDay) {
                case "Weekday":
                    priceOf1Ticket = 18;
                    break;
                case "Weekend":
                    priceOf1Ticket = 20;
                    break;
                case "Holiday":
                    priceOf1Ticket = 12;
                    break;
            }
        } else if (age > 64 && age <= 122) {
            switch (typeOfDay) {
                case "Weekday":
                    priceOf1Ticket = 12;
                    break;
                case "Weekend":
                    priceOf1Ticket = 15;
                    break;
                case "Holiday":
                    priceOf1Ticket = 10;
                    break;
            }
        } else {      //във всички останали случаи (когато възрастта е отрицат. число или е повече от 122)
            isValidAge = false;
        }


        //Print the ticket price according to the table, or "Error!" if the age is not in the table.
        if (isValidAge) {       //ако възрастта е валидна
            System.out.printf("%d$", priceOf1Ticket);
        } else {          //в противен случай (ако възрастта е невалидна)
            System.out.println("Error!");
        }


    }
}
