package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P10MultiplicationTableVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You will receive an integer as input from the console.
        int firstMultiplier = Integer.parseInt(scanner.nextLine());

        // Print the 10 times table for this integer. See the examples below for more information. - {theInteger} X {times} = {product}
        int secondMultiplier = 1;      //като нач. стойност задаваме числото 1 (а не 0), защото ще участва в аритметични операции умножение
        while (secondMultiplier <= 10) {               //създаваме цикъл за втория множител с възможните му стойности (числата от 1 до 10)
            int product = firstMultiplier * secondMultiplier;             //при всяко завъртане на цикъла умножаваме числото, което ще прочетем от конзолата, с число от поредицата от 1 до 10
            System.out.printf("%d X %d = %d%n", firstMultiplier, secondMultiplier, product);        //принтираме на отделни редове формулата и произведението от множителите

            secondMultiplier++;   //update на входните данни - инкрементация - стойността на променливата ще нараства с единица на всяка следваща итерация на цикъла   //secondMultiplier = secondMultiplier + 1;         //secondMultiplier += 1;
        }

    }
}
