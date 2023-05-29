package lecture4ExerciseStacksAndQueues;

import java.util.*;

public class P03MaximumElementVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        Deque<Integer> numbersStack = new ArrayDeque<>();     //създаваме празен Stack от цели числа (не може да е от текстове, защото ще търсим най-голямото число - ще извършваме сравнения на числа)

        for (int counter = 1; counter <= numberOfCommands; counter++) {
            String[] commandPartsArray = scanner.nextLine().split("\\s+");      //четем всеки ред като масив от текстове
            String command = commandPartsArray[0];

            switch (command) {
                case "1":
                    int element = Integer.parseInt(commandPartsArray[1]);     //вторият елемент в масива (който е на индекс 1) е текст, а искаме да го доавим към Stack от цели числа - следователно, трябва да превърнем текста в число
                    numbersStack.push(element);
                    break;
                case "2":
                    numbersStack.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(numbersStack));
                    break;
            }

        }


    }
}
