package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCode = Integer.parseInt(scanner.nextLine());     //от първия ред на конзолата четем един символен индекс (тоест, четем целочислената стойност/ASCII кода на символ)
        int endCode = Integer.parseInt(scanner.nextLine());       //от втория ред на конзолата четем един символен индекс (тоест, четем целочислената стойност/ASCII кода на символ)

        //задачата ни е да принтираме поредица от символи -> многократно принтиране ще имаме, знаем колко пъти (от startCode до endCode, инкрементация с единица -> типичен for-loop)
        for (int code = startCode; code <= endCode; code++) {          //вместо code можем да напишем currentSymbol

            System.out.print((char) code + " ");    //на всяка итерация на цикъла принтираме символната стойност на променливата code и интервал (всичкик принтирания са на един ред с интервал между тях)
            //System.out.printf("%c ", (char) code);
        }

    }
}
