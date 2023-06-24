package lecture6ExerciseConditionalStatements;

import java.util.Scanner;

public class P08LunchBreakVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine();      //Име на сериал – текст
        int durationOfEpisode = Integer.parseInt(scanner.nextLine());        //Продължителност на епизод  – цяло число в диапазона [10… 90]
        int durationOfLunchBreak = Integer.parseInt(scanner.nextLine());       //Продължителност на почивката  – цяло число в диапазона [10… 120]

        //Времето за обяд ще бъде 1/8 от времето за почивка, а времето за отдих ще бъде 1/4 от времето за почивка.
        double timeToEat = durationOfLunchBreak * 1.0 / 8;           //int timeToEat = durationOfLunchBreak * 1 / 8;
        double timeToRelax = durationOfLunchBreak * 1.0 / 4;            //int timeToRelax = durationOfLunchBreak * 1 / 4;

        double remainingTime = durationOfLunchBreak - (timeToEat + timeToRelax);

        double differenceInTime = Math.abs(remainingTime - durationOfEpisode);
        differenceInTime = Math.ceil(differenceInTime);
        if (remainingTime >= durationOfEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serialName, differenceInTime);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serialName, differenceInTime);
        }

    }
}

