package lecture12ExerciseWhileLoop;

import java.util.Scanner;

public class P07MovingVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //само веднъж (тоест идвън цикъла) ще прочетем:
        int width = Integer.parseInt(scanner.nextLine());           //Широчина на свободното пространство - цяло число в интервала [1...1000]
        int length = Integer.parseInt(scanner.nextLine());          //Дължина на свободното пространство - цяло число в интервала [1...1000]
        int height = Integer.parseInt(scanner.nextLine());          //Височина на свободното пространство - цяло число в интервала [1...1000]

        int space = width * length * height;    //намираме обема - цялото пространство в апартамента - в кубични метри

        boolean noMoreSpace = false;          //създаваме си булева променлива, която ни държи истината - с начална стойност false, за да се върти цикълът

        String input = scanner.nextLine();      //създаваме си променлива за входните данни, които ще четем на всяко завъртане на цикъла
        while (!input.equals("Done")) {             //докато входните данни са различни от Done, цикълът да се върти
            int boxes = Integer.parseInt(input);        //щом сме си осигурили, че входните данни са различи от Done, превърни ги в цяло число и ги запази в променлива от тип int - това ще са брой кашони, които се пренасят в квартирата - цяло число в интервала [1...10000]

            space = space - boxes;     //изчисляваме пространството, което остава незаето  (пространството до момента минус кутиите)
            //Един кашон е с точни размери:  1m. x 1m. x 1m.

            if (space <= 0) {              //ако не остане свободно пространство, цикълът да се прекъсне
                noMoreSpace = true;
                break;
            }

            input = scanner.nextLine();       //update-ваме - подканяме скенера да прочете входните данни на следващия ред (ако не го направим, ще имаме безкраен цикъл)
        }


        if (noMoreSpace) {                    //ако не остане свободно пространство, да се принтира колко куб. метра не достигат
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(space));            //осигуряваме си, че няма да е отриц. число
        } else {                              //ако остане свободно пространство, да се принтира колко куб. метра остават свободни/незаети
            System.out.printf("%d Cubic meters left.", space);
        }

    }
}
