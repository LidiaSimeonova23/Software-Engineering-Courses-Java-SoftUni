package pbExam6Date2And3May2019;

import java.util.Scanner;

public class P06VetParkingVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четaт два реда:
        int numberOfDays = Integer.parseInt(scanner.nextLine());      //Брой дни – цяло число в интервала [1 … 5]
        int numberOfHoursPerEachDay = Integer.parseInt(scanner.nextLine());     //Брой часове за всеки един от дните - цяло число в интервала [1 … 24]


        //трябва да итерираме по всеки от дните (знаем колко са те) и за всеки от дните да итерираме по всичките часове (знаем колко са те) -> ще имаме 2 вложени for цикъла
        //външният цикъл е за текущия ден, а вътрешният е за текущия час на текущия ден
        double totalSumForAllDays = 0;       //създаваме си променлива за натрупаната сума през всичките дни
        for (int currentDay = 1; currentDay <= numberOfDays; currentDay++) {

            double sumForTheCurrentDay = 0;      //създаваме си променлива за натрупаната сума през текущия ден
            for (int currentHour = 1; currentHour <= numberOfHoursPerEachDay; currentHour++) {

                //За всеки четен ден и нечетен час, паркингът таксува 2.50 лева. Във всеки нечетен ден и четен час таксата е 1.25 лева, във всички останали случаи се заплаща 1 лев.
                double feePerHour = 0;         //създаваме си променлива за таксата за текущия час
                if (currentDay % 2 != 0 && currentHour % 2 == 0) {           //ако денят е нечетен и в същото време часът е четен
                    feePerHour = 1.25;
                } else if (currentDay % 2 == 0 && currentHour % 2 != 0) {     //ако денят е четен и в същото време часът е нечетен
                    feePerHour = 2.50;
                } else {       //във всички останали случаи (тоест, когато денят е нечетен и часът е нечетен или когато денят е четен и часът е четен)
                    feePerHour = 1;
                }

                //намираме сумата от всичките часове за текущия ден
                sumForTheCurrentDay += feePerHour;      //sumForTheCurrentDay = sumForTheCurrentDay + feePerHour;
            }

            //за всеки ден принтираме общата сума за всичките часове
            System.out.printf("Day: %d - %.2f leva%n", currentDay, sumForTheCurrentDay);

            //намираме общата сума от всички дни
            totalSumForAllDays += sumForTheCurrentDay;        //totalSumForAllDays = totalSumForAllDays + sumForTheCurrentDay;
        }

        //принтираме цялата обща сума от всичките дни
        System.out.printf("Total: %.2f leva", totalSumForAllDays);
    }
}
