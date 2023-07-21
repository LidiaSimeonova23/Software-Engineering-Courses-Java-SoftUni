package pbExam8Date6And7April2019;

import java.util.Scanner;

public class P03OscarsWeekInCinemaVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входът се чете от конзолата и се състои от три реда:
        String nameOfFilm = scanner.nextLine();      //име на филм – текст ("A Star Is Born", "Bohemian Rhapsody","Green Book" или "The Favourite")
        String typeOfHall = scanner.nextLine();       //вид на залата – текст ("normal", "luxury" или "ultra luxury")
        int numberOfTickets = Integer.parseInt(scanner.nextLine());       //брой на купените билети – цяло число в интервала [1…100]

        double priceOf1Ticket = 0;      //double priceOf1Ticket = 0.0;        //създаваме си променлива за цената на 1 билет (с начална стойност 0, после ще я променяме)
        switch (nameOfFilm) {
            case "A Star Is Born":
                if (typeOfHall.equals("normal")) {
                    priceOf1Ticket = 7.50;
                } else if (typeOfHall.equals("luxury")) {
                    priceOf1Ticket = 10.50;
                } else if (typeOfHall.equals("ultra luxury")) {
                    priceOf1Ticket = 13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if (typeOfHall.equals("normal")) {
                    priceOf1Ticket = 7.35;
                } else if (typeOfHall.equals("luxury")) {
                    priceOf1Ticket = 9.45;
                } else if (typeOfHall.equals("ultra luxury")) {
                    priceOf1Ticket = 12.75;
                }
                break;
            case "Green Book":
                if (typeOfHall.equals("normal")) {
                    priceOf1Ticket = 8.15;
                } else if (typeOfHall.equals("luxury")) {
                    priceOf1Ticket = 10.25;
                } else if (typeOfHall.equals("ultra luxury")) {
                    priceOf1Ticket = 13.25;
                }
                break;
            case "The Favourite":
                if (typeOfHall.equals("normal")) {
                    priceOf1Ticket = 8.75;
                } else if (typeOfHall.equals("luxury")) {
                    priceOf1Ticket = 11.55;
                } else if (typeOfHall.equals("ultra luxury")) {
                    priceOf1Ticket = 13.95;
                }
                break;
        }

        //намираме и принтираме приходите от филма:
        double totalPriceOfAllTickets = numberOfTickets * priceOf1Ticket;
        System.out.printf("%s -> %.2f lv.", nameOfFilm, totalPriceOfAllTickets);
    }
}
