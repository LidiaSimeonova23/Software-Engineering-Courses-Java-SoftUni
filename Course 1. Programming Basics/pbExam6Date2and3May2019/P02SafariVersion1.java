package pbExam6Date2and3May2019;

import java.util.Scanner;

public class P02SafariVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        double availableBudget = Double.parseDouble(scanner.nextLine());       //Бюджет – реално число в интервала [0.00… 10000.00]
        double necessaryLitresOfFuel = Double.parseDouble(scanner.nextLine());    //Колко литра гориво ще са им нужни – реално число в интервала [1.00… 50.00]
        String dayOfWeek = scanner.nextLine();         //Ден от седмицата – текст с възможности "Saturday" и "Sunday"

        //Цената на един литър гориво е 2.10 лв. ->
        double priceOfAllLitresOfFuel = necessaryLitresOfFuel * 2.10;

        //Цената за екскурзовод е 100 лв.

        //намираме крайната цена на екскурзията
        double priceOfExcursion = priceOfAllLitresOfFuel + 100;

        //В зависимост от деня има отстъпки от общата цена - за събота 10%, а за неделя 20%.
        switch (dayOfWeek) {
            case "Saturday":
                priceOfExcursion = priceOfExcursion - (priceOfExcursion * 10 / 100);
                break;
            case "Sunday":
                priceOfExcursion = priceOfExcursion - (priceOfExcursion * 20 / 100);
                break;
        }


        double differenceInMoney = Math.abs(availableBudget - priceOfExcursion);
        if (availableBudget >= priceOfExcursion) {      //Ако бюджетът е достатъчен
            System.out.printf("Safari time! Money left: %.2f lv.", differenceInMoney);
        } else {     //else if (availableBudget < priceOfExcursion)       //Ако бюджетът не е достатъчен
            System.out.printf("Not enough money! Money needed: %.2f lv.", differenceInMoney);
        }

    }
}
