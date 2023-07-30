package lecture24AssociativeArrays;

import java.util.*;

public class P03OddOccurrencesVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();    //от първия ред на конзолата си прочитаме един текст
        input = input.toLowerCase();      //по условие резултатът трябва да е с малки букви, затова още тук си превръщам всички букви от прочетения текст в малки букви
        String[] inputWithLowerCasesArray = input.split("\\s+");       //сплитваме текста по един или повече интервала и получаваме масив от текстове

        //•	Print the result elements in lowercase in their order of appearance.  -> трябва да използваме LinkedHashMap
        //част от елементите в масива ще са записи/item-и в асоциативен масив  (но този път накрая ще принтираме само ключовете на записите/item-ите)
        LinkedHashMap<String, Integer> oddOccurencesMap = new LinkedHashMap<>();     //създаваме си асоциативен масив - за резултата (само за тези ключове, които се повтарят в прочетения масив нечетен брой пъти)

        //създаваме си for цикъл, за да дотъпим всеки елемент от прочетения от конзолата масив от текстове
        for (int i = 0; i <= inputWithLowerCasesArray.length - 1; i++) {       //for (int i = 0; i < inputWithLowerCasesArray.length; i++)
            String currentElement = inputWithLowerCasesArray[i];     //създаваме си променлива за текущия елемент от масива
            oddOccurencesMap.putIfAbsent(currentElement, 0);      //към асоциативния масив да се добави като ключ (но само ако липсва такъв ключ) текущият елемент от масива, а като стойност в началото е 0
            int value = oddOccurencesMap.get(currentElement);      //създаваме си променлива за стойността на записа (item-а) - намираме текущата стойност, като вземем текущия ключ (в случая ключ е текущият елемент от масива inputWithLowerCasesArray)
            oddOccurencesMap.put(currentElement, value + 1);    //към асоц. масив привидно изглежда, че отново добавяме ключа, който вече се съдържа там), но всъщност ние само презаписваме неговата стойност (в случая стойността е колко пъти даден текст се среща в прочетения от конзолата текст)

        }

        //вместо for цикъл, за да дотъпим всеки елемент от прочетения от конзолата масив от текстове, можехме да създадем foreach цикъл:
//        for (String element : inputWithLowerCasesArray) {
//            oddOccurencesMap.putIfAbsent(element, 0);
//            int value = oddOccurencesMap.get(element);        //създаваме си променлива за стойността на записа (item-а) и като стойност й присвояваме стойността на ключа - елемента от масива numbersArray
//            oddOccurencesMap.put(element, value + 1);
//        }

        //знаем, че асоц. масив се състои от key (ключ) и value (стойност) - в случая целта е всички ключове да се принтират на един ред, затова можем да си създадем лист за ключовете:
        List<String> resultList = new ArrayList<>();      //създаваме си лист, в който ще слагаме ключовете

        for (Map.Entry<String, Integer> entry : oddOccurencesMap.entrySet()) {           //за всеки запис/item (entry) от асоциативния масив
            if (entry.getValue() % 2 != 0) {       //с entry.getValue()   намираме стойността     //ако стойността е нечетно число
                resultList.add(entry.getKey());       //към листа с ключовете да се добави текущият ключ
            }
        }

        //вече събрахме ключовете в един лист (защото целта е да се принтират на един ред); друг от начините за принтиране на лист е чрез for цикъл
        for (int index = 0; index <= resultList.size() - 1; index++) {
            String currentElement = resultList.get(index);
            if (!currentElement.equals(resultList.get(resultList.size() - 1))) {       //ако текущият елемент не е последен
                System.out.print(currentElement + ", ");
            } else {         //в противен случай (ако текущият елемент е последен)
                System.out.print(currentElement);
            }
        }


    }
}
