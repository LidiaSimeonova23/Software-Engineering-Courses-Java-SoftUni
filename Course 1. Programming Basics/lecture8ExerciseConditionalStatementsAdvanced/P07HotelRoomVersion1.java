package lecture8ExerciseConditionalStatementsAdvanced;

import java.util.Scanner;

public class P07HotelRoomVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата четем:
        String month = scanner.nextLine();                             //месеца – May, June, July, August, September или October
        int numberOfNights = Integer.parseInt(scanner.nextLine());             //броя на нощувките – цяло число в интервала [0 ... 200]


        double studioPrice = 0;                     //създаваме си променлива за цената на студио за 1 нощ - даваме й начална стойност 0, като после ще й проравняваме други стойности
        double apartmentPrice = 0;                   //създаваме си променлива за цената на апартамент за 1 нощ - даваме й начална стойност 0, като после ще й проравняваме други стойности


        switch (month) {
            case "May":                                                                  //в случай че месецът е май или октомври
            case "October":
                studioPrice = numberOfNights * 50;                                               //цената на студиото е равна на брой нощувки по цена за една нощувка
                apartmentPrice = numberOfNights * 65;                                            //цената на апартамента е равна на брой нощувки по цена за една нощувка
                if (numberOfNights > 7 && numberOfNights <= 14) {                                        //ако нощувките са над 7 и по-малко или равно на 14, ще има 5% отстъпка от цената на студиото
                    studioPrice = studioPrice - (studioPrice * 5 / 100);
                } else if (numberOfNights > 14) {                                                        //ако нощувките са над 14, ще има 30% отстъпка от цената на студиото и 10% отстъпка от цената на апартамента
                    studioPrice = studioPrice - (studioPrice * 30 / 100);
                    apartmentPrice = apartmentPrice - (apartmentPrice * 10 / 100);
                }
                break;
            case "June":                                                                  //в случай че месецът е юни или септември
            case "September":
                studioPrice = numberOfNights * 75.20;
                apartmentPrice = numberOfNights * 68.70;
                if (numberOfNights > 14) {                                                               //ако нощувките са над 14, ще има 20% отстъпка от цената на студиото и 10% отстъпка от цената на апартамента
                    studioPrice = studioPrice - (studioPrice * 20 / 100);
                    apartmentPrice = apartmentPrice - (apartmentPrice * 10 / 100);
                }
                break;
            case "July":                                                                  //в случай че месецът е юли или август
            case "August":
                studioPrice = numberOfNights * 76;
                apartmentPrice = numberOfNights * 77;
                if (numberOfNights > 14) {                                                                //ако нощувките са над 14, ще има 10% отстъпка от цената на апартамента
                    apartmentPrice = apartmentPrice - (apartmentPrice * 10 / 100);
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);                              //да се принтира цената на апартамента за всички нощувки (форматирана до два знака след дес. точка)
        System.out.printf("Studio: %.2f lv.", studioPrice);                                      //да се принтира цената на студиото за всички нощувки (форматирана до два знака след дес. точка)
    }
}
