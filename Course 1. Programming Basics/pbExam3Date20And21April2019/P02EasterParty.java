package pbExam3Date20And21April2019;

import java.util.Scanner;

public class P02EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        int numberOfGuests = Integer.parseInt(scanner.nextLine());             //Брой гости – цяло число в интервала [1...99]
        double priceForOnePerson = Double.parseDouble(scanner.nextLine());        //Цена на куверт за един човек – реално число в интервала [0.00 … 99.00]
        double availableBudget = Double.parseDouble(scanner.nextLine());            //Бюджетът на Деси  – реално число в интервала [0.00 … 9999.00]


        if (numberOfGuests >= 10 && numberOfGuests <= 15) {       //Между 10 (вкл.) и 15 (вкл.) човека -> 15 % отстъпка от куверта за един човек
            priceForOnePerson = priceForOnePerson - (priceForOnePerson * 15 / 100);
        } else if (numberOfGuests > 15 && numberOfGuests <= 20) {        //Между 15 и 20 (вкл.) човека -> 20 % отстъпка от куверта за един човек
            priceForOnePerson = priceForOnePerson - (priceForOnePerson * 20 / 100);
        } else if (numberOfGuests > 20) {        //Над 20 човека -> 25 % отстъпка от куверта за един човек
            priceForOnePerson = priceForOnePerson - (priceForOnePerson * 25 / 100);
        }


        //Деси трябва да предвиди и закупуването на торта за партито. Цената на тортата е 10% от бюджета на Деси.
        double priceOfCake = availableBudget * 10 / 100;                     //намираме цената на тортата
        double totalSum = (numberOfGuests * priceForOnePerson) + priceOfCake;         //намираме общата необходима сума за кувертите на всички хора и за тортата

        double difference = Math.abs(availableBudget - totalSum);     //намираме разликата (между наличната сума и необходимата сума) и си осигуряваме, че тя ще е положително число
        if (availableBudget >= totalSum) {             //ако бюджетът е достатъчен за предвидените гости
            System.out.printf("It is party time! %.2f leva left.", difference);
        } else {             //в противен случай (ако бюджетът не е достатъчен)
            System.out.printf("No party! %.2f leva needed.", difference);
        }

    }
}
