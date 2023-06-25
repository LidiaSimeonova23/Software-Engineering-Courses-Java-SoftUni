package moreExercisesDrawingFiguresWithLoops;

import java.util.Scanner;

public class P08Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете цяло число n (3 ≤ n ≤ 100), въведено от потребителя, и печата слънчеви очила с размер 5*n x n

        int number = Integer.parseInt(scanner.nextLine());


        //това е кодът за първия ред с всичките му колони:
        for (int i = 1; i <= 2 * number; i++) {             //за звездичките отляво на първия ред
            System.out.print("*");
        }

        for (int i = 1; i <= number; i++) {        //за space-овете в средата на първия ред
            System.out.print(" ");
        }


        for (int i = 1; i <= 2 * number; i++) {            //за звездичките отдясно на първия ред
            System.out.print("*");
        }

        System.out.println();    //за да свалим курсора на следващия ред


        //това е кодът за средните редове с всичките им колони:
        for (int row = 1; row <= number - 2; row++) {    //за име на променливата ползвам row вместо i
            System.out.print("*");        //за първата звездичка в началото на всички средни редове
            for (int column = 1; column <= (2 * number) - 2; column++) {      //за име на променливата ползвам column вместо j
                System.out.print("/");
            }
            System.out.print("*");        //за последната звездичка (тази, която е преди space-овете на всички средни редове) от лявата страна на очилата


            if (number % 2 != 0 && row == number / 2) {                  //ако числото, прочетено от конзолата е нечетно, и текущият ред е средният, там ще принтираме изправени черти (вместо space-ове)
                for (int i = 1; i <= number; i++) {
                    System.out.print("|");
                }
            } else if (number % 2 == 0 && row == (number / 2) - 1) {        //ако числото, прочетено от конзолата е четно, и текущият ред е този преди средният, там ще принтираме изправени черти (вместо space-ове)
                for (int i = 1; i <= number; i++) {
                    System.out.print("|");
                }
            } else {          //във всички останали случаи принтираме space-ове в средата на средните редове
                for (int i = 1; i <= number; i++) {
                    System.out.print(" ");
                }
            }

            System.out.print("*");         //за първата звездичка (в началото на дясната половина на очилата) на всички средни редове
            for (int column = 1; column <= (2 * number) - 2; column++) {      //за име на променливата ползвам column вместо j    //за наклонените чертички (в дясната част на очилата) на всички средни редове
                System.out.print("/");
            }
            System.out.println("*");        //за последната звездичка (на дясната половина на очилата) на всички средни редове
        }


        //това е кодът за последния ред с всичките му колони:
        for (int i = 1; i <= 2 * number; i++) {            //за звездичките отляво на последния ред
            System.out.print("*");
        }

        for (int i = 1; i <= number; i++) {          //за space-овете в средата на последния ред
            System.out.print(" ");
        }


        for (int i = 1; i <= 2 * number; i++) {           //за звездичките отдясно на последния ред
            System.out.print("*");
        }


    }
}
