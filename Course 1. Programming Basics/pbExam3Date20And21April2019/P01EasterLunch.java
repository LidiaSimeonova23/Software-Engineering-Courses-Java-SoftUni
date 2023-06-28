package pbExam3Date20And21April2019;

import java.util.Scanner;

public class P01EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        int numberOfEasterBread = Integer.parseInt(scanner.nextLine());          //Брой козунаци - цяло число в интервала [0 … 99]
        int eggShells = Integer.parseInt(scanner.nextLine());            //Брой кори с яйца - цяло число в интервала [0 … 99]
        int kilosOfCookies = Integer.parseInt(scanner.nextLine());          //Килограми курабии - цяло число в интервала [0 … 99]


        //•	Козунак  – 3.20 лв.
        //•	Яйца –  4.35 лв. за кора с 12 яйца
        //•	Курабии – 5.40 лв. за килограм
        //•	Боя за яйца - 0.15 лв. за яйце

        double sumOfEasterBread = numberOfEasterBread * 3.20;    //намираме цената на козунаците
        double sumOfEggs = eggShells * 4.35;     //намираме цената на всичките кори с яйца
        double sumOfCookies = kilosOfCookies * 5.40;    //намираме цената на всичките курабии
        int numberOfEggs = eggShells * 12;         //намираме общия брой на яйцата
        double sumOfEggPaint = numberOfEggs * 0.15;    //намираме цената на боята за всичките яйца

        double totalSum = sumOfEasterBread + sumOfEggs + sumOfCookies + sumOfEggPaint;
        System.out.printf("%.2f", totalSum);
    }
}
