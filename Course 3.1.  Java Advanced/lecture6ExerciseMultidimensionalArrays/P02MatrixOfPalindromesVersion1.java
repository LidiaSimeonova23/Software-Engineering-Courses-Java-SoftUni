package lecture6ExerciseMultidimensionalArrays;

import java.util.Scanner;

public class P02MatrixOfPalindromesVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //palindromes - думи или числа, които и в прав, и в обратен ред се четат по един и същи начин  //1001, 202, madam, racecar

        //четем си входните данни
        String input = scanner.nextLine();
        String[] inputPartsArray = input.split("\\s+");
        int rowsNumber = Integer.parseInt(inputPartsArray[0]);    //брой редове в матрицата
        int columnsNumber = Integer.parseInt(inputPartsArray[1]);    //брой колони

        //създаваме си матрица от текстове
        String[][] palindromesMatrix = new String[rowsNumber][columnsNumber];

        //присвояваме стойности на елементите на матрицата
        fillMatrix(palindromesMatrix);    //извикваме си метода, който създадохме

        //принтираме елементите на матрицата
        printMatrix(palindromesMatrix);      //извикваме си метода, който създадохме


    }


    private static void fillMatrix(String[][] palindromesMatrix) {       //създаваме си метод за присвояване стойности на елементите на матрицата
        char startLetter = 'a';
        for (int row = 0; row < palindromesMatrix.length; row++) {        // for (int row = 0; row < rowsNumber; row++)
            for (int column = 0; column < palindromesMatrix[row].length; column++) {       //for (int column = 0; column < columnsNumber; column++)
                //(a -> b -> c)(startLetter + column)   - така става промяната на втория символ в елементите, които са на един ред
                String palindrome = "" + startLetter + (char) (startLetter + column) + startLetter;       //намираме кой е текущият текст (palindrome)
                //чрез (char) (startLetter + column)  намираме втория символ от текста (който е равен на сумата от началния символ и индекса на текущата колона) и го взимаме като символ (а не като число)
                palindromesMatrix[row][column] = palindrome;     //на текущия елемент на матрицата му присвояваме като стойност намерения palindrome
            }
            //(a -> b -> c)(startLetter + 1)
            startLetter = (char) (startLetter + 1);     //всеки нов ред започва с нова начална буква, която е домоментната + 1 (следващата)
        }
    }


    private static void printMatrix(String[][] palindromesMatrix) {      //създаваме си метод за принтиране на елементите на матрицата
        for (int row = 0; row < palindromesMatrix.length; row++) {
            for (int column = 0; column < palindromesMatrix[row].length; column++) {
                System.out.print(palindromesMatrix[row][column] + " ");
            }

            System.out.println();
        }
    }

}
