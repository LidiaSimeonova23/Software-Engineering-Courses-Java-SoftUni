package moreExercises9And10ForLoop;

import java.util.Scanner;

public class P01BackToThePastVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(scanner.nextLine());         //•	Наследените пари – реално число в интервала [1.00 ... 1 000 000.00]
        int yearToLive = Integer.parseInt(scanner.nextLine());      //•	Годината, до която трябва да живее (включително) – цяло число в интервала [1801 ... 1900]

        //Иванчо е на 18 години
        //решава да се върне до 1800 година
        double spentMoneyPerYear = 0;
        int years = 17;
        double totalSpentMoneyForAllYears = 0;

        for (int currentYear = 1800; currentYear <= yearToLive; currentYear++) {         //като име на променливата ползвам currentYear вместо  i
            years++;          //years = years + 1;          //years += 1;     //Иванчо пораства с една година
            if (currentYear % 2 == 0) {
                spentMoneyPerYear = 12000;           //за всяка четна (1800, 1802 и т.н.) година ще харчи 12 000 лева
            } else {      //else if (currentYear % 2 != 0)
                spentMoneyPerYear = 12000 + (50 * years);     //За всяка нечетна (1801,1803  и т.н.) ще харчи 12 000 + 50 * [годините, които е навършил през дадената година].
            }

            totalSpentMoneyForAllYears = totalSpentMoneyForAllYears + spentMoneyPerYear;
        }


        double differenceInMoney = Math.abs(inheritedMoney - totalSpentMoneyForAllYears);
        if (inheritedMoney >= totalSpentMoneyForAllYears) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", differenceInMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", differenceInMoney);
        }

    }
}
