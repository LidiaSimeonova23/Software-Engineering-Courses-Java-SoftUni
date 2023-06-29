package pbExam3Date20And21April2019;

import java.util.Scanner;

public class P04EasterEggsBattleVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата се четат два реда:
        int numberOfEggsFirstPlayer = Integer.parseInt(scanner.nextLine());           //Брой яйца, които има първият играч - цяло число в интервала [1 … 99]
        int numberOfEggsSecondPlayer = Integer.parseInt(scanner.nextLine());          //Брой яйца, които има вторият играч - цяло число в интервала [1 … 99]


        //•	Играта приключва, ако някой от играчите остане без яйца или до получаване на команда "End"   -> while цикъл
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String winner = input;     //на всяка итерация четем кой е победителят (има две мъзможности: "one" или "two")

            switch (winner) {
                case "one":        //При получаване на команда "one" -> първият играч печели => яйцата на втория намаляват с едно
                    numberOfEggsSecondPlayer--;      //numberOfEggsSecondPlayer = numberOfEggsSecondPlayer - 1;        //numberOfEggsSecondPlayer -= 1;
                    break;
                case "two":        //При получаване на команда "two" -> вторият играч печели => яйцата на първия намаляват с едно
                    numberOfEggsFirstPlayer--;
                    break;
            }

            //•	Играта приключва, ако някой от играчите остане без яйца  ->
            if (numberOfEggsFirstPlayer == 0 || numberOfEggsSecondPlayer == 0) {
                break;
            }

            input = scanner.nextLine();    //update
        }


        if (input.equals("End")) {         //При команда "End"
            System.out.printf("Player one has %d eggs left.%n", numberOfEggsFirstPlayer);
            System.out.printf("Player two has %d eggs left.", numberOfEggsSecondPlayer);
        } else {        //в противен случай (тоест, ако някой от играчите е останал без яйца)
            if (numberOfEggsFirstPlayer == 0) {     //Ако първият играч остане без яйца
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", numberOfEggsSecondPlayer);
            } else {      //Ако вторият играч остане без яйца        //else if (numberOfEggsSecondPlayer == 0)
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", numberOfEggsFirstPlayer);
            }
        }


    }
}

