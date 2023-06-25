package lecture7ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P07WorkingHoursVersion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        boolean isOpen = (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") ||
                dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday") || dayOfWeek.equals("Saturday")) && (hour >= 10 && hour <= 18);

        if (isOpen) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }

    }
}
