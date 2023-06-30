package pbExam3Date20And21April2019;

import java.util.Scanner;

public class P06EasterDecorationVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата първоначално се чете един ред:
        int numberOfClients = Integer.parseInt(scanner.nextLine());      //Брои на клиентите в магазина – цяло число [1… 100]

        //Цените на продуктите са:
        //•	кошничка за яйца (basket) – 1.50 лв.
        //•	великденски венец (wreath) – 3.80 лв.
        //•	шоколадов заек (chocolate bunny) – 7 лв.

        //ще имаме 2 вложени цикъла
        //във външния (for - защото знаем колко ще са итерациите - колкото са клиентите) итерираме по текущия клиент, а във вътрешния (while - защото не знаем колко ще са итерациите) - по всичките покупки на текущия клиент
        double totalSumOfAllPurchasesOfAllClients = 0;    //създаваме си променлива за общата сума от всички покупки на всички клиенти
        for (int currentClient = 1; currentClient <= numberOfClients; currentClient++) {

            int purchasesCount = 0;     //създаваме си променлива за общия брой покупки на текущия клиент
            double priceOfCurrentPurchase = 0;      //създаваме си променлива за цената на текущата покупка
            double totalPriceOfAllPurchasesOfCurrentClient = 0;      //създаваме си променлива за общата цена от всичките покупки на текущия клиент

            String input = scanner.nextLine();
            while (!input.equals("Finish")) {
                String currentPurchase = input;       //Покупката, която клиентът е избрал – текст ("basket", "wreath" или "chocolate bunny")

                //щом сме прочели нова покупка, значи броят на покупките на текущия клиент се увеличава с единица
                purchasesCount++;        //purchasesCount = purchasesCount + 1;          //purchasesCount += 1;

                switch (currentPurchase) {
                    case "basket":
                        priceOfCurrentPurchase = 1.50;
                        break;
                    case "wreath":
                        priceOfCurrentPurchase = 3.80;
                        break;
                    case "chocolate bunny":
                        priceOfCurrentPurchase = 7;
                        break;
                }


                //намираме сумата, която текущият клиент трябва да плати за всичките си покупки
                totalPriceOfAllPurchasesOfCurrentClient = totalPriceOfAllPurchasesOfCurrentClient + priceOfCurrentPurchase;

                input = scanner.nextLine();      //update
            }

            //накрая (след като са приключили покупките на текущия клиент) за всеки клиент правим проверка:
            //ако текущият клиент е купил четен брой продукти, ще получи 20% отстъпка от крайната цена   -> ако попадне в това условие, ще получи отстъпка от крайната сума
            if (purchasesCount % 2 == 0) {
                totalPriceOfAllPurchasesOfCurrentClient = totalPriceOfAllPurchasesOfCurrentClient - (totalPriceOfAllPurchasesOfCurrentClient * 20 / 100);
            }

            //преди да преминем към следващия клиент, трябва да принтираме брой покупки на текущия клиент и общата им цена
            System.out.printf("You purchased %d items for %.2f leva.%n", purchasesCount, totalPriceOfAllPurchasesOfCurrentClient);

            //намираме общата сума (от всички продукти) на всички клиенти в магазина
            totalSumOfAllPurchasesOfAllClients = totalSumOfAllPurchasesOfAllClients + totalPriceOfAllPurchasesOfCurrentClient;
        }

        //намираме средно аритметичната сума, която е похарчил всеки един клиент и я принтираме
        double averageSumPerClient = totalSumOfAllPurchasesOfAllClients / numberOfClients;
        System.out.printf("Average bill per client is: %.2f leva.", averageSumPerClient);
    }
}
