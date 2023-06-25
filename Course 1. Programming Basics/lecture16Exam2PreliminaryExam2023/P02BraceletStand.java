package lecture16Exam2PreliminaryExam2023;

import java.util.Scanner;

public class P02BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dailyMoneyOfTeresa = Double.parseDouble(scanner.nextLine());        //джобните на Тереза на ден – реално число в интервала [1.00 ...100.00]
        double moneyEarnedFromSalesPerDay = Double.parseDouble(scanner.nextLine());    //парите, които тя печели на ден от продажби – реално число в интервала [1.00...1000.00]
        double costsForAllDays = Double.parseDouble(scanner.nextLine());      //разходите на Тереза за целия период – реално число в интервала [1.00...1000.00]
        double priceOfPresent = Double.parseDouble(scanner.nextLine());     //цената на подаръка – реално число в интервала [1.00...10000.00]

        //5 days

        double totalMoneyOfTeresa = (5 * dailyMoneyOfTeresa) + (5 * moneyEarnedFromSalesPerDay);
        double availableMoneyAfterPaymentOfCosts = totalMoneyOfTeresa - costsForAllDays;       //totalMoneyOfTeresa = totalMoneyOfTeresa - costsForAllDays;


        if (availableMoneyAfterPaymentOfCosts >= priceOfPresent) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", availableMoneyAfterPaymentOfCosts);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", priceOfPresent - availableMoneyAfterPaymentOfCosts);
            //System.out.printf("Insufficient money: %.2f BGN.", Math.abs(availableMoneyAfterPaymentOfCosts - priceOfPresent));
        }

    }
}
