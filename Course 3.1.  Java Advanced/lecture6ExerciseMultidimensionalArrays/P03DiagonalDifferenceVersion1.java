package lecture6ExerciseMultidimensionalArrays;

import java.util.Scanner;

public class P03DiagonalDifferenceVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четем от конзолата брой редове на матрицата
        int n = Integer.parseInt(scanner.nextLine());    //понеже матрицата е квадратна, бр. редове = бр. колони

        //създаваме си матрица - в случая от цели числа
        int[][] matrix = new int[n][n];

        //присвояваме стойности на елементите на матрицата (напълваме матрицата)
        fillMatrix(matrix, scanner);     //извикваме си метода, който създадохме

        //намираме сумата от елементите на първия (главния) диагонал (диагонала от горен ляв до долен десен ъгъл) на квадратна матрица
        int sumOfElementsOfFirstDiagonal = getSumOfElementsOfFirstDiagonalInSquareMatrix(matrix);    //извикваме си метода, който създадохме

        //намираме сумата от елементите на втория (второстепенния) диагонал (диагонала от долен ляв до горен десен ъгъл) на квадратна матрица
        int sumOfElementsOfSecondDiagonal = getSumOfElementsOfSecondDiagonalInSquareMatrix(matrix);     //извикваме си метода, който създадохме

        //принтираме разликата (чрез абсолютна стойност) между сумите на двата диагонала на квадратната матрица
        System.out.println(Math.abs(sumOfElementsOfFirstDiagonal - sumOfElementsOfSecondDiagonal));
    }


    private static void fillMatrix(int[][] matrix, Scanner scanner) {       //създаваме си метод за присвояване стойности на елементите на матрицата (напълване на матрицата)
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                //със scanner.nextInt() четем от конзолата следващото цяло число
                matrix[row][column] = scanner.nextInt();     //на текущия елемент от матрицата му присвояваме като стойност текущо прочетеното число
            }
        }
    }


    private static int getSumOfElementsOfFirstDiagonalInSquareMatrix(int[][] matrix) {      //създаваме си метод за намиране на сумата от елементите, които са на първия (главния) диагонал в квадратна матрица
        int sum = 0;    //създаваме си променлива за сумата от елементите, които са на първия (главния) диагонал в квадратна матрица - с нач. стойност 0
        //обхождаме всички елементи в матрицата и към сумата ще прибавяме само тези, които са на първия диагонал
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                int currentElement = matrix[row][column];     //създаваме си променлива за текущия елемент на матрицата
                if (row == column) {      //това е условието един елемент в квадратна матрица да се намира на първия (главния) диагонал (ако индексът му за ред е равен на индекса му за колона)
                    sum += currentElement;     //sum = sum + currentElement;    //и щом текущият елемент е на главния диагонал, прибавяме стойността му към сумата от елементите, които са на първия (главния) диагонал
                }
            }
        }
        return sum;
    }


    private static int getSumOfElementsOfSecondDiagonalInSquareMatrix(int[][] matrix) {      //създаваме си метод за намиране на сумата от елементите, които са на втория (второстепенния) диагонал в квадратна матрица
        int sum = 0;     //създаваме си променлива за сумата от елементите, които са на втория (второстепенния) диагонал в квадратна матрица - с нач. стойност 0
        //обхождаме всички елементи в матрицата и към сумата ще прибавяме само тези, които са на втория диагонал
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                int currentElement = matrix[row][column];     //създаваме си променлива за текущия елемент на матрицата
                if (column == matrix.length - row - 1) {    //това е условието един елемент в квадратна матрица да се намира на втория (второстепенния) диагонал (ако индексът му за колона е равен на размера на матрицата (т.е. бр. редове/бр. колони) минус 1)
                    sum += currentElement;      //и щом текущият елемент е на втория диагонал, прибавяме стойността му към сумата от елементите, които са на втория (второстепенния) диагонал
                }
            }
        }
        return sum;
    }


}
