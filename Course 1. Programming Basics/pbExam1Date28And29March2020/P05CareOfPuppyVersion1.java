package pbExam1Date28And29March2020;

import java.util.Scanner;

public class P05CareOfPuppyVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която проверява дали количеството храна, което е закупено за кученцето, ще е достатъчно, докато кученцето бъде осиновено

        int availableFoodInKilograms = Integer.parseInt(scanner.nextLine());       //•	Закупеното количество храна за кученцето в килограми – цяло число в интервала [1 …100]

        //1 kg = 1000 g   (трябва да работим в една и съща мерна единица)
        int availableFoodInGrams = availableFoodInKilograms * 1000;

        String input = scanner.nextLine();
        while (!input.equals("Adopted")) {
            int currentFoodInGrams = Integer.parseInt(input);     //На всеки следващ ред до получаване на команда Adopted ще получавате колко грама изяжда кученцето на всяко хранене - цяло число в интервала [10 …1000]

            availableFoodInGrams = availableFoodInGrams - currentFoodInGrams;      //на всяка итерация проверяваме какво колич. храна е останало, след като от наличната до момента извадим текущо изядената храна

            input = scanner.nextLine();     //update
        }


        if (availableFoodInGrams >= 0) {          //•	Ако количеството храна е достатъчно
            System.out.printf("Food is enough! Leftovers: %d grams.", availableFoodInGrams);
        } else {             //•	Ако количеството храна не е достатъчно        // if (availableFoodInGrams < 0)
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(availableFoodInGrams));
        }

    }
}
