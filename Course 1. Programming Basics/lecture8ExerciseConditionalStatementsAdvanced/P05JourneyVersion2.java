package lecture8ExerciseConditionalStatementsAdvanced;

import java.util.Scanner;

public class P05JourneyVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableBudget = Double.parseDouble(scanner.nextLine());      //•	Първи ред – Бюджет, реално число в интервала [10.00...5000.00].
        String season = scanner.nextLine();       //•	Втори ред –  Един от двата възможни сезона: "summer" или "winter"

        String destination = "";
        double spentSum = 0;
        if (availableBudget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                spentSum = availableBudget * 30 / 100;
            } else if (season.equals("winter")) {
                spentSum = availableBudget * 70 / 100;
            }
        } else if (availableBudget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                spentSum = availableBudget * 40 / 100;
            } else if (season.equals("winter")) {
                spentSum = availableBudget * 80 / 100;
            }
        } else {             //else if (availableBudget > 1000)
            destination = "Europe";
            spentSum = availableBudget * 90 / 100;
        }

        //	Почивката може да е между "Camp" и "Hotel"
        String stay = "";
        switch (destination) {
            case "Europe":
                stay = "Hotel";
                break;
            default:
                if (season.equals("summer")) {
                    stay = "Camp";
                } else if (season.equals("winter")) {
                    stay = "Hotel";
                }
                break;
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", stay, spentSum);
    }
}
