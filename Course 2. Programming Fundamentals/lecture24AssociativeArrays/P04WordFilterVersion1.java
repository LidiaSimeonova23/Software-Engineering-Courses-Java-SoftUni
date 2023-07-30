package lecture24AssociativeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04WordFilterVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArray = Arrays.stream(scanner.nextLine().split(" ")).filter(word -> word.length() % 2 == 0).toArray(String[]::new);
                                //със scanner.nextLine().split(" ")  четем ред от конзолата като текст и го сплитваме, което ни връща масив от текстове
                                //с Arrays.stream  пускаме поток от данни
                                //word -> word.length() % 2 == 0    - това е ламбда израз, тоест, анонимен метод
                                //с .filter(word -> word.length() % 2 == 0)   филтрираме - в масива да се запазят тези елементи (тези думи), които са нечетни (състоят се от нечетен брой символи)
                                //с toArray(String[]::new   създаваме нов обект в паметта - нов масив, в който са само елементите (текстовете), които се състоят от четен брой символи - него го присвояваме като стойност на стария масив

        System.out.println(String.join(System.lineSeparator(), wordsArray));    //принтираме елементите на масива на отделни редове
    }

}
