package lecture4ExerciseFirstStepsInCoding;

import java.util.Scanner;

public class P05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //по условие е дадено:
        double priceOf1PackageOfPencils = 5.80;
        double priceOf1PackageOfMarkers = 7.20;
        double priceOf1LitreOfChalkBoardCleaner = 1.20;

        int packagesOfPencils = Integer.parseInt(scanner.nextLine());       //Брой пакети химикали - цяло число в интервала [0...100]
        int packagesOfMarkers = Integer.parseInt(scanner.nextLine());          //Брой пакети маркери - цяло число в интервала [0...100]
        int litresOfChalkBoardCleaner = Integer.parseInt(scanner.nextLine());     //Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        int percentageOfDiscount = Integer.parseInt(scanner.nextLine());      //Процент намаление - цяло число в интервала [0...100]

        double totalSumWithoutDiscount = (packagesOfPencils * priceOf1PackageOfPencils) + (packagesOfMarkers * priceOf1PackageOfMarkers) + (litresOfChalkBoardCleaner * priceOf1LitreOfChalkBoardCleaner);
        double finalSum = totalSumWithoutDiscount - (totalSumWithoutDiscount * percentageOfDiscount / 100);
        System.out.println(finalSum);
        //System.out.printf("%f", finalSum);
    }
}
