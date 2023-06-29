package pbExam3Date20And21April2019;

import java.util.Scanner;

public class P02EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 2 реда:
        int numberOfGuests = Integer.parseInt(scanner.nextLine());      //броят на гостите – цяло число в интервала [0 ... 200000]
        int availableSum = Integer.parseInt(scanner.nextLine());        //бюджетът с който разполага Любо  – цяло число в интервала [0 ... 200000]

        //един козунак стига за трима човека, като всеки гост ще получи и по 2 яйца
        //При изчисляването на броя козунаци, които Любо трябва да купи, техният брой трябва да се закръгли към по-голямото цяло число.    -> щом ще закръгляме, значи променливата трябва да е от тип double
        double numberOfEasterLoavesOfBread = numberOfGuests * 1.0 / 3;
        numberOfEasterLoavesOfBread = Math.ceil(numberOfEasterLoavesOfBread);          //намираме броя козунаци, които трябва да се купят

        int numberOfEggs = numberOfGuests * 2;     //намираме броя яйца, които трябва да се купят

        //•	Един козунак струва 4 лв.
        //•	Едно яйце струва 0.45 лв.
        double necessarySum = (numberOfEasterLoavesOfBread * 4) + (numberOfEggs * 0.45);


        double differenceInMoney = Math.abs(availableSum - necessarySum);    //намираме разликата (между наличната сума и необходимата сума) и си осигуряваме, че е положително число
        if (availableSum >= necessarySum) {       //Ако бюджетът е достатъчен
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", numberOfEasterLoavesOfBread, numberOfEggs);
            System.out.printf("He has %.2f lv. left.", differenceInMoney);
        } else {         //в противен случай (ако бюджетът не е достатъчен)
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", differenceInMoney);
        }


    }
}
