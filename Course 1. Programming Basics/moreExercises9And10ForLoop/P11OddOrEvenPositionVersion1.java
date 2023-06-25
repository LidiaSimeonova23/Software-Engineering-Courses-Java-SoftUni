package moreExercises9And10ForLoop;

import java.util.Scanner;

public class P11OddOrEvenPositionVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете n-на брой числа, въведени от потребителя, и пресмята сумата, минимума и максимума на числата на четни и нечетни позиции (броим от 1).
        //Когато няма минимален / максимален елемент, отпечатайте "No".

        int numbersCount = Integer.parseInt(scanner.nextLine());         //число (цяло), което показва колко на брой числа ще прочетем след това

        //Използвайте неутрална начална стойност при намиране на минимум / максимум, например 1000000000.0 и -1000000000.0. Ако получите накрая неутралната стойност, печатайте “No”.
        double sumOfNumbersInOddPositions = 0;
        double sumOfNumbersInEvenPositions = 0;
        double maxNumberInOddPosition = -1000000000.0;
        double minNumberInOddPosition = 1000000000.0;
        double maxNumberInEvenPosition = -1000000000.0;
        double minNumberInEvenPosition = 1000000000.0;
        for (int position = 1; position <= numbersCount; position++) {           //при създаване на цикъла за име на променлива ползвам position вместо i
            double currentNumber = Double.parseDouble(scanner.nextLine());    //на всяка итерация на цикъла ще четем текущото число

            if (position % 2 != 0) {       //if (position % 2 == 1)     //ако позицията на числото е нечетна
                sumOfNumbersInOddPositions = sumOfNumbersInOddPositions + currentNumber;

                if (currentNumber > maxNumberInOddPosition) {       //намираме най-голямото число на нечетна позиция
                    maxNumberInOddPosition = currentNumber;
                }

                if (currentNumber < minNumberInOddPosition) {       //намираме най-малкото число на нечетна позиция
                    minNumberInOddPosition = currentNumber;
                }

            } else {      //else if (position % 2 == 0)     //ако позицията на числото е четна
                sumOfNumbersInEvenPositions = sumOfNumbersInEvenPositions + currentNumber;

                if (currentNumber > maxNumberInEvenPosition) {        //намираме най-голямото число на четна позиция
                    maxNumberInEvenPosition = currentNumber;
                }

                if (currentNumber < minNumberInEvenPosition) {        //намираме най-малкото число на четна позиция
                    minNumberInEvenPosition = currentNumber;
                }

            }

        }


        System.out.printf("OddSum=%.2f,%n", sumOfNumbersInOddPositions);


        if (minNumberInOddPosition == 1000000000.0) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", minNumberInOddPosition);
        }


        if (maxNumberInOddPosition == -1000000000.0) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,%n", maxNumberInOddPosition);
        }


        System.out.printf("EvenSum=%.2f,%n", sumOfNumbersInEvenPositions);


        if (minNumberInEvenPosition == 1000000000.0) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,%n", minNumberInEvenPosition);
        }


        if (maxNumberInEvenPosition == -1000000000.0) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f", maxNumberInEvenPosition);
        }


    }
}

