package lecture5MultidimensionalArrays;

import java.util.Scanner;

public class Demo03ReadingACharMatrixFromTheConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем брой редове и брой колони
        int rowsNumber = Integer.parseInt(scanner.nextLine());
        int columnsNumber = Integer.parseInt(scanner.nextLine());

        //2. създаваме си матрица (двумерен масив) от символи - всички елементи са с дефолтна стойност
        char[][] symbolsMatrix = new char[rowsNumber][columnsNumber];

        //3. четене на стойности за матрицата (присвояваме стойности на елементите й)
        for (int row = 0; row < rowsNumber; row++) {        //for (int row = 0; row < symbolsMatrix.length; row++)        //for (int row = 0; row <= symbolsMatrix.length - 1; row++)
            String[] rowDataArray = scanner.nextLine().split(" ");      //масив от текстове

            for (int column = 0; column < columnsNumber; column++) {      //for (int column = 0; column < symbolsMatrix[row].length; column++)        //for (int column = 0; column <= symbolsMatrix[row].length - 1; column++)
                symbolsMatrix[row][column] = (rowDataArray[column]).charAt(0);      //текущият елемент на масива rowDataArray е rowDataArray[column] и е от тип String    и чрез .charAt(0) го превръщаме в променлива от тип char
            }

        }


        //4. ако е нужно, принтираме елементите на матрицата:
        for (int row = 0; row < rowsNumber; row++) {
            for (int column = 0; column < columnsNumber; column++) {
                System.out.print(symbolsMatrix[row][column] + " ");
                //System.out.printf("%c ", symbolsMatrix[row][column]);

            }

            System.out.println();    //сваляме на нов ред (за да принтираме следващия ред с елементи на нов ред)
        }

    }
}
