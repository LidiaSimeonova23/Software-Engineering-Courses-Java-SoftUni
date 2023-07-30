package lecture24AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class P01CountRealNumbersVersion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());     //чета си входните данни като лист от дробни числа, както е по условие

        //гледайки изходните данни, разбирам, че имам ключ и срещу него стойност, което означава асоц. масив - затова си създавам асоц. масив от 0 записа
        TreeMap<Double, Integer> numbersMap = new TreeMap<>();

        //ще прибавям записи в асоц. масив - винаги проверяваме дали ключът вече се съдържа в асоц. масив (ако не се съдържа, добавяме записа с неговия ключ и стойност, а ако вече се съдържа, само презаписваме стойността)
        for (int i = 0; i <= numbersList.size() - 1; i++) {      //for (int i = 0; i < numbersList.size(); i++)
            double currentElement = numbersList.get(i);
            if (!numbersMap.containsKey(currentElement)) {
                numbersMap.put(currentElement, 1);
            } else {
                int value = numbersMap.get(currentElement);
                numbersMap.put(currentElement, value + 1);
            }
        }

        //вместо for цикъла обаче за предпочитане е да се използва foreach цикъл  - и с foreach цикъл би изглеждало така:
        //for (double currentElement : numbersList) {
        //    if (!numbersMap.containsKey(currentElement)) {
        //        numbersMap.put(currentElement, 1);
        //    } else {
        //        int value = numbersMap.get(currentElement);
        //        numbersMap.put(currentElement, value + 1);
        //    }
        //}

        for (Map.Entry<Double, Integer> entry : numbersMap.entrySet()) {
            double currentKey = entry.getKey();
            int currentValue = entry.getValue();
            System.out.printf("%.0f -> %d%n", currentKey, currentValue);
        }


    }
}
