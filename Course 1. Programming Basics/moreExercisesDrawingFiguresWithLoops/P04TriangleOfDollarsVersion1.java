package moreExercisesDrawingFiguresWithLoops;

import java.util.Scanner;

public class P04TriangleOfDollarsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете число n, въведено от потребителя, и печата триъгълник от долари

        int number = Integer.parseInt(scanner.nextLine());

        //искаме на даден пореден ред да имаме толкова на брой колони (първи ред - една колона, ..., осми ред - осем колони и т. нат.) - вложени цикли:
        for (int rows = 1; rows <= number; rows++) {           //за създаване на външния цикъл като име на променлива съм ползвала rows вместо i
            for (int columns = 1; columns <= rows; columns++) {         //за създ. на вътрешния цикъл като име на променлива съм ползвала columns вместо j
                System.out.print("$ ");
                //System.out.print("$" + " ");
                //System.out.printf("%s ", "$");
                //System.out.printf("%c ", '$');
            }

            System.out.println();     //сваляме курсора на нов ред
        }


    }
}
