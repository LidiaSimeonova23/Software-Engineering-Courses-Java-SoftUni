package lecture5MultidimensionalArrays;

import java.util.Scanner;

public class Demo05ReadingAStringMatrixWhenWeDoNotKnowNumberOfColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //например имаме следната матрица от текстове - с 3 реда (не знаем на кой ред колко колони има)
        //3
        //rose Michael glory
        //Sofia 15 water 49.5 several >
        //So fight illusion s Mars captain capital abcd


        //1. четене на матрица от текстове, когато не знаем броя на колоните
        //прочитаме колко редове ще има матрицата     //3     - в случая имаме данни само за бр. редове (3)  //не знаем колко са колоните
        int rowsNumber = Integer.parseInt(scanner.nextLine());      //брой редове

        String[][] dataMatrix = new String[rowsNumber][];     //създаваме си матрица (двумерен масив) от текстове - указваме брой редове, но не и брой колони

        //четене на входни данни
        for (int row = 0; row < rowsNumber; row++) {        //for (int row = 0; row < dataMatrix.length; row++)        //for (int row = 0; row <= dataMatrix.length - 1; row++)
            String[] rowDataArray = scanner.nextLine().split(" ");

            dataMatrix[row] = rowDataArray;  //на текущия ред от матрицата му присвояваме текущия прочетения масив rowDataArray
        }

        //2. принтиране на елементите на матрицата (присвоените входни данни)
        for (int row = 0; row < rowsNumber; row++) {
            for (int column = 0; column < dataMatrix[row].length; column++) {
                System.out.print(dataMatrix[row][column] + " ");
                //System.out.printf("%s ", dataMatrix[row][column]);
            }

            System.out.println();
        }

    }
}
