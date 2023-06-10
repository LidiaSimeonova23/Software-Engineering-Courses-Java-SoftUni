package lecture5MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06PrintDiagonalsOfSquareMatrixVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем от конзолата една квадратна матрица
        //четем брой редове на матрицата
        int size = Integer.parseInt(scanner.nextLine());      //брой редове  //брой колони  - защото е квадратна матрица

        //можем например да си създадем матрица от текстове (вместо да е целочислена матрица), защото с елементите на матрицата (въпреки че са числа) няма да извършваме аритм. операции и/или сравнения
        String[][] dataMatrix = new String[size][];      //в този случай съм определила само брой редове - те се четат като текст, всички редове са с дефолна стойност null

        //четене на стойности за редовете на матрицата (присвояваме им стойности, които четем от конзолата)
        for (int row = 0; row < size; row++) {        //for (int row = 0; row < dataMatrix.length; row++)        //for (int row = 0; row <= dataMatrix.length - 1; row++)
            String[] currentRowArray = scanner.nextLine().split("\\s+");     //четем текущия ред с входни данни, който е масив от текстове
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
        for (int row = 0; row < dataMatrix.length; row++) {
            System.out.print(dataMatrix[row][row] + " ");     //текущият елемент от диагонала на квадратна матрица има има един и същи индекс за ред и за колона
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

