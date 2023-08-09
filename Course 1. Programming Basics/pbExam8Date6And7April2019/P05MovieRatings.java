package pbExam8Date6And7April2019;

import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата първо се чете един ред:
        int numberOfFilms = Integer.parseInt(scanner.nextLine());         //Брой филми, които си е набелязала Деси – цяло число в интервала [1…20]

        //За всеки филм (знаем колко е броят на филмите -> имаме for цикъл) се прочитат два отделни реда:
        double maxRating = Double.MIN_VALUE;       //създаваме си променлива за най-висок рейтинг
        String filmWithTheHighestRating = "";         //създаваме си променлива за филма с най-висок рейтинг - в началото не знаем кой е той; променливата е от тип String и задаваме начална стойност празен String
        double minRating = Double.MAX_VALUE;       //създаваме си променлива за най-нисък рейтинг
        String filmWithTheLowestRating = "";          //създаваме си променлива за филма с най-нисък рейтинг - в началото не знаем кой е той; променливата е от тип String и задаваме начална стойност празен String
        double totalSumOfRatingsOfAllFilms = 0;            //създаваме си променлива за общата сума от рейтингите на всички филми
        for (int currentFilm = 1; currentFilm <= numberOfFilms; currentFilm++) {
            String nameOfCurrentFilm = scanner.nextLine();     //Име на филма – текст
            double ratingOfCurrentFilm = Double.parseDouble(scanner.nextLine());      //Рейтинг на филма - реално число в интервала [1.00…10.00]

            if (ratingOfCurrentFilm > maxRating) {
                maxRating = ratingOfCurrentFilm;       //намираме кой е най-високият рейтинг
                filmWithTheHighestRating = nameOfCurrentFilm;       //намираме филма с най-висок рейтинг
            }

            if (ratingOfCurrentFilm < minRating) {
                minRating = ratingOfCurrentFilm;        //намираме кой е най-ниският рейтинг
                filmWithTheLowestRating = nameOfCurrentFilm;        //намираме филма с най-нисък рейтинг
            }

            //намираме сумата от рейтингите на всички филми (трябва ни, за да изчислим средноаритметичния рейтинг)
            totalSumOfRatingsOfAllFilms += ratingOfCurrentFilm;       //totalSumOfRatingsOfAllFilms = totalSumOfRatingsOfAllFilms + ratingOfCurrentFilm;
        }


        System.out.printf("%s is with highest rating: %.1f%n", filmWithTheHighestRating, maxRating);        //принтираме филма с най-висок рейтинг (и рейтинга му)
        System.out.printf("%s is with lowest rating: %.1f%n", filmWithTheLowestRating, minRating);          //принтираме филма с най-нисък рейтинг (и рейтинга му)

        //намираме средноаритметичния рейтинг на всички филми и го принтираме:
        double averageRatingOfAllFilms = totalSumOfRatingsOfAllFilms / numberOfFilms;
        System.out.printf("Average rating: %.1f", averageRatingOfAllFilms);
    }
}
