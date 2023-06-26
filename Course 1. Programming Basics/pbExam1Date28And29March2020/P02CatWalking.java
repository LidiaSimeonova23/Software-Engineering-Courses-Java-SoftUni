package pbExam1Date28And29March2020;

import java.util.Scanner;

public class P02CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesPer1Going = Integer.parseInt(scanner.nextLine());        //минути разходка на едно излизане - цяло число в интервала [1...50]
        int numberOfWalksPerDay = Integer.parseInt(scanner.nextLine());         //броят на разходките дневно - цяло число в интервала [1…10]
        int takenCaloriesPerDay = Integer.parseInt(scanner.nextLine());       //приетите от котката калории на ден – цяло число в интервала [100…4000]

        //За всяка минута от разходката, котката гори по 5 калории. Разходката е достатъчна, ако котката изгаря 50% от приетите калории.

        int minutesPerDayInWalking = numberOfWalksPerDay * minutesPer1Going;
        int burnedCaloriesPerDay = minutesPerDayInWalking * 5;

        if (burnedCaloriesPerDay >= takenCaloriesPerDay * 50 / 100) {           //•	Ако изгорените калории през разходката са повече или равни на  50% от приетите през деня калории
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCaloriesPerDay);
        } else {         //•	Ако  изгорените калории през разходката са по-малко от 50% от приетите през деня калории
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCaloriesPerDay);
        }


    }
}
