package lecture24AssociativeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04WordFilterVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArray = scanner.nextLine().split(" ");     //от първия ред на конзолата си прочитаме масив от текстове (няма да ги манипулираме)
                                                                      //задачата може да се реши и с лист, но тъй като няма да манипулираме елементите, по-бързо става с масив

        //чрез foreach цикъл - итерираме  по масива (индекс по индекс) и намираме дължината на всеки елемент; накрая ще принтираме само елементити, чиято дължина е четна
        for (String element : wordsArray) {
            int lengthElement = element.length();      //намираме дължината (брой символи) на текущия елемент (текст)

            if (lengthElement % 2 == 0) {        //на всяка итерация на цикъла правим проверка - ако дължината на текущия елемент е четна ->
                System.out.println(element);       //да се принтира текущият елемент (всеки елемент на отделен ред)
            }

        }

        //същото нещо можехме да направим и чрез for цикъл - итерираме  по масива (индекс по индекс) и намираме дължината на всеки елемент; накрая ще принтираме само елементити, чиято дължина е четна
//        for (int i = 0; i <= wordsArray.length - 1; i++) {     //for (int i = 0; i < wordsArray.length; i++)
//            String currentElement = wordsArray[i];          //създаваме си променлива за текущия елемент от масива - той е елементът на текущия индекс
//            int lengthCurrentElement = currentElement.length();      //намираме дължината (брой символи) на текущия елемент (текст)
//
//            if (lengthCurrentElement % 2 == 0) {        //на всяка итерация на цикъла правим проверка - ако дължината на текущия елемент е четна ->
//                System.out.println(currentElement);       //да се принтира текущият елемент (всеки елемент на отделен ред)
//            }
//
//        }


    }
}
