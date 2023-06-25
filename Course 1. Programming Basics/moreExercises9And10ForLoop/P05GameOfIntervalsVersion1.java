package moreExercises9And10ForLoop;

import java.util.Scanner;

public class P05GameOfIntervalsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSteps = Integer.parseInt(scanner.nextLine());         //колко хода ще има по време на играта – цяло число в интервала [1...100]

        double result = 0;
        int numbersCountInTheIntervalFrom0To9 = 0;      //създ. променлива за брой на числата в диапазона от 0 до 9
        int numbersCountInTheIntervalFrom10To19 = 0;
        int numbersCountInTheIntervalFrom20To29 = 0;
        int numbersCountInTheIntervalFrom30To39 = 0;
        int numbersCountInTheIntervalFrom40To50 = 0;
        int invalidNumbersCount = 0;        //създ. променлива за брой на невалидните числа (отрицателните и тези над 50)
        for (int step = 1; step <= numberOfSteps; step++) {          //за да си построя цикъла, съм използвала за име на променливата step вместо i
            int currentNumberCarryingPoints = Integer.parseInt(scanner.nextLine());    //•	За всеки ход – числата, които се проверяват, в кой интервал са – цели числа в интервала [-100...100]

            double points = 0;
            boolean isValid = true;      //създаваме си булева променлива, която да държи истината (числото е валидно по подразбиране - тоест, ако е в интервала от 0 до 50 включит.)
            if (currentNumberCarryingPoints >= 0 && currentNumberCarryingPoints <= 9) {        //ако числото е от 0 до 9  точките са 20 % от числото
                numbersCountInTheIntervalFrom0To9++;        //numbersCountInTheIntervalFrom0To9 = numbersCountInTheIntervalFrom0To9 + 1;         //numbersCountInTheIntervalFrom0To9 += 1;
                points = currentNumberCarryingPoints * 20 * 0.01;          //points = currentNumberCarryingPoints * 1.0 * 20 / 100;
            } else if (currentNumberCarryingPoints >= 10 && currentNumberCarryingPoints <= 19) {            //ако числото е от 10 до 19  точките са 30 % от числото
                numbersCountInTheIntervalFrom10To19++;
                points = currentNumberCarryingPoints * 30 * 0.01;
            } else if (currentNumberCarryingPoints >= 20 && currentNumberCarryingPoints <= 29) {        //ако числото е от 20 до 29  точките са 40 % от числото
                numbersCountInTheIntervalFrom20To29++;
                points = currentNumberCarryingPoints * 40 * 0.01;
            } else if (currentNumberCarryingPoints >= 30 && currentNumberCarryingPoints <= 39) {         //ако числото е от 30 до 39  50 точки
                numbersCountInTheIntervalFrom30To39++;
                points = 50;
            } else if (currentNumberCarryingPoints >= 40 && currentNumberCarryingPoints <= 50) {              //ако числото е от 40 до 50  100 точки
                numbersCountInTheIntervalFrom40To50++;
                points = 100;
            } else {    //else if (currentNumberCarryingPoints < 0 || currentNumberCarryingPoints > 50)     //резултатът се дели на 2
                isValid = false;
                invalidNumbersCount++;
            }


            if (isValid) {           //ако текущото число е валидно, към резултата прибавяме точките и резултатът се увеличава
                result = result + points;
            } else {     //else if (!isValid)       //ако текущото число е невалидно, делим резултата на 2 (и резултатът намалява)
                result = result / 2;
            }

        }


        System.out.printf("%.2f%n", result);

        //процентът на числата в даден диапазон е равен на броя на числата в дадения диапазон, делено на общия брой на всички числа (а общият брой на всички числа е равен на брой ходове), умножено по 100
        double percentageOfNumbersInTheIntervalFrom0To9 = numbersCountInTheIntervalFrom0To9 * 1.0 / numberOfSteps * 100;
        System.out.printf("From 0 to 9: %.2f%%%n", percentageOfNumbersInTheIntervalFrom0To9);

        double percentageOfNumbersInTheIntervalFrom10To19 = numbersCountInTheIntervalFrom10To19 * 1.0 / numberOfSteps * 100;
        System.out.printf("From 10 to 19: %.2f%%%n", percentageOfNumbersInTheIntervalFrom10To19);

        double percentageOfNumbersInTheIntervalFrom20To29 = numbersCountInTheIntervalFrom20To29 * 1.0 / numberOfSteps * 100;
        System.out.printf("From 20 to 29: %.2f%%%n", percentageOfNumbersInTheIntervalFrom20To29);

        double percentageOfNumbersInTheIntervalFrom30To39 = numbersCountInTheIntervalFrom30To39 * 1.0 / numberOfSteps * 100;
        System.out.printf("From 30 to 39: %.2f%%%n", percentageOfNumbersInTheIntervalFrom30To39);

        double percentageOfNumbersInTheIntervalFrom40To50 = numbersCountInTheIntervalFrom40To50 * 1.0 / numberOfSteps * 100;
        System.out.printf("From 40 to 50: %.2f%%%n", percentageOfNumbersInTheIntervalFrom40To50);

        double percentageOfInvalidNumbers = invalidNumbersCount * 1.0 / numberOfSteps * 100;
        System.out.printf("Invalid numbers: %.2f%%", percentageOfInvalidNumbers);
    }
}
