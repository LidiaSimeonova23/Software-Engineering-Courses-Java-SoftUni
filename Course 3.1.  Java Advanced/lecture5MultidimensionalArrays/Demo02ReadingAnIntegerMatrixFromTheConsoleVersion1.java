package lecture5MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Demo02ReadingAnIntegerMatrixFromTheConsoleVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //например имаме следната матрица от цели числа с 4 реда и 6 колони на всеки ред
        //4 6
        //1 2 3 4 5 6
        //12 47 48 28 54 68
        //-7 -9 -5 -18 -104 -37
        //-5 10 -15 20 -14 68

        //четене на матрица от цели числа
        //прочитаме колко редове и колко колони ще има матрицата     //4 6    - в случая данните за бр. редове (4) и бр. колони (6) са на един ред в конзолата
        String[] partsArray = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(partsArray[0]);      //брой редове
        int columns = Integer.parseInt(partsArray[1]);   //брой колони

        int[][] dataMatrix = new int[rows][columns];     //създаваме си целочислена матрица (двумерен масив от цели числа)

        //четене на входни данни
        for (int i = 0; i < rows; i++) {        //for (int i = 0; i < dataMatrix.length; i++)        //for (int i = 0; i <= dataMatrix.length - 1; i++)
            String[] rowNumbersArray = scanner.nextLine().split(" ");

            for (int j = 0; j < columns; j++) {      //for (int j = 0; j < dataMatrix[i].length; j++)        //for (int j = 0; j <= dataMatrix[i].length - 1; j++)
                dataMatrix[i][j] = Integer.parseInt(rowNumbersArray[j]);
            }

        }

        //принтиране на елементите на матрицата (присвоените входни данни)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(dataMatrix[i][j] + " ");
            }

            System.out.println();
        }

    }
}
