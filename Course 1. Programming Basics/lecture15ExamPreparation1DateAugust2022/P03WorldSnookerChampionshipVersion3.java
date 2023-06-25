package lecture15ExamPreparation1DateAugust2022;

import java.util.Scanner;

public class P03WorldSnookerChampionshipVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //От конзолата се четат 4 реда:
        String championshipStage = scanner.nextLine();      //Етап на първенството – текст - “Quarter final ”, “Semi final” или “Final”
        String ticketType = scanner.nextLine();    //Вид на билета – текст - “Standard”, “Premium” или “VIP”
        int numberOfTickets = Integer.parseInt(scanner.nextLine());    //Брой билети – цяло число в интервала [1 … 30]
        String trophyPhoto = scanner.nextLine();    //Снимка с трофея – символ – 'Y' (да) или 'N' (не)    //но в случая е прочетен като текст "Y" или "N"

        double ticketPrice = 0;   //създаваме си променлива за цената на билета с начална стойност 0, после ще й сетваме други стойности

        //като главни условия съм ползвала видовете билет, а като подусловия на всяко главно условие - етапите на първенството
        if (ticketType.equals("Standard")) {
            if (championshipStage.equals("Quarter final")) {
                ticketPrice = 55.50;
            } else if (championshipStage.equals("Semi final")) {
                ticketPrice = 75.88;
            } else if (championshipStage.equals("Final")) {
                ticketPrice = 110.10;
            }
        } else if (ticketType.equals("Premium")) {
            if (championshipStage.equals("Quarter final")) {
                ticketPrice = 105.20;
            } else if (championshipStage.equals("Semi final")) {
                ticketPrice = 125.22;
            } else if (championshipStage.equals("Final")) {
                ticketPrice = 160.66;
            }
        } else if (ticketType.equals("VIP")) {
            if (championshipStage.equals("Quarter final")) {
                ticketPrice = 118.90;
            } else if (championshipStage.equals("Semi final")) {
                ticketPrice = 300.40;
            } else if (championshipStage.equals("Final")) {
                ticketPrice = 400;
            }
        }

        double allTicketsPrice = numberOfTickets * ticketPrice;   //намираме цената на всички билети (брой билети по единична цена)

        //по условие, ако е избрана снимка с трофея, тя е на цена 40 лири; При избрана опция за снимки с трофея цената се начислява след изчисляването на отстъпките.

        if (allTicketsPrice > 4000) {                                               //ако билетите струват над 4000 лири, има 25% отстъпка и безплатни снимки с трофея
            allTicketsPrice = allTicketsPrice - (allTicketsPrice * 25 / 100);
        } else if (allTicketsPrice > 2500) {                                        //ако билетите струват над 2500 лири, има 10% отстъпка, но се плаща за снимките с трофея
            allTicketsPrice = allTicketsPrice - (allTicketsPrice * 10 / 100);
            if (trophyPhoto.equals("Y")) {
                allTicketsPrice = allTicketsPrice + (numberOfTickets * 40);    //ако има снимки с трофея, цената на всеки от билетите допълнително се оскъпява с 40 лири
            }
        } else {                                                                    //ако билетите са по-малко или равно на 2500 лири
            if (trophyPhoto.equals("Y")) {
                allTicketsPrice = allTicketsPrice + (numberOfTickets * 40);    //ако има снимки с трофея, цената на всеки от билетите допълнително се оскъпява с 40 лири
            }
        }

        System.out.printf("%.2f", allTicketsPrice);    //принтира се окончателната сума (след отстъпката, ако има такава изобщо) на всички билети
    }
}
