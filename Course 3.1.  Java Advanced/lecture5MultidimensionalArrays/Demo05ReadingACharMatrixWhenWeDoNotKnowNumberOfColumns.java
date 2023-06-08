package lecture5MultidimensionalArrays;

import java.util.Scanner;

public class Demo05ReadingACharMatrixWhenWeDoNotKnowNumberOfColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //например имаме следната матрица от символи - с 4 реда (не знаем на кой ред колко колони има)
        //4
        //r o ? s e M i
        //S o > f 1 i a 1 5
        //z
        //S o = i i l M


        //1. четене на матрица от символи, когато не знаем броя на колоните
        //прочитаме колко редове ще има матрицата     //4     - в случая имаме данни само за бр. редове (4)  //не знаем колко са колоните
        int rowsNumber = Integer.parseInt(scanner.nextLine());      //брой редове

        char[][] dataMatrix = new char[rowsNumber][];     //създаваме си матрица (двумерен масив) от символи - указваме брой редове, но не и брой колони

        //четене на входни данни
        for (int row = 0; row < rowsNumber; row++) {        //for (int row = 0; row < dataMatrix.length; row++)        //for (int row = 0; row <= dataMatrix.length - 1; row++)
            char[] rowDataArray = scanner.nextLine().toCharArray();      //четем ред от конзолата като текст и го превръщаме в масив от символи
            dataMatrix[row] = rowDataArray;      //на текущия ред от матрицата му присвояваме текущия прочетения масив rowDataArray
        }

        //2. принтиране на елементите на матрицата (присвоените входни данни)
        for (int row = 0; row < rowsNumber; row++) {
            for (int column = 0; column < dataMatrix[row].length; column++) {
                System.out.print(dataMatrix[row][column] + " ");
                //System.out.printf("%c ", dataMatrix[row][column]);
            }

            System.out.println();
        }

    }
}
