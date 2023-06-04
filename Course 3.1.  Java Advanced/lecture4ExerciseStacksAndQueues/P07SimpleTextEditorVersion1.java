package lecture4ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P07SimpleTextEditorVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder currentText = new StringBuilder();        //създаваме си празен StringBuilder, защото е по-функционален от String      //String currentText = "";

        Deque<String> textsStack = new ArrayDeque<>();

        for (int count = 1; count <= n; count++) {
            String command = scanner.nextLine();

            if (command.startsWith("1")) {      //command = "1 {string}"       // if (command.contains("1"))
                //преди модификация съхраняваме текущото състояние на текста преди промяната
                textsStack.push(currentText.toString());      //понеже currentText е StringBuilder, за да го добавим към Stack от String-ове, го превръщаме в String

                String[] commandPartsArray = command.split("\\s+");
                String textToAppend = commandPartsArray[1];
                currentText.append(textToAppend);
            } else if (command.startsWith("2")) {     //command = "2 {count}"       // if (command.contains("2"))
                //преди модификация съхраняваме текущото състояние на текста преди промяната
                textsStack.push(currentText.toString());

                String[] commandPartsArray = command.split("\\s+");
                int countOfElementsToErase = Integer.parseInt(commandPartsArray[1]);
                int startIndex = currentText.length() - countOfElementsToErase;
                currentText.delete(startIndex, currentText.length());
            } else if (command.startsWith("3")) {      //command = "3 {index}"      // if (command.contains("3"))
                String[] commandPartsArray = command.split("\\s+");
                int position = Integer.parseInt(commandPartsArray[1]);          //позиция на буквата в думата
                char symbol = currentText.charAt(position - 1);      //position - 1 e индексът на буквата
                System.out.println(symbol);
            } else if (command.equals("4")) {      //command = "4"
                if (!textsStack.isEmpty()) {
                    String lastStateOfText = textsStack.pop();
                    currentText = new StringBuilder(lastStateOfText);      //понеже currentText е StringBuilder, а lastStateOfText беше String, превърнахме lastStateOfText също в StringBuilder
                }
            }

        }


    }
}
