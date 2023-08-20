package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfOrders = Integer.parseInt(scanner.nextLine());         //броят на поръчките - цяло число

        //  (daysInMonth * capsulesCount) * pricePerCapsule

        //знаем броя на поръчките - многократно ще извършваме едни и същи действия -> знаем колко пъти (колкото е броят на поръчките)  -> имаме for-цикъл
        double totalSumAllOrders = 0;          //създаваме си променлива за общата сума на всички поръчки (с начална стойност 0   /може и 0.0/)
        for (int currentOrder = 1; currentOrder <= numberOfOrders; currentOrder++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());    //Price per capsule - floating-point number in the range [0.00…1000.00].
            int daysInMonth = Integer.parseInt(scanner.nextLine());      //daysInMonth – integer in the range [1…31].
            int numberOfCapsulesPerDay = Integer.parseInt(scanner.nextLine());    //numberOfCapsulesPerDay - integer in the range [0…2000].

            //намираме цената на текущата поръчка и я принтираме:
            double priceOfCurrentOrder = (daysInMonth * numberOfCapsulesPerDay) * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", priceOfCurrentOrder);   //на всяка итерация на цикъла принтираме цената на текущата поръчка

            //намираме общата сума на всички поръчки:
            totalSumAllOrders += priceOfCurrentOrder;           //totalSumAllOrders = totalSumAllOrders + priceOfCurrentOrder;
        }

        //накрая извън цикъла принтираме (само веднъж) общата сума на всички поръчки:
        System.out.printf("Total: $%.2f", totalSumAllOrders);
    }
}
