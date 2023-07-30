package lecture24AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbersVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();   //от първия ред на конзолата си прочитаме масив от цели числа (избрахме да е масив, защото няма да модифицираме елементите, а просто ще ги съхранявамем масивите са най-бързо действащата структура)

        //искаме да видим кое число от масива колко пъти се съдържа - това е точно като ключ - стойност - значи можем да ползваме асоциативен масив:
        TreeMap<Integer, Integer> countMap = new TreeMap<>();     //създаваме си асоциативен масив (от 0 item-a) от вид TreeMap, защото искаме да подредим резултатите във възходящ ред (да сортираме) (ключът ще е от клас Integer, стойността ще е от клас Integer)

        //8 2 2 8 2
        //2 -> 3
        //8 -> 2
        //трябва да обходим (чрез for цикъл или foreach цикъл) всеки елемент от прочетения масив numbersArray и да го добавим към асоциативния масив countMap, ако все още няма такъв item в него
        //а ако вече има такъв item в него, не го добавяме, защото в асоц. масив не може да има два записа с един и същи ключ, просто го презаписваме, тоест, променяме само стойността му
        //добавяме item-и в асоциативния масив
        for (int number : numbersArray) {      //за всеки елемент от масив numbersArray
            if (!countMap.containsKey(number)) {      //ако асоц. масив countMap не съдържа ключа (прочетеното число, тоест текущия елемент от масива) ->
                countMap.put(number, 1);               //това число да се добави към асоц. масив (числото да е ключ, стойността да е 1, тъй като това число ще се среща за първи пътв асоциативния масив)
            } else {           //в противен случай (тоест, ако асоц. масив countMap съдържа ключа (прочетеното число, тоест текущия елемент от масива) ->
                int value = countMap.get(number);        //създаваме си променлива за стойността на записа (item-а) и като стойност й присвояваме стойността на ключа - елемента от масива numbersArray
                countMap.put(number, value + 1);           //опитваме се да добавим ключ, който вече се съдържа в асоц. масив със стойност старата стойност + 1  - тъй като асоциативният масив вече съдържа този ключ, не можем да го добавим отново, защото не може да има два записа с еднакъв ключ, но презаписваме неговата стойност, която се увеличава с единица (ако числото 8 се е срещало веднъж в масива, по този начин казваме, че вече се среща два пъти) - вместо 8 -> 1 ще имаме 8 -> 2
            }
        }

        //с foreach цикъл принтираме всеки запис (item) от асоциативния масив:
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.printf("%d -> %d%n", entry.getKey(), entry.getValue());   //принтирането е на отделни редове   - принтираме ключа и срещу него стойността (в случая ключът е даден елемент от масива numbersArray, а стойността е колко пъти се съдържа този елемент в масива numbersArray)
        }

    }
}
