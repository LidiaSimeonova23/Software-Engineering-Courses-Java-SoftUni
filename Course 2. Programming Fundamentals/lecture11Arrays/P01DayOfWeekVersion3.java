package lecture11Arrays;

import java.util.Scanner;

public class P01DayOfWeekVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());      //от първия ред на конзолата четем едно цяло число

        //проверка -> ако прочетеното число е от 1 до 7 включително, да се принтира съответният ден от седмицата; ако числото не е нито едно от тези числа (от 1 до 7 вкл.), да се принтира "Invalid day!"
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day!");
                break;
        }

    }
}
