package moreExercises5And6ConditionalStatements;

import java.util.Scanner;

public class P06FlowerShopVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnoliasCount = Integer.parseInt(scanner.nextLine());     //•	Брой магнолии – цяло число в интервала [0 … 50]
        int hyacinthsCount = Integer.parseInt(scanner.nextLine());     //•	Брой зюмбюли – цяло число в интервала [0 … 50]
        int rosesCount = Integer.parseInt(scanner.nextLine());         //•	Брой рози – цяло число в интервала [0 … 50]
        int cactiCount = Integer.parseInt(scanner.nextLine());         //•	Брой кактуси – цяло число в интервала [0 … 50]
        double presentPrice = Double.parseDouble(scanner.nextLine());      //•	Цена на подаръка – реално число в интервала [0.00 … 500.00]

        //•	Магнолии – 3.25 лева
        //•	Зюмбюли – 4 лева
        //•	Рози – 3.50 лева
        //•	Кактуси – 8 лева

        double magnoliaPrice = 3.25;
        double hyacinthPrice = 4;
        double rosePrice = 3.50;
        double cactusPrice = 8;

        double totalSumOfAllFlowers = (magnoliasCount * magnoliaPrice) + (hyacinthsCount * hyacinthPrice) + (rosesCount * rosePrice) + (cactiCount * cactusPrice);

        //От общата сума Мария трябва да плати 5% данъци.
        double availableMoney = totalSumOfAllFlowers - (totalSumOfAllFlowers * 5 / 100);

        double differenceInMoney = Math.abs(availableMoney - presentPrice);
        if (availableMoney >= presentPrice) {
            differenceInMoney = Math.floor(differenceInMoney);
            System.out.printf("She is left with %.0f leva.", differenceInMoney);
        } else {
            differenceInMoney = Math.ceil(differenceInMoney);
            System.out.printf("She will have to borrow %.0f leva.", differenceInMoney);
        }

    }
}
