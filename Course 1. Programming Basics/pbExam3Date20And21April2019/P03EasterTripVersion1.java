package pbExam3Date20And21April2019;

import java.util.Scanner;

public class P03EasterTripVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата се четат три реда:
        String destination = scanner.nextLine();      //дестинация - текст с възможности: "France", "Italy" или "Germany"
        String reservedDays = scanner.nextLine();         //дати, през които си е резервирала екскурзията - текст  с възможности "21-23", "24-27" или "28-31"
        int numberOfNights = Integer.parseInt(scanner.nextLine());          //брой нощувки - цяло число в интервала [1… 100]


        double priceForOneNight = 0;         //създаваме си променлива за цена за 1 нощувка - с начална стойност 0, после ще й задаваме други стойности
        switch (destination) {
            case "France":                                       //ако дестинацията е Франция
                if (reservedDays.equals("21-23")) {                   //ако датите са 21-23
                    priceForOneNight = 30;
                } else if (reservedDays.equals("24-27")) {            //или ако датите са 24-27
                    priceForOneNight = 35;
                } else if (reservedDays.equals("28-31")) {            //или ако датите са 28-31
                    priceForOneNight = 40;
                }
                break;
            case "Italy":                                         //или ако дестинацията е Италия
                if (reservedDays.equals("21-23")) {                     //ако датите са 21-23
                    priceForOneNight = 28;
                } else if (reservedDays.equals("24-27")) {              //или ако датите са 24-27
                    priceForOneNight = 32;
                } else if (reservedDays.equals("28-31")) {              //или ако датите са 28-31
                    priceForOneNight = 39;
                }
                break;
            case "Germany":                                         //или ако дестинацията е Германия
                if (reservedDays.equals("21-23")) {                     //или ако датите са 21-23
                    priceForOneNight = 32;
                } else if (reservedDays.equals("24-27")) {              //или ако датите са 24-27
                    priceForOneNight = 37;
                } else if (reservedDays.equals("28-31")) {              //или ако датите са 28-31
                    priceForOneNight = 43;
                }
                break;
        }

        double priceOfAllNights = numberOfNights * priceForOneNight;        //намираме цената за всички нощувки, като умножаваме брой нощувки по цена за една нощувка

        System.out.printf("Easter trip to %s : %.2f leva.", destination, priceOfAllNights);
    }
}
