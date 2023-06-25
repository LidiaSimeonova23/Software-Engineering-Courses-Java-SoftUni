package moreExercisesDrawingFiguresWithLoops;

import java.util.Scanner;

public class P06RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете цяло положително число n, въведено от потребителя, и печата ромбче от звездички с размер n

        int number = Integer.parseInt(scanner.nextLine());

        //цикъл за горната половина от ромба
        for (int rows = 1; rows <= number; rows++) {
            for (int spaces = number - rows; spaces >= 1; spaces--) {            //this loop is for printing spaces
                System.out.print(" ");
            }

            for (int stars = 1; stars <= rows; stars++) {              //this loop is for printing stars
                System.out.print("* ");
            }


            System.out.println();
        }


        //цикъл за долната половина от ромба
        for (int rows = 1; rows <= number; rows++) {
            for (int spaces = 1; spaces <= rows; spaces++) {              //this loop is for printing spaces
                System.out.print(" ");
            }

            for (int stars = number - rows; stars >= 1; stars--) {            //this loop is for printing stars
                System.out.print("* ");
            }


            System.out.println();
        }


    }
}
