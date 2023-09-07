package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P01IntegerOperationsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read four integer numbers. Add first to the second, divide (integer) the sum by the third number, and multiply the result by the fourth number. Print the result.
        //Constraints the four numbers from the input are in the range [-2,147,483,648… 2,147,483,647].  -> int

        int number1 = Integer.parseInt(scanner.nextLine());    //от първия ред на конзолата прочитаме едно цяло число
        int number2 = Integer.parseInt(scanner.nextLine());    //от първия ред на конзолата прочитаме едно цяло число
        int number3 = Integer.parseInt(scanner.nextLine());    //от първия ред на конзолата прочитаме едно цяло число
        int number4 = Integer.parseInt(scanner.nextLine());    //от първия ред на конзолата прочитаме едно цяло число

        int sumOfNumber1AndNumber2 = number1 + number2;
        int resultOfDivisionOfSumOfTheFirstTwoNumbersAndTheThirdNumber = sumOfNumber1AndNumber2 / number3;     //при целочислено деление резултатът по подразбиране е цяло число (ако има остатък, го губим)
        int product = resultOfDivisionOfSumOfTheFirstTwoNumbersAndTheThirdNumber * number4;
        System.out.println(product);
        //System.out.printf("%d", product);
    }
}
