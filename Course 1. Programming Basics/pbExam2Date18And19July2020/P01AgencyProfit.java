package pbExam2Date18And19July2020;

import java.util.Scanner;

public class P01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 5 реда:
        String nameOfCompany = scanner.nextLine();      //Име на авиокомпанията - текст
        int numberOfTicketsForAdults = Integer.parseInt(scanner.nextLine());       //Брой билети за	 възрастни – цяло число в диапазона [1…400]
        int numberOfTicketsForKids = Integer.parseInt(scanner.nextLine());      //Брой детски билети – цяло число в диапазона [25…120]
        double netPriceOf1TicketForAdult = Double.parseDouble(scanner.nextLine());     //Нетна цена на билет за възрастен – реално число в диапазона [100.0…1600.0]
        double feeForServices = Double.parseDouble(scanner.nextLine());       //Цената на такса обслужване - реално число в диапазона [10.0…50.0]

        //детският билет е със 70% по-евтин от билета за възрастен
        double netPriceOf1TicketForKid = netPriceOf1TicketForAdult - (netPriceOf1TicketForAdult * 70 / 100);
        //втори начин:    double netPriceOf1TicketForKid = netPriceOf1TicketForAdult * 30 / 100;

        //Агенцията добавя към нетната цена на всеки билет такса обслужване.
        double totalPriceOf1TicketForAdult = netPriceOf1TicketForAdult + feeForServices;    //намираме крайната цена на 1 билет за възрастен
        double totalPriceOf1TicketForKid = netPriceOf1TicketForKid + feeForServices;        //намираме крайната цена на 1 билет за дете

        //намираме сумата от всички продадени билети
        double sumOfAllTickets = (numberOfTicketsForAdults * totalPriceOf1TicketForAdult) + (numberOfTicketsForKids * totalPriceOf1TicketForKid);

        //Крайната печалба на Агенцията е 20% от общата цена на всички билети.
        double profitOfAgency = sumOfAllTickets * 20 / 100;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", nameOfCompany, profitOfAgency);
    }
}
