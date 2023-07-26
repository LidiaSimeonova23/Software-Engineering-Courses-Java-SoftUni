package lecture5BasicSyntaxConditionalStatementsAndLoops;

public class P08DivisibleBy3Version2 {
    public static void main(String[] args) {


        //Write a program that prints all the numbers from 1 to 100, which are divisible by 3. You have to use a single for loop. The program should not receive input.

        for (int currentNumber = 3; currentNumber <= 99; currentNumber += 3) {
            System.out.println(currentNumber);      //тук дори не правим проверка, тъй като в условието на цикъла си осигурихме (чрез стъпка += 3) на всяка итерация текущото число да е кратно на 3  (3, 6, 9, 12 ... 99)
        }

    }
}
