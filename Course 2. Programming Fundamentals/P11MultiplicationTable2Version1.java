package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P11MultiplicationTable2Version1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstMultiplier = Integer.parseInt(scanner.nextLine());    //You will receive an integer as input from the console.  - това ще е числото, което ще умножаваме (първият множител)
        int initialValueOfSecondMultiplier = Integer.parseInt(scanner.nextLine());      //And you will receive the multiplier from the console   - това ще е числото, с което ще почнем да умножаваме първия множител

        //Print the table from the given multiplier to 10. If the given multiplier is more than 10 - print only one row with the integer, the given multiplier, and the product.
        //{theInteger} X {times} = {product}
        //числото firstMultiplier няма да го умножаваме с числата от 1 до 10, а ще го умножаваме с числата от initialValueOfSecondMultiplier до 10

        if (initialValueOfSecondMultiplier > 10) {               //първо проверяваме дали initialValueOfSecondMultiplier > 10 - ако да, принтираме само 1 ред с произведението на firstMultiplier * initialValueOfSecondMultiplier
            int result = firstMultiplier * initialValueOfSecondMultiplier;
            System.out.printf("%d X %d = %d", firstMultiplier, initialValueOfSecondMultiplier, result);
        }

        for (int secondMultiplier = initialValueOfSecondMultiplier; secondMultiplier <= 10; secondMultiplier++) {           //щом горното условие е false (тоест, числото initialValueOfSecondMultiplier не е > 10), принтираме на отделни редове произведението на firstMultiplier с всяко от числата от initialValueOfSecondMultiplier  до 10
            int product = firstMultiplier * secondMultiplier;
            System.out.printf("%d X %d = %d%n", firstMultiplier, secondMultiplier, product);
        }

    }
}
