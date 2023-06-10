package lecture5MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06PrintDiagonalsOfSquareMatrixVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем от конзолата една квадратна матрица
        //четем брой редове на матрицата
        int size = Integer.parseInt(scanner.nextLine());      //брой редове  //брой колони  - защото е квадратна матрица

        //създаваме си целочислена матрица (двумерен масив от цели числа) - в този случай съм определила само брой редове
        int[][] dataMatrix = new int[size][];      //не сме определили брой колони, а само брой редове - те се четат като текст, всички редове са с дефолна стойност null

        //четене на стойности за редовете на матрицата (присвояваме им стойности, които четем от конзолата)
        for (int row = 0; row < size; row++) {        //for (int row = 0; row < dataMatrix.length; row++)        //for (int row = 0; row <= dataMatrix.length - 1; row++)
            String[] columnDataArray = scanner.nextLine().split(" ");     //четем текущия ред с входни данни, който е масив от текстове
            int[] currentRowArray = Arrays.stream(columnDataArray).mapToInt(element -> Integer.parseInt(element)).toArray();    //превръщаме масива от String в int
            //вместо предишните 2 реда можеше само 1 ред:   int[] currentRowArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            dataMatrix[row] = currentRowArray;        //на текущия ред на матрицата присвояваме като стойност прочетения масив currentRowArray
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
            System.out.print(dataMatrix[i][i] + " ");         //текущият елемент от диагонала на квадратна матрица има има един и същи индекс за ред и за колона
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

