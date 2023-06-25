package lecture15ExamPreparation2DateFebruary2023;

import java.util.Scanner;

public class P05ClubVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wantedProfit = Double.parseDouble(scanner.nextLine());      //желаната печалба на клуба - реално число в интервала [1.00... 15000.00]

        //Поредица от два реда до получаване на командата "Party!" или до достигане на желаната печалба:
        double totalSumOfAllTypesOfCocktails = 0;
        String input = scanner.nextLine();          //Име на коктейла – текст
        while (!input.equals("Party!")) {
            String currentCocktailName = input;
            int numberOfCocktailsFrom1Type = Integer.parseInt(scanner.nextLine());     //Брой на коктейлите за поръчката – цяло число в интервала [1… 50]

            double priceOfCurrentCocktail = currentCocktailName.length();         //намираме цената на коктейла   (цената на един коктейл е дължината на неговото име)
            double priceOfAllCocktailsFrom1Type = numberOfCocktailsFrom1Type * priceOfCurrentCocktail;      //намираме цената на цялата текуща  поръчка

            //Ако цената на една поръчка е нечетно число, има 25% отстъпка от цената на поръчката.
            if (priceOfAllCocktailsFrom1Type % 2 != 0) {      //if (priceOfAllCocktailsFrom1Type % 2 == 1)
                priceOfAllCocktailsFrom1Type = priceOfAllCocktailsFrom1Type - (priceOfAllCocktailsFrom1Type * 25 / 100);
            }

            totalSumOfAllTypesOfCocktails = totalSumOfAllTypesOfCocktails + priceOfAllCocktailsFrom1Type;        //намираме цената на всички поръчки за вечерта

            if (totalSumOfAllTypesOfCocktails >= wantedProfit) {
                break;
            }

            input = scanner.nextLine();
        }


        double differenceInSum = Math.abs(wantedProfit - totalSumOfAllTypesOfCocktails);
        if (input.equals("Party!")) {
            System.out.printf("We need %.2f leva more.%n", differenceInSum);
            System.out.printf("Club income - %.2f leva.", totalSumOfAllTypesOfCocktails);
        } else if (totalSumOfAllTypesOfCocktails >= wantedProfit) {
            System.out.println("Target acquired.");
            //System.out.printf("Target acquired.%n");
            System.out.printf("Club income - %.2f leva.", totalSumOfAllTypesOfCocktails);
        }

    }
}

