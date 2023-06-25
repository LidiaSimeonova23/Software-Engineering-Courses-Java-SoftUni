package lecture8ExerciseConditionalStatementsAdvanced;

import java.util.Scanner;

public class P01CinemaVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ticketType = scanner.nextLine();       //тип прожекция (стринг),
        int rowsNumber = Integer.parseInt(scanner.nextLine());      //брой редове (цели числа)
        int columnsNumber = Integer.parseInt(scanner.nextLine());      //брой колони в залата (цели числа)

        //•	Premiere – премиерна прожекция, на цена 12.00 лева.
        //•	Normal – стандартна прожекция, на цена 7.50 лева.
        //•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.

        double ticketPrice = 0;
        if (ticketType.equals("Premiere")) {
            ticketPrice = 12.00;
        } else if (ticketType.equals("Normal")) {
            ticketPrice = 7.50;
        } else if (ticketType.equals("Discount")) {
            ticketPrice = 5.00;
        }


        int numberOfSeats = rowsNumber * columnsNumber;
        double totalPriceOfAllTickets = numberOfSeats * ticketPrice;
        System.out.printf("%.2f leva", totalPriceOfAllTickets);
    }
}
