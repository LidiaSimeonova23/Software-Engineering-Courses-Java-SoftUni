package lecture7ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P01DayOfWeekVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();      //цяло число в граници [1...7]    //тъй като няма да извършваме аритметични операции с числото, можем да го прочетем като текст (вместо като число)

        if (dayOfWeek.equals("1")) {
            System.out.println("Monday");
        } else if (dayOfWeek.equals("2")) {
            System.out.println("Tuesday");
        } else if (dayOfWeek.equals("3")) {
            System.out.println("Wednesday");
        } else if (dayOfWeek.equals("4")) {
            System.out.println("Thursday");
        } else if (dayOfWeek.equals("5")) {
            System.out.println("Friday");
        } else if (dayOfWeek.equals("6")) {
            System.out.println("Saturday");
        } else if (dayOfWeek.equals("7")) {
            System.out.println("Sunday");
        } else {
            System.out.println("Error");
        }

    }
}
