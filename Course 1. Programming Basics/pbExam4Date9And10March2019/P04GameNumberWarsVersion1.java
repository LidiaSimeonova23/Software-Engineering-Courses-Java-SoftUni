package pbExam4Date9And10March2019;

import java.util.Scanner;

public class P04GameNumberWarsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //карти:  двойки, тройки, четворки, петици, шестици, седмици, осмици, деветки и десетки от всички 4 бои

        //Първоначално се четат два реда:
        String nameOfFirstPlayer = scanner.nextLine();     //Име на първия играч - текст
        String nameOfSecondPlayer = scanner.nextLine();    //Име на втория играч - текст


        //След това, до получаване на команда "End of game", се четат многократно по два реда:
        int pointsOfFirstPlayer = 0;       //създаваме си променлива за точките на първия играч
        int pointsOfSecondPlayer = 0;      //създаваме си променлива за точките на втория играч
        String input = scanner.nextLine();
        while (!input.equals("End of game")) {
            int cardOfFirstPlayer = Integer.parseInt(input);    //Карта, която дава първият играч- цяло число в интервала [2…9]
            int cardOfSecondPlayer = Integer.parseInt(scanner.nextLine());    //Карта, която дава вторият играч -  цяло число в интервала [2…9]

            if (cardOfFirstPlayer > cardOfSecondPlayer) {       //Ако картата на първия играч е с по-голяма стойност от картата на втория играч, първият получава точки, които са равни на разликата между картата на първия и картата на втория
                pointsOfFirstPlayer = pointsOfFirstPlayer + (cardOfFirstPlayer - cardOfSecondPlayer);
            } else if (cardOfFirstPlayer < cardOfSecondPlayer) {        //Ако картата на втория играч е с по-голяма стойност от картата на първия играч, вторият получава точки, които са равни на разликата между картата на втория и картата на първия
                pointsOfSecondPlayer = pointsOfSecondPlayer + (cardOfSecondPlayer - cardOfFirstPlayer);
            } else {         //else if (cardOfFirstPlayer == cardOfSecondPlayer)
                System.out.println("Number wars!");
                //При еднакви карти на двамата играчи се прочитат нови два реда (карта, която дава първият, и карта, която дава вторият.)
                int additionalCardOfFirstPlayer = Integer.parseInt(scanner.nextLine());
                int additionalCardOfSecondPlayer = Integer.parseInt(scanner.nextLine());

                //Играчът, чиято допълнителна карта е с по-голяма стойност, печели и играта приключва
                if (additionalCardOfFirstPlayer > additionalCardOfSecondPlayer) {
                    System.out.printf("%s is winner with %d points", nameOfFirstPlayer, pointsOfFirstPlayer);
                } else {
                    System.out.printf("%s is winner with %d points", nameOfSecondPlayer, pointsOfSecondPlayer);
                }
                break;         //прекъсваме само цикъла (и се изпълнява това, което е под цикъла)
            }

            input = scanner.nextLine();     //update
        }


        //При команда "End of game", няма победител, просто си принтираме точките на всеки от играчите:
        if (input.equals("End of game")) {
            System.out.printf("%s has %d points%n", nameOfFirstPlayer, pointsOfFirstPlayer);
            System.out.printf("%s has %d points", nameOfSecondPlayer, pointsOfSecondPlayer);
        }

    }
}
