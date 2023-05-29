package lecture4ExerciseStacksAndQueues;

import java.util.*;

public class P03MaximumElementVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        Deque<Integer> numbersStack = new ArrayDeque<>();     //създаваме празен Stack от цели числа (не може да е от текстове, защото ще търсим най-голямото число - ще извършваме сравнения на числа)

        for (int counter = 1; counter <= numberOfCommands; counter++) {
            String command = scanner.nextLine();           //четем всеки ред като текст, който е някаква команда

            if (command.contains("1")) {      //"1 X"  - например "1 97"    "1 20"     "1 26"
                String numberAsText = command.substring(2);       //String numberAsText = command.substring(2, command.length());       //създаваме си substring, за да намерим числото (като текст)
                int number = Integer.parseInt(numberAsText);        //превръщаме числото от текст в число
                numbersStack.push(number);
            } else if (command.equals("2")) {     //"2"
                numbersStack.pop();
            } else if (command.equals("3")) {      //"3"
                System.out.println(Collections.max(numbersStack));
            }

        }


    }
}
