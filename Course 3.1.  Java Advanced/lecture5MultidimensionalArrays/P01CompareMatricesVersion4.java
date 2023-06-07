package lecture5MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P01CompareMatricesVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем от конзолата първата матрица
        //четем брой редове и брой колони на първата матрица
        int[] rowsAndColumnsFirstMatrixArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rowsFirstMatrix = rowsAndColumnsFirstMatrixArray[0];      //брой редове
        int columnsFirstMatrix = rowsAndColumnsFirstMatrixArray[1];   //брой колони

        //създаваме си първата целочислена матрица (двумерен масив от цели числа) - всички елементи са с дефолтна стойност 0
        int[][] firstMatrix = new int[rowsFirstMatrix][columnsFirstMatrix];

        //четене на елементи за първата матрица (присвояваме им стойности)
        for (int i = 0; i < rowsFirstMatrix; i++) {        //for (int i = 0; i < firstMatrix.length; i++)        //for (int i = 0; i <= firstMatrix.length - 1; i++)
            int[] rowNumbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int j = 0; j < columnsFirstMatrix; j++) {      //for (int j = 0; j < firstMatrix[i].length; j++)        //for (int j = 0; j <= firstMatrix[i].length - 1; j++)
                firstMatrix[i][j] = rowNumbersArray[j];
            }

        }


        //2. четем от конзолата втората матрица
        //четем брой редове и брой колони на втората матрица
        int[] rowsAndColumnsSecondMatrixArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rowsSecondMatrix = rowsAndColumnsSecondMatrixArray[0];      //брой редове
        int columnsSecondMatrix = rowsAndColumnsSecondMatrixArray[1];   //брой колони

        //създаваме си втората целочислена матрица (двумерен масив от цели числа) - всички елементи са с дефолтна стойност 0
        int[][] secondMatrix = new int[rowsSecondMatrix][columnsSecondMatrix];

        //четене на елементи за втората матрица (присвояваме им стойности)
        for (int i = 0; i < rowsSecondMatrix; i++) {        //for (int i = 0; i < secondMatrix.length; i++)        //for (int i = 0; i <= secondMatrix.length - 1; i++)
            int[] rowNumbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int j = 0; j < columnsSecondMatrix; j++) {      //for (int j = 0; j < secondMatrix[i].length; j++)        //for (int j = 0; j <= secondMatrix[i].length - 1; j++)
                secondMatrix[i][j] = rowNumbersArray[j];
            }

        }


        //3. сравняваме двете матрици, като си извикваме метода, който създадохме (като аргументи му подаваме първата и втората матрица)
        if (areMatricesEqual(firstMatrix, secondMatrix)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }


    public static boolean areMatricesEqual(int[][] firstMatrix, int[][] secondMatrix) {   //създаваме си отделен метод (от тип return), с който сравняваме двете матрици
        //веднага е ясно, че ако броят на редовете им е различен, двете матрици са различни
        if (firstMatrix.length != secondMatrix.length) {      //rowsFirstMatrix = firstMatrix.length    //rowsSecondMatrix = secondMatrix.length
            return false;    //прекъсваме този метод
        }

        //ако броят на колоните им е различен, двете матрици са различни
        //за да можем да ползваме firstMatrix[row].length (за броя на колоните), трябва да си създадем цикъл, за да въведем променливата row
        for (int row = 0; row < firstMatrix.length; row++) {
            if (firstMatrix[row].length != secondMatrix[row].length) {         //firstMatrix[row].length = columnsFirstMatrix   //secondMatrix[row].length) = columnsSecondMatrix
                return false;    //прекъсваме този метод
            }

            //ако броят на колоните им не е различен, сравняваме текущия елемент от първата матрица с текущия елемент от втората матрица
            for (int column = 0; column < firstMatrix[row].length; column++) {
                if (firstMatrix[row][column] != secondMatrix[row][column]) {     //ако текущите елементи са различни
                    return false;    //прекъсваме този метод
                }
            }
        }

        //ако дотук никъде не сме срещнали return false;    - значи матриците са еднакви
        return true;
    }

}
