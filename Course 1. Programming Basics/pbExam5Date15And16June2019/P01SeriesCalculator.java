package pbExam5Date15And16June2019;

import java.util.Scanner;

public class P01SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 4 реда:
        String nameOfSerial = scanner.nextLine();       //Име на сериал - текст
        int seasonsCount = Integer.parseInt(scanner.nextLine());        //Брой сезони – цяло число в диапазона [1… 10]
        int numberOfEpisodesPerSeason = Integer.parseInt(scanner.nextLine());       //Брой епизоди  – цяло число в диапазона [10… 80]
        double durationOf1OrdinaryEpisode = Double.parseDouble(scanner.nextLine());       //Времетраене на обикновен епизод без рекламите – реално число в диапазона [40.0… 65.0]


        //намираме общия брой епизоди (общо от всички сезони):
        int totalNumberOfEpisodesForAllSeasons = seasonsCount * numberOfEpisodesPerSeason;

        //Във всеки епизод има реклами, които са с продължителност 20% от времето на един епизод.
        double durationOfCommercialsFor1Episode = durationOf1OrdinaryEpisode * 20 / 100;

        //всеки сезон завършва със специален епизод, който е с 10 мин. по-дълъг от обичайното
        double durationOf1SpecialEpisode = durationOf1OrdinaryEpisode + 10;

        //всеки сезон завършва със специален епизод, значи броят на специалните епизоди е равен на броя на сезоните
        double timeNeededForAllSpecialEpisodes = seasonsCount * (durationOf1SpecialEpisode + durationOfCommercialsFor1Episode);

        //намираме броя на обикновените епизоди:
        int numberOfOrdinaryEpisodes = totalNumberOfEpisodesForAllSeasons - seasonsCount;

        //намираме нужното време за всички обикновени епизоди:
        double timeNeededForAllOrdinaryEpisodes = numberOfOrdinaryEpisodes * (durationOf1OrdinaryEpisode + durationOfCommercialsFor1Episode);

        //намираме общото време за всички епизоди (и обикновените, и специалните), закръглено до най-близкото цяло число надолу :
        double timeForAllEpisodes = timeNeededForAllOrdinaryEpisodes + timeNeededForAllSpecialEpisodes;
        timeForAllEpisodes = Math.floor(timeForAllEpisodes);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", nameOfSerial, timeForAllEpisodes);
    }
}
