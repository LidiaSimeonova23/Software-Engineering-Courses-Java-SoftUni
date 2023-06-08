package lecture5MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Demo05ReadingAnIntegerMatrixWhenWeDoNotKnowNumberOfColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //например имаме следната матрица от цели числа с 4 реда (не знаем на кой ред колко колони има)
        //4
        //1 3 24 56
        //12 47 48 28 54 68
        //-7
        //-5 10 -15 20 -14 68

        //1. четене на матрица от цели числа, когато не знаем броя на колоните
        //прочитаме колко редове ще има матрицата     //4     - в случая имаме данни само за бр. редове (4)  //не знаем колко са колоните
        int rowsNumber = Integer.parseInt(scanner.nextLine());      //брой редове

        int[][] dataMatrix = new int[rowsNumber][];     //създаваме си целочислена матрица (двумерен масив от цели числа) - указваме брой редове, но не и брой колони

        //четене на входни данни
        for (int row = 0; row < rowsNumber; row++) {        //for (int row = 0; row < dataMatrix.length; row++)        //for (int row = 0; row <= dataMatrix.length - 1; row++)
            int[] rowDataArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            dataMatrix[row] = rowDataArray;  //на текущия ред от матрицата му присвояваме текущия прочетения масив rowDataArray
        }

        //2. принтиране на елементите на матрицата (присвоените входни данни)
        for (int row = 0; row < rowsNumber; row++) {
            for (int column = 0; column < dataMatrix[row].length; column++) {
                System.out.print(dataMatrix[row][column] + " ");
                //System.out.printf("%d ", dataMatrix[row][column]);
            }

            System.out.println();
        }

    }
}
