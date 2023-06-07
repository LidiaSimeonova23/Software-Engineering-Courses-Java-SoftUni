package lecture5MultidimensionalArrays;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] array = {{1, 2}, {3, 4}};

        // Iterate through rows
        for (int i = 0; i < array.length; i++) {
            // Iterate through columns
            for (int j = 0; j < array[i].length; j++) {
                // Print the element at the current position
                System.out.print(array[i][j] + " ");
            }

            System.out.println(); // Move to the next line after each row
        }


        System.out.println("********************************************************");


        int[][] tableMatrix = new int[3][2];
        System.out.println(tableMatrix.length);         //принтираме брой редове  - в случая са 3
        System.out.println(tableMatrix[0].length);      //принтираме брой колони на първия ред (който е на индекс 0) - в случая са 2
        System.out.println(tableMatrix[1].length);      //принтираме брой колони на втория ред (който е на индекс 1) - в случая са 2
        System.out.println(tableMatrix[2].length);      //принтираме брой колони на третия ред (който е на индекс 2) - в случая са 2


        System.out.println("********************************************************");


        int[][] numsArray = new int[3][4];
        for (int row = 0; row < numsArray.length; row++) {
            for (int col = 0; col < numsArray[0].length; col++) {
                int currentElement = numsArray[row][col];
                currentElement = row + col;
                System.out.print(numsArray[row][col]);
            }

            System.out.println();
        }


        System.out.println("********************************************************");


        int[][] numsMatrix = {{1, 2, 13, 4}, {-9, 3, -7, 4}, {-2, -3, 19, 24}};
        for (int row = 0; row < numsMatrix.length; row++) {
            for (int col = 0; col < numsMatrix[0].length; col++) {
                int currentElement = numsMatrix[row][col];
                System.out.print(currentElement + " ");
                //System.out.printf("%d ", numsMatrix[row][col]);
            }

            System.out.println();
        }


        System.out.println("********************************************************");


        int[][] nMatrix = {{1, 2, 13, 4}, {-9, 3, -7, 4}, {-2, -3, 19, 24}};
        nMatrix[1][2] = 40;         //присвояваме нова стойност на елемента от масива, който е на ред 1, колона 2   (и вместо -7 вече е 40)
        for (int row = 0; row < nMatrix.length; row++) {
            for (int col = 0; col < nMatrix[0].length; col++) {
                int currentElement = nMatrix[row][col];
                currentElement = row + col;
                //System.out.print(namesArray[row][col] + " ");
                System.out.printf("%d ", nMatrix[row][col]);
            }

            System.out.println();
        }


        System.out.println("********************************************************");


        int[][] numbers2DimensionalArray = new int[3][4];
        numbers2DimensionalArray[1][2] = 40;         //присвояваме нова стойност на елемента от масива, който е на ред 1, колона 2   (и вместо -7 вече е 40)
        for (int row = 0; row < numbers2DimensionalArray.length; row++) {
            for (int col = 0; col < numbers2DimensionalArray[0].length; col++) {
                int currentElement = numbers2DimensionalArray[row][col];
//                currentElement = row + col;
                //System.out.print(namesArray[row][col] + " ");
                System.out.printf("%d ", numbers2DimensionalArray[row][col]);
            }

            System.out.println();
        }


        System.out.println("********************************************************");


        String[][] namesArray = new String[2][4];
//        namesArray[1][2] = "Martina";         //присвояваме нова стойност на елемента от масива, който е на ред 1, колона 2   (и вместо null вече е "Martina")
        for (int row = 0; row < namesArray.length; row++) {
            for (int col = 0; col < namesArray[0].length; col++) {
                String currentElement = namesArray[row][col];
                //System.out.print(namesArray[row][col] + " ");
                System.out.printf("%s ", namesArray[row][col]);
            }

            System.out.println();
        }


        System.out.println("********************************************************");


        double[][] numbersArray = new double[3][2];
        double newValue = 56.24;

// Set the new value for all elements in symbolsArray
        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = 0; j < numbersArray[i].length; j++) {
                numbersArray[i][j] = newValue;       //Set the new value
                System.out.print(numbersArray[i][j] + " ");        //Print all the elements in the matrix
            }

            System.out.println();
        }


        System.out.println("********************************************************");

        String[][] wordsArray = new String[2][5];

// Set the new value for all elements in symbolsArray
        for (int i = 0; i < wordsArray.length; i++) {
            for (int j = 0; j < wordsArray[i].length; j++) {
                wordsArray[i][j] = "'Maria" + i + j;       //Set the new value
                System.out.print(wordsArray[i][j] + " ");        //Print all the elements in the matrix
            }

            System.out.println();
        }


        System.out.println("********************************************************");

        int[][] numbersMatrix = new int[2][5];

// Set the new value for all elements in symbolsArray
        for (int row = 0; row < numbersMatrix.length; row++) {
            for (int column = 0; column < numbersMatrix[row].length; column++) {
                int currentElement = numbersMatrix[row][column];
                currentElement = 5 + row + column;   //Set the new value
                System.out.print(currentElement + " ");        //Print all the elements in the matrix
            }

            System.out.println();
        }

    }
}
