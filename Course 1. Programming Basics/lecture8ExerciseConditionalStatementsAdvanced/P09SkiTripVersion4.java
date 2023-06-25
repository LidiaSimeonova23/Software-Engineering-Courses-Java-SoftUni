package lecture8ExerciseConditionalStatementsAdvanced;

import java.util.Scanner;

public class P09SkiTripVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата четем
        int daysForStay = Integer.parseInt(scanner.nextLine());            //дни за престой - цяло число в интервала [0...365]
        String roomType = scanner.nextLine();                       //вид помещение - "room for one person", "apartment" или "president apartment"
        String assessment = scanner.nextLine();               //оценка - "positive"  или "negative"

        double holidayPrice = 0;             //създаваме си променлива за цената на почивката с начална стойност 0, после ще й приравняваме различни стойности

        int nights = daysForStay - 1;          //намираме колко са нощувките, като от дните извадим 1

        if (roomType.equals("room for one person")) {                                           //ако  видът помещение е единична стая, няма никаква отстъпка
            holidayPrice = nights * 18.00;                                              //цената на ваканцията =  брой нощувки по цена за една нощувка
        } else if (roomType.equals("apartment")) {                                                      //ако  видът помещение е апартамент
            holidayPrice = nights * 25.00;                                              //цената на ваканцията =  брой нощувки по цена за една нощувка
            if (daysForStay < 10) {                                                         //ако почивката е под 10 дни, има отстъпка от цената - 30%
                holidayPrice = holidayPrice - (holidayPrice * 0.30);
            } else if (daysForStay <= 15) {                                                 //ако почивката е между 10 и 15 дни, има отстъпка от цената - 35%
                holidayPrice = holidayPrice - (holidayPrice * 0.35);
            } else {                                                                        //ако почивката е повече от 15 дни, има отстъпка от цената - 50%
                holidayPrice = holidayPrice - (holidayPrice * 0.50);
            }
        } else if (roomType.equals("president apartment")) {                                            //ако  видът помещение е президентски апартамент
            holidayPrice = nights * 35.00;                                              //цената на ваканцията =  брой нощувки по цена за една нощувка
            if (daysForStay < 10) {                                                         //ако почивката е под 10 дни, има отстъпка от цената - 10%
                holidayPrice = holidayPrice - (holidayPrice * 0.10);
            } else if (daysForStay <= 15) {                                                 //ако почивката е между 10 и 15 дни, има отстъпка от цената - 15%
                holidayPrice = holidayPrice - (holidayPrice * 0.15);
            } else {                                                                        //ако почивката е повече от 15 дни, има отстъпка от цената - 20%
                holidayPrice = holidayPrice - (holidayPrice * 0.20);
            }
        }


        switch (assessment) {
            case "positive":                 //Ако оценката позитивна, към цената с вече приспаднатото намаление се добавя 25% от нея.
                holidayPrice = holidayPrice + (holidayPrice * 0.25);
                break;
            case "negative":                           //Ако оценката е негативна, от цената с вече приспаднатото намаление се приспада 10%.
                holidayPrice = holidayPrice - (holidayPrice * 0.10);
                break;
        }


        System.out.printf("%.2f", holidayPrice);           //да се принтира окончателната цена за почивката, форматирана до два знака след десет. точка
    }
}
