package lecture5MultidimensionalArrays;

import java.util.Scanner;

public class P07FindTheRealQueenVersion1 {
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
                    System.out.printf("%d %d", row, column);    //принтираме индекс за ред, интервал и индекс за колона на текущия елемент (истинската кралицата)
                }
            }
        }

    }


    private static boolean isValidQueen(int row, int column, char[][] chessMatrix) {     //създаваме си метод, който проверава дали дадена царица е валидна (и така открива истинската царица)
        for (int rowDirection = -1; rowDirection <= 1; rowDirection++) {
            for (int columnDirection = -1; columnDirection <= 1; columnDirection++) {

                if (rowDirection == 0 && columnDirection == 0) {
                    continue;   //прекъсваме текущата итерация на цикъла и преминаваме на следващата итерация
                }

                int currentRow = row + rowDirection;
                int currentColumn = column + columnDirection;

                //валидираме индексите за ред и колона   //валиден индекс за ред  [0; rowsNumber]    //валиден индекс за колона [0; rowsNumber]  - защото е квадратна матрица и бр. редове = бр. колони
                boolean validIndex = areValidIndexes(chessMatrix, currentRow, currentColumn);    //извикваме си метода, който създадохме

                //докато инедексът е валиден, трябва да продължаваме с движението в същата посока - по хоризонтала/вертикала/диагонал
                while (validIndex) {

                    if (chessMatrix[currentRow][currentColumn] == 'q') {      //ако текущият елемент съвпадне с 'q', това означава, че по реда/колоната/диагонала има още една кралица, което означава, че нашата кралица не е валидната
                        return false;
                    }

                    currentRow = currentRow + rowDirection;
                    currentColumn = currentColumn + columnDirection;

                    //на всяка итерация на цикъла да се проверява дали индексите за ред и колона са валидни
                    validIndex = areValidIndexes(chessMatrix, currentRow, currentColumn);     //update - ако не го направим, сме в безкраен цикъл   //извикваме си метода, който създадохме
                }

            }
        }


        return true;     //ако никъде дотук компилаторът не е срещнал return false, да се върне return  true (значи сме открили истинската/валидната кралица)
    }


    private static boolean areValidIndexes(char[][] chessMatrix, int currentRow, int currentColumn) {      //създаваме си метод, който проверява дали индексите за ред и колона са валидни
        //валидираме индексите за ред и колона   //валиден индекс за ред  [0; rowsNumber]    //валиден индекс за колона [0; rowsNumber]
        return currentRow >= 0 && currentRow < chessMatrix.length && currentColumn >= 0 && currentColumn < chessMatrix[currentRow].length;
        //currentRow >= 0 && currentRow <= chessMatrix.length - 1 && currentColumn >= 0 && currentColumn <= chessMatrix[currentRow].length - 1;
    }


}
