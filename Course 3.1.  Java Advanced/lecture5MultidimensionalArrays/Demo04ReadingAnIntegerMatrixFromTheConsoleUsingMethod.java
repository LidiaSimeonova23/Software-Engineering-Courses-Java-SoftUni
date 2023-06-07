package lecture5MultidimensionalArrays;

import java.util.Scanner;

public class Demo04ReadingAnIntegerMatrixFromTheConsoleUsingMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем от конзолата една матрица
        //четем брой редове и брой колони на матрицата
        int rowsOfMatrix = scanner.nextInt();     //брой редове
        int columnsOfMatrix = scanner.nextInt();   //брой колони

        //създаваме си целочислена матрица (двумерен масив от цели числа) - всички елементи са с дефолтна стойност 0
        int[][] matrix = new int[rowsOfMatrix][columnsOfMatrix];

        //четене на стойности за елементите на матрицата (присвояваме им стойности, които четем от конзолата)
        settingValuesOfMatrixElements(matrix, scanner);     //извикваме си метода, който създадохме (като аргументи му подаваме името на матрицата и скенера)

        //2. принтиране на елементите на матрицата
        printMatrixElements(matrix);  //извикваме си метода, който създадохме, и като аргумент му подаваме името на матрицата
    }


    private static void settingValuesOfMatrixElements(int[][] matrix, Scanner scanner) {    //създаваме си метод, чрез който на всеки елемент на матрицата му присвояваме стойност, която четем от конзолата (четене на входни данни)
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();           //на текущия елемент от матрицата му присвояваме като стойност прочетеното цяло число от конзолата
            }
        }
    }


    private static void printMatrixElements(int[][] matrix) {      //създаваме си метод, който принтира елементите на матрица
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");      //елементите от текущия ред на матрицата да се принтират на един ред с разстояние между тях
            }
            System.out.println(); //свали курсора на следващия ред
        }
    }


}
