package lecture10ExerciseForLoop;

import java.util.Scanner;

public class P08TennisRanklistVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTournaments = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());

        int winCount = 0;
        double pointsFromTour = 0;

        for (int i = 1; i <= numberOfTournaments; i++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    points = points + 2000;
                    pointsFromTour = pointsFromTour + 2000;
                    winCount++;
                    break;
                case "F":
                    points = points + 1200;
                    pointsFromTour = pointsFromTour + 1200;
                    break;
                case "SF":
                    points = points + 720;
                    pointsFromTour = pointsFromTour + 720;
                    break;
            }
        }


        double averageWinningPoints = Math.floor(pointsFromTour / numberOfTournaments);
        double winInPercent = winCount * 1.0 / numberOfTournaments * 100;

        System.out.printf("Final points: %d%n", points);
        System.out.printf("Average points: %.0f%n", averageWinningPoints);
        System.out.printf("%.2f%%", winInPercent);
    }
}
