package lecture5BasicSyntaxConditionalStatementsAndLoops;

public class P08DivisibleBy3Version1 {
    public static void main(String[] args) {


        //Write a program that prints all the numbers from 1 to 100, which are divisible by 3. You have to use a single for loop. The program should not receive input.

        for (int currentNumber = 1; currentNumber <= 100; currentNumber++) {
            if (currentNumber % 3 == 0) {
                System.out.println(currentNumber);
            }
        }

    }
}
