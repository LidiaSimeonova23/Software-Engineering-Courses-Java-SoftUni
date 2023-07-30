package lecture24AssociativeArrays;

import java.util.*;

public class P03OddOccurrencesVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");   //от първия ред на конзолата си четем масив от текстове  (четем цял ред като текст, сплитваме го по интервал и получаваме масив от текстове)

        //•	Print the result elements in lowercase in their order of appearance.  -> трябва да използваме LinkedHashMap
        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();  //създаваме си асоциативен масив - за резултата (само за тези ключове, които се повтарят в прочетения масив нечетен брой пъти)

        //за да дотъпим всеки елемент от прочетения от конзолата масив от текстове, си създаваме foreach цикъл (също става и с for цикъл):
        for (String word : inputArray) {       //за всеки елемент (елементът в случая е цяла дума) от прочетения от конзолата масив
            word = word.toLowerCase();        //всеки елемент (текст) от масива с текстовете го превръщаме в текст само от малки букви

            wordsMap.putIfAbsent(word, 0);    //към асоциативния масив да се добави като ключ (но само ако липсва такъв ключ) текущият елемент от масива, а като стойност в началото е 0
            //int value = wordsMap.get(word);
            wordsMap.put(word, wordsMap.get(word) + 1);    //към асоц. масив привидно изглежда, че отново добавяме ключа, който вече се съдържа там), но всъщност ние само презаписваме неговата стойност (в случая стойността е колко пъти даден текст се среща в прочетения от конзолата текст)

            //можем да добавяме записи към асоц. масив и чрез .containsKey(key)
//            if (!wordsMap.containsKey(word)) {
//                wordsMap.put(word, 0);
//            }
//            wordsMap.put(word, wordsMap.get(word) + 1);
        }

        //знаем, че асоц. масив се състои от key (ключ) и value (стойност) - в случая целта е всички ключове да се принтират на един ред, затова можем да си създадем лист за ключовете:
        List<String> resultList = new ArrayList<>();

        //с foreach цикъл обхождаме всеки запис от асоц. масив и ако стойността на текущия запис е нечетно число, добавяме ключа към листа за ключовете, който създадохме
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {       //за всеки запис/item (entry) от асоциативния масив
            if (entry.getValue() % 2 != 0) {          //с entry.getValue()   намираме стойността     //ако стойността е нечетно число
                resultList.add(entry.getKey());     //към листа с ключовете да се добави текущият ключ
            }
        }

        //вече събрахме ключовете в един лист (защото целта е да се принтират на един ред), един от начините за принтиране на лист от стрингове е чрез String.join метода
        System.out.println(String.join(", ", resultList));      //ключовете да са на един ред, разделени със запетая
    }
}
