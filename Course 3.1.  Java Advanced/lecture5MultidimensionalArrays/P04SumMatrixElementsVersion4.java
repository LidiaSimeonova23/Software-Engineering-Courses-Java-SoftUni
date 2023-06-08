package lecture5MultidimensionalArrays;

import java.util.Scanner;

public class P04SumMatrixElementsVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем от конзолата една матрица
        //четем брой редове и брой колони на матрицата
        String[] rowsAndColumnsOfMatrixArray = scanner.nextLine().split(", ");
        int rowsNumber = Integer.parseInt(rowsAndColumnsOfMatrixArray[0]);      //брой редове
        int columnsNumber = Integer.parseInt(rowsAndColumnsOfMatrixArray[1]);   //брой колони

        //създаваме си целочислена матрица (двумерен масив от цели числа) - всички елементи са с дефолтна стойност 0
        //ще извършваме аритметични операции, следователно сме длъжни да четем данните като числа (не могат да бъдат текстове)
        //int[][] dataMatrix = new int[rowsNumber][columnsNumber];      //конкретно в този случай тази стъпка можем да я пропуснем

        int sumMatrixElements = 0;

        //итерираме по редове и колони и намираме сумата от всички числа
        for (int row = 0; row < rowsNumber; row++) {        //for (int row = 0; row < dataMatrix.length; row++)        //for (int row = 0; row <= dataMatrix.length - 1; row++)
            String[] rowDataArray = scanner.nextLine().split(", ");

            for (int column = 0; column < columnsNumber; column++) {      //for (int column = 0; column < dataMatrix[row].length; column++)        //for (int column = 0; column <= dataMatrix[row].length - 1; column++)
                sumMatrixElements += Integer.parseInt(rowDataArray[column]);      //sumMatrixElements = sumMatrixElements + Integer.parseInt(rowDataArray[column]);
                //в случая дори не ни беше нужно да присвояваме стойност на текущия елемент на матрицата - пропуснахме умишлено тази стъпка (може и с нея, но не ни е нужна)
            }

        }

        //2. принтиране
        System.out.println(rowsNumber);
        System.out.println(columnsNumber);
        System.out.println(sumMatrixElements);
    }
}
