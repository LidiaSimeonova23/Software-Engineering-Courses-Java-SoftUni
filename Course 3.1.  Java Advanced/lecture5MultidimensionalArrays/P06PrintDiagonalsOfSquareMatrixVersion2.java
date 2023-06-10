package lecture5MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06PrintDiagonalsOfSquareMatrixVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем от конзолата една квадратна матрица
        //четем брой редове на матрицата
        int size = Integer.parseInt(scanner.nextLine());      //брой редове  //брой колони  - защото е квадратна матрица

        //създаваме си целочислена матрица (двумерен масив от цели числа) - в този случай съм определила и брой редове, и брой колони
        int[][] dataMatrix = new int[size][size];      //всички редове са с дефолна стойност 0

        //четене на стойности за елементите на матрицата (присвояваме им стойности, които четем от конзолата)
        for (int row = 0; row < size; row++) {        //for (int row = 0; row < dataMatrix.length; row++)        //for (int row = 0; row <= dataMatrix.length - 1; row++)
            int[] currentRowArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();   //четем текущия ред с входни данни, който е масив

            for (int column = 0; column < size; column++) {
                dataMatrix[row][column] = currentRowArray[column];        //на текущия елемент на матрицата присвояваме като стойност текущия елемент от масива currentRowArray
            }

        }

        //първи начин за принтиране на първия диагонал (започва на първи ред, първа колона) в квадратна матрица
//        for (int row = 0; row < dataMatrix.length; row++) {
//            for (int column = 0; column < dataMatrix[row].length; column++) {
//                if (row == column) {     //ако индексът на текущия ред съвпада с индекса на текущата колона
//                    System.out.print(dataMatrix[row][column] + " ");
//                }
//            }
//        }
//        System.out.println();    //сваляме курсора на следващия ред (за да принтираме на нов ред елементите от втория диагонал)


        //втори начин за принтиране на първия диагонал (започва на първи ред, първа колона) в квадратна матрица - по-лесен е:
        for (int i = 0; i < dataMatrix.length; i++) {
            System.out.print(dataMatrix[i][i] + " ");          //текущият елемент от диагонала на квадратна матрица има има един и същи индекс за ред и за колона
        }
        System.out.println();    //сваляме курсора на следващия ред (за да принтираме на нов ред елементите от втория диагонал)


        //принтиране на втория диагонал (започва на последен ред, първа колона) в квадратна матрица
        for (int row = size - 1, column = 0; column < size; row--, column++) {    //в един for цикъл можем да дефинираме повече от една променлива    - int row = 0, column = 0;
            //вторият диагонал започва на последния ред (който е на индекс за ред size - 1 и на всяка итерация на цикъла редът намалява с 1, затова пишем row--)
            //вторият диагонал започва от първата колона /на последния ред/ - тя е на индекс за колона 0 (column = 0) и на всяка итерация на цикъла колоната се увеличава с 1 (column++)
            System.out.print(dataMatrix[row][column] + " ");
        }


    }
}

