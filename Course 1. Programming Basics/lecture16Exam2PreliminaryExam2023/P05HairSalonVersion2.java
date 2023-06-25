package lecture16Exam2PreliminaryExam2023;

import java.util.Scanner;

public class P05HairSalonVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wantedSumForTheDay = Integer.parseInt(scanner.nextLine());       //•	цел за деня – цяло число в интервала [1 … 5000]


        double totalSumForTheDay = 0;
        boolean isGoalFulfilled = false;

        String input = scanner.nextLine();
        while (!input.equals("closed")) {
            String service = input;
            String typeOfService = scanner.nextLine();

            double priceOfService = 0;

            if (service.equals("haircut")) {
                if (typeOfService.equals("mens")) {
                    priceOfService = 15;
                } else if (typeOfService.equals("ladies")) {
                    priceOfService = 20;
                } else if (typeOfService.equals("kids")) {
                    priceOfService = 10;
                }
            } else if (service.equals("color")) {
                if (typeOfService.equals("touch up")) {
                    priceOfService = 20;
                } else if (typeOfService.equals("full color")) {
                    priceOfService = 30;
                }
            }

            totalSumForTheDay = totalSumForTheDay + priceOfService;

            if (totalSumForTheDay >= wantedSumForTheDay) {
                isGoalFulfilled = true;
                break;
            }


            input = scanner.nextLine();
        }


        if (isGoalFulfilled) {    //if (totalSumForTheDay >= wantedSumForTheDay)           //Ако Деси е успяла да постигне целта за деня:
            System.out.println("You have reached your target for the day!");
            System.out.printf("Earned money: %.0flv.", totalSumForTheDay);
        } else {            //Ако Деси не е успяла да постигне целта за деня:
            System.out.printf("Target not reached! You need %.0flv. more.%n", wantedSumForTheDay - totalSumForTheDay);
            System.out.printf("Earned money: %.0flv.", totalSumForTheDay);
        }


    }
}
