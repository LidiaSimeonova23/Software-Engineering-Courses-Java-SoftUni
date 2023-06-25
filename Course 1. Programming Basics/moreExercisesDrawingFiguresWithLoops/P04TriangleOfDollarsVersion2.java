package moreExercisesDrawingFiguresWithLoops;

import java.util.Scanner;

public class P04TriangleOfDollarsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете число n, въведено от потребителя, и печата триъгълник от долари

        int number = Integer.parseInt(scanner.nextLine());

        //искаме на даден пореден ред да имаме толкова на брой долари, колкото е поредността на реда - вложени цикли:
        for (int currentNumber = 1; currentNumber <= number; currentNumber++) {           //за създаване на външния цикъл като име на променлива съм ползвала currentNumber вместо i
            for (int times = 1; times <= currentNumber; times++) {         //за създ. на вътрешния цикъл като име на променлива съм ползвала times вместо j
                System.out.print("$ ");
                //System.out.print("$" + " ");
                //System.out.printf("%s ", "$");
                //System.out.printf("%c ", '$');
            }

            System.out.println();     //сваляме курсора на нов ред
        }


    }
}
