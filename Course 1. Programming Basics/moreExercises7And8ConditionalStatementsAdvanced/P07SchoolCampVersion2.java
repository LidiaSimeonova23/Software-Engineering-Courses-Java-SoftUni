package moreExercises7And8ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P07SchoolCampVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();      //Сезонът – текст - “Winter”, “Spring” или “Summer”;
        String groupType = scanner.nextLine();      //Видът на групата – текст - “boys”, “girls” или “mixed”;
        int numberOfPupils = Integer.parseInt(scanner.nextLine());       //Брой на учениците – цяло число в интервала [1 … 10000];
        int nightsCount = Integer.parseInt(scanner.nextLine());        //Брой на нощувките – цяло число в интервала [1 … 100].

        double priceOf1NightFor1Pupil = 0;
        String typeOfSport = "";
        if (season.equals("Winter")) {
            if (groupType.equals("boys")) {
                priceOf1NightFor1Pupil = 9.60;
                typeOfSport = "Judo";
            } else if (groupType.equals("girls")) {
                priceOf1NightFor1Pupil = 9.60;
                typeOfSport = "Gymnastics";
            } else if (groupType.equals("mixed")) {
                priceOf1NightFor1Pupil = 10;
                typeOfSport = "Ski";
            }
        } else if (season.equals("Spring")) {
            if (groupType.equals("boys")) {
                priceOf1NightFor1Pupil = 7.20;
                typeOfSport = "Tennis";
            } else if (groupType.equals("girls")) {
                priceOf1NightFor1Pupil = 7.20;
                typeOfSport = "Athletics";
            } else if (groupType.equals("mixed")) {
                priceOf1NightFor1Pupil = 9.50;
                typeOfSport = "Cycling";
            }
        } else if (season.equals("Summer")) {
            if (groupType.equals("boys")) {
                priceOf1NightFor1Pupil = 15;
                typeOfSport = "Football";
            } else if (groupType.equals("girls")) {
                priceOf1NightFor1Pupil = 15;
                typeOfSport = "Volleyball";
            } else if (groupType.equals("mixed")) {
                priceOf1NightFor1Pupil = 20;
                typeOfSport = "Swimming";
            }
        }


        double totalPriceOfAllNightsForAllPupils = (nightsCount * priceOf1NightFor1Pupil) * numberOfPupils;

        //Училището получава отстъпка от крайната цена в зависимост от броя на настанените в хотела ученици:
        if (numberOfPupils >= 50) {            //50% отстъпка
            totalPriceOfAllNightsForAllPupils = totalPriceOfAllNightsForAllPupils - (totalPriceOfAllNightsForAllPupils * 50 / 100);
        } else if (numberOfPupils >= 20) {          //else if (numberOfPupils >= 20 && numberOfPupils < 50)      //15% отстъпка
            totalPriceOfAllNightsForAllPupils = totalPriceOfAllNightsForAllPupils - (totalPriceOfAllNightsForAllPupils * 15 / 100);
        } else if (numberOfPupils >= 10) {               //5% отстъпка
            totalPriceOfAllNightsForAllPupils = totalPriceOfAllNightsForAllPupils - (totalPriceOfAllNightsForAllPupils * 5 / 100);
        }

        System.out.printf("%s %.2f lv.", typeOfSport, totalPriceOfAllNightsForAllPupils);
    }
}
