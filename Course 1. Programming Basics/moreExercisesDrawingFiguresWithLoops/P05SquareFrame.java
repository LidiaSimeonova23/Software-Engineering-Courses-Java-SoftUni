package moreExercisesDrawingFiguresWithLoops;

import java.util.Scanner;

public class P05SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете цяло положително число n, въведено от потребителя, и чертае на конзолата квадратна рамка с размер n * n

        int number = Integer.parseInt(scanner.nextLine());


        //Подсказки:
        //•	Отпечатайте горната част: знак “+”, n-2 пъти знак “-”, знак “+”.
        //•	Отпечатайте средната част: в цикъл n-2 пъти печатайте знак “|”, n-2 пъти знак “-”, знак “|”.
        //•	Отпечатайте долната част: знак “+”, n-2 пъти знак “-”, знак “+”.


        //това е кодът за първия ред с всичките му колони:                   //+ - - +
        System.out.print("+ ");
        for (int i = 1; i <= number - 2; i++) {
            System.out.print("- ");
        }
        System.out.println("+ ");


        //това е кодът за средните редове с всичките им колони:              //| - - |
        for (int row = 1; row <= number - 2; row++) {    //за име на променливата ползвам row вместо i
            System.out.print("| ");
            for (int column = 1; column <= number - 2; column++) {      //за име на променливата ползвам column вместо j
                System.out.print("- ");
            }
            System.out.println("| ");
        }


        //това е кодът за последния ред с всичките му колони:                 //+ - - +
        System.out.print("+ ");
        for (int i = 1; i <= number - 2; i++) {
            System.out.print("- ");
        }
        System.out.println("+ ");


    }
}

