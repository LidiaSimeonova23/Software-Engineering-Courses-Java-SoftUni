package pbExam4Date9And10March2019;

import java.util.Scanner;

public class P02Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 4 реда:
        int controlInMinutes = Integer.parseInt(scanner.nextLine());    //Минути на контролата – цяло число в интервала [0…59]
        int controlInSeconds = Integer.parseInt(scanner.nextLine());    //Секунди на контролата – цяло число в интервала [0…59]
        double lengthOfChuteInMeters = Double.parseDouble(scanner.nextLine());    //Дължината на улея в метри – реално число в интервала [0.00…50000]
        int secondsFor100Meters = Integer.parseInt(scanner.nextLine());    //Секунди за изминаване на 100 метра – цяло число в интервала [0…1000]

        //контролата ни е дадена в минути и секунди - трябва да работим в една и съща мерна единица:      //1 мин = 60 сек
        int controlTimeOnlyInSeconds = (controlInMinutes * 60) + controlInSeconds;

        //Трябва да се има предвид, че поради наклона на улея, на всеки 120 метра неговото време намаля с 2.5 секунди.  (тоест, наклонът му помага да се движи по-бързо)
        double timesInWhichHisTimeReduces = lengthOfChuteInMeters / 120;       //намираме колко пъти неговото време ще намалее благодарение на наклона на улея

        //намираме с колко секунди времето му ще намалее
        double secondsThatHisTimeReduces = timesInWhichHisTimeReduces * 2.5;

        //намираме за колко секунди Марин се спуска по улея
        double timeThatMarinNeedsInSeconds = (lengthOfChuteInMeters / 100 * secondsFor100Meters) - secondsThatHisTimeReduces;

        if (timeThatMarinNeedsInSeconds <= controlTimeOnlyInSeconds) {         //Ако времето на Марин е по-малко или равно на контролата
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", timeThatMarinNeedsInSeconds);
        } else {          //Ако времето на Марин е повече от това на контролата
            double missingSeconds = timeThatMarinNeedsInSeconds - controlTimeOnlyInSeconds;       //намираме недостигащите му секунди
            System.out.printf("No, Marin failed! He was %.3f second slower.", missingSeconds);
        }

    }
}
