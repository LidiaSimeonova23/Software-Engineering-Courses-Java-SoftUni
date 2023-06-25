package moreExercises5And6ConditionalStatements;

import java.util.Scanner;

public class P02SleepyTomCatVersion1 {
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

        int differenceInMinutes = Math.abs(totalTimeForGamesPerYear - 30000);
        //1 час = 60 минути
        int hours = differenceInMinutes / 60;            //с целочислено деление на 60 намираме часовете
        int minutes = differenceInMinutes % 60;         //с модулно деление на 60 намираме остатъка (минутите)
        if (totalTimeForGamesPerYear > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        } else {          //else if (totalTimeForGamesPerYear <= 30000)
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }

    }
}
