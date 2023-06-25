package lecture16Exam2PreliminaryExam2023;

import java.util.Scanner;

public class P03ExcursionCalculatorVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());     //брой хора – цяло число в интервала [1 … 20]
        String season = scanner.nextLine();      //сезон – текст с възможности - "spring", "summer", "autumn" или "winter"

        double priceFor1Person = 0;
        switch (season) {
            case "spring":
                if (numberOfPeople <= 5) {
                    priceFor1Person = 50.00;
                } else {
                    priceFor1Person = 48.00;
                }
                break;
            case "summer":
                if (numberOfPeople <= 5) {
                    priceFor1Person = 48.50;
                    priceFor1Person = priceFor1Person - (priceFor1Person * 15 / 100);     //цената след отстъпката
                } else {
                    priceFor1Person = 45.00;
                    priceFor1Person = priceFor1Person - (priceFor1Person * 15 / 100);     //цената след отстъпката
                }
                break;
            case "autumn":
                if (numberOfPeople <= 5) {
                    priceFor1Person = 60.00;
                } else {
                    priceFor1Person = 49.50;
                }
                break;
            case "winter":
                if (numberOfPeople <= 5) {
                    priceFor1Person = 86.00;
                    priceFor1Person = priceFor1Person + (priceFor1Person * 8 / 100);      //цената след надценката
                } else {
                    priceFor1Person = 85.00;
                    priceFor1Person = priceFor1Person + (priceFor1Person * 8 / 100);      //цената след надценката
                }
                break;
        }


        double totalSumForAllPeople = numberOfPeople * priceFor1Person;
        System.out.printf("%.2f leva.", totalSumForAllPeople);
    }
}
