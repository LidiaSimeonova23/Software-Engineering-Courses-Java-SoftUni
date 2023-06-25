package lecture8ExerciseConditionalStatementsAdvanced;

import java.util.Scanner;

public class P01CinemaVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ticketType = scanner.nextLine();       //тип прожекция (стринг),
        int rowsNumber = Integer.parseInt(scanner.nextLine());      //брой редове (цели числа)
        int columnsNumber = Integer.parseInt(scanner.nextLine());      //брой колони в залата (цели числа)

        //•	Premiere – премиерна прожекция, на цена 12.00 лева.
        //•	Normal – стандартна прожекция, на цена 7.50 лева.
        //•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.

        double ticketPrice = 0;
        switch (ticketType) {
            case "Premiere":
                ticketPrice = 12.00;
                break;
            case "Normal":
                ticketPrice = 7.50;
                break;
            case "Discount":
                ticketPrice = 5.00;
                break;
        }

        int numberOfSeats = rowsNumber * columnsNumber;
        double totalPriceOfAllTickets = numberOfSeats * ticketPrice;
        System.out.printf("%.2f leva", totalPriceOfAllTickets);
    }
}
