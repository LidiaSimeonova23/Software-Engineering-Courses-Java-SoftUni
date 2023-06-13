package lecture6ExerciseMultidimensionalArrays;

import java.util.Scanner;

public class P05MatrixShufflingVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //това решение също е вярно, но за него ползваме try - catch конструкцията (в if - else проверка), а ние още не сме я учили

        //от първия ред на конзолата четем брой редове и брой колони на матрицата
        int rowsNumber = scanner.nextInt();      //бр. редове
        int columnsNumber = scanner.nextInt();   //бр. колони
        scanner.nextLine();

        //създаваме си матрица от текстове
        String[][] matrix = new String[rowsNumber][columnsNumber];

        //присвояваме стойности на елементите на матрицата
        for (int row = 0; row < rowsNumber; row++) {
            String[] rowDataArray = scanner.nextLine().split("\\s+");

            for (int column = 0; column < columnsNumber; column++) {
                matrix[row][column] = rowDataArray[column];
            }
        }


        //четем команди - ако командата е валидно, разменяме местата на 2 елемента, ако командата е невалидно, принтираме, че е невалидна и преминаваме на следващата (ако има такава)
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] commandPartsArray = command.split("\\s+");
            if (commandPartsArray.length != 5 || !commandPartsArray[0].equals("swap")) {
                System.out.println("Invalid input!");
            } else {
                int row1, col1, row2, col2;
                try {
                    row1 = Integer.parseInt(commandPartsArray[1]);
                    col1 = Integer.parseInt(commandPartsArray[2]);
                    row2 = Integer.parseInt(commandPartsArray[3]);
                    col2 = Integer.parseInt(commandPartsArray[4]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input!");
                    command = scanner.nextLine();
                    continue;
                }

                if (areValidCoordinatesOfElement(matrix, row1, col1) && areValidCoordinatesOfElement(matrix, row2, col2)) {      //извикваме си метода, който проверява дали координатите (индекс за ред и за колона) на даден елемент са валидни
                    swapElements(matrix, row1, col1, row2, col2);    //извикваме си метода за размяна на местата на двата елемента
                    printMatrix(matrix);       //извикваме си метода за принтиране на елементите на матрица
                } else {
                    System.out.println("Invalid input!");
                }
            }

            command = scanner.nextLine();    //update
        }
    }

    private static boolean areValidCoordinatesOfElement(String[][] matrix, int row, int column) {
        return row >= 0 && row < matrix.length && column >= 0 && column < matrix[0].length;
    }

    private static void swapElements(String[][] matrix, int row1, int col1, int row2, int col2) {      //метод, чрез който разменяме местата на два елемента в матрицата
        String firstElement = matrix[row1][col1];      //създаваме си променлива за първия елемент, чието място трябва да сменим
        String secondElement = matrix[row2][col2];     //създаваме си променлива за втория елемент, чието място трябва да сменим

        //разменяме местата на двата елемента:
        matrix[row1][col1] = secondElement;      //на взетите от командата индекси за ред и за колона на първия елемент присвояваме като стойност втория елемент
        matrix[row2][col2] = firstElement;       //на взетите от командата индекси за ред и за колона на втория елемент присвояваме като стойност първия елемент
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {      //за всеки масив от матрицата  (също става: за всеки ред от матрицата)   //знаем, че всеки ред в матрицата всъщност е масив от елементи
            for (String cell : row) {      //за всеки елемент от текущия масив  (също става: за всяка клетка на текущия ред)
                System.out.print(cell + " ");    //на всяка итерация принтираме текущия елемент (текущата клетка) и интервал
            }
            System.out.println();    //сваляме курсора на следващия ред (за да принтираме следващия ред от матрицата на нов ред в конзолата)
        }
    }

}
