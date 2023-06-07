package lecture5MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P02PositionsOfVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем от конзолата една матрица
        //четем брой редове и брой колони на матрицата
        int[] rowsAndColumnsOfMatrixArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rowsOfMatrix = rowsAndColumnsOfMatrixArray[0];      //брой редове
        int columnsOfMatrix = rowsAndColumnsOfMatrixArray[1];   //брой колони

        //създаваме си матрица от текстове (двумерен масив от текстове) - всички елементи са с дефолтна стойност null - тези текстове всъщност са числа, но няма да извършваме аритметични операции и/или сравнения с тях
        String[][] matrix = new String[rowsOfMatrix][columnsOfMatrix];

        //четене на стойности за елементите на матрицата (присвояваме им стойности, които четем от конзолата)
        settingValuesOfMatrixElements(matrix, scanner);     //извикваме си метода, който създадохме (като аргументи му подаваме името на матрицата и скенера)


        //2. четем от конзолата число (за което ще трябва да проверим дали се съдържа в матрицата) - няма да извършваме аритм. операции и/или сравнения с него, затова можем да си го прочетем като текст (вместо като число)
        String numberAsText = scanner.nextLine();

        //3. проверяваме дали прочетеното число се съдържа в матрицата - итерираме по всеки елемент от матрицата и го сравняваме с числото
        boolean isFound = false;        //създаваме променлива, кояо държи истината (приемаме, че прочетеното число не се съдържа в матрицата)
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                String currentElementOfMatrix = matrix[row][column];    //създаваме си променлива за текущия елемент на матрицата

                if (currentElementOfMatrix.equals(numberAsText)) {        //ако текущият елемент на матрицата съвпада с числото
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


    private static void settingValuesOfMatrixElements(String[][] matrix, Scanner scanner) {      //създаваме си метод, чрез който на всеки елемент на матрицата му присвояваме стойност, която четем от конзолата (четене на входни данни)
        for (int row = 0; row < matrix.length; row++) {
            //scanner.nextLine() -> "1 2 3"
            //scanner.nextLine().split(" ") -> ["1", "2", "3"]
            matrix[row] = scanner.nextLine().split("\\s+");        //на текущия ред от матрицата му присвояваме като стойност прочетения текст от конзолата
        }
    }

}
