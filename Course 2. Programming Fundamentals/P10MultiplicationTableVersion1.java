package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P10MultiplicationTableVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You will receive an integer as input from the console.
        int firstMultiplier = Integer.parseInt(scanner.nextLine());

        // Print the 10 times table for this integer. See the examples below for more information. - {theInteger} X {times} = {product}
        for (int secondMultiplier = 1; secondMultiplier <= 10; secondMultiplier++) {               //създаваме си цикъл за възможните стойности на втория множител (числата от 1 до 10)
            int product = firstMultiplier * secondMultiplier;               //при всяко завъртане на цикъла умножаваме числото, което ще прочетем от конзолата, с текущото число от поредицата от 1 до 10
            System.out.printf("%d X %d = %d%n", firstMultiplier, secondMultiplier, product);               //принтираме на отделни редове формулатна и произведението от множителите
        }

    }
}
