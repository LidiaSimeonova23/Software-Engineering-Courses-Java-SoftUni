package pbExam5Date15And16June2019;

import java.util.Scanner;

public class P03FilmPremiereVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входът се чете от конзолата и се състои от три реда:
        String nameOfFilm = scanner.nextLine();      //прожекция - текст с възможности: "John Wick", "Star Wars" или "Jumanji"
        String typeOfPurchase = scanner.nextLine();        //пакет за филм - текст  с възможности "Drink", "Popcorn" или "Menu"
        int numberOfTickets = Integer.parseInt(scanner.nextLine());      //брой билети - цяло число в интервала [1… 30]

        //проверяваме в кой случай попадат клиентите (според филма и покупката):
        double unitPrice = 0;       //създаваме си променлива за единична цена на пакет, който включва билета и покупката
        switch (nameOfFilm) {
            case "John Wick":
                if (typeOfPurchase.equals("Drink")) {
                    unitPrice = 12;
                } else if (typeOfPurchase.equals("Popcorn")) {
                    unitPrice = 15;
                } else if (typeOfPurchase.equals("Menu")) {
                    unitPrice = 19;
                }
                break;
            case "Star Wars":
                if (typeOfPurchase.equals("Drink")) {
                    unitPrice = 18;
                } else if (typeOfPurchase.equals("Popcorn")) {
                    unitPrice = 25;
                } else if (typeOfPurchase.equals("Menu")) {
                    unitPrice = 30;
                }
                break;
            case "Jumanji":
                if (typeOfPurchase.equals("Drink")) {
                    unitPrice = 9;
                } else if (typeOfPurchase.equals("Popcorn")) {
                    unitPrice = 11;
                } else if (typeOfPurchase.equals("Menu")) {
                    unitPrice = 14;
                }
                break;
        }

        //намираме общата цена (за всички хора) /броят на хората е равен на броя на билетите/:
        double totalPrice = numberOfTickets * unitPrice;

        //•	При избран филм "Star Wars" и купени поне четири билета има 30% семейна отстъпка.
        if (nameOfFilm.equals("Star Wars")) {
            if (numberOfTickets >= 4) {
                totalPrice = totalPrice - (totalPrice * 30 / 100);
            }
        }


        //•	При избран филм "Jumanji" и купени точно два билета има 15% отстъпка за двама.
        if (nameOfFilm.equals("Jumanji")) {
            if (numberOfTickets == 2) {
                totalPrice = totalPrice - (totalPrice * 15 / 100);
            }
        }

        //принтираме крайната сума (за всички хора)
        System.out.printf("Your bill is %.2f leva.", totalPrice);
    }
}
