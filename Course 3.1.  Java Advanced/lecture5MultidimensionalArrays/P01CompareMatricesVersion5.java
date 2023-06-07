package lecture5MultidimensionalArrays;

import java.util.Scanner;

public class P01CompareMatricesVersion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем от конзолата първата матрица
        //четем брой редове и брой колони на първата матрица
        int rowsFirstMatrix = scanner.nextInt();      //брой редове
        int columnsFirstMatrix = scanner.nextInt();   //брой колони

        //създаваме си първата целочислена матрица (двумерен масив от цели числа) - всички елементи са с дефолтна стойност 0
        int[][] firstMatrix = new int[rowsFirstMatrix][columnsFirstMatrix];

        //четене на елементи за първата матрица (присвояваме им стойности)
        settingValuesOfMatrixElements(firstMatrix, scanner);   //извикваме си метода, който създадохме и му подаваме аргументи


        //2. четем от конзолата втората матрица
        //четем брой редове и брой колони на втората матрица
        int rowsSecondMatrix = scanner.nextInt();      //брой редове
        int columnsSecondMatrix = scanner.nextInt();   //брой колони

        //създаваме си втората целочислена матрица (двумерен масив от цели числа) - всички елементи са с дефолтна стойност 0
        int[][] secondMatrix = new int[rowsSecondMatrix][columnsSecondMatrix];

        //четене на елементи за втората матрица (присвояваме им стойности)
        settingValuesOfMatrixElements(secondMatrix, scanner);    //извикваме си метода, който създадохме и му подаваме аргументи


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


    private static void settingValuesOfMatrixElements(int[][] matrix, Scanner scanner) {    //създаваме си метод, чрез който на всеки елемент на матрицата му присвояваме стойност, която четем от конзолата (четене на входни данни)
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();           //на текущия елемент от матрицата му присвояваме като стойност прочетеното цяло число от конзолата
            }
        }
    }


}
