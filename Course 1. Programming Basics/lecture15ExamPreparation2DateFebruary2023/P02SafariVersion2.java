package lecture15ExamPreparation2DateFebruary2023;

import java.util.Scanner;

public class P02SafariVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableBudget = Double.parseDouble(scanner.nextLine());       //Бюджет – реално число в интервала [0.00… 10000.00]
        double litresOfFuel = Double.parseDouble(scanner.nextLine());     //Колко литра гориво ще са им нужни – реално число в интервала [1.00… 50.00]
        String dayOfWeek = scanner.nextLine();      //Ден от седмицата – текст с възможности "Saturday" и "Sunday"

        //•	Цената на един литър гориво е 2.10 лв.
        //•	Цената за екскурзовод е 100 лв.

        double necessarySum = (litresOfFuel * 2.10) + 100;

        //•	В зависимост от деня има отстъпки от общата цена - за събота 10%, а за неделя 20%
        if (dayOfWeek.equals("Saturday")) {
            necessarySum = necessarySum - (necessarySum * 10 / 100);
        } else if (dayOfWeek.equals("Sunday")) {
            necessarySum = necessarySum - (necessarySum * 20 / 100);
        }


        if (availableBudget >= necessarySum) {
            System.out.printf("Safari time! Money left: %.2f lv.", availableBudget - necessarySum);      //availableBudget - necessarySum
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", necessarySum - availableBudget);    //necessarySum - availableBudget
        }

    }
}
