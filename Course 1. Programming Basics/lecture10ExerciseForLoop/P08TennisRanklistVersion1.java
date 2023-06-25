package lecture10ExerciseForLoop;

import java.util.Scanner;

public class P08TennisRanklistVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата четем:
        int numberOfTournaments = Integer.parseInt(scanner.nextLine());           //Брой турнири, в които е участвал – цяло число в интервала [1…20]
        int initialPoints = Integer.parseInt(scanner.nextLine());             //Начален брой точки в ранглистата - цяло число в интервала [1...4000]

        int points = initialPoints;        //създаваме си променлива за точките, които е събрал тенисистът - задаваме начална стойност, но тя няма да е 0 в случая, тъй като тенисистът влиза в турнира с някакви първоначални точки

        int countWinner = 0;             //създаваме си променлива за броя на победите - задаваме начална стойност 0 в случая  - ще ни трябва и в цикъла, и извън него, затова я създаваме в main метода, но над цикъла (живот на променлива)

        int countFinalist = 0;           //създаваме си променлива за броя на финалите - задаваме начална стойност 0 в случая  - ще ни трябва и в цикъла, и извън него, затова я създаваме в main метода, но над цикъла (живот на променлива)

        int countSemiFinalist = 0;       //създаваме си променлива за броя на полуфиналите - задаваме начална стойност 0 в случая  - ще ни трябва и в цикъла, и извън него, затова я създаваме в main метода, но над цикъла (живот на променлива)

        for (int i = 1; i <= numberOfTournaments; i++) {              //цикълът ще се завърти толкова пъти, колкото е броят на турнирите
            String stageOfTournament = scanner.nextLine();        //на всяко завъртане на цикъла четем от конзолата достигнат етап от турнира – текст – "W"  winner, "F" - finalist или "SF" - semifinalist

            switch (stageOfTournament) {
                case "W":                        //W - ако е победител, получава 2000 точки
                    points = points + 2000;          //и точките, които има, са равни на точките до момента + спечелените от дадения турнир
                    countWinner++;    //броим победите - те са равни на победите до момента + 1   - това може да се запише и така:  countWinner = countWinner + 1;   инкрементация - увелич. стойността на променливата с единица
                    break;
                case "F":                        //F - ако е финалист, получава 1200 точки
                    points = points + 1200;
                    countFinalist++;   //броим финалите - те са равни на финалите до момента + 1   - това може да се запише и така:  countFinalist = countFinalist + 1;   инкрементация - увелич. стойността на променливата с единица
                    break;
                case "SF":                       //SF - ако е полуфиналист, получава 720 точки
                    points = points + 720;
                    countSemiFinalist++;   //броим полуфиналите - те са равни на полуфиналите до момента + 1   - това може да се запише и така:  countSemiFinalist = countSemiFinalist + 1;   инкрементация - увелич. стойността на променливата с единица
                    break;
            }

        }


        //брой победи от даден вид по спечелените точки за съответния вид турнир са общите точки от един вид турнир   -> събираме ги и намираме спечелените точки от турнирите (без първончалните точки)
        int pointsWithoutInitialPoints = (countWinner * 2000) + (countFinalist * 1200) + (countSemiFinalist * 720);
        double averagePointsFrom1Tournament = Math.floor(pointsWithoutInitialPoints * 1.0 / numberOfTournaments);  //изчисляваме колко точки средно печели на турнир (ако приемем, че на всички турнири печели по еднакъв брой точки) - делим общия брой точки (без първоначалните)  на броя турнири
        //закръгляме до най-лизкото цяло число надолу - така е по условие

        double percentOfWonTournaments = countWinner * 1.0 / numberOfTournaments * 100; //изчисляваме процента на спечелените турнири

        System.out.printf("Final points: %d%n", points);
        System.out.printf("Average points: %.0f%n", averagePointsFrom1Tournament);
        System.out.printf("%.2f%%", percentOfWonTournaments);
    }
}

