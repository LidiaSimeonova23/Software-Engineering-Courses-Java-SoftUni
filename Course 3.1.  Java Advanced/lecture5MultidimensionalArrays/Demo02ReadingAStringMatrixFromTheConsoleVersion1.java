package lecture5MultidimensionalArrays;

import java.util.Scanner;

public class Demo02ReadingAStringMatrixFromTheConsoleVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //например имаме следната матрица от текстове с 2 реда и 5 колони на всеки ред
        //2 5
        //Milen star exam Viki theory
        //Kati radio Nani TV street

        //четене на матрица от текстове
        //прочитаме колко редове и колко колони ще има матрицата     //2 5    - в случая данните за бр. редове (2) и бр. колони (5) са на един ред в конзолата
        String[] rowsAndColumnsArray = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(rowsAndColumnsArray[0]);      //брой редове
        int columns = Integer.parseInt(rowsAndColumnsArray[1]);   //брой колони

        String[][] inputDataMatrix = new String[rows][columns];     //създаваме си матрица от текстове (двумерен масив от текстове)

        //четене на входни данни
        for (int i = 0; i < rows; i++) {        //for (int i = 0; i < inputDataMatrix.length; i++)        //for (int i = 0; i <= inputDataMatrix.length - 1; i++)
            String[] rowNumbersArray = scanner.nextLine().split(" ");

            for (int j = 0; j < columns; j++) {      //for (int j = 0; j < inputDataMatrix[i].length; j++)        //for (int j = 0; j <= inputDataMatrix[i].length - 1; j++)
                inputDataMatrix[i][j] = rowNumbersArray[j];
            }

        }

        //принтиране на елементите на матрицата (присвоените входни данни)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(inputDataMatrix[i][j] + " ");
            }

            System.out.println();
        }

    }
}
