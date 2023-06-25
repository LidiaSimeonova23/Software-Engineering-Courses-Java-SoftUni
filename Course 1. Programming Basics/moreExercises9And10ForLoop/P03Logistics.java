package moreExercises9And10ForLoop;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLoadsToBeTransported = Integer.parseInt(scanner.nextLine());           //броят на товарите за превоз – цяло число в интервала [1...1000]

        int totalTonesOfAllLoads = 0;
        int tonesTransportedByMinibus = 0;
        int tonesTransportedByTruck = 0;
        int tonesTransportedByTrain = 0;

        for (int load = 1; load <= numberOfLoadsToBeTransported; load++) {      //за да си съставя цикъла, използвах като променлива load вместо i
            int tonesPerCurrentLoad = Integer.parseInt(scanner.nextLine());         //•	За всеки един товар на отделен ред – тонажът на товара – цяло число в интервала [1...1000]

            totalTonesOfAllLoads = totalTonesOfAllLoads + tonesPerCurrentLoad;

            //•	До 3 тона – микробус (200 лева на тон)
            //•	От 4 до 11 тона – камион (175 лева на тон)
            //•	12 и повече тона – влак (120 лева на тон)

            String typeOfTransport = "";
            double pricePerTon = 0;
            if (tonesPerCurrentLoad <= 3) {
                typeOfTransport = "minibus";
                pricePerTon = 200;
                tonesTransportedByMinibus = tonesTransportedByMinibus + tonesPerCurrentLoad;
            } else if (tonesPerCurrentLoad <= 11) {
                typeOfTransport = "truck";
                pricePerTon = 175;
                tonesTransportedByTruck = tonesTransportedByTruck + tonesPerCurrentLoad;
            } else {        //else if (tonesPerCurrentLoad > 11)     //else if (tonesPerCurrentLoad >= 12)
                typeOfTransport = "train";
                pricePerTon = 120;
                tonesTransportedByTrain = tonesTransportedByTrain + tonesPerCurrentLoad;
            }

        }


        double averagePricePerToneOfLoad = (tonesTransportedByMinibus * 200 + tonesTransportedByTruck * 175 + tonesTransportedByTrain * 120) * 1.0 / totalTonesOfAllLoads;     //средната цена на тон превозен товар
        System.out.printf("%.2f%n", averagePricePerToneOfLoad);

        //процент тонове с дадено прев. средство = брой тонове с това прев. средство, делено на общ брой тонове с всички прев. средства, умножено по 100

        double percentOfTonesTransportedByMinibus = tonesTransportedByMinibus * 1.0 / totalTonesOfAllLoads * 100;        //процентът тона превозвани с микробус
        System.out.printf("%.2f%%%n", percentOfTonesTransportedByMinibus);

        double percentOfTonesTransportedByTruck = tonesTransportedByTruck * 1.0 / totalTonesOfAllLoads * 100;         //процентът  тона превозвани с камион
        System.out.printf("%.2f%%%n", percentOfTonesTransportedByTruck);

        double percentOfTonesTransportedByTrain = tonesTransportedByTrain * 1.0 / totalTonesOfAllLoads * 100;         //процентът тона превозвани с влак
        System.out.printf("%.2f%%", percentOfTonesTransportedByTrain);
    }
}
