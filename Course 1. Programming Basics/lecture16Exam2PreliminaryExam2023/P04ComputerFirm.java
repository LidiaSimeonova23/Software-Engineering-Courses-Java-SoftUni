package lecture16Exam2PreliminaryExam2023;

import java.util.Scanner;

public class P04ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfModelsOfComputers = Integer.parseInt(scanner.nextLine());      //броя на моделите компютри


        double allRealSales = 0;
        double sumAllRatings = 0;
        for (int currentModelOfComputer = 1; currentModelOfComputer <= numberOfModelsOfComputers; currentModelOfComputer++) {
            int possibleSalesAndRating = Integer.parseInt(scanner.nextLine());        //Числото, представляващо възможните продажби и рейтинга - цяло число в интервала [32…306]

            //•	Последната цифра (единиците) на това число представлява рейтингът, който е в интервала [2…6].
            //•	Останалите цифри (стотици и десетици) са възможните продажби, които ще се осъществят.
            int rating = possibleSalesAndRating % 10;      //с модулно дел. на 10 намираме последната цифра на едно число
            int possibleSales = possibleSalesAndRating / 10;       //с целочислено дел. на 10 премахваме последната цифра от едно число

            double realSales = 0;
            if (rating == 2) {        //Рейтинг 2 взима 0% от  възможните продажби.
                realSales = possibleSales * 0 * 0.01;
            } else if (rating == 3) {        //Рейтинг 3 взима 50% от възможните продажби.
                realSales = possibleSales * 50 * 0.01;
            } else if (rating == 4) {        //Рейтинг 4 взима 70% от възможните продажби.
                realSales = possibleSales * 70 * 0.01;
            } else if (rating == 5) {        //Рейтинг 5 взима 85% от възможните продажби.
                realSales = possibleSales * 85 * 0.01;
            } else if (rating == 6) {        //Рейтинг 6 взима 100% от възможните продажби.
                realSales = possibleSales * 100 * 0.01;
            }

            allRealSales = allRealSales + realSales;
            sumAllRatings = sumAllRatings + rating;
        }

        System.out.printf("%.2f%n", allRealSales);

        double averageRating = sumAllRatings / numberOfModelsOfComputers;    //броят на рейтингите е равен на броя модели компютри (затова вместо да търсим брой рейтинги, ползваме numberOfModelsOfComputers)
        System.out.printf("%.2f", averageRating);
    }
}

