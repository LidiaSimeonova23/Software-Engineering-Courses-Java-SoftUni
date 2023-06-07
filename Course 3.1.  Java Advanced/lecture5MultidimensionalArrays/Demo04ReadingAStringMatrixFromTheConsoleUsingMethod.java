package lecture5MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Demo04ReadingAStringMatrixFromTheConsoleUsingMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем от конзолата една матрица
        //четем брой редове и брой колони на матрицата
        int[] rowsAndColumnsOfMatrixArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rowsOfMatrix = rowsAndColumnsOfMatrixArray[0];      //брой редове
        int columnsOfMatrix = rowsAndColumnsOfMatrixArray[1];   //брой колони

        //създаваме си матрица от текстове (двумерен масив от текстове) - всички елементи са с дефолтна стойност null - тези текстове всъщност са числа, но няма да извършваме аритметични операции и/или сравнения с тях
        String[][] matrix = new String[rowsOfMatrix][columnsOfMatrix];

        //четене на стойности за елементите на матрицата (присвояваме им стойности, които четем от конзолата)
        settingValuesOfMatrixElements(matrix, scanner);         //извикваме си метода, който създадохме (като аргументи му подаваме името на матрицата и скенера)

        //2. принтиране на елементите на матрицата
        printMatrixElements(matrix);       //извикваме си метода, който създадохме, и като аргумент му подаваме името на матрицата


    }


    private static void settingValuesOfMatrixElements(String[][] matrix, Scanner scanner) {      //създаваме си метод, чрез който на всеки елемент на матрицата му присвояваме стойност, която четем от конзолата (четене на входни данни)
        for (int row = 0; row < matrix.length; row++) {
            //scanner.nextLine() -> "1 2 3"
            //scanner.nextLine().split(" ") -> ["1", "2", "3"]
            matrix[row] = scanner.nextLine().split("\\s+");        //на текущия ред от матрицата му присвояваме като стойност прочетения текст от конзолата
        }
    }


    private static void printMatrixElements(String[][] matrix) {      //създаваме си метод, който принтира елементите на матрица
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");        //елементите от текущия ред на матрицата да се принтират на един ред с разстояние между тях
            }
            System.out.println(); //свали курсора на следващия ред
        }
    }

}
