package lecture4ExerciseFirstStepsInCoding;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualFee = Integer.parseInt(scanner.nextLine());       //Годишната такса за тренировки по баскетбол – цяло число в интервала [0… 9999]

        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        double snickersPrice = annualFee - (annualFee * 1.0 * 40 / 100);
        double equipmentPrice = snickersPrice - (snickersPrice * 20 / 100);
        double basketballPrice = equipmentPrice * 1 / 4;
        double accessoriesPrice = basketballPrice * 1 / 5;

        double totalSum = annualFee + snickersPrice + equipmentPrice + basketballPrice + accessoriesPrice;
        System.out.println(totalSum);
        //System.out.printf("%f", totalSum);
    }
}
