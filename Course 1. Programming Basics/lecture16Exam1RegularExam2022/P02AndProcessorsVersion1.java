package lecture16Exam1RegularExam2022;

import java.util.Scanner;

public class P02AndProcessorsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата се четат:
        int numberOfProcessorsToBeProduced = Integer.parseInt(scanner.nextLine());            //броят процесори, които трябва да се изработят – цяло число в интервала [1...500 000]
        int numberOfWorkers = Integer.parseInt(scanner.nextLine());         //броят служители – цяло число в интервала [1...1000]
        int workingDays = Integer.parseInt(scanner.nextLine());        //работните дни – цяло число в интервала [1...1000]

        //Един процесор се изработва за 3 часа. Един служител работи 8 часа на ден.

        int totalWorkingHoursOfAllWorkers = workingDays * 8 * numberOfWorkers;   //намираме общия брой работни часове на всички работници (брой работни дни * 8 часа на ден по броя на работниците)

        //по условие ни е дадено, че броят на произведените процесори трябва да бъде закръглен към по-малкото цяло число  - щом ще го закръгляме, трябва да го определим като double променлива
        double producedProcessors = Math.floor(totalWorkingHoursOfAllWorkers * 1.0 / 3);    //намираме реалния брой произведени процесори - щом 1 процесор се изработва за 3 часа, делим броя часове на 3

        //Един процесор струва 110.10 лв - по условие е дадено.
        double targetedSum = numberOfProcessorsToBeProduced * 110.10;
        double realSum = producedProcessors * 110.10;

        double differenceInSums = Math.abs(targetedSum - realSum);
        if (producedProcessors >= numberOfProcessorsToBeProduced) {      //Ако реално изработените процесори са повече или колкото плануваните, да се принтира печалбата
            System.out.printf("Profit: -> %.2f BGN", differenceInSums);
        } else {                                                         //в противен случай (ако реално изработените процесори са по-малко от плануваните) да се принтира загубата
            System.out.printf("Losses: -> %.2f BGN", differenceInSums);
        }


    }
}
