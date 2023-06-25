package lecture16Exam1RegularExam2022;

import java.util.Scanner;

public class P06GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLocations = Integer.parseInt(scanner.nextLine());    //едно число – брой локации – цяло число в интервала [1.. 100]

        double goldMinedForAllDays = 0;

        double averageQuantityGoldPerDay = 0;
        for (int locations = 1; locations <= numberOfLocations; locations++) {
            double expectedAverageQuantityOfGoldPerDay = Double.parseDouble(scanner.nextLine());     //очакван среден добив на ден злато – реално число в интервала [0.00.. 10000.00]
            int workingDays = Integer.parseInt(scanner.nextLine());          //брой дни, в които ще се копае на дадената локация – цяло число в интервала [1.. 30]


            for (int daysOfCurrentLocation = 1; daysOfCurrentLocation <= workingDays; daysOfCurrentLocation++) {
                double goldMinedTheCurrentDay = Double.parseDouble(scanner.nextLine());    //Добито злато за деня – реално число в интервала [0.00.. 1000.00]

                goldMinedForAllDays = goldMinedForAllDays + goldMinedTheCurrentDay;   //намираме златото, добито за всички дни за дадената локация

            }

            averageQuantityGoldPerDay = goldMinedForAllDays / workingDays;   //намираме средно аритметично колич. злато, добито за един ден

            if (averageQuantityGoldPerDay >= expectedAverageQuantityOfGoldPerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageQuantityGoldPerDay);
                goldMinedForAllDays = 0;     //зануляваме натрупаното злато      //след като сме принтирали изречението за текущата локация, на променливата goldMinedForAllDays присвояваме стойност 0, за да може следващата локация да започне на 0 (а не с натрупаното злато от предишната локация)
            } else {
                double neededGold = expectedAverageQuantityOfGoldPerDay - averageQuantityGoldPerDay;
                System.out.printf("You need %.2f gold.%n", neededGold);
                goldMinedForAllDays = 0;     //зануляваме натрупаното злато      //след като сме принтирали изречението за текущата локация, на променливата goldMinedForAllDays присвояваме стойност 0, за да може следващата локация да започне на 0 (а не с натрупаното злато от предишната локация)
            }

        }


    }
}
