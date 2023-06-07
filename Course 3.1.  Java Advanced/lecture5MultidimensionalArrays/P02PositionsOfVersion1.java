package lecture5MultidimensionalArrays;

import java.util.Scanner;

public class P02PositionsOfVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем от конзолата една матрица
        //четем брой редове и брой колони на матрицата
        String[] rowsAndColumnsOfMatrixArray = scanner.nextLine().split(" ");          //String[] rowsAndColumnsOfMatrixArray = scanner.nextLine().split("\\s+");
        int rowsOfMatrix = Integer.parseInt(rowsAndColumnsOfMatrixArray[0]);      //брой редове
        int columnsOfMatrix = Integer.parseInt(rowsAndColumnsOfMatrixArray[1]);   //брой колони

        //създаваме си целочислена матрица (двумерен масив от цели числа) - всички елементи са с дефолтна стойност 0
        int[][] matrix = new int[rowsOfMatrix][columnsOfMatrix];

        //четене на стойности за елементите на матрицата (присвояваме им стойности, които четем от конзолата)
        for (int row = 0; row < rowsOfMatrix; row++) {        //for (int row = 0; row < matrix.length; row++)        //for (int row = 0; row <= matrix.length - 1; row++)
            String[] rowNumbersArray = scanner.nextLine().split(" ");

            for (int column = 0; column < columnsOfMatrix; column++) {      //for (int column = 0; column < matrix[row].length; column++)        //for (int column = 0; column <= matrix[row].length - 1; column++)
                matrix[row][column] = Integer.parseInt(rowNumbersArray[column]);
            }

        }

        //2. четем от конзолата число (за което ще трябва да проверим дали се съдържа в матрицата)
        int number = Integer.parseInt(scanner.nextLine());

        //3. проверяваме дали прочетеното число се съдържа в матрицата - итерираме по всеки елемент от матрицата и го сравняваме с числото
        boolean isFound = false;        //създаваме променлива, кояо държи истината (приемаме, че прочетеното число не се съдържа в матрицата)
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                int currentElementOfMatrix = matrix[row][column];    //създаваме си променлива за текущия елемент на матрицата

                if (currentElementOfMatrix == number) {        //ако текущият елемент на матрицата съвпада с числото
                    isFound = true;
                    System.out.println(row + " " + column);       //принтираме индекс за ред и индекс за колона на текущия елемент, разделени със space
                    //System.out.printf("%d %d%n", row, column);
                }

            }
        }

        if (!isFound) {     //ако в матрицата не се съдържа прочетеното число
            System.out.println("not found");
        }


    }
}
