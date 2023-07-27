package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P11MultiplicationTable2Version2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstMultiplier = Integer.parseInt(scanner.nextLine());    //You will receive an integer as input from the console.  - това ще е числото, което ще умножаваме (първият множител)
        int initialValueOfSecondMultiplier = Integer.parseInt(scanner.nextLine());      //And you will receive the multiplier from the console   - това ще е числото, с което ще почнем да умножаваме първия множител

        //Print the table from the given multiplier to 10. If the given multiplier is more than 10 - print only one row with the integer, the given multiplier, and the product.
        //{theInteger} X {times} = {product}
        //числото firstMultiplier няма да го умножаваме с числата от 1 до 10, а ще го умножаваме с числата от initialValueOfSecondMultiplier до 10

        //С цикъла do while първо изпълняваме кода, после проверяваме условието:
        do {
            int product = firstMultiplier * initialValueOfSecondMultiplier;     //намираме произведението
            System.out.printf("%d X %d = %d%n", firstMultiplier, initialValueOfSecondMultiplier, product);
            initialValueOfSecondMultiplier++;        //инкрементираме си променливата initialValueOfSecondMultiplier  (update на стойността на променливата)      //initialValueOfSecondMultiplier = initialValueOfSecondMultiplier + 1;
        } while (initialValueOfSecondMultiplier <= 10);

    }
}
