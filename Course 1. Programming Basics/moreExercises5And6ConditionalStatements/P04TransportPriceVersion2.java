package moreExercises5And6ConditionalStatements;

import java.util.Scanner;

public class P04TransportPriceVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometres = Integer.parseInt(scanner.nextLine());      //брой километри – цяло число в интервала [1…5000]
        String timeOfTravelling = scanner.nextLine();         //дума “day” или “night” – пътуване през деня или през нощта

        //•	Такси. Начална такса: 0.70 лв.   Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
        //•	Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
        //•	Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.

        String theCheapestTypeOfTransport = "";
        double rate = 0;
        double priceOfTravelling = 0;
        if (kilometres < 20) {
            theCheapestTypeOfTransport = "taxi";
            double initialFee = 0.70;
            if (timeOfTravelling.equals("day")) {
                rate = 0.79;
                priceOfTravelling = initialFee + kilometres * 0.79;
            } else if (timeOfTravelling.equals("night")) {
                rate = 0.90;
                priceOfTravelling = initialFee + kilometres * 0.90;
            }
        } else if (kilometres < 100) {
            theCheapestTypeOfTransport = "bus";
            rate = 0.09;
            priceOfTravelling = kilometres * 0.09;
        } else {
            theCheapestTypeOfTransport = "train";
            rate = 0.06;
            priceOfTravelling = kilometres * 0.06;
        }


        System.out.printf("%.2f", priceOfTravelling);
    }
}
