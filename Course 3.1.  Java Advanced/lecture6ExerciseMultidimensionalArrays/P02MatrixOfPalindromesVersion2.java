package lecture6ExerciseMultidimensionalArrays;

import java.util.Scanner;

public class P02MatrixOfPalindromesVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //palindromes - думи или числа, които и в прав, и в обратен ред се четат по един и същи начин  //1001, 202, madam, racecar

        //четем си входните данни
        String input = scanner.nextLine();
        String[] inputPartsArray = input.split("\\s+");
        int rowsNumber = Integer.parseInt(inputPartsArray[0]);    //брой редове в матрицата
        int columnsNumber = Integer.parseInt(inputPartsArray[1]);    //брой колони

        //създаваме си матрица
        String[][] palindromesMatrix = new String[rowsNumber][columnsNumber];

        //присвояваме стойност на текущия елемент от матрицата и веднага го принтираме
        char startLetter = 'a';
        for (int row = 0; row < palindromesMatrix.length; row++) {        // for (int row = 0; row < rowsNumber; row++)
            for (int column = 0; column < palindromesMatrix[row].length; column++) {       //for (int column = 0; column < columnsNumber; column++)
                //(a -> b -> c)(startLetter + column)
                String palindrome = "" + startLetter + (char) (startLetter + column) + startLetter;       //намираме кой е текущият текст (palindrome)
                palindromesMatrix[row][column] = palindrome;      //на текущия елемент на матрицата му присвояваме като стойност намерения palindrome
                System.out.print(palindromesMatrix[row][column] + " ");      //принтираме текущия елемент от текущия ред и интервал след него
            }
            System.out.println();
            //(a -> b -> c)(startLetter + 1)
            startLetter = (char) (startLetter + 1);     //всеки нов ред започва с нова начална буква, която е домоментната + 1 (следващата)
        }

    }
}
