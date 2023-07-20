package pbExam8Date6And7April2019;

import java.util.Scanner;

public class P01OscarsCeremonyVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четe 1 ред:
        int rentOfHall = Integer.parseInt(scanner.nextLine());   //Наем за залата – цяло число в интервала [0 … 999]

        //•	Статуетки  – цената им е 30% по-малка от наема на залата -> следователно, цената на статуетките е 70% от наема на залата
        double statuettesPrice = rentOfHall * 70 * 0.01;

        //•	Кетъринг – цената му е 15% по-малка от тази на статуетките -> следователно, цената на кетъринга е 85% от цената на статуетките
        double cateringPrice = statuettesPrice * 85 * 0.01;

        //•	Озвучаване – цената му е 1/2 от цената за кетъринг
        double soundPrice = cateringPrice * 1 / 2;

        //намираме и принтираме цялата сума за всички разходи
        double totalPrice = rentOfHall + statuettesPrice + cateringPrice + soundPrice;
        System.out.printf("%.2f", totalPrice);
    }
}
