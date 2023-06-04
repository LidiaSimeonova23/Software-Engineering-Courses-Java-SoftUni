package lecture4ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P07SimpleTextEditorVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder currentText = new StringBuilder();             //String currentText = "";

        Deque<String> textsStack = new ArrayDeque<>();

        for (int count = 1; count <= n; count++) {
            String[] commandPartsArray = scanner.nextLine().split("\\s+");
            String command = commandPartsArray[0];      //във всички редове първият текст е командата, затова още тук си я изнасяме в променлива (това е общо за всички)

            switch (command) {
                case "1":       //command = "1"
                    //преди модификация съхраняваме текущото състояние на текста преди промяната
                    textsStack.push(currentText.toString());        //чрез currentText.toString()  превръщаме currentText (който е StringBuilder) в String, за да можем да го добавим към Stack от String-ове

                    String textToAppend = commandPartsArray[1];
                    currentText.append(textToAppend);
                    break;
                case "2":     //command = "2"
                    //преди модификация съхраняваме текущото състояние на текста преди промяната
                    textsStack.push(currentText.toString());

                    int countOfElementsToErase = Integer.parseInt(commandPartsArray[1]);
                    int startIndex = currentText.length() - countOfElementsToErase;    //намираме началния index, от който трябва да почне триенето
                    currentText.delete(startIndex, currentText.length());       //последният символ е на индекс currentText.length() - 1   //трием всичко от startIndex до endIndex, но не включително endIndex    //понеже искаме да изтрием и последния символ, става currentText.length() - 1 + 1
                    break;
                case "3":      //command = "3"
                    int position = Integer.parseInt(commandPartsArray[1]);          //позиция на буквата в думата
                    int index = position - 1;         //position - 1 e индексът на буквата      //пример: първият елемент е на индекс 0     осмият елемент е на индекс 7
                    char symbol = currentText.charAt(index);
                    System.out.println(symbol);
                    break;
                case "4":     //command = "4"
                    if (!textsStack.isEmpty()) {
                        String lastStateOfText = textsStack.pop();
                        currentText = new StringBuilder(lastStateOfText);      //понеже currentText е StringBuilder, а lastStateOfText беше String, превърнахме lastStateOfText също в StringBuilder
                        break;
                    }
            }

        }


    }
}
