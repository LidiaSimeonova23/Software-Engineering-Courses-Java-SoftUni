package lecture15ExamPreparation1DateAugust2022;

import java.util.Scanner;

public class P01OscarsCeremonyVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четe 1 ред - наем за залата – цяло число в интервала [0 … 999]
        int rentOfHall = Integer.parseInt(scanner.nextLine());

        //•	Статуетки  – цената им е 30% по-малка от наема на залата  (тоест, 30% е отстъпката)
        //•	Кетъринг – цената му е 15% по-малка от тази на статуетките   (тоест, 15% е отстъпката)
        //•	Озвучаване – цената му е 1 / 2 от цената за кетъринг

        double priceOfStatuettes = rentOfHall - (rentOfHall * 30 * 0.01);            //double priceOfStatuettes = rentOfHall - (rentOfHall * 1.0 * 30 / 100);
        double priceOfCatering = priceOfStatuettes - (priceOfStatuettes * 15 * 0.01);          //double priceOfCatering = priceOfStatuettes - (priceOfStatuettes * 15 / 100);
        double sounding = priceOfCatering * 1 / 2;

        double totalPrice = rentOfHall + priceOfStatuettes + priceOfCatering + sounding;    //намираме крайната цена (за всички разходи)

        System.out.printf("%.2f", totalPrice);    //принтираме крайната цена
    }
}
