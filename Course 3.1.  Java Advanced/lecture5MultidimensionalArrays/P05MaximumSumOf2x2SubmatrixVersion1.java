package lecture5MultidimensionalArrays;

import java.util.Scanner;

public class P05MaximumSumOf2x2SubmatrixVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем от конзолата една матрица
        //четем брой редове и брой колони на матрицата
        String[] rowsAndColumnsOfMatrixArray = scanner.nextLine().split(", ");
        int rowsNumber = Integer.parseInt(rowsAndColumnsOfMatrixArray[0]);      //брой редове
        int columnsNumber = Integer.parseInt(rowsAndColumnsOfMatrixArray[1]);   //брой колони

        //създаваме си целочислена матрица (двумерен масив от цели числа) - всички елементи са с дефолтна стойност 0
        //ще извършваме аритметични операции, следователно сме длъжни да четем данните като числа (не могат да бъдат текстове)
        int[][] dataMatrix = new int[rowsNumber][columnsNumber];

        //четене на стойности за елементите на матрицата (присвояваме им стойности, които четем от конзолата)
        for (int row = 0; row < rowsNumber; row++) {        //for (int row = 0; row < dataMatrix.length; row++)        //for (int row = 0; row <= dataMatrix.length - 1; row++)
            String[] rowDataArray = scanner.nextLine().split(", ");

            for (int column = 0; column < columnsNumber; column++) {      //for (int column = 0; column < dataMatrix[row].length; column++)        //for (int column = 0; column <= dataMatrix[row].length - 1; column++)
                dataMatrix[row][column] = Integer.parseInt(rowDataArray[column]);
            }

        }


        //2. създаваме си подматрици от 2 реда и 2 колони
        int maxSumTopLeftRow = -1;         //създаваме си индекс за ред на подматрицата с най-голяма сума от елементите й (с нач. стойност -1)
        int maxSumTopLeftColumn = -1;       //създаваме си индекс за колона на подматрицата с най-голяма сума от елементите й (с нач. стойност -1)
        int maxSumOfElementsOfSubmatrix = 0;   //с конкретно дадените ни входни данни (които в случая са само положит. числа) и това ще ни свърши работа:   //int maxSumOfElementsOfSubmatrix = Integer.MIN_VALUE;

        for (int row = 0; row < dataMatrix.length - 1; row++) {       //row < dataMatrix.length - 1;     -> тъй като ще взимаме редовете два по два (текущия и следващия), трябва да спрем цикъла не на последния ред, а на предпоследния (защото когато вземем предпоследния, с него ще върви и последният)
            for (int column = 0; column < dataMatrix[row].length - 1; column++) {         //column < dataMatrix[row].length - 1;    -> тъй като ще взимаме колоните две по две (текущата и следващата), трябва да спрем цикъла не на последната колона, а на предпоследната (защото когато вземем предпоследната, с нея ще върви и последната)
                int sumOfElementsOfCurrentSubmatrix = dataMatrix[row][column] + dataMatrix[row][column + 1]           //текущия елемент и елемента вдясно от текущия (в съседната колона)
                                                     + dataMatrix[row + 1][column] + dataMatrix[row + 1][column + 1];     //елемента, който е под текущия елемент (на следващия ред) и елемента, който е по диагонал на текущия елемент (на следващия ред, в следващата колона)

                if (sumOfElementsOfCurrentSubmatrix > maxSumOfElementsOfSubmatrix) {
                    maxSumOfElementsOfSubmatrix = sumOfElementsOfCurrentSubmatrix;         //намираме подматрицата с най-голяма сума от елементите й

                    maxSumTopLeftRow = row;
                    maxSumTopLeftColumn = column;
                }

            }
        }


        //3. принтиране
        //принтираме елементите на подматрицата с най-голяма сума от елементите й - този път няма да итерираме по елементите с 2 вложени for цикъла, а директно ще си ги достъпим чрез индексите им
        System.out.println(dataMatrix[maxSumTopLeftRow][maxSumTopLeftColumn] + " " + dataMatrix[maxSumTopLeftRow][maxSumTopLeftColumn + 1]);       //принтираме текущия елемент на подматрицата и този вдясно от него
        System.out.println(dataMatrix[maxSumTopLeftRow + 1][maxSumTopLeftColumn] + " " + dataMatrix[maxSumTopLeftRow + 1][maxSumTopLeftColumn + 1]);   //принтираме елемента, който е под текущия елемент, както и този, който е по диагонал на текущия елемент

        //принтираме сумата от елементите на подматрицата победител
        System.out.println(maxSumOfElementsOfSubmatrix);
    }
}
