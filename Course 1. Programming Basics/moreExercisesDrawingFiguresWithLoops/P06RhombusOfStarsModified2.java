package moreExercisesDrawingFiguresWithLoops;

import java.util.Scanner;

public class P06RhombusOfStarsModified2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете цяло положително число n, въведено от потребителя, и печата ромбче от звездички с размер n

        int number = Integer.parseInt(scanner.nextLine());


        for (int currentNumber = 1; currentNumber <= number; currentNumber++) {
            for (int spaces = 1; spaces <= currentNumber; spaces++) {    // this loop is for printing spaces
                System.out.print(" ");
            }

            for (int stars = 1; stars <= number; stars++) {    // this loop is for printing stars
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
