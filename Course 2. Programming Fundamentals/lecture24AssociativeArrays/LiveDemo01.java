package lecture24AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class LiveDemo01 {
    public static void main(String[] args) {

        LinkedHashMap<String, Double> fruitsMap = new LinkedHashMap<>();   //създаваме си асоциативен масив (от 0 записа в началото), ключът ще е от клас String, стойността ще е от клас Double
        //създадох асоциативния масив от вида LinkedHashMap, защото ще искаме редът на добавяне на записите (item-ите) да се запази

        //добавяме записи (item-и) към асоциативния масив с конкретни ключове и стойности:
        fruitsMap.put("apple", 1.60);
        fruitsMap.put("banana", 3.80);

        //единствено чрез foreach цикъл можем да итерираме по записите (item-ите) на асоциативния масив (чрез for цикъл не може, защото в него се ползват индекси, а асоциативните масиви нямат индекси):
        for (Map.Entry<String, Double> entry : fruitsMap.entrySet()) {          //за всеки запис (item) от асоциативния масив fruitsMap
            String currentKey = entry.getKey();
            double currentValue = entry.getValue();
            System.out.printf("%s - %f%n", currentKey, currentValue);    //на всяка итерация на цикъла да се принтира (на отделен ред) текущият ключ и текущата стойност (достъпваме  даден запис (item) чрез неговия уникален ключ и съответната му стойност)
        }


    }
}
