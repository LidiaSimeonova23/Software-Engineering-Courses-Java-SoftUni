package lecture4ExerciseFirstStepsInCoding;

import java.util.Scanner;

public class P04VacationBooksListVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesInTheBook = Integer.parseInt(scanner.nextLine());
        int readPagesPer1Hour = Integer.parseInt(scanner.nextLine());
        int numberOfDaysToReadTheBook = Integer.parseInt(scanner.nextLine());

        int totalHoursNeeded = pagesInTheBook / readPagesPer1Hour;
        int hoursPerDay = totalHoursNeeded / numberOfDaysToReadTheBook;
        System.out.println(hoursPerDay);
        //System.out.println((pagesInTheBook / readPagesPer1Hour) / numberOfDaysToReadTheBook);
    }
}

