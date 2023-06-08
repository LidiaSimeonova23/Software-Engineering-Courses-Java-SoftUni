package lecture5MultidimensionalArrays;

import java.util.Scanner;

public class P04SumMatrixElementsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем от конзолата една матрица
        //четем брой редове и брой колони на матрицата
        String[] rowsAndColumnsOfMatrixArray = scanner.nextLine().split(", ");
        int rowsNumber = Integer.parseInt(rowsAndColumnsOfMatrixArray[0]);      //брой редове
        int columnsNumber = Integer.parseInt(rowsAndColumnsOfMatrixArray[1]);   //брой колони

        //създаваме си целочислена матрица (двумерен масив от цели числа) - всички елементи са с дефолтна стойност 0
        //ще извършваме аритметични операции, следователно сме длъжни да четем данните като числа (не могат да бъдат текстове)
        int[][] dataMatrix = new int[rowsNumber][columnsNumber];

        //четене на стойности за елементите на матрицата (присвояваме им стойности, които четем от конзолата)
        for (int row = 0; row < rowsNumber; row++) {        //for (int row = 0; row < dataMatrix.length; row++)        //for (int row = 0; row <= dataMatrix.length - 1; row++)
            String[] rowDataArray = scanner.nextLine().split(", ");

            for (int column = 0; column < columnsNumber; column++) {      //for (int column = 0; column < dataMatrix[row].length; column++)        //for (int column = 0; column <= dataMatrix[row].length - 1; column++)
                dataMatrix[row][column] = Integer.parseInt(rowDataArray[column]);
            }

        }

        int sumMatrixElements = 0;
        //2. намираме сумата от всички елементи на матрицата
        for (int row = 0; row < rowsNumber; row++) {        //for (int row = 0; row < dataMatrix.length; row++)        //for (int row = 0; row <= dataMatrix.length - 1; row++)
            for (int column = 0; column < columnsNumber; column++) {      //for (int column = 0; column < dataMatrix[row].length; column++)        //for (int column = 0; column <= dataMatrix[row].length - 1; column++)
                sumMatrixElements += dataMatrix[row][column];      //sumMatrixElements = sumMatrixElements + dataMatrix[row][column];
            }

        }


        //3. принтиране
        System.out.println(rowsNumber);
        System.out.println(columnsNumber);
        System.out.println(sumMatrixElements);
    }
}
