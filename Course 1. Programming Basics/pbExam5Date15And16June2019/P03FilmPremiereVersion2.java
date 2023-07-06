package pbExam5Date15And16June2019;

import java.util.Scanner;

public class P03FilmPremiereVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входът се чете от конзолата и се състои от три реда:
        String nameOfFilm = scanner.nextLine();      //прожекция - текст с възможности: "John Wick", "Star Wars" или "Jumanji"
        String typeOfPurchase = scanner.nextLine();        //пакет за филм - текст  с възможности "Drink", "Popcorn" или "Menu"
        int numberOfTickets = Integer.parseInt(scanner.nextLine());      //брой билети - цяло число в интервала [1… 30]

        //проверяваме в кой случай попадат клиентите (според филма и покупката):
        double unitPrice = 0;        //създаваме си променлива за единична цена на пакет, който включва билета и покупката
        if (nameOfFilm.equals("John Wick")) {
            if (typeOfPurchase.equals("Drink")) {
                unitPrice = 12;
            } else if (typeOfPurchase.equals("Popcorn")) {
                unitPrice = 15;
            } else if (typeOfPurchase.equals("Menu")) {
                unitPrice = 19;
            }
        } else if (nameOfFilm.equals("Star Wars")) {
            if (typeOfPurchase.equals("Drink")) {
                unitPrice = 18;
            } else if (typeOfPurchase.equals("Popcorn")) {
                unitPrice = 25;
            } else if (typeOfPurchase.equals("Menu")) {
                unitPrice = 30;
            }
        } else if (nameOfFilm.equals("Jumanji")) {
            if (typeOfPurchase.equals("Drink")) {
                unitPrice = 9;
            } else if (typeOfPurchase.equals("Popcorn")) {
                unitPrice = 11;
            } else if (typeOfPurchase.equals("Menu")) {
                unitPrice = 14;
            }
        }

        //намираме общата цена (за всички хора) /броят на хората е равен на броя на билетите/:
        double totalPrice = numberOfTickets * unitPrice;

        //•	При избран филм "Star Wars" и купени поне четири билета има 30% семейна отстъпка.   -> тоест, крайната цена е 70% от цената
        if (nameOfFilm.equals("Star Wars") && numberOfTickets >= 4) {
            totalPrice = totalPrice * 70 * 0.01;
        }


        //•	При избран филм "Jumanji" и купени точно два билета има 15% отстъпка за двама.      -> тоест, крайната цена е 85% от цената
        if (nameOfFilm.equals("Jumanji") && numberOfTickets == 2) {
            totalPrice = totalPrice * 85 * 0.01;
        }

        //принтираме крайната сума (за всички хора)
        System.out.printf("Your bill is %.2f leva.", totalPrice);
    }
}
