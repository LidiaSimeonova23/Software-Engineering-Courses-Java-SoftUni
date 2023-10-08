package lecture11Arrays;

import java.util.Scanner;

public class P01DayOfWeekVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());      //от първия ред на конзолата четем едно цяло число

        //проверка -> ако прочетеното число е от 1 до 7 включително, да се принтира съответният ден от седмицата; ако числото не е нито едно от тези числа (от 1 до 7 вкл.), да се принтира "Invalid day!"
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day!");
        }

    }
}
