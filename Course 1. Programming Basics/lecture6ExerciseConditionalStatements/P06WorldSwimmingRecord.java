package lecture6ExerciseConditionalStatements;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentWorldRecord = Double.parseDouble(scanner.nextLine());        //Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        double distanceToSwimInMeters = Double.parseDouble(scanner.nextLine());         //Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        double timeInSecondsForDistanceOf1Meter = Double.parseDouble(scanner.nextLine());      //Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]

        //съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди
        double numberOfDelays = distanceToSwimInMeters / 15;
        numberOfDelays = Math.floor(numberOfDelays);       //резултатът трябва да се закръгли надолу до най-близкото цяло число
        double bestTimeOfIvanIncludingDelays = (distanceToSwimInMeters * timeInSecondsForDistanceOf1Meter) + (numberOfDelays * 12.5);

        if (bestTimeOfIvanIncludingDelays < currentWorldRecord) {     //Ако Иван е подобрил Световния рекорд (времето му е по-малко от рекорда)
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", bestTimeOfIvanIncludingDelays);
        } else {          //Ако НЕ е подобрил рекорда (времето му е по-голямо или равно на рекорда)
            System.out.printf("No, he failed! He was %.2f seconds slower.", bestTimeOfIvanIncludingDelays - currentWorldRecord);
        }

    }
}
