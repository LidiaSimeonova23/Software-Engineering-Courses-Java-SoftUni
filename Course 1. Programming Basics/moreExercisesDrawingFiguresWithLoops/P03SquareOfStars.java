package moreExercisesDrawingFiguresWithLoops;

import java.util.Scanner;

public class P03SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете число n, въведено от потребителя, и чертае квадрат от n * n звездички.
        //между всеки две звездички има по един интервал.

        int number = Integer.parseInt(scanner.nextLine());

        //трябва да принтираме квадрат с толкова колони, колкото са редовете му (прочетени от конзолата)
        for (int row = 1; row <= number; row++) {         //за да си построя цикъла, използвам за име на променливата row вместо  i
            for (int column = 1; column <= number; column++) {         //за да си построя цикъла, използвам за име на променливата column вместо j
                System.out.print("* ");
                //System.out.print("*" + " ");    //конкатенация (долепяне)
                //System.out.printf("%s ", "*");         //с форматирано принтиране - ако разглеждаме звездичката като промелива от тип String
                //System.out.printf("%c ", '*');          //с форматирано принтиране - ако разглеждаме звездичката като промелива от тип char
            }

            System.out.println();        //за да свалим курсора на следващия ред
        }

    }
}
