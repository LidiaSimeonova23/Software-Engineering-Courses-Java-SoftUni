package lecture5MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четем брой редове на матрицата (колоните не са дадени)
        int rowsNumber = Integer.parseInt(scanner.nextLine());

        //създаваме матрица - ще е от числа (защото трябва да извършваме аритм. операции)
        int[][] numbersMatrix = new int[rowsNumber][];   //всички редове са с дефолтна стойност null

        //четене на входни данни за редовете на матрицата (четем само редове) - всички редове са с дефо
        for (int row = 0; row < rowsNumber; row++) {        //for (int row = 0; row < numbersMatrix.length; row++)
            int[] currentRowArray = readArrayOfIntegers(scanner);     //извикваме си метода за четене на масив от цели числа
            numbersMatrix[row] = currentRowArray;   //на текущия ред от матрицата присвояваме текущо прочетения масив currentRowArray
        }

        //прочитаме координати (индекс за ред и индекс за колона) на грешната стойност в матрицата
        int[] coordinatesOfWrongValue = readArrayOfIntegers(scanner);    //извикваме си метода за четене на масив от цели числа
        int rowIndex = coordinatesOfWrongValue[0];      //индекс за ред на грешната стойност в матрицата
        int columnIndex = coordinatesOfWrongValue[1];     //индекс за колона на грешната стойност в матрицата

        //имайки вече индексите на грашната стойност, намираме кой елемент от матрицата е това
        int valueToReplace = numbersMatrix[rowIndex][columnIndex];

        //създаваме си списък, който да съхранява верните стойности (сумата от съседните елементи), които впоследствие ще заменят всички елементи, които имат грешната стойнст
        //създаваме лист (а не масив), защото предварително не знаем колко елемента ще има (размерът на листа може да се променя, а този на масива - не)
        List<int[]> correctValuesList = new ArrayList<>();

        //тъй като стойността, която трябва да се замени, я има на няколко места в матрицата, трябва да итерираме елемент по елемент
        for (int row = 0; row < numbersMatrix.length; row++) {
            for (int column = 0; column < numbersMatrix[row].length; column++) {
                if (numbersMatrix[row][column] == valueToReplace) {       //ако текущият елемент на матрицата съвпада със стойността, която трябва да се замени (грешната стойност)
                    int correctValue = findSumOfNeighbouringElements(numbersMatrix, row, column, valueToReplace);           //създаваме си променлива за вярната стойност (сумата от съседните елементи на елемента, който има грешна стойност)
                    //тази correctValue я намираме в отделен метод, защото тук вече имаме два вложени цикъла, проверка в тях и ще стане прекалено претрупано, ако и сумата намираме тук
                    //АКО ВЕДНАГА НА ТЕКУЩИЯ ЕЛЕМЕНТ МУ ПРИСВОИМ ВЯРНАТА СТОЙНОСТ:  numbersMatrix[row][column] = correctValue;     ЩЕ ДОВЕДЕ ДО ГРЕШЕН РЕЗУЛТАТ ПРИ ВТОРИТЕ ВХОДНИ ДАННИ, ЗАЩОТО НОВАТА СТОЙНОСТ ЩЕ ПОВЛИЯЕ НА СЛЕДВАЩИТЕ СРЕЩАНИЯ НА ГРЕШНАТА СТОЙНОСТ
                    correctValuesList.add(new int[]{row, column, correctValue});    //към създадения лист добавяме масив от цели числа, който масив съдържа, индекс за ред и индекс за колона на вярната стойност
                }
            }
        }

        //обхождаме всеки масив от списъка (correctValuesList) с масиви
        for (int[] correctValueArray : correctValuesList) {
            int row = correctValueArray[0];    //създаваме си индекс за текущия ред - той е първият елемент от масива correctValue и е на индекс 0 в масива
            int column = correctValueArray[1];    //създаваме си индекс за текущата колона - тя е вторият елемент от масива correctValue и е на индекс 1 в масива
            numbersMatrix[row][column] = correctValueArray[2];      //на текущия елемент на матрицата му присвояваме като стойност третия елемент на масив correctValueArray (този елемент всъщност е вярната стойност)
        }

        //принтираме матрицата (с верните стойности на мястото на грешните)
        for (int row = 0; row < numbersMatrix.length; row++) {
            for (int column = 0; column < numbersMatrix[row].length; column++) {
                System.out.print(numbersMatrix[row][column] + " ");
            }
            System.out.println();
        }

    }


    private static int findSumOfNeighbouringElements(int[][] matrix, int row, int column, int valueToReplace) {    //създаваме метод, който намира сумата от съседните елементи на елемента, който има грешна стойност
        int sumOfNeighbouringElements = 0;     //създаваме си променлива за сумата от съседните елементи с нач. стойност 0

        //в случая ни трябва сумата от горен, долен, ляв и десен съсед (без съседите по диагоналите)
        //затова с 4 проверки ще проверим дали всеки от споменатите 4 съседа (на текущия елемент) съществува и дали е различен от стойността, която трябва да се замени
        //ВАЖНО! - АКО ТАКЪВ СЪСЕД СЪЩЕСТВУВА И АКО Е РАЗЛИЧЕН ОТ СТОЙНОСТТА, КОЯТО ТРЯБВА ДА СЕ ЗАМЕНИ, ГО ПРИБАВЯМЕ КЪМ СУМАТА   (АКО НЕ Е РАЗЛИЧЕН ОТ СТОЙНОСТТА, КОЯТО ТРЯБВА ДА СЕ ЗАМЕНИ, НЕ ГО ПРИБАВЯМЕ КЪМ СУМАТА)
        if (areValidIndexes(matrix, row - 1, column) && matrix[row - 1][column] != valueToReplace) {      //извикваме си метода, който проверява дали индексите за ред и колона са валидни
            sumOfNeighbouringElements += matrix[row - 1][column];   //matrix[row - 1][column]   е елемента, който е над текущия елемент    //sumOfNeighbouringElements = sumOfNeighbouringElements + matrix[row - 1][column];
        }

        if (areValidIndexes(matrix, row + 1, column) && matrix[row + 1][column] != valueToReplace) {
            sumOfNeighbouringElements += matrix[row + 1][column];   //matrix[row + 1][column]   е елемента, който е под текущия елемент
        }

        if (areValidIndexes(matrix, row, column - 1) && matrix[row][column - 1] != valueToReplace) {
            sumOfNeighbouringElements += matrix[row][column - 1];   //matrix[row][column - 1]   е елемента, който е вляво от текущия елемент
        }

        if (areValidIndexes(matrix, row, column + 1) && matrix[row][column + 1] != valueToReplace) {
            sumOfNeighbouringElements += matrix[row][column + 1];   //matrix[row][column + 1]   е елемента, който е вдясно от текущия елемент
        }


        return sumOfNeighbouringElements;
    }

    private static boolean areValidIndexes(int[][] matrix, int row, int column) {
        return row >= 0 && row < matrix.length && column >= 0 && column < matrix[row].length;
    }


    private static int[] readArrayOfIntegers(Scanner scanner) {      //създаваме си метод за четене (от конзолата) на масив от цели числа
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

}
