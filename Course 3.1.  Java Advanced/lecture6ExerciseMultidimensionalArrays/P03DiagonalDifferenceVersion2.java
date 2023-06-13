package lecture6ExerciseMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03DiagonalDifferenceVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четем от конзолата брой редове на матрицата
        int n = Integer.parseInt(scanner.nextLine());    //понеже матрицата е квадратна, бр. редове = бр. колони

        //създаваме си матрица - в случая от цели числа
        int[][] matrix = new int[n][n];

        //присвояваме стойности на елементите на матрицата (напълваме матрицата)
        fillMatrix(matrix, scanner);     //извикваме си метода, който създадохме

        //принтираме разликата между сумите на двата диагонала на квадратната матрица, като си извикваме създадения метод
        System.out.println((getDifferenceOfSumsOfElementsOfFirstAndSecondDiagonalsInSquareMatrix(matrix, scanner)));
    }


    private static void fillMatrix(int[][] matrix, Scanner scanner) {       //създаваме си метод за присвояване стойности на елементите на матрицата (напълване на матрицата)
        for (int row = 0; row < matrix.length; row++) {
            int[] rowDataArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();     //четем текущия ред с входни данни

            for (int column = 0; column < matrix.length; column++) {
                matrix[row][column] = rowDataArray[column];     //на текущия елемент на матрицата му присвояваме като стойност текущия елемент от прочетения масив
            }
        }
    }


    private static int getDifferenceOfSumsOfElementsOfFirstAndSecondDiagonalsInSquareMatrix(int[][] matrix, Scanner scanner) {      //създаваме си метод за намиране на разликата между сумата от елементите, които са на първия (главния) диагонал и сумата от елементите, които са на втория (второстепенния) диагонал в квадратна матрица
        int sumOfElementsOfFirstDiagonal = 0;    //създаваме си променлива за сумата от елементите, които са на първия (главния) диагонал в квадратна матрица - с нач. стойност 0
        int sumOfElementsOfSecondDiagonal = 0;     //създаваме си променлива за сумата от елементите, които са на втория (второстепенния) диагонал в квадратна матрица - с нач. стойност 0

        //обхождаме всички елементи в матрицата и към сумата от елементите на първия диагонал ще прибавяме само тези, които са на първия диагонал, а към сумата от елементите на втория диагонал ще прибавяме само тези, които са на втория диагонал
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                int currentElement = matrix[row][column];     //създаваме си променлива за текущия елемент на матрицата
                if (row == column) {      //това е условието един елемент в квадратна матрица да се намира на първия (главния) диагонал (ако индексът му за ред е равен на индекса му за колона)
                    sumOfElementsOfFirstDiagonal += currentElement;     //sumOfElementsOfFirstDiagonal = sumOfElementsOfFirstDiagonal + currentElement;    //и щом текущият елемент е на главния диагонал, прибавяме стойността му към сумата от елементите, които са на първия (главния) диагонал
                }

                if (column == matrix.length - row - 1) {    //това е условието един елемент в квадратна матрица да се намира на втория (второстепенния) диагонал (ако индексът му за колона е равен на размера на матрицата (т.е. бр. редове/бр. колони) минус индекса му за ред минус 1)
                    sumOfElementsOfSecondDiagonal += currentElement;      //и щом текущият елемент е на втория диагонал, прибавяме стойността му към сумата от елементите, които са на втория (второстепенния) диагонал
                }
            }
        }

        //не знаем коя от двете суми е по-голяма, затова с Math.abs си осигуряваме, че резултатът (разликата от сумите на диагоналите) ще е полож. число
        return Math.abs(sumOfElementsOfFirstDiagonal - sumOfElementsOfSecondDiagonal);
    }


}
