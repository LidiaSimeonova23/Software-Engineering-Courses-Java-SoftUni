package pbExam5Date15And16June2019;

import java.util.Scanner;

public class P05SeriesVersion2 {
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

            if (nameOfCurrentSeries.equals("Thrones")) {        //ако сериалът е "Thrones", има 50% отстъпка  -> следователно реалната цена е 50% от цената
                priceOfCurrentSeries = priceOfCurrentSeries * 50 * 0.01;
            } else if (nameOfCurrentSeries.equals("Lucifer")) {       //ако сериалът е "Lucifer", има 40% отстъпка  -> следователно реалната цена е 60% от цената
                priceOfCurrentSeries = priceOfCurrentSeries * 60 * 0.01;
            } else if (nameOfCurrentSeries.equals("Protector")) {      //ако сериалът е "Protector", има 30% отстъпка  -> следователно реалната цена е 70% от цената
                priceOfCurrentSeries = priceOfCurrentSeries * 70 * 0.01;
            } else if (nameOfCurrentSeries.equals("TotalDrama")) {        //ако сериалът е "TotalDrama", има 20% отстъпка  -> следователно реалната цена е 80% от цената
                priceOfCurrentSeries = priceOfCurrentSeries * 80 * 0.01;
            } else if (nameOfCurrentSeries.equals("Area")) {        //ако сериалът е "Area", има 10% отстъпка  -> следователно реалната цена е 90% от цената
                priceOfCurrentSeries = priceOfCurrentSeries * 90 * 0.01;
            }

            //намираме общата сума за всички сериали:
            totalSumOfAllSeries += priceOfCurrentSeries;       //totalSumOfAllSeries = totalSumOfAllSeries + priceOfCurrentSeries;
        }


        if (availableBudget >= totalSumOfAllSeries) {      //ако бюджетът е достатъчен
            System.out.printf("You bought all the series and left with %.2f lv.", availableBudget - totalSumOfAllSeries);
        } else {     //else if (availableBudget < totalSumOfAllSeries)     //ако бюджетът не е достатъчен
            System.out.printf("You need %.2f lv. more to buy the series!", totalSumOfAllSeries - availableBudget);
        }

    }
}