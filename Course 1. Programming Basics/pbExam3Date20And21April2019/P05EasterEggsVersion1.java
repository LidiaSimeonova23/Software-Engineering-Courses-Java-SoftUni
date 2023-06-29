package pbExam3Date20And21April2019;

import java.util.Scanner;

public class P05EasterEggsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се чете 1 ред:
        int totalNumberOfPaintedEggs = Integer.parseInt(scanner.nextLine());        //Броят на боядисаните яйца – цяло число в интервала [1 ... 100]

        //За всяко яйце се чете цветът на яйцето – текст с възможности: "red", "orange", "blue", "green" -> знаем колко са итерациите -> for loop ще използваме
        int redEggsCount = 0;         //създаваме си променлива за броя на червените яйца
        int orangeEggsCount = 0;      //създаваме си променлива за броя на оранжевите яйца
        int blueEggsCount = 0;        //създаваме си променлива за броя на сините яйца
        int greenEggsCount = 0;       //създаваме си променлива за броя на зелените яйца

        for (int currentEgg = 1; currentEgg <= totalNumberOfPaintedEggs; currentEgg++) {
            String colourOfCurrentEgg = scanner.nextLine();

            switch (colourOfCurrentEgg) {
                case "red":        //ако цветът на яйцето е червен, броят на червените яйца се увеличава с единица
                    redEggsCount++;         //redEggsCount = redEggsCount + 1;      //redEggsCount += 1;
                    break;
                case "orange":     //ако цветът на яйцето е оранжев, броят на оранжевите яйца се увеличава с единица
                    orangeEggsCount++;
                    break;
                case "blue":       //ако цветът на яйцето е син, броят на сините яйца се увеличава с единица
                    blueEggsCount++;
                    break;
                case "green":      //ако цветът на яйцето е зелен, броят на зелените яйца се увеличава с единица
                    greenEggsCount++;
                    break;
            }

        }


        //в случая срявненията са извън цикъла, следователно единственият вариант е да ползваме Math.max()  метода, който сравнява две стойности и връща по-голямата от тях:
        int maxNumberBetweenRedAndOrangeEggs = Math.max(redEggsCount, orangeEggsCount);       //намираме кои яйца са повече (червените или оранжевите)
        int maxNumberBetweenBlueAndGreenEggs = Math.max(blueEggsCount, greenEggsCount);       //намираме кои яйца са повече (сините или зелените)
        int maxCount = Math.max(maxNumberBetweenRedAndOrangeEggs, maxNumberBetweenBlueAndGreenEggs);     //намираме кои яйца (с какъв цвят) са най-много
        //вместо предишните 3 реда може само този ред:    int maxCount = Math.max(Math.max(redEggsCount, orangeEggsCount), Math.max(blueEggsCount, greenEggsCount));

        String maxColor = "";       //създаваме си променлива за цвета на най-многото яйца (в началото не знаем кой е този цвят, затова задаваме начална стойност празен String)
        if (redEggsCount == maxCount) {                 //ако червените яйца са най-много, цветът на най-многото яйца е червен
            maxColor = "red";
        } else if (orangeEggsCount == maxCount) {       //или ако оранжевите яйца са най-много, цветът на най-многото яйца е оранжев
            maxColor = "orange";
        } else if (blueEggsCount == maxCount) {         //или ако сините яйца са най-много, цветът на най-многото яйца е син
            maxColor = "blue";
        } else {           //else if (greenEggsCount == maxCount)  //във всички останали случаи (тоест, ако зелените яйца са най-много), цветът на най-многото яйца е зелен
            maxColor = "green";
        }


        //за всеки цвят принтираме колко броя яйца са боядисани с такъв цвят
        System.out.printf("Red eggs: %d%n", redEggsCount);
        System.out.printf("Orange eggs: %d%n", orangeEggsCount);
        System.out.printf("Blue eggs: %d%n", blueEggsCount);
        System.out.printf("Green eggs: %d%n", greenEggsCount);

        //принтираме колко е максималният брой яйца, боядисани в един цвят, както и какъв цвят са най-многото яйца
        System.out.printf("Max eggs: %d -> %s", maxCount, maxColor);
    }
}
