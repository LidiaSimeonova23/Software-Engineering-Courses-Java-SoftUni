package pbExam3Date20And21April2019;

import java.util.Scanner;

public class P04EasterShopVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се чете:
        int availableNumberOfEggsInStore = Integer.parseInt(scanner.nextLine());         //Началното количество яйца в магазина - цяло число в интервала [1… 10000]

        //•	След това поредица от два реда (до получаване на команда "Close" или при заявка за пуване на повече от наличните в магазина яйца) -> while loop   ->
        int totalNumberOfSoldEggs = 0;
        String input = scanner.nextLine();
        while (!input.equals("Close")) {
            String command = input;       //Команда за купуване или допълване на яйца в магазина – текст ("Buy" или "Fill")
            int numberOfEggs = Integer.parseInt(scanner.nextLine());       //Брой яйца, които да бъдат купени или допълнени в магазина – цяло число в интервала [1… 1000]

            switch (command) {
                case "Buy":     //при получаване на команда за купуване на яйца
                    //правим проверка дали има толкова яйца, колкото клиентът иска да купи
                    if (numberOfEggs > availableNumberOfEggsInStore) {       //Ако клиентът поиска да купи повече, отколкото има в наличност, програмата трябва да приключи изпълнение.
                        System.out.println("Not enough eggs in store!");
                        System.out.printf("You can buy only %d.", availableNumberOfEggsInStore);
                        return;      //прекъсваме цялата програма
                    } else {      //в противен случай (тоест, ако желаният брой яйца е наличен в магазина)
                        totalNumberOfSoldEggs = totalNumberOfSoldEggs + numberOfEggs;        //намираме колко общо яйца са продадени на различни клиенти
                        availableNumberOfEggsInStore = availableNumberOfEggsInStore - numberOfEggs;      //намираме колко яйца ще останат в магазина, след като клиентът купи желания брой яйца
                    }
                    break;
                case "Fill":    //при получаване на команда за допълване на яйца (тоест, доставяне на още яйца в магазина)
                    availableNumberOfEggsInStore = availableNumberOfEggsInStore + numberOfEggs;         //намираме колко яйца ще има в магазина след допълнително доставените яйца
                    break;
            }


            input = scanner.nextLine();      //update
        }


        //•	При получаване на командата "Close"
        System.out.println("Store is closed!");
        System.out.printf("%d eggs sold.", totalNumberOfSoldEggs);
    }
}
