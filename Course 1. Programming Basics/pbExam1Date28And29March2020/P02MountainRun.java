package pbExam1Date28And29March2020;

import java.util.Scanner;

public class P02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни, които четем от конзолата:
        double record = Double.parseDouble(scanner.nextLine());      //рекорда (в секунди), който Георги трябва да подобри
        double distance = Double.parseDouble(scanner.nextLine());       //разстоянието (в метри), което трябва да изкачи
        double timeInSecondsForOneMeter = Double.parseDouble(scanner.nextLine());   //времето (в секунди), за което Георги изкачва 1 метър

        double georgiTime = distance * timeInSecondsForOneMeter;

        //наклонът на терена го забавя на всеки 50 м. с 30 секунди
        double numberOfDelays = distance / 50;
        //Когато се изчислява колко пъти Георги ще се забави в резултат на наклона на терена, резултатът трябва да се закръгли надолу до най-близкото цяло число.
        numberOfDelays = Math.floor(numberOfDelays);
        double additionalTimeForDelays = numberOfDelays * 30;

        double totalTimeOfGeorgi = georgiTime + additionalTimeForDelays;

        if (totalTimeOfGeorgi < record) {        //Ако Георги е подобрил рекорда
            System.out.printf("Yes! The new record is %.2f seconds.", totalTimeOfGeorgi);
        } else {      //в противен случай (ако не е подобрил рекорда)
            double difference = totalTimeOfGeorgi - record;
            System.out.printf("No! He was %.2f seconds slower.", difference);
        }

    }
}
