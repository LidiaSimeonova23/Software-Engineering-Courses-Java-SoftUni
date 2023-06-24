package lecture6ExerciseConditionalStatements;

import java.util.Scanner;

public class P03TimePlus15MinutesVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        //1 hour = 60 minutes
        //колко ще е часът след 15 минути
        int allMinutes = (hours * 60) + minutes + 15;

        int timeInHours = allMinutes / 60;    //с целочислено деление на 60 намираме часовете
        int timeInMinutes = allMinutes % 60;     //с модулно деление на 60 намираме минутите

        //Часовете винаги са между 0 и 23
        if (timeInHours > 23) {
            timeInHours = 0;     //ако часовете станат повече от 23, ги зануляваме (присвояваме им стойност 0)
        }

        if (timeInMinutes < 10) {
            System.out.printf("%d:0%d", timeInHours, timeInMinutes);
        } else {
            System.out.printf("%d:%d", timeInHours, timeInMinutes);
        }

    }
}

