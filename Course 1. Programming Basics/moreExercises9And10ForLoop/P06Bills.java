package moreExercises9And10ForLoop;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMonths = Integer.parseInt(scanner.nextLine());       //месеците, за които се търси средният разход – цяло число в интервала [1...100]

        //За всеки месец разходите са следните:
        //•	За ток – всеки месец е различен, ще се чете от конзолата
        //•	за вода – 20 лв.
        //•	за интернет – 15 лв.
        //•	за други – събират се токът, водата и интернетът за месеца и към сумата се прибавят 20%.

        double monthlySumForOtherCosts = 0;
        double totalSumForElectricityForAllMonths = 0;
        double totalSumForOtherCostsForAllMonths = 0;
        for (int month = 1; month <= numberOfMonths; month++) {       //за да си построя цикъла, за име на променлива използвах month вместо i
            double monthlySumForElectricity = Double.parseDouble(scanner.nextLine());      //За всеки месец – сметката за ток – реално число в интервала [1.00...1000.00]

            monthlySumForOtherCosts = (monthlySumForElectricity + 20 + 15) + ((monthlySumForElectricity + 20 + 15) * 20 / 100);

            totalSumForElectricityForAllMonths = totalSumForElectricityForAllMonths + monthlySumForElectricity;
            totalSumForOtherCostsForAllMonths = totalSumForOtherCostsForAllMonths + monthlySumForOtherCosts;
        }

        System.out.printf("Electricity: %.2f lv%n", totalSumForElectricityForAllMonths);

        double totalSumForWaterForAllMonths = numberOfMonths * 20;
        System.out.printf("Water: %.2f lv%n", totalSumForWaterForAllMonths);

        double totalSumForInternetForAllMonths = numberOfMonths * 15;
        System.out.printf("Internet: %.2f lv%n", totalSumForInternetForAllMonths);

        System.out.printf("Other: %.2f lv%n", totalSumForOtherCostsForAllMonths);

        double averageCostsPerMonth = (totalSumForElectricityForAllMonths + totalSumForWaterForAllMonths + totalSumForInternetForAllMonths + totalSumForOtherCostsForAllMonths) / numberOfMonths;
        System.out.printf("Average: %.2f lv", averageCostsPerMonth);
    }
}
