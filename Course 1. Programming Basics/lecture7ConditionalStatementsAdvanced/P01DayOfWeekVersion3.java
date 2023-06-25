package lecture7ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P01DayOfWeekVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();      //цяло число в граници [1...7]    //тъй като няма да извършваме аритметични операции с числото, можем да го прочетем като текст (вместо като число)

        switch (dayOfWeek) {
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            case "7":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
                break;
        }

    }
}

