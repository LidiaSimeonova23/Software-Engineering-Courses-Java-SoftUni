package lecture7ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P02WeekendOrWorkingDayVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        if (dayOfWeek.equals("Monday")) {
            System.out.println("Working day");
        } else if (dayOfWeek.equals("Tuesday")) {
            System.out.println("Working day");
        } else if (dayOfWeek.equals("Wednesday")) {
            System.out.println("Working day");
        } else if (dayOfWeek.equals("Thursday")) {
            System.out.println("Working day");
        } else if (dayOfWeek.equals("Friday")) {
            System.out.println("Working day");
        } else if (dayOfWeek.equals("Saturday")) {
            System.out.println("Weekend");
        } else if (dayOfWeek.equals("Sunday")) {
            System.out.println("Weekend");
        } else {
            System.out.println("Error");
        }


    }
}

