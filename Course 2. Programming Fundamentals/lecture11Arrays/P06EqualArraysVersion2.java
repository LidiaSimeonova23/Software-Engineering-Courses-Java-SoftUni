package lecture11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArraysVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //може да се наложи да извършваме аритметични операции - ще четем масиви от цели числа
        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        //в тази задача съгласно изходните данни се приема, че дължините на масивите ще са еднакви, затова няма да проверяваме дължините
        int sum = 0;
        for (int index = 0; index <= firstArray.length - 1; index++) {         //for (int index = 0; index < firstArray.length; index++)
            if (firstArray[index] != secondArray[index]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", index);
                return;
            } else {
                sum += firstArray[index];
            }
        }

        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
