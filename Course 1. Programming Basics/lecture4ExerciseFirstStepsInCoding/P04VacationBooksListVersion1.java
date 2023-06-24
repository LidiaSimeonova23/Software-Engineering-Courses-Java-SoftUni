package lecture4ExerciseFirstStepsInCoding;

import java.util.Scanner;

public class P04VacationBooksListVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesInTheBook = Integer.parseInt(scanner.nextLine());
        int readPagesPer1Hour = Integer.parseInt(scanner.nextLine());
        int numberOfDaysToReadTheBook = Integer.parseInt(scanner.nextLine());

        int pagesPerDay = pagesInTheBook / numberOfDaysToReadTheBook;
        int hoursPerDay = pagesPerDay / readPagesPer1Hour;
        System.out.println(hoursPerDay);
        //System.out.println((pagesInTheBook / numberOfDaysToReadTheBook) / readPagesPer1Hour);
    }
}
