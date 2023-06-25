package lecture15ExamPreparation1DateAugust2022;

import java.util.Scanner;

public class P02MountainRunVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        double worldRecord = Double.parseDouble(scanner.nextLine());     //Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        double distance = Double.parseDouble(scanner.nextLine());        //Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        double timeNeededForOneMeter = Double.parseDouble(scanner.nextLine());   //Времето в секунди, за което изкачва 1 м. – реално число в интервала [0.00 … 1000.00]

        double timeNeededForTheWholeDistance = distance * timeNeededForOneMeter;

        //обаче по условие е дадено, че наклонът на терена го забавя на всеки 50 м. с 30 секунди
        double numberOfDelays = distance / 50;     //намираме колко пъти ще са забавянията на Георги заради наклона на терена - с целочислено деление
        numberOfDelays = Math.floor(numberOfDelays);      //закръгляме резултата до най-близкото цяло по-малко число (изисква се по условие)

        double additionalTime = numberOfDelays * 30;     //намираме допълнителното време, с което Георги ще се забави заради наклона на терена
        double totalTimeOfGeorge = timeNeededForTheWholeDistance + additionalTime;   //намираме общото време на Георги, което му е нужно (заедно със забавянето заради наклона)

        if (totalTimeOfGeorge < worldRecord) {    //Ако Георги е подобрил рекорда - за да го подобри, неговото време трябва да е по-малко от световния рекорд
            System.out.printf("Yes! The new record is %.2f seconds.", totalTimeOfGeorge);
        } else {                                  //Ако НЕ е подобрил рекорда
            System.out.printf("No! He was %.2f seconds slower.", totalTimeOfGeorge - worldRecord);
        }

    }
}

