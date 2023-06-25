package lecture8ExerciseConditionalStatementsAdvanced;

import java.util.Scanner;

public class P09SkiTripVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата четем
        int daysForStay = Integer.parseInt(scanner.nextLine());         //дни за престой - цяло число в интервала [0...365]
        String roomType = scanner.nextLine();                  //вид помещение - "room for one person", "apartment" или "president apartment"
        String assessment = scanner.nextLine();                     //оценка - "positive"  или "negative"

        int numberOfNights = daysForStay - 1;               //намираме колко са нощувките - те са с 1 по-малко от дните

        double holidayPrice = 0;                                //създаваме си променлива за цената на почивката с начална стойност 0, после ще й приравняваме различни стойности

        if (daysForStay < 10) {                                                                          //ако дните са под 10
            if (roomType.equals("room for one person")) {                                                       //ако стаята е единична, няма отстъпка от цената
                holidayPrice = numberOfNights * 18.00;
            } else if (roomType.equals("apartment")) {                                                          //ако стаята е апартамент, има отстъпка 30% от цената
                holidayPrice = numberOfNights * 25.00 - (numberOfNights * 25.00 * 30 / 100);
            } else if (roomType.equals("president apartment")) {                                                //ако стаята е президентнски апартамент, има отстъпка 35% от цената
                holidayPrice = numberOfNights * 35.00 - (numberOfNights * 35.00 * 10 / 100);
            }
        } else if (daysForStay <= 15) {                                                                  //ако дните са 15 или по-малко
            if (roomType.equals("room for one person")) {                                                       //ако стаята е единична, няма отстъпка от цената
                holidayPrice = numberOfNights * 18.00;
            } else if (roomType.equals("apartment")) {                                                          //ако стаята е апартамент, има отстъпка 35% от цената
                holidayPrice = numberOfNights * 25.00 - (numberOfNights * 25.00 * 35 / 100);
            } else if (roomType.equals("president apartment")) {                                                //ако стаята е президентнски апартамент, има отстъпка 15% от цената
                holidayPrice = numberOfNights * 35.00 - (numberOfNights * 35.00 * 15 / 100);
            }
        } else {                  //else if (daysForStay > 15)                                                                           //ако дните са 15 или повече
            if (roomType.equals("room for one person")) {                                                       //ако стаята е единична, няма отстъпка от цената
                holidayPrice = numberOfNights * 18.00;
            } else if (roomType.equals("apartment")) {                                                          //ако стаята е апартамент, има отстъпка 50% от цената
                holidayPrice = numberOfNights * 25.00 - (numberOfNights * 25.00 * 50 / 100);
            } else if (roomType.equals("president apartment")) {                                                //ако стаята е президентнски апартамент, има отстъпка 20% от цената
                holidayPrice = numberOfNights * 35.00 - (numberOfNights * 35.00 * 20 / 100);
            }
        }


        if (assessment.equals("positive")) {                                          //Ако оценката позитивна, към цената с вече приспаднатото намаление се добавя 25% от нея.
            holidayPrice = holidayPrice + (holidayPrice * 25 / 100);
        } else if (assessment.equals("negative")) {                                    //Ако оценката е негативна, от цената с вече приспаднатото намаление се приспада 10%.
            holidayPrice = holidayPrice - (holidayPrice * 10 / 100);
        }

        System.out.printf("%.2f", holidayPrice);                 //да се принтира окончателната цена за почивката
    }
}
