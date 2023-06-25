package lecture12ExerciseWhileLoop;

import java.util.Scanner;

public class P06CakeVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //веднъж ще прочетем от конзолата размерите на тортата:
        int width = Integer.parseInt(scanner.nextLine());          //широчина – цели числа в интервала [1...1000]
        int length = Integer.parseInt(scanner.nextLine());             //дължина – цели числа в интервала [1...1000]

        //Парчетата са квадратни с размер  1 см
        int cakePieces = width * length;            //намираме от колко на брой парчета е тортата (всъщност това е площта/лицето), като умножим шир. * дълж.


        boolean noMoreCake = false;       //създаваме си boolean променлива с начална стойност false, за да се върти цикълът
        String input = scanner.nextLine();    //създаваме си променлива за входните данни (могат да са цяло число или текст), които ще се четат на всяко завъртане на цикъла
        while (!input.equals("STOP")) {                  //докато входните данни са различни от Stop, цикълът да се върти
            int currentPieces = Integer.parseInt(input);             //щом сме си осигурили, че входните данни не са Stop, превръщай ги в цяло число и ги запази в променлива от тип int  - това са парчетата, които се взимат

            cakePieces = cakePieces - currentPieces;              //парчетата торта, които остават, са равни на парчетата до момента минус парчетата, които са взети

            if (cakePieces <= 0) {            //ако парчетата торта свършат (това става, когато са по-голямо или равно на 0), цикълът да се прекъсне
                noMoreCake = true;
                break;
            }

            input = scanner.nextLine();             //подканваме скенера да прочете следващия ред (ако не го направим, ще имаме безкраен цикъл, защото винаги ще чете само първия ред)
        }


        if (noMoreCake) {                    //ако парчетата са свършили, да се принтира колко не са достигнали
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));               //осигуряваме си, че няма да е отриц. число
        } else {                            //в противен случай (ако парчетата не са свършили), да се принтира колко са останали
            System.out.printf("%d pieces are left.", cakePieces);
        }

    }
}
