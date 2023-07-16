package pbExam7Date6And7July2019;

import java.util.Scanner;

public class P04ClubVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double targetedProfit = Double.parseDouble(scanner.nextLine());      //желаната печалба на клуба - реално число в интервала [1.00... 15000.00]

        //Многократно ще четем поредица от два реда - до получаване на командата "Party!" или до достигане на желаната печалба:
        double totalProfitFromAllOrders = 0;      //създаваме си променлива за натрупаната сума (печалба) от всички поръчки
        String input = scanner.nextLine();
        while (!input.equals("Party!")) {
            String currentCocktailName = input;      //Име на коктейла – текст
            int numberOfCocktailsOfCurrentType = Integer.parseInt(scanner.nextLine());       //Брой на коктейлите за поръчката – цяло число в интервала [1… 50]

            //цената на един коктейл е дължината на неговото име ->
            double unitPriceOfCurrentCocktail = currentCocktailName.length();

            //намираме общата сума на цялата текуща поръчка
            double totalPriceOfCurrentOrder = numberOfCocktailsOfCurrentType * unitPriceOfCurrentCocktail;

            //Ако цената на една поръчка е нечетно число, има 25% отстъпка от цената на поръчката. ->   значи цената ще е 75% от цената на поръчката
            if (totalPriceOfCurrentOrder % 2 == 1) {
                totalPriceOfCurrentOrder = totalPriceOfCurrentOrder * 75 * 0.01;
            }

            //намираме общата сума (печалба) от всички поръчки, извършени до момента:
            totalProfitFromAllOrders += totalPriceOfCurrentOrder;      //totalProfitFromAllOrders = totalProfitFromAllOrders + totalPriceOfCurrentOrder;

            //при достигане на желаната печалба:
            if (totalProfitFromAllOrders >= targetedProfit) {
                System.out.println("Target acquired.");
                System.out.printf("Club income - %.2f leva.", totalProfitFromAllOrders);
                break;      //прекъсваме само цикъла  (и следва да се направи проверката под цикъла)
            }

            input = scanner.nextLine();     //update
        }


        //ако все някога се е стигнало до входни данни "Party!"
        if (input.equals("Party!")) {
            System.out.printf("We need %.2f leva more.%n", targetedProfit - totalProfitFromAllOrders);
            System.out.printf("Club income - %.2f leva.", totalProfitFromAllOrders);
        }

    }
}
