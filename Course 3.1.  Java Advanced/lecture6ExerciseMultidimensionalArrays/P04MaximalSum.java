package lecture6ExerciseMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четем брой редове и колони на правоъгълна матрица
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rowsNumber = numbers[0];
        int columnsNumber = numbers[1];

        //създаваме си целочислена матрица (ще изчисляваме сума -> елементите ни трябват като числа, не може да са текст)
        int[][] matrix = new int[rowsNumber][columnsNumber];

        //присвояваме стойности на елементите на матрицата
        fillMatrix(scanner, matrix, rowsNumber, columnsNumber);    //извикваме си метода, който създадохме

        //от правоъгълната матрица трябва да си правим въображаеми квадратни матрици (от 3 реда и 3 колони), да намираме сумата от деветте име елемента и съответна да намерим матрицата с най-голямата такава сума
        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;    //създаваме си променлива за индекса на първия ред на въображаемата квадратна матрица с най-голяма сума от елементите й
        int startColumn = 0;    //създаваме си променлива за индекса на първата колона на въображаемата квадратна матрица с най-голяма сума от елементите й
        //итерираме по редове и колони на правоъгълната матрица, за да си намираме сумата от елементите на въображаемите текущи квадратни матрици
        //МНОГО ВАЖНО: ПРИ УСЛОВИЯТА В ДВАТА ЦИКЪЛА НЯМА ДА ВЗИМАМЕ ПОСЛЕДНИТЕ ДВА РЕДА И ДВЕ КОЛОНИ (ЗАЩОТО АКО ТЕ СА НАЧАЛО НА МАТРИЦИ, ЩЕ СЕ ОПИТАМЕ ДА ДОСТЪПИМ ЕЛЕМЕНТИ, КОИТО НЕ СЪЩЕСТВУВАТ и ще имаме Exception ... Index ... out of bounds for length...
        for (int row = 0; row < rowsNumber - 2; row++) {
            for (int column = 0; column < columnsNumber - 2; column++) {
                //на всяка итерация си намираме сумата от деветте елемента на текущата въображаема квадратна матрица от 3 реда и 3 колони; знаем индексите за ред и колона на текущия елемент и чрез зависимости си достъпваме всички други елементи:
                int currentSumOfElementsOfImaginarySquare3x3Matrix = matrix[row][column] + matrix[row][column + 1] + matrix[row][column + 2]
                        + matrix[row + 1][column] + matrix[row + 1][column + 1] + matrix[row + 1][column + 2]
                        + matrix[row + 2][column] + matrix[row + 2][column + 1] + matrix[row + 2][column + 2];

                //намираме коя е най-голямата сума от 9 елемента на въображаема квадратна матрица
                if (currentSumOfElementsOfImaginarySquare3x3Matrix > maxSum) {
                    maxSum = currentSumOfElementsOfImaginarySquare3x3Matrix;
                    startRow = row;    //щом сме намерили най-голямата сума, следователно индексът на първия ред на тази квадратна матрица е равен на индекса на текущия ред на дадената ни по условие правоъгълна матрица
                    startColumn = column;    //щом сме намерили най-голямата сума, следователно индексът на първата колона на тази квадратна матрица е равен на индекса на текущата колона на дадената ни по условие правоъгълна матрица
                }

            }
        }

        //System.out.println("Sum = " + maxSum);      //принтираме намерената най-голямата сума от елементи на въображаемата квадратна матрица
        System.out.printf("Sum = %d%n", maxSum);

        //знаейки индекса на първия ред и индекса на първата колона на матрицата с най-голяма сума от елементите й, веднага можем да прибавим още 2 реда и 2 колони (защото е квадратна 3 х 3) и да принтираме елементите й:
        for (int row = startRow; row <= startRow + 2; row++) {
            for (int column = startColumn; column <= startColumn + 2; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

    }


    public static void fillMatrix(Scanner scanner, int[][] matrix, int rows, int cols) {        //създаваме си метод за присвояване стойности на елементите на матрица от цели числа
        for (int row = 0; row < rows; row++) {      //можем да си присвояваме стойности и само чрез редовете (без да правим втори цикъл за колоните)
            int[] rowDataArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = rowDataArray;    //на текущия ред от матрицата му присвояваме като стойност текущо прочетения масив
        }
    }


}
