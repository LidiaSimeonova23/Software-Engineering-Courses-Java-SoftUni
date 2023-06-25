package moreExercises5And6ConditionalStatements;

import java.util.Scanner;

public class P02SleepyTomCatVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDaysOff = Integer.parseInt(scanner.nextLine());      //броят почивни дни – цяло число в интервала [0...365]

        //•	Когато е на работа, стопанинът му си играе с него по 63 минути на ден.
        //•	Когато почива, стопанинът му си играе с него  по 127 минути на ден.
        //годината има 365 дни

        int numberOfWorkingDays = 365 - numberOfDaysOff;    //намираме брой работни дни  (от всичките дни в годината вадим почивните дни)
        int minutesForGamesInAllWorkingDays = numberOfWorkingDays * 63;
        int minutesForGamesInAllDaysOff = numberOfDaysOff * 127;

        int totalTimeForGamesPerYear = minutesForGamesInAllWorkingDays + minutesForGamesInAllDaysOff;   //намираме цялото време (в минути), прекарано в игри, за 1 година

        //нормата за игра на Том е 30 000  минути в година
        //ако времето за игра е повече от 30 000 мин. в год., Том няма да е имал достатъчно време за сън (и ще иска да избяга от стопанина си)

        //1 час = 60 минути

        if (totalTimeForGamesPerYear > 30000) {
            System.out.println("Tom will run away");
            int minutesMoreInPlaying = totalTimeForGamesPerYear - 30000;
            int hours = minutesMoreInPlaying / 60;            //с целочислено деление на 60 намираме часовете
            int minutes = minutesMoreInPlaying % 60;         //с модулно деление на 60 намираме остатъка (минутите)
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        } else {          //else if (totalTimeForGamesPerYear <= 30000)
            System.out.println("Tom sleeps well");
            int minutesFewerInPlaying = 30000 - totalTimeForGamesPerYear;
            int hours = minutesFewerInPlaying / 60;            //с целочислено деление на 60 намираме часовете
            int minutes = minutesFewerInPlaying % 60;         //с модулно деление на 60 намираме остатъка (минутите)
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }

    }
}
