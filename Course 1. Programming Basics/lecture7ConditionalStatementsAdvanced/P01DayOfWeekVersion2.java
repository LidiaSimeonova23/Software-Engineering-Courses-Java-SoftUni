package lecture7ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P01DayOfWeekVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayOfWeek = Integer.parseInt(scanner.nextLine());      //цяло число в граници [1...7]

        if (dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("Saturday");
        } else if (dayOfWeek == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Error");
        }

    }
}
