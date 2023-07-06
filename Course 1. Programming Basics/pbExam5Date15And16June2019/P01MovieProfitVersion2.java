package pbExam5Date15And16June2019;

import java.util.Scanner;

public class P01MovieProfitVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 5 реда:
        String nameOfFilm = scanner.nextLine();         //Име на филм - текст
        int daysCount = Integer.parseInt(scanner.nextLine());        //Брой дни - цяло число в диапазона [1… 90]
        int ticketsCount = Integer.parseInt(scanner.nextLine());       //Брой билети  - цяло число в диапазона [100… 100000]
        double priceOf1Ticket = Double.parseDouble(scanner.nextLine());        //Цена на билет - реално число в диапазона [5.0… 25.0]
        int percentageOfProfitForTheCinema = Integer.parseInt(scanner.nextLine());         //Процент за киното - цяло число в диапазона [5... 35]

        //в тази задача предварително се премята очаквана печалба (правят се някакви предварителни залагания за средно продадени билети на ден)

        //намираме цената на всички билети (за всички дни):
        double totalPriceOfAllTicketsFromAllDays = daysCount * (ticketsCount * priceOf1Ticket);

        //намираме печалбата за киното:
        double profitOfTheCinema = totalPriceOfAllTicketsFromAllDays * percentageOfProfitForTheCinema / 100;

        //намираме и принтираме печалбата за филмовата компания:
        double profitOfFilmCompany = totalPriceOfAllTicketsFromAllDays - profitOfTheCinema;
        System.out.printf("The profit from the movie %s is %.2f lv.", nameOfFilm, profitOfFilmCompany);
    }
}
