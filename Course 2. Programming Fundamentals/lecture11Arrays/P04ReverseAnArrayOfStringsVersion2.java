package lecture11Arrays;

import java.util.Scanner;

public class P04ReverseAnArrayOfStringsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputArray = scanner.nextLine().split(" ");     //от конзолата четем масив от текстове
        //чрез scanner.nextLine() четем цял ред от конзолата като String  и чрез split(" ") го разделяме на масив от String-ове   //например:  "-1 hi ho w"   ->  ["-1", "hi", "ho", "w"]

        //трябва да принтираме елементите от масива в обратен ред -> чрез for цикъл - от последния елемент към първия елемент
        for (int index = inputArray.length - 1; index >= 0; index--) {
            String currentElement = inputArray[index];   //създаваме променлива за текущия елемент от масива и й присвояваме като стойност елемента от масива на текущия index
            System.out.println(String.join(" ", inputArray));   //принтираме елементите на масива чрез метода String.join - всички елементи да са на един ред с интервал между тях
            //System.out.print(currentElement + " ");
            //System.out.printf("%s ", currentElement);
        }

    }
}
