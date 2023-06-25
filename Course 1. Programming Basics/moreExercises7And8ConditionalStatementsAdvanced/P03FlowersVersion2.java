package moreExercises7And8ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P03FlowersVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemumsCount = Integer.parseInt(scanner.nextLine());           //броят на закупените хризантеми – цяло число в интервала [0 ... 200]
        int rosesCount = Integer.parseInt(scanner.nextLine());          //броят на закупените рози – цяло число в интервала [0 ... 200]
        int tulipsCount = Integer.parseInt(scanner.nextLine());       //броят на закупените лалета – цяло число в интервала [0 ... 200]
        String season = scanner.nextLine();        //сезона – [Spring, Summer, Autumn, Winter]
        String ifTheDayIsHoliday = scanner.nextLine();           //дали денят е празник – [Y – да / N - не]

        double chrysanthemumPrice = 0;
        double rosePrice = 0;
        double tulipPrice = 0;
        if (season.equals("Spring") || season.equals("Summer")) {
            chrysanthemumPrice = 2.00;
            rosePrice = 4.10;
            tulipPrice = 2.50;
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            chrysanthemumPrice = 3.75;
            rosePrice = 4.50;
            tulipPrice = 4.15;
        }

        //В празнични дни цените на всички цветя се увеличават с 15%.
        if (ifTheDayIsHoliday.equals("Y")) {
            chrysanthemumPrice = chrysanthemumPrice + (chrysanthemumPrice * 15 / 100);
            rosePrice = rosePrice + (rosePrice * 15 / 100);
            tulipPrice = tulipPrice + (tulipPrice * 15 / 100);
        }


        double finalSum = (chrysanthemumsCount * chrysanthemumPrice) + (rosesCount * rosePrice) + (tulipsCount * tulipPrice);    //цена на целия букет

        //•	За закупени повече от 7 лалета през пролетта – има отстъпка, която е 5% от цената на целия букет.
        if (tulipsCount > 7 && season.equals("Spring")) {
            finalSum = finalSum - (finalSum * 5 / 100);
        }

        //•	За закупени 10 или повече рози през зимата – има отстъпка, която е 10% от цената на целия букет.
        if (rosesCount >= 10 && season.equals("Winter")) {
            finalSum = finalSum - (finalSum * 10 / 100);
        }

        //•	За закупени повече от 20 цветя общо през всички сезони – има отстъпка, която е 20% от цената на целият букет.
        if (chrysanthemumsCount + rosesCount + tulipsCount > 20) {
            finalSum = finalSum - (finalSum * 20 / 100);
        }

        //Цената за аранжиране на букета винаги е 2 лв.
        double totalSum = finalSum + 2;
        System.out.printf("%.2f", totalSum);
    }
}
