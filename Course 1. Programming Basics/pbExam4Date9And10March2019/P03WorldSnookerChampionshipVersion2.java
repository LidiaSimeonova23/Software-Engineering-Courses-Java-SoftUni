package pbExam4Date9And10March2019;

import java.util.Scanner;

public class P03WorldSnookerChampionshipVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        String tournamentStage = scanner.nextLine();         //Етап на първенството – текст - “Quarter final ”, “Semi final” или “Final”
        String typeOfTicket = scanner.nextLine();        //Вид на билета – текст - “Standard”, “Premium” или “VIP”
        int countTickets = Integer.parseInt(scanner.nextLine());         //Брой билети – цяло число в интервала [1 … 30]
        String trophyPhoto = scanner.nextLine();         //Снимка с трофея – символ – 'Y' (да) или 'N' (не)    -> в случая сме прочели символа като текст  "Y" or "N"

        double price = 0;      //създаваме си променлива за цената на 1 билет
        //в случая като главни условия разглеждаме вида на билета и за всяко главно условие проверяваме между 3 подусловия (етап от турнира)
        if (typeOfTicket.equals("Standard")) {
            if (tournamentStage.equals("Quarter final")) {
                price = 55.50;
            } else if (tournamentStage.equals("Semi final")) {
                price = 75.88;
            } else if (tournamentStage.equals("Final")) {
                price = 110.10;
            }
        } else if (typeOfTicket.equals("Premium")) {
            if (tournamentStage.equals("Quarter final")) {
                price = 105.20;
            } else if (tournamentStage.equals("Semi final")) {
                price = 125.22;
            } else if (tournamentStage.equals("Final")) {
                price = 160.66;
            }
        } else if (typeOfTicket.equals("VIP")) {
            if (tournamentStage.equals("Quarter final")) {
                price = 118.90;
            } else if (tournamentStage.equals("Semi final")) {
                price = 300.40;
            } else if (tournamentStage.equals("Final")) {
                price = 400;
            }
        }

        //намираме цената за всички билети
        double totalPriceOfAllTickets = countTickets * price;

        //При достигане на определена сума има отстъпки:
        if (totalPriceOfAllTickets > 4000) {       //Над 4000 лири има 25% отстъпка и безплатни снимки с трофея (ако  опцията за снимки е избрана, таксата от 40 лири за билет не се включва)
            totalPriceOfAllTickets = totalPriceOfAllTickets * 0.75;
        } else if (totalPriceOfAllTickets > 2500) {         //Над 2500 лири има 10% отстъпка
            totalPriceOfAllTickets = totalPriceOfAllTickets * 0.90;
            if (trophyPhoto.equals("Y")) {       //при избрана опция снимка с трофея - цената на 1 билет нараства с 40 лири
                totalPriceOfAllTickets = totalPriceOfAllTickets + (countTickets * 40);
            }
        } else {    //във всички останали случаи (тоест, когато сумата за билетите е по-малка или равна на 2500 лири) няма отстъпка
            if (trophyPhoto.equals("Y")) {
                totalPriceOfAllTickets = totalPriceOfAllTickets + (countTickets * 40);
            }
        }

        System.out.printf("%.2f", totalPriceOfAllTickets);
    }
}
