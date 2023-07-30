package lecture24AssociativeArrays;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbersVersion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersArray = scanner.nextLine().split("\\s+");   //по условие е дадено, че входните данни ще са дробни числа, обаче може да си ги четем като текстове, защото няма да извършваме аритметични операции и/или сравнения

        TreeMap<String, Integer> numbersMap = new TreeMap<>();

        for (String element : numbersArray) {
            if (!numbersMap.containsKey(element)) {
                numbersMap.put(element, 1);
            } else {
                int value = numbersMap.get(element);
                numbersMap.put(element, value + 1);
            }
        }


        for (Map.Entry<String, Integer> entry : numbersMap.entrySet()) {
            String currentKey = entry.getKey();
            int currentValue = entry.getValue();
            System.out.printf("%s -> %d%n", currentKey, currentValue);
        }


    }
}
