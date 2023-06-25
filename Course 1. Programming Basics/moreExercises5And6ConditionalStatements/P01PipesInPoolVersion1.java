package moreExercises5And6ConditionalStatements;

import java.util.Scanner;

public class P01PipesInPoolVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityOfPoolInLitres = Integer.parseInt(scanner.nextLine());      //V – Обем на басейна в литри – цяло число в интервала [1…10000].
        int debitOfFirstPipeFor1Hour = Integer.parseInt(scanner.nextLine());       //P1 – дебит на първата тръба за час – цяло число в интервала [1…5000].
        int debitOfSecondPipeFor1Hour = Integer.parseInt(scanner.nextLine());        //P2 – дебит на втората тръба за час – цяло число в интервала [1…5000].
        double timeWhenWorkerIsAbsent = Double.parseDouble(scanner.nextLine());      //H – часовете, които работникът отсъства – реално число в интервала [1.0…24.00]

        double realLitresOfWaterInPool = (timeWhenWorkerIsAbsent * debitOfFirstPipeFor1Hour) + (timeWhenWorkerIsAbsent * debitOfSecondPipeFor1Hour);

        double differenceInVolume = Math.abs(capacityOfPoolInLitres - realLitresOfWaterInPool);
        if (realLitresOfWaterInPool > capacityOfPoolInLitres) {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", timeWhenWorkerIsAbsent, differenceInVolume);
        } else if (realLitresOfWaterInPool <= capacityOfPoolInLitres) {
            double poolFillingInPercentages = realLitresOfWaterInPool * 100/ capacityOfPoolInLitres;
            double waterFromFirstPipeInPercentages = (timeWhenWorkerIsAbsent * debitOfFirstPipeFor1Hour) / realLitresOfWaterInPool * 100;         //намираме процент вода от първата тръба
            double waterFromSecondPipeInPercentages = (timeWhenWorkerIsAbsent * debitOfSecondPipeFor1Hour) / realLitresOfWaterInPool * 100;       //намираме процент вода от втората тръба
            //double waterFromSecondPipeInPercentages = (realLitresOfWaterInPool - (timeWhenWorkerIsAbsent * debitOfFirstPipeFor1Hour)) / realLitresOfWaterInPool * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", poolFillingInPercentages, waterFromFirstPipeInPercentages, waterFromSecondPipeInPercentages);
        }

    }
}
