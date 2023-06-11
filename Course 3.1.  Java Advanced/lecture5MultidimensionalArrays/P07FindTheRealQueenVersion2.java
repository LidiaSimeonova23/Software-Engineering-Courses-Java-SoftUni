package lecture5MultidimensionalArrays;

import java.util.Scanner;

public class P07FindTheRealQueenVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //по условие е дадено, че имаме шахматна дъска 8 х 8  (редове и колони)
        int rowsNumber = 8;
        int columnsNumber = 8;

        //създаваме си матрица от символи
        char[][] chessBoardMatrix = new char[rowsNumber][columnsNumber];

        //четем входни данни и ги присвояваме като стойности на елементите на матрицата
        for (int row = 0; row < rowsNumber; row++) {        //for (int row = 0; row < dataMatrix.length; row++)        //for (int row = 0; row <= dataMatrix.length - 1; row++)
            String currentRowData = scanner.nextLine();     //четем текущия ред с входни данни като текст
            String strippedString = currentRowData.replaceAll("\\s+", "");       //в прочетения текст премахваме интервалите
            chessBoardMatrix[row] = strippedString.toCharArray();   //превръщаме текста в масив от символи и го присвояваме като стойност на текущия ред от матрицата
        }

        //обхождаме елементите на матрицата и търсим истинската/валидната кралица (символ 'q' - който символ да е единствен в реда си, колоната си и диагоналите си)
        for (int row = 0; row < chessBoardMatrix.length; row++) {
            for (int column = 0; column < chessBoardMatrix[row].length; column++) {
                if (chessBoardMatrix[row][column] == 'q' && isValidQueen(row, column, chessBoardMatrix)) {
                    //System.out.println(row + " " + column);
                    System.out.printf("%d %d", row, column);
                    return;
                }
            }
        }


    }


    private static boolean isValidQueen(int row, int column, char[][] chessMatrix) {     //създаваме си метод, който проверава дали дадена царица е валидна (и така открива истинската царица)

        //единият вариант е да направим 8 цикъла, имайки предвид тези зависимости между индекс за текущ ред и индекс за текуща колона:
        //по хоризонтала (реда) наляво от текущия елемент   ->   column--                   (индексът за текуща колона намалява, индексът за текущ ред се запазва)
        //по хоризонтала (реда) надясно от текущия елемент  ->   column++                   (индексът за текуща колона нараства, индексът за текущ ред се запазва)
        //по вертикала (колона) нагоре от текущия елемент   ->   row--                      (индексът за текущ ред намалява, индексът за текуща колона се запазва)
        //по вертикала (колона) надолу от текущия елемент   ->   row++                      (индексът за текущ ред нараства, индексът за текуща колона се запазва)
        //по диагонала нагоре-наляво от текущия елемент     ->   row--   column--           (индексът за текущ ред намалява, индексът за текуща колона също намалява)
        //по диагонала нагоре-надясно от текущия елемент    ->   row--   column++           (индексът за текущ ред намалява, индексът за текуща колона нараства)
        //по диагонала надолу-наляво от текущия елемент     ->   row++   column--           (индексът за текущ ред нараства, индексът за текуща колона намалява)
        //по диагонала надолу-надясно от текущия елемент    ->   row++   column++           (индексът за текущ ред нараства, индексът за текуща колона също нараства)

        // обхождаме елементите по хоризонтала (реда) наляво от текущия елемент
        for (int currentColumn = column - 1; currentColumn >= 0; currentColumn--) {
            if (chessMatrix[row][currentColumn] == 'q') {
                return false;
            }
        }

        // обхождаме елементите по хоризонтала (реда) надясно от текущия елемент
        for (int currentColumn = column + 1; currentColumn < chessMatrix[row].length; currentColumn++) {
            if (chessMatrix[row][currentColumn] == 'q') {
                return false;
            }
        }

        // обхождаме елементите по вертикала (колона) нагоре от текущия елемент
        for (int currentRow = row - 1; currentRow >= 0; currentRow--) {
            if (chessMatrix[currentRow][column] == 'q') {
                return false;
            }
        }

        // обхождаме елементите по вертикала (колона) надолу от текущия елемент
        for (int currentRow = row + 1; currentRow < chessMatrix.length; currentRow++) {
            if (chessMatrix[currentRow][column] == 'q') {
                return false;
            }
        }

        // обхождаме елементите по диагонала нагоре-наляво от текущия елемент
        int currentRow = row - 1;
        int currentColumn = column - 1;
        while (currentRow >= 0 && currentColumn >= 0) {
            if (chessMatrix[currentRow][currentColumn] == 'q') {
                return false;
            }
            currentRow--;
            currentColumn--;
        }

        // обхождаме елементите по диагонала нагоре-надясно от текущия елемент
        currentRow = row - 1;
        currentColumn = column + 1;
        while (currentRow >= 0 && currentColumn < chessMatrix[row].length) {
            if (chessMatrix[currentRow][currentColumn] == 'q') {
                return false;
            }
            currentRow--;
            currentColumn++;
        }

        // обхождаме елементите по диагонала надолу-наляво от текущия елемент
        currentRow = row + 1;
        currentColumn = column - 1;
        while (currentRow < chessMatrix.length && currentColumn >= 0) {
            if (chessMatrix[currentRow][currentColumn] == 'q') {
                return false;
            }
            currentRow++;
            currentColumn--;
        }

        // обхождаме елементите по диагонала надолу-надясно от текущия елемент
        currentRow = row + 1;
        currentColumn = column + 1;
        while (currentRow < chessMatrix.length && currentColumn < chessMatrix[row].length) {
            if (chessMatrix[currentRow][currentColumn] == 'q') {
                return false;
            }
            currentRow++;
            currentColumn++;
        }

        return true;      //ако никъде дотук компилаторът не е срещнал return false, да се върне return  true (значи сме открили истинската/валидната кралица)
    }


}
