package pbExam7Date6And7July2019;

import java.util.Scanner;

public class P02FamilyTripVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 4 реда:
        double availableBudget = Double.parseDouble(scanner.nextLine());        //Бюджетът, с който разполагат – реално число в интервала [1.00 … 10000.00]
        int nightsCount = Integer.parseInt(scanner.nextLine());      //Брой нощувки – цяло число в интервала [0 … 1000]
        double priceOf1Night = Double.parseDouble(scanner.nextLine());       //Цена за нощувка – реално число в интервала [1.00 … 500.00]
        int percentageOfAdditionalExpenses = Integer.parseInt(scanner.nextLine());        //Процент за допълнителни разходи – цяло число в интервала [0 … 100]


        //ако броят на нощувките е по-голям от 7, цената за 1 нощувка се намаля с 5%
        if (nightsCount > 7) {
            priceOf1Night = priceOf1Night - (priceOf1Night * 5 / 100);
        }

        //намираме цената на всички нощувки
        double totalPriceOfAllNights = nightsCount * priceOf1Night;


        //намираме стойността на допълнителните разходи (те са някакъв процент, прочетен от конзолата, от наличния бюджет):
        double valueOfTheAdditionalExpenses = availableBudget * percentageOfAdditionalExpenses * 0.01;

        //намираме крайната сума, необходима за пътуването:
        double finalSumOfTheTrip = totalPriceOfAllNights + valueOfTheAdditionalExpenses;


        if (availableBudget >= finalSumOfTheTrip) {       //Ако сумата е достатъчна
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", availableBudget - finalSumOfTheTrip);
        } else {        //else if (availableBudget < finalSumOfTheTrip)    //Ако сумата НЕ е достатъчна
            System.out.printf("%.2f leva needed.", finalSumOfTheTrip - availableBudget);
        }

    }
}
