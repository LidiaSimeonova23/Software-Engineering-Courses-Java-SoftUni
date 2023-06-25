package lecture7ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P08CinemaTicketVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        int ticketPrice = 0;
        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Friday")) {
            ticketPrice = 12;
        } else if (dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")) {
            ticketPrice = 14;
        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            ticketPrice = 16;
        }

        System.out.println(ticketPrice);
    }
}

