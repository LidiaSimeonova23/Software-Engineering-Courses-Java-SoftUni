package moreExercisesDrawingFiguresWithLoops;

import java.util.Scanner;

public class P07ChristmasTreeVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете число n (1 ≤ n ≤ 100), въведено от потребителя, и печата коледна елха с размер n

        int number = Integer.parseInt(scanner.nextLine());


        for (int rows = 0; rows <= number; rows++) {       //for (int rows = 1; rows <= number + 1; rows++)
            for (int spaces = number - rows; spaces >= 1; spaces--) {            //this loop is for printing spaces
                System.out.print(" ");
            }


            for (int stars = 0; stars <= rows - 1; stars++) {              //this loop is for printing stars
                System.out.print("*");
            }


            System.out.print(" | ");       //printing a straight line


            for (int stars = 0; stars <= rows - 1; stars++) {              //this loop is for printing stars
                System.out.print("*");
            }



            System.out.println();       //за да отиде курсорът в началото на следващия ред
        }


    }
}


