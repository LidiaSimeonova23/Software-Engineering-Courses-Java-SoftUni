package pbExam3Date20And21April2019;

import java.util.Scanner;

public class P03PaintingEggsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входът се чете от конзолата и се състои от три реда:
        String sizeOfEggs = scanner.nextLine();      //размер на яйцата – текст с възможности "Large", "Medium" или "Small"
        String colourOfEggs = scanner.nextLine();      //цвят на яйцата – текст  с възможности "Red", "Green" или "Yellow"
        int numberOfLots = Integer.parseInt(scanner.nextLine());      //брой партиди – цяло число в интервала [1… 350]


        double priceOf1LotOfEggs = 0;        //създаваме си променлива за цената на една партида яйца
        switch (colourOfEggs) {
            case "Red":
                if (sizeOfEggs.equals("Large")) {
                    priceOf1LotOfEggs = 16;
                } else if (sizeOfEggs.equals("Medium")) {
                    priceOf1LotOfEggs = 13;
                } else if (sizeOfEggs.equals("Small")) {
                    priceOf1LotOfEggs = 9;
                }
                break;
            case "Green":
                if (sizeOfEggs.equals("Large")) {
                    priceOf1LotOfEggs = 12;
                } else if (sizeOfEggs.equals("Medium")) {
                    priceOf1LotOfEggs = 9;
                } else if (sizeOfEggs.equals("Small")) {
                    priceOf1LotOfEggs = 8;
                }
                break;
            case "Yellow":
                if (sizeOfEggs.equals("Large")) {
                    priceOf1LotOfEggs = 9;
                } else if (sizeOfEggs.equals("Medium")) {
                    priceOf1LotOfEggs = 7;
                } else if (sizeOfEggs.equals("Small")) {
                    priceOf1LotOfEggs = 5;
                }
                break;
        }

        double priceOfAllLots = numberOfLots * priceOf1LotOfEggs;        //намираме цената на всички портиди яйца

        //С 35% от крайната цена ще бъдат покрити производствени разходи.
        double expenses = priceOfAllLots * 35 / 100;

        //намираме печалбата
        double profit = priceOfAllLots - expenses;
        System.out.printf("%.2f leva.", profit);
    }
}
