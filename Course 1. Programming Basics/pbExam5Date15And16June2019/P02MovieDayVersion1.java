package pbExam5Date15And16June2019;

import java.util.Scanner;

public class P02MovieDayVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        int availableTime = Integer.parseInt(scanner.nextLine());      //Време за снимки – цяло число в диапазона [0… 1440]
        int numberOfScenes = Integer.parseInt(scanner.nextLine());       //Брой сцени  – цяло число в диапазона [5… 25]
        int timeNeededFor1Scene = Integer.parseInt(scanner.nextLine());      //Времетраене на сцена – цяло число в диапазона [20… 90]

        //намираме необходимото време за снимане на сцените:
        int necessaryTimeForAllScenes = numberOfScenes * timeNeededFor1Scene;

        //Снимачният ден започва с подготовка на терен, което е 15 процента от времето, с което разполагаме
        double additionalTimeForPreparationOfStage = availableTime * 1.0 * 15 / 100;      //намираме времето, необходимо за подготовка на терена

        //намираме цялото нужното време:
        double theWholeNecessaryTime = additionalTimeForPreparationOfStage + necessaryTimeForAllScenes;

        //принтираме дали времето е стигнало, или не (и съответно колко минути са останали, ако е стигнало; или колко минути не достигат)
        double differenceInMinutes = Math.abs(theWholeNecessaryTime - availableTime);          //с Math.abs си осигуряваме, че разликата е положително число
        if (theWholeNecessaryTime <= availableTime) {       //Ако времето за заснемане на филма ви стигне
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", differenceInMinutes);
        } else {         //else if (theWholeNecessaryTime > availableTime)         //Ако времето НЕ ВИ стигне
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", differenceInMinutes);
        }


    }
}
