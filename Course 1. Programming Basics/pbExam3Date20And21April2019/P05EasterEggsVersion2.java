package pbExam3Date20And21April2019;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P05EasterEggsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //В ТОВА РЕШЕНИЕ НА ЗАДАЧАТА ПОЛЗВАМ АСОЦИАТИВЕН МАСИВ (УЧИХМЕ ГО В КУРС PROGRAMMING FUNDAMENTALS WITH JAVA)

        //От конзолата се чете 1 ред:
        int totalNumberOfEggs = Integer.parseInt(scanner.nextLine());     //Броят на боядисаните яйца – цяло число в интервала [1 ... 100]

        Map<String, Integer> eggColorsMap = new HashMap<>();          //СЪЗДАВАМ АСОЦИАТИВЕН МАСИВ (КЛЮЧ ЩЕ Е ЦВЕТЪТ НА ЯЙЦАТА, СТОЙНОСТ ЩЕ Е БРОЯТ НА ЯЙЦАТА ОТ ДАДЕНИЯ ЦВЯТ)
        eggColorsMap.put("red", 0);
        eggColorsMap.put("orange", 0);
        eggColorsMap.put("blue", 0);
        eggColorsMap.put("green", 0);

        for (int i = 0; i < totalNumberOfEggs; i++) {
            String color = scanner.nextLine();

            if (eggColorsMap.containsKey(color)) {
                int count = eggColorsMap.get(color);
                eggColorsMap.put(color, count + 1);
            }
        }


        int maxCount = 0;
        String maxColor = "";
        for (Map.Entry<String, Integer> entry : eggColorsMap.entrySet()) {       //за всеки запис от асоциативния масив (map-а)
            String color = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                maxColor = color;
            }
        }

        System.out.println("Red eggs: " + eggColorsMap.get("red"));
        System.out.println("Orange eggs: " + eggColorsMap.get("orange"));
        System.out.println("Blue eggs: " + eggColorsMap.get("blue"));
        System.out.println("Green eggs: " + eggColorsMap.get("green"));
        System.out.println("Max eggs: " + maxCount + " -> " + maxColor);
    }
}
