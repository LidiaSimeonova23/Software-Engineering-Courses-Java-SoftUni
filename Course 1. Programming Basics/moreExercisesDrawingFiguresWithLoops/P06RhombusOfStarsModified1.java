package moreExercisesDrawingFiguresWithLoops;

import java.util.Scanner;

public class P06RhombusOfStarsModified1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете цяло положително число n, въведено от потребителя, и печата ромбче от звездички с размер n

        int number = Integer.parseInt(scanner.nextLine());

        for (int rowIncreasing = 1; rowIncreasing <= number; rowIncreasing++) {
            for (int columnIncreasing = 1; columnIncreasing <= rowIncreasing; columnIncreasing++) {
                System.out.print("* ");
            }

            System.out.println();
        }



        for (int rowDecreasing = number - 1; rowDecreasing >= 1; rowDecreasing--) {
            for (int columnDecreasing = rowDecreasing; columnDecreasing >= 1; columnDecreasing--) {
                System.out.print("* ");
            }

            System.out.println();
        }


    }
}
