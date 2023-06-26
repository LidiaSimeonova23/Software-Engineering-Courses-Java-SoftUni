package pbExam1Date28And29March2020;

import java.util.Scanner;

public class P03EnergyBoosterVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();      //Плод - текст с възможности: "Watermelon", "Mango", "Pineapple" или "Raspberry"
        String sizeOfSet = scanner.nextLine();      //Размер на сета - текст с възможности: "small" или "big"
        int numberOfOrderedSets = Integer.parseInt(scanner.nextLine());       //Брой на поръчаните сетове - цяло число в интервала [1 … 10000]


        //малки и големи разфасовки с по 2 бр. и 5 бр. енергийни гела, като цената на един гел зависи от плодовете, от които е направен
        //програма, която изчислява сумата, която трябва да се плати за поръчката.

        double priceOf1Set = 0;
        if (fruit.equals("Watermelon")) {
            if (sizeOfSet.equals("small")) {
                priceOf1Set = 2 * 56;
            } else if (sizeOfSet.equals("big")) {
                priceOf1Set = 5 * 28.70;
            }
        } else if (fruit.equals("Mango")) {
            if (sizeOfSet.equals("small")) {
                priceOf1Set = 2 * 36.66;
            } else if (sizeOfSet.equals("big")) {
                priceOf1Set = 5 * 19.60;
            }
        } else if (fruit.equals("Pineapple")) {
            if (sizeOfSet.equals("small")) {
                priceOf1Set = 2 * 42.10;
            } else if (sizeOfSet.equals("big")) {
                priceOf1Set = 5 * 24.80;
            }
        } else if (fruit.equals("Raspberry")) {
            if (sizeOfSet.equals("small")) {
                priceOf1Set = 2 * 20;
            } else if (sizeOfSet.equals("big")) {
                priceOf1Set = 5 * 15.20;
            }
        }

        double priceOfOrder = numberOfOrderedSets * priceOf1Set;

        //•	При поръчки от 400 лв. до 1000 лв. включително има 15% отстъпка
        //•	При поръчки над 1000 лв. има 50% отстъпка

        if (priceOfOrder >= 400 && priceOfOrder <= 1000) {
            priceOfOrder = priceOfOrder - (priceOfOrder * 15 / 100);
        } else if (priceOfOrder > 1000) {
            priceOfOrder = priceOfOrder - (priceOfOrder * 50 / 100);
        }


        System.out.printf("%.2f lv.", priceOfOrder);
    }
}
