package pbExam5Date15And16June2019;

import java.util.Scanner;

public class P04CinemaVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат:
        int capacityOfHall = Integer.parseInt(scanner.nextLine());       //капацитет (брой места) на залата - цяло число в интервала [50... 150]

        //На всеки следващ ред - до команда "Movie time!" - се чете брой хора, влизащи в киното - цяло число в интервала [1… 15] -> не знаем колко ще са итерациите, имаме while loop
        int finalSumOfAllSoldTickets = 0;      //създаваме си променлива за общата сума от всички продадени билети     (в конкретния случай става и да е от тип int)
        String input = scanner.nextLine();
        while (!input.equals("Movie time!")) {
            int currentNumberOfPeople = Integer.parseInt(input);     //брой хора, влизащи в киното

            int totalNumberOfPeopleInTheHall = 0;       //създаваме си променлива за общия брой хора в залата (киното)
            int totalSumOfAllTicketsOfCurrentGroup = 0;     //създаваме си променлива за общата сума от билетите на текущата група от хора (в конкретния случай става и да е от тип int)
            if (capacityOfHall >= currentNumberOfPeople) {    //Ако има места за всички хора (на текущата итерация на цикъла), които се опитват да влязат в залата, те влизат
                int priceOf1Ticket = 5;        //Цената на един билет е 5 лв.
                totalSumOfAllTicketsOfCurrentGroup = currentNumberOfPeople * priceOf1Ticket;       //намираме общата сума за билетите на текущата група от хора

                //Ако ТЕКУЩИЯТ брой хора, влезли в залата, се дели на 3 без остатък, се прави отстъпка 5 лв от общата им сметка.
                if (currentNumberOfPeople % 3 == 0) {
                    totalSumOfAllTicketsOfCurrentGroup -= 5;     //totalSumOfAllTicketsOfCurrentGroup = totalSumOfAllTicketsOfCurrentGroup - 5;
                }

                totalNumberOfPeopleInTheHall += currentNumberOfPeople;    //totalNumberOfPeopleInTheHall = totalNumberOfPeopleInTheHall + currentNumberOfPeople;      //броят на хората в залата се увеличава

            } else {     //else if (capacityOfHall < currentNumberOfPeople)    //Ако в залата се опитат да влязат повече хора, отколкото места са останали, се счита, че местата са изчерпани, и програмата трябва да приключи четенето на вход.
                System.out.println("The cinema is full.");
                System.out.printf("Cinema income - %d lv.", finalSumOfAllSoldTickets);
                break;   //прекъсваме само цикъла (и ще се изпълни това, което е извън него - ще се направи проверка)
            }

            //Ако хората са си купили билети, броят на свободните места (капацитетът) намалява:
            capacityOfHall -= currentNumberOfPeople;        //capacityOfHall = capacityOfHall - currentNumberOfPeople;

            //намираме сумата от абсолютно всички продадени билети:
            finalSumOfAllSoldTickets += totalSumOfAllTicketsOfCurrentGroup;         //finalSumOfAllSoldTickets = finalSumOfAllSoldTickets + totalSumOfAllTicketsOfCurrentGroup;

            input = scanner.nextLine();        //update
        }


        //ако входните данни са били "Movie time!"
        if (input.equals("Movie time!")) {
            System.out.printf("There are %d seats left in the cinema.%n", capacityOfHall);
            System.out.printf("Cinema income - %d lv.", finalSumOfAllSoldTickets);
        }

    }
}