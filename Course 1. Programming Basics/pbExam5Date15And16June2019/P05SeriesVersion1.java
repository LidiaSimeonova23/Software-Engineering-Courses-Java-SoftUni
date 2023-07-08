package pbExam5Date15And16June2019;

import java.util.Scanner;

public class P05SeriesVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат:
        double availableBudget = Double.parseDouble(scanner.nextLine());       //Бюджет  - реално  число в интервала [10.0… 100.0]
        int numberOfSeries = Integer.parseInt(scanner.nextLine());     //Брой сериали - n - цяло положително число в интервала [1… 10]

        //За всеки сериал (а ние знаем колко са сериалите -> имаме  for цикъл) се четат по два реда:
        double totalSumOfAllSeries = 0;      //създаваме си променлива за общата сума за всички сериали
        for (int currentSeries = 1; currentSeries <= numberOfSeries; currentSeries++) {
            String nameOfCurrentSeries = scanner.nextLine();     //Име на сериал - текст
            double priceOfCurrentSeries = Double.parseDouble(scanner.nextLine());      //Цена за сериал -  реално  число в интервала [1.0… 15.0]

            switch (nameOfCurrentSeries) {
                case "Thrones":       //ако сериалът е "Thrones", има 50% отстъпка
                    priceOfCurrentSeries = priceOfCurrentSeries - (priceOfCurrentSeries * 50 / 100);
                    break;
                case "Lucifer":        //ако сериалът е "Lucifer", има 40% отстъпка
                    priceOfCurrentSeries = priceOfCurrentSeries - (priceOfCurrentSeries * 40 / 100);
                    break;
                case "Protector":       //ако сериалът е "Protector", има 30% отстъпка
                    priceOfCurrentSeries = priceOfCurrentSeries - (priceOfCurrentSeries * 30 / 100);
                    break;
                case "TotalDrama":        //ако сериалът е "TotalDrama", има 20% отстъпка
                    priceOfCurrentSeries = priceOfCurrentSeries - (priceOfCurrentSeries * 20 / 100);
                    break;
                case "Area":         //ако сериалът е "Area", има 10% отстъпка
                    priceOfCurrentSeries = priceOfCurrentSeries - (priceOfCurrentSeries * 10 / 100);
                    break;
            }

            //намираме общата сума за всички сериали:
            totalSumOfAllSeries += priceOfCurrentSeries;       //totalSumOfAllSeries = totalSumOfAllSeries + priceOfCurrentSeries;
        }


        double differenceInMoney = Math.abs(availableBudget - totalSumOfAllSeries);     //с Math.abs си осигуряваме, че разликата ще бъде положително число
        if (availableBudget >= totalSumOfAllSeries) {      //ако бюджетът е достатъчен
            System.out.printf("You bought all the series and left with %.2f lv.", differenceInMoney);
        } else {     //else if (availableBudget < totalSumOfAllSeries)     //ако бюджетът не е достатъчен
            System.out.printf("You need %.2f lv. more to buy the series!", differenceInMoney);
        }

    }
}