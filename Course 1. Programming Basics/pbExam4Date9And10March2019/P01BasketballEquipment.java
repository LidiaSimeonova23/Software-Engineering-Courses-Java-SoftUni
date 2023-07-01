package pbExam4Date9And10March2019;

import java.util.Scanner;

public class P01BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четe 1 ред:
        int annualFee = Integer.parseInt(scanner.nextLine());      //Годишната такса за тренировки по баскетбол – цяло число в интервала [0… 9999]

        //Нужна екипировка: кецове, екип, топка, аксесоари   ->
        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        double priceOf1PairOfSnickers = annualFee - (annualFee * 40 * 0.01);          //double priceOf1PairOfSnickers = annualFee - (annualFee * 1.0 * 40 / 100);

        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        double priceOfEquipment = priceOf1PairOfSnickers - (priceOf1PairOfSnickers * 20 / 100);

        //•	Баскетболна топка – цената ѝ е 1/4 от цената на баскетболния екип
        double priceOfBall = priceOfEquipment * 1 / 4;

        //•	Баскетболни аксесоари – цената им е 1/5 от цената на баскетболната топка
        double priceOfAccessories = priceOfBall * 1 / 5;

        double totalSumOfAllExpenses = annualFee + priceOf1PairOfSnickers + priceOfEquipment + priceOfBall + priceOfAccessories;
        System.out.printf("%.2f", totalSumOfAllExpenses);
    }
}
