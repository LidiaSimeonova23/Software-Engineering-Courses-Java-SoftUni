package lecture11Arrays;

import java.util.Scanner;

public class P01DayOfWeekVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberAsText = scanner.nextLine();      //от първия ред на конзолата четем едно цяло число (обаче можем да го прочетем и като текст, тъй като няма да извършваме аритметични операции и/или сравнения с него)

        //проверка -> ако прочетеното число (прочетеният текст в случая) е от 1 до 7 включително, да се принтира съответният ден от седмицата; ако числото/текстът не е нито едно от тези числа (от 1 до 7 вкл.), да се принтира "Invalid day!"
        if (numberAsText.equals("1")) {
            System.out.println("Monday");
        } else if (numberAsText.equals("2")) {
            System.out.println("Tuesday");
        } else if (numberAsText.equals("3")) {
            System.out.println("Wednesday");
        } else if (numberAsText.equals("4")) {
            System.out.println("Thursday");
        } else if (numberAsText.equals("5")) {
            System.out.println("Friday");
        } else if (numberAsText.equals("6")) {
            System.out.println("Saturday");
        } else if (numberAsText.equals("7")) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day!");
        }

    }
}
