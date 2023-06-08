package lecture5MultidimensionalArrays;

import java.util.Scanner;

public class Demo04ReadingACharMatrixFromTheConsoleUsingMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем брой редове и брой колони
        int rowsNumber = Integer.parseInt(scanner.nextLine());
        int columnsNumber = Integer.parseInt(scanner.nextLine());

        //2. създаваме си матрица (двумерен масив) от символи - всички елементи са с дефолтна стойност
        char[][] symbolsMatrix = new char[rowsNumber][columnsNumber];

        //четене на стойности за елементите на матрицата (присвояваме им стойности, които четем от конзолата)
        settingValuesOfMatrixElements(symbolsMatrix, scanner);     //извикваме си метода, който създадохме (като аргументи му подаваме името на матрицата и скенера)

        //2. ако е нужно, принтираме елементите на матрицата
        printMatrixElements(symbolsMatrix);  //извикваме си метода, който създадохме, и като аргумент му подаваме името на матрицата
    }


    private static void settingValuesOfMatrixElements(char[][] matrix, Scanner scanner) {    //създаваме си метод, чрез който на всеки елемент на матрицата му присвояваме стойност, която четем от конзолата (четене на входни данни)
        for (int row = 0; row < matrix.length; row++) {
            String[] rowDataArray = scanner.nextLine().split(" ");

            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = rowDataArray[column].charAt(0);     //текущият елемент на масива rowDataArray е rowDataArray[column] и е от тип String    и чрез .charAt(0) го превръщаме в променлива от тип char
            }
        }
    }

    private static void printMatrixElements(char[][] matrix) {       //създаваме си метод, който принтира елементите на матрица
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");        //елементите от текущия ред на матрицата да се принтират на един ред с разстояние между тях
            }
            System.out.println();      //сваляме курсора на следващия ред
        }
    }

}
