package lecture6ExerciseMultidimensionalArrays;

import java.util.Scanner;

public class P01FillTheMatrixVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четем входни данни за матрица N x N (тоест брой редове = брой колони) - квадратна е
        String input = scanner.nextLine();
        String[] inputPartsArray = input.split(", ");
        int n = Integer.parseInt(inputPartsArray[0]);    //брой редове (следователно и брой колони)
        String pattern = inputPartsArray[1];    //шаблон  (може да бъде шаблон "A" или шаблон "B")

        //създаваме си целочислена матрица
        int[][] numbersMatrix = new int[n][n];     //ако определим и брой колони:    int[][] numbersMatrix = new int[n][n];     - всички елементи са с дефолтна стойност 0
        //ако определим само брой редове, всички редове са с дефолтна стойност  null   (има място за елементи, но още няма елементи)  //обаче в случая това не е подходящо, защото ще обхождаме матрицата по колони, а не по редове

        //присвояваме стойности на елементите на матрицата
        switch (pattern) {
            case "A":    //в случай че шаблонът е "A" 
                fillMatrixPatternA(numbersMatrix);       //извикваме си метода, който създадохме и му подаваме аргумент
                break;
            case "B":    //или в случай че шаблонът е "В"
                fillMatrixPatternB(numbersMatrix);       //извикваме си метода, който създадохме и му подаваме аргумент
                break;
        }

        //принтираме елементите на матрицата
        printMatrix(numbersMatrix);      //извикваме си метода, който създадохме

    }


    private static void fillMatrixPatternA(int[][] matrix) {           //създаваме си метод за присвояване на стойности на елементите на матрица, която е по шаблон "A"
        int startNumber = 1;   //ще пълним матрицата с числата от 1 до колкото се побере в прочетения брой редове и колони - създаваме си променлива с нач. стойност 1
        //този път във външния цикъл итерираме по колони, а във вътрешния цикъл - по всички редове на текущата колона
        for (int column = 0; column < matrix.length; column++) {   //по принцип брой колони на текущия ред намираме чрез  matrix[row].length    //а брой редове - чрез matrix.length
            //но това е квадратна матрица и бр. редове = бр. колони  -> за брой колони също можем да ползваме   matrix.length
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][column] = startNumber;      //на текущия елемент от матрицата присвояваме като стойност startNumber
                startNumber++;      //увеличаваме стойността на startNumber с единица    //startNumber = startNumber + 1;
            }

        }
    }


    private static void fillMatrixPatternB(int[][] matrix) {       //създаваме си метод за присвояване на стойности на елементите на матрица, която е по шаблон "B"
        int startNumber = 1;
        //този път във външния цикъл итерираме по колони, а във вътрешния цикъл - по всички редове на текущата колона
        for (int column = 0; column < matrix.length; column++) {   //по принцип брой колони на текущия ред намираме чрез  matrix[row].length    //а брой редове - чрез matrix.length
            //но това е квадратна матрица и бр. редове = бр. колони  -> за брой колони също можем да ползваме   matrix.length

            //за итерацията по редове имаме два варианта:
            if (column % 2 == 0) {       //ако индексът за колона е четен, за текущата колона итерираме по редовете от горе надолу (от първия до последния ред)
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][column] = startNumber;      //на текущия елемент от матрицата присвояваме като стойност startNumber
                    startNumber++;      //увеличаваме стойността на startNumber с единица    //startNumber = startNumber + 1;
                }
            } else {        //в противен случай (ако индексът за колона е нечетен) - за текущата колона итерираме по редовете от долу нагоре (от последния до първия ред)
                for (int row = matrix.length - 1; row >= 0; row--) {  //matrix.length - 1 е индексът на последния ред   //matrix.length е брой редове
                    matrix[row][column] = startNumber;      //на текущия елемент от матрицата присвояваме като стойност startNumber
                    startNumber++;      //увеличаваме стойността на startNumber с единица    //startNumber = startNumber + 1;
                }
            }

        }

    }


    private static void printMatrix(int[][] numbersMatrix) {       //създаваме си метод за принтиране на елементите на матрицата
        for (int row = 0; row < numbersMatrix.length; row++) {
            for (int column = 0; column < numbersMatrix[row].length; column++) {
                System.out.print(numbersMatrix[row][column] + " ");
            }

            System.out.println();
        }
    }


}
