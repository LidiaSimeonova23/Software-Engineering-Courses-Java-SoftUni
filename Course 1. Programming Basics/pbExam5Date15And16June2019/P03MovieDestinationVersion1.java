package pbExam5Date15And16June2019;

import java.util.Scanner;

public class P03MovieDestinationVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 4 реда:
        double availableBudget = Double.parseDouble(scanner.nextLine());        //Бюджет на филма – реално число в диапазона [100 000.0… 2 000 000.0]
        String destination = scanner.nextLine();      //Дестинация – текст, с възможности "Dubai", "Sofia" и "London"
        String season = scanner.nextLine();         //Сезон – текст, с възможности "Summer" и "Winter"
        int numberOfDays = Integer.parseInt(scanner.nextLine());      //Брой дни  – цяло число в диапазона [1… 40]

        //проверяваме коя е дестинацията и кой е сезонът - и според тези данни сетваме единична цена (цена за 1 снимачен ден)
        double priceFor1Day = 0;
        switch (destination) {
            case "Dubai":
                if (season.equals("Winter")) {
                    priceFor1Day = 45000;
                } else if (season.equals("Summer")) {
                    priceFor1Day = 40000;
                }
                break;
            case "Sofia":
                if (season.equals("Winter")) {
                    priceFor1Day = 17000;
                } else if (season.equals("Summer")) {
                    priceFor1Day = 12500;
                }
                break;
            case "London":
                if (season.equals("Winter")) {
                    priceFor1Day = 24000;
                } else if (season.equals("Summer")) {
                    priceFor1Day = 20250;
                }
                break;
        }

        //намираме цената за всички снимачни дни:
        double totalPriceForAllDays = numberOfDays * priceFor1Day;

        //Ако дестинацията е Дубай – 30% отстъпка от крайната цена
        if (destination.equals("Dubai")) {
            totalPriceForAllDays = totalPriceForAllDays - (totalPriceForAllDays * 30 / 100);
        }

        //Ако дестинацията е София – цената се оскъпява с 25%
        if (destination.equals("Sofia")) {
            totalPriceForAllDays = totalPriceForAllDays + (totalPriceForAllDays * 25 / 100);
        }


        //принтираме дали бюджетът е стигнал (и колко пари са останали), или не (и колко още пари са нужни):
        double differenceInMoney = Math.abs(availableBudget - totalPriceForAllDays);      //намираме разликата в сумите - с Math.abs си осигуряваме, че тази разлика ще е положително число
        if (totalPriceForAllDays <= availableBudget) {       //Ако бюджетът е достатъчен
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", differenceInMoney);
        } else {        //else if (totalPriceForAllDays > availableBudget)     //Ако бюджетът НЕ е достатъчен
            System.out.printf("The director needs %.2f leva more!", differenceInMoney);
        }

    }
}
