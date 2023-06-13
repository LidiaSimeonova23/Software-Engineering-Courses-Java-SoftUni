package lecture6ExerciseMultidimensionalArrays;

import java.util.Scanner;

public class P05MatrixShufflingVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от първия ред на конзолата четем измеренията на матрицата
        String dimensionsOfMatrix = scanner.nextLine(); //"3 4".split(" ") -> ["3", "4"]
        String[] rowsAndColumnsArray = dimensionsOfMatrix.split("\\s+");
        int rowsNumber = Integer.parseInt(rowsAndColumnsArray[0]);     //брой редове на матрицата
        int columnsNumber = Integer.parseInt(rowsAndColumnsArray[1]);     //брой колони на матрицата

        //създаваме си матрица - от текстове ще е
        String[][] matrix = new String[rowsNumber][columnsNumber];

        //присвояваме стойности (които четем от конзолата) на елементите на матрицата
        fillMatrix(matrix, scanner);      //извикваме си метода, който създадохме

        //четем команди - ако командата е валидно, разменяме местата на 2 елемента, ако командата е невалидно, принтираме, че е невалидна и преминаваме на следващата (ако има такава)
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            if (isValidCommand(command, rowsNumber, columnsNumber)) {     //ако командата е валидна, ще трябва да разменим местата на двата елемента   //извикваме си метода, който създадохме - за проверка на валидността на командата
                String[] commandParts = command.split("\\s+");
                //command = "swap 1 2 2 3"
                //"swap 1 2 2 3".split(" ") -> ["swap", "1", "2", "2", "3"]

                //координатите (индекс за ред и индекс за колона) на първия елемент, който трябва да разменим
                //отново си създаваме променливи за координатите на двата елемента (ние вече направихме това в отделен метод, но онези данни ги няма в main метода, затова правим същото отново
                int row1 = Integer.parseInt(commandParts[1]); //индекс за ред на първия елемент
                int col1 = Integer.parseInt(commandParts[2]); //индекс за колона на първия елемент

                //координатите (индекс за ред и индекс за колона) на втория елемент, който трябва да разменим
                int row2 = Integer.parseInt(commandParts[3]);  //индекс за ред на втория елемент
                int col2 = Integer.parseInt(commandParts[4]);  //индекс за колона на втория елемент

                //създаваме си променливи за двата елемента
                String firstElement = matrix[row1][col1];      //създаваме си променлива за първия елемент, чието място трябва да сменим
                String secondElement = matrix[row2][col2];     //създаваме си променлива за втория елемент, чието място трябва да сменим

                //разменяме местата на двата елемента:
                matrix[row1][col1] = secondElement;      //на взетите от командата индекси за ред и за колона на първия елемент присвояваме като стойност втория елемент
                matrix[row2][col2] = firstElement;       //на взетите от командата индекси за ред и за колона на втория елемент присвояваме като стойност първия елемент

                //принтираме матрицата (след като сме сменили местата на елементите)
                printMatrix(matrix);      //извикваме си метода, който създадохме
            } else {    //в противен случай (ако командата е невалидна)
                System.out.println("Invalid input!");
            }

            command = scanner.nextLine();       //update на входните данни (в противен случай ще четем само първия ред с команда и ще се получи безкраен цикъл)
        }

    }


    private static void fillMatrix(String[][] matrix, Scanner scanner) {       //създаваме си метод за присвояване на стойности на елементите от матрицата
        for (int row = 0; row < matrix.length; row++) {    //for (int row = 0; row < rowsNumber; row++)
            //scanner.nextLine() -> "1 2 3"
            //scanner.nextLine().split(" ") -> ["1", "2", "3"]
            String[] rowDataArray = scanner.nextLine().split("\\s+");
            matrix[row] = rowDataArray;    //на текущия ред от матрицата присвояваме като стойност текущо прочетения масив от текстове
        }
    }


    private static boolean isValidCommand(String command, int rowsNumber, int columnsNumber) {    //създаваме си метод, който ни връща дали прочетената команда е валидна, или не
        //true -> ако командата е валидна
        //false -> ако командата не е валидна
        //валидната команда е в следния вид:   command = "swap row1 col1 row2 col2"
        //валидната команда трябва да почва със "swap" и следващите елементи да са точно 4 числа (те са индекси за редове и колони)
        String[] commandPartsArray = command.split("\\s+");      //този масив го четем като масив от текстове, защото в него има и текстове, и числа (после допълнително ще си превръщаме числата от String в int)
        //"swap 1 3 4 6".split(" ") -> ["swap", "1", "3", "4", "6"]

        //НАЙ-ЛЕСНО Е ДА ТЪРСИМ РАЗЛИКА - АКО ИМА ТАКАВА, ВЕДНАГА ПРАВИМ ИЗВОД, ЧЕ КАМАНДАТА Е НЕВАЛИДНА
        //първа условие за валидност на командата  - ако броят на параметрите /частите на командата/ е различен от 5 -> значи командата е невалидна
        if (commandPartsArray.length != 5) {
            return false;
        }

        //второ условие за валидност на командата  - ако първият елемент (на индекс 0) от прочетения масив  не е "swap" -> значи командата е невалидна
        if (!commandPartsArray[0].equals("swap")) {
            return false;
        }

        //трето условие за валидност на командата  - дали дадените/прочетените индекси за редове и колони съществуват в матрицата
        //до момента те са ни текстове, сега ни трябват като индекси (цели числа), затова ще ги превръщаме в цели числа
        int row1 = Integer.parseInt(commandPartsArray[1]);      //за валидност:    >= 0 && < бр. редове
        int col1 = Integer.parseInt(commandPartsArray[2]);   //за валидност:    >= 0 && < бр. колони
        int row2 = Integer.parseInt(commandPartsArray[3]);      //за валидност:    >= 0 && < бр. редове
        int col2 = Integer.parseInt(commandPartsArray[4]);   //за валидност:    >= 0 && < бр. колони

        //условия за невалидност на индексите:      (достатъчно е да има дори само един невалиден индекс и цялата команда става невалидна)
        if (row1 < 0 || row1 >= rowsNumber || row2 < 0 || row2 >= rowsNumber || col1 < 0 || col1 >= columnsNumber || col2 < 0 || col2 >= columnsNumber) {
            return false;
        }

        //ако сме преминали през всички проверки и не сме срещнали return false;    - значи командата е валидна по всички параметри и методът трябва да ни върне, че командата е валидна
        return true;
    }


    private static void printMatrix(String[][] matrix) {        //създаваме си метод за принтиране на елементите на матрица от текстове
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();    //сваляме курсора на следващия ред
        }
    }

}
