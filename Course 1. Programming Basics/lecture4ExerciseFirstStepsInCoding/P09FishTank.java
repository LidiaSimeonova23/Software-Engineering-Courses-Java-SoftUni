package lecture4ExerciseFirstStepsInCoding;

import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthInCentimeters = Integer.parseInt(scanner.nextLine());      //Дължина в см – цяло число в интервала [10 … 500]
        int widthInCentimeters = Integer.parseInt(scanner.nextLine());        //Широчина в см – цяло число в интервала [10 … 300]
        int heightInCentimeters = Integer.parseInt(scanner.nextLine());        //Височина в см – цяло число в интервала [10… 200]
        double percent = Double.parseDouble(scanner.nextLine());         //Процент  – реално число в интервала [0.000 … 100.000]

        //1 л = 1 дм3

        //V = a.b.c  - намиране на обем на правоъгълен паралелепипед

        int volumeOfTankInCentimeters = lengthInCentimeters * widthInCentimeters * heightInCentimeters;
        //1 дм = 10 cм     //1 дм3 = 10^3 cм   (1 дм3 = 10 * 10 * 10 = 1000 cм3)
        double volumeOfWholeTankInLitres = volumeOfTankInCentimeters * 1.0 / 1000;
        //double volumeOfWholeTankInLitres = volumeOfTankInCentimeters * 0.001;
        double litresOfWaterInTheTank = volumeOfWholeTankInLitres - (volumeOfWholeTankInLitres * percent / 100);
        System.out.println(litresOfWaterInTheTank);
        //System.out.printf("%f", litresOfWaterInTheTank);
    }
}
