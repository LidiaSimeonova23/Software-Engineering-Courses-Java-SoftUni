package lecture5MultidimensionalArrays;

import java.util.Scanner;

public class P03IntersectionOfTwoMatricesVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. четем брой редове и брой колони - и за двете матрици са еднакви
        int rowsNumber = Integer.parseInt(scanner.nextLine());
        int columnsNumber = Integer.parseInt(scanner.nextLine());

        //2. създаваме си първата матрица (двумерен масив) от символи - всички елементи са с дефолтна стойност
        char[][] firstMatrix = new char[rowsNumber][columnsNumber];

        //четене на стойности за първата матрица (присвояваме стойности на елементите й)
        for (int row = 0; row < rowsNumber; row++) {        //for (int row = 0; row < firstMatrix.length; row++)        //for (int row = 0; row <= firstMatrix.length - 1; row++)
            String[] rowDataArray = scanner.nextLine().split(" ");      //масив от текстове

            for (int column = 0; column < columnsNumber; column++) {      //for (int column = 0; column < firstMatrix[row].length; column++)        //for (int column = 0; column <= firstMatrix[row].length - 1; column++)
                firstMatrix[row][column] = (rowDataArray[column]).charAt(0);      //текущият елемент на масива rowDataArray е rowDataArray[column] и е от тип String    и чрез .charAt(0) го превръщаме в променлива от тип char
            }

        }


        //3. създаваме си втората матрица (двумерен масив) от символи - всички елементи са с дефолтна стойност (втората матрица има същия брой редове и колони като първата матрица)
        char[][] secondMatrix = new char[rowsNumber][columnsNumber];

        //четене на стойности за първата матрица (присвояваме стойности на елементите й)
        for (int row = 0; row < rowsNumber; row++) {        //for (int row = 0; row < firstMatrix.length; row++)        //for (int row = 0; row <= firstMatrix.length - 1; row++)
            String[] rowDataArray = scanner.nextLine().split(" ");      //масив от текстове

            for (int column = 0; column < columnsNumber; column++) {      //for (int column = 0; column < firstMatrix[row].length; column++)        //for (int column = 0; column <= firstMatrix[row].length - 1; column++)
                secondMatrix[row][column] = (rowDataArray[column]).charAt(0);      //текущият елемент на масива rowDataArray е rowDataArray[column] и е от тип String    и чрез .charAt(0) го превръщаме в променлива от тип char
            }

        }

        //4. създаваме си трета матрица - от толкова редове и толкова колони, колкото има първата (и втората) матрици
        char[][] thirdMatrix = new char[rowsNumber][columnsNumber];

        //5. сравняваме първата и втората матрица - по условие ни е дадено, че имат еднакъв брой редове и еднакъв брой колони - следователно, тези неща няма да ги проверяваме
        //ще итерираме по елементите на една от двете матрици (няма значение коя от двете) и ще сравняваме текущия елемент на едната с текущия елемент на другата ->
        // и ако съвпадат, присъединяваме този елемент към третата матрица
        // а ако са различни, към третата матрица присъединяваме символа '*' //като символ, защото е матрица от символи
        for (int row = 0; row < rowsNumber; row++) {
            for (int column = 0; column < columnsNumber; column++) {
                if (firstMatrix[row][column] == secondMatrix[row][column]) {           //ако текущият елемент от първата матрица е същият като текущия елемент от втората матрица
                    thirdMatrix[row][column] = firstMatrix[row][column];        //на текущия елемент от третата матрица му присвояваме като стойност текущия елемент от първата (или от втората) матрица
                    //thirdMatrix[row][column] = secondMatrix[row][column];
                } else {    //в противен случай (ако текущият елемент от първата матрица е различен от текущия елемент от втората матрица)
                    thirdMatrix[row][column] = '*';     //на текущия елемент от третата матрица му присвояваме като стойност символа (защото матрицата е от тип char) звездичка
                }
            }

            //System.out.println();    //сваляме на нов ред (за да принтираме следващия ред с елементи на нов ред)
        }


        //6. принтираме елементите на третата матрица
        for (int row = 0; row < thirdMatrix.length; row++) {
            for (int column = 0; column < thirdMatrix[row].length; column++) {
                System.out.print(thirdMatrix[row][column] + " ");
            }

            System.out.println();
        }

    }
}

