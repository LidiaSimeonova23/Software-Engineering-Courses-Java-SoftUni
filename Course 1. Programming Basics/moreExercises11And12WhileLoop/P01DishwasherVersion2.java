package moreExercises11And12WhileLoop;

import java.util.Scanner;

public class P01DishwasherVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBottles = Integer.parseInt(scanner.nextLine());      //Брой бутилки от препарат, който ще бъде използван за миенето на чинии - цяло число в интервала [1…10]

        //всяка бутилка съдържа 750 мл. препарат, за 1 чиния са нужни 5 мл., а за тенджера 15 мл.
        //на всяко трето зареждане със съдове съдомиялната се пълни само с тенджери, а останалите пъти с чинии

        int availableQuantityOfDetergent = numberOfBottles * 750;

        int loading = 0;
        String typeOfDishes = "";
        int necessaryQuantityOfDetergent = 0;
        int usedQuantityOfDetergent = 0;
        int washedPots = 0;
        int washedPlates = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int currentNumberOfDishesToBeWashed = Integer.parseInt(input);     //На всеки следващ ред, до получаване на командата "End" или докато количеството препарат не се изчерпи, четем брой съдове, които трябва да бъдат измити - цяло число в интервала [1…100]

            loading++;         //loading = loading + 1;        //loading += 1;
            if (loading % 3 == 0) {        //ако зареждането на съдомиялната е трето      //на всяко трето зареждане със съдове съдомиялната се пълни само с тенджери
                typeOfDishes = "pots";
                necessaryQuantityOfDetergent = currentNumberOfDishesToBeWashed * 15;
                washedPots = washedPots + currentNumberOfDishesToBeWashed;
            } else {        //останалите пъти съдомиялната се пълни с чинии
                typeOfDishes = "plates";
                necessaryQuantityOfDetergent = currentNumberOfDishesToBeWashed * 5;
                washedPlates = washedPlates + currentNumberOfDishesToBeWashed;
            }

            usedQuantityOfDetergent = usedQuantityOfDetergent + necessaryQuantityOfDetergent;

            if (usedQuantityOfDetergent > availableQuantityOfDetergent) {     //ако количеството препарат се изчерпи
                break;
            }

            input = scanner.nextLine();
        }


        if (availableQuantityOfDetergent >= usedQuantityOfDetergent) {            //В случай че количеството препарат е било достатъчно за измиването на съдовете
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", washedPlates, washedPots);
            System.out.printf("Leftover detergent %d ml.", availableQuantityOfDetergent - usedQuantityOfDetergent);
        } else {        //В противен случай (ако количеството препарат не е било достатъчно за измиването на съдовете)
            System.out.printf("Not enough detergent, %d ml. more necessary!", usedQuantityOfDetergent - availableQuantityOfDetergent);
        }


    }
}
