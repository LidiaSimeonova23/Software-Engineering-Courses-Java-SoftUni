package pbExam2Date18And19July2020;

import java.util.Scanner;

public class P04BallsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се чете 1 цяло число N, което е броят на топките в диапазон (0-1000).
        int numberOfBalls = Integer.parseInt(scanner.nextLine());


        //След това се четат N на брой цветове.   -> знаем колко ще са итерациите -> for цикъл
        int numberOfRedBalls = 0;        //създаваме си променлива за броя на червените топки
        int numberOfOrangeBalls = 0;     //създаваме си променлива за броя на оранжевите топки
        int numberOfYellowBalls = 0;     //създаваме си променлива за броя на жълтите топки
        int numberOfWhiteBalls = 0;      //създаваме си променлива за броя на белите топки
        int numberOfBlackBalls = 0;      //създаваме си променлива за броя на черните топки
        int numberOfOtherBalls = 0;      //създаваме си променлива за броя на останалите (с цветове, различни от изброените) топки
        double points = 0;     //създаваме си променлива за броя на точките от всички топки

        for (int currentBall = 1; currentBall <= numberOfBalls; currentBall++) {
            String colourOfCurrentBall = scanner.nextLine();

            switch (colourOfCurrentBall) {
                case "red":       //Ако топката е “red”, точките ни се повишават с 5.
                    numberOfRedBalls++;      //броят на червените топки нараства с единица      //numberOfRedBalls = numberOfRedBalls + 1;        //numberOfRedBalls += 1;
                    points += 5;      //points = points + 5;
                    break;
                case "orange":    //Ако топката е “orange”, точките ни се повишават с 10.
                    numberOfOrangeBalls++;
                    points += 10;
                    break;
                case "yellow":    //Ако топката е “yellow”, точките ни се повишават с 15.
                    numberOfYellowBalls++;
                    points += 15;
                    break;
                case "white":     //Ако топката е “white”, точките ни се повишават с 20.
                    numberOfWhiteBalls++;
                    points += 20;
                    break;
                case "black":     //Ако топката е “black”, точките ни се делят на 2, като закръгляме към по-малкото цяло число.
                    numberOfBlackBalls++;
                    points /= 2;         // points = points / 2;
                    points = Math.floor(points);
                    break;
                default:          //Ако топката е с какъвто и да е цвят, различен от по-горните, точките не се манипулират и програмата продължава да работи.
                    numberOfOtherBalls++;
                    break;
            }

        }


        System.out.printf("Total points: %.0f%n", points);
        System.out.printf("Red balls: %d%n", numberOfRedBalls);
        System.out.printf("Orange balls: %d%n", numberOfOrangeBalls);
        System.out.printf("Yellow balls: %d%n", numberOfYellowBalls);
        System.out.printf("White balls: %d%n", numberOfWhiteBalls);
        System.out.printf("Other colors picked: %d%n", numberOfOtherBalls);
        System.out.printf("Divides from black balls: %d%n", numberOfBlackBalls);        //System.out.printf("Divides from black balls: %d", numberOfBlackBalls);
    }
}
