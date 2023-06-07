package lecture5MultidimensionalArrays;

import java.util.Scanner;

public class P01CompareMatricesVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем от конзолата първата матрица
        //четем брой редове и брой колони на първата матрица
        String[] rowsAndColumnsFirstMatrixArray = scanner.nextLine().split(" ");          //String[] rowsAndColumnsFirstMatrixArray = scanner.nextLine().split("\\s+");
        int rowsFirstMatrix = Integer.parseInt(rowsAndColumnsFirstMatrixArray[0]);      //брой редове
        int columnsFirstMatrix = Integer.parseInt(rowsAndColumnsFirstMatrixArray[1]);   //брой колони

        //създаваме си първата целочислена матрица (двумерен масив от цели числа) - всички елементи са с дефолтна стойност 0
        int[][] firstMatrix = new int[rowsFirstMatrix][columnsFirstMatrix];

        //четене на елементи за първата матрица (присвояваме им стойности)
        for (int i = 0; i < rowsFirstMatrix; i++) {        //for (int i = 0; i < firstMatrix.length; i++)        //for (int i = 0; i <= firstMatrix.length - 1; i++)
            String[] rowNumbersArray = scanner.nextLine().split(" ");

            for (int j = 0; j < columnsFirstMatrix; j++) {      //for (int j = 0; j < firstMatrix[i].length; j++)        //for (int j = 0; j <= firstMatrix[i].length - 1; j++)
                firstMatrix[i][j] = Integer.parseInt(rowNumbersArray[j]);
            }

        }


        //2. четем от конзолата втората матрица
        //четем брой редове и брой колони на втората матрица
        String[] rowsAndColumnsSecondMatrixArray = scanner.nextLine().split(" ");          //String[] rowsAndColumnsSecondMatrixArray = scanner.nextLine().split("\\s+");
        int rowsSecondMatrix = Integer.parseInt(rowsAndColumnsSecondMatrixArray[0]);      //брой редове
        int columnsSecondMatrix = Integer.parseInt(rowsAndColumnsSecondMatrixArray[1]);   //брой колони

        //създаваме си втората целочислена матрица (двумерен масив от цели числа) - всички елементи са с дефолтна стойност 0
        int[][] secondMatrix = new int[rowsSecondMatrix][columnsSecondMatrix];

        //четене на елементи за втората матрица (присвояваме им стойности)
        for (int i = 0; i < rowsSecondMatrix; i++) {        //for (int i = 0; i < secondMatrix.length; i++)        //for (int i = 0; i <= secondMatrix.length - 1; i++)
            String[] rowNumbersArray = scanner.nextLine().split(" ");

            for (int j = 0; j < columnsSecondMatrix; j++) {      //for (int j = 0; j < secondMatrix[i].length; j++)        //for (int j = 0; j <= secondMatrix[i].length - 1; j++)
                secondMatrix[i][j] = Integer.parseInt(rowNumbersArray[j]);
            }

        }


        //3. сравняваме двете матрици
        //веднага е ясно, че ако броят на редовете им е различен, или ако броят на колоните им е различен, двете матрици са различни
        if (rowsFirstMatrix != rowsSecondMatrix || columnsFirstMatrix != columnsSecondMatrix) {
            System.out.println("not equal");
            return;      //прекратяваме изпълнението на цялата програма (на целия main метод)
        }

        //ако горното условие е false, значи броят на редовете им съвпада и в същото време броят на колоните им съвпада, следователно има шанс двете матрици да са еднакви
        //затова почваме да сравняваме текущия елемент от едната матрица с текущия елемент от другата матрица
        //по-удобно е да търсим разлика - ако открием дори едно несъвпадение, матриците са различни
        for (int i = 0; i < rowsFirstMatrix; i++) {        //тук вместо rowsFirstMatrix може да е и rowsSecondMatrix    (защото вече сме установили, че броят им е еднакъв)
            for (int j = 0; j < columnsFirstMatrix; j++) {       //тук вместо columnsFirstMatrix може да е и columnsSecondMatrix   (защото вече сме установили, че броят им е еднакъв)
                if (firstMatrix[i][j] != secondMatrix[i][j]) {           //ако текущият елемент от първата матрица е различен от текущия елемент от втората матрица
                    System.out.println("not equal");
                    return;      //прекратяваме изпълнението на цялата програма
                }
            }
        }

        //ако не сме открили несъвпадение между текущите елементи, значи матриците са еднакви
        System.out.println("equal");
    }
}
