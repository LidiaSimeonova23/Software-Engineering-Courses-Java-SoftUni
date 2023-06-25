package lecture14ExerciseNestedLoops;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());   //ще прочетем едно цяло число n от конзолата

        //външният цикъл ще определя колко реда да се отпечатат, а вътрешният – колко са колоните, тоест, колко числа се принтират на съответния ред:
        int number = 1;         //създаваме си променлива - цяло число - за числата, с начална стойност 1 (защото винаги ще почваме от 1)
        boolean isBigger = false;   //
        for (int rows = 1; rows <= n; rows++) {                  //за да преминем към следващия ред, трябва да са се извъртели всички колони
            for (int columns = 1; columns <= rows; columns++) {
                if (number > n) {                  //ако числото, което трябва да се принтира, е по-голямо от числото, прочетено от конзолата, да се прекъсне вътрешният цикъл
                    isBigger = true;
                    break;              //прекъсваме вътрешния цикъл
                }
                System.out.print(number + " ");       //искаме числата, които ще са на един ред, да се принтират едно след друго, като между тях има един празен space (празно разстояние)
                //System.out.printf("%d ", number);
                number++;        //number = number + 1;     //на следващата итерация числото се увеличава с единица
            }

            if (isBigger) {
                break;                   //прекъсваме и външния цикъл
            }

            System.out.println();    //за да свалим курсора на следващия ред
        }


    }
}
