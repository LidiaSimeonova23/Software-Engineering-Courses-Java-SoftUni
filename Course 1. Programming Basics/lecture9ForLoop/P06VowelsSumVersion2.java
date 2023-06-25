package lecture9ForLoop;

import java.util.Scanner;

public class P06VowelsSumVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете текст (стринг), въведен от потребителя, изчислява и отпечатва сумата от стойностите на гласните букви според таблицата

        String text = scanner.nextLine();

        int value = 0;
        int sumOfVowels = 0;
        for (int index = 0; index <= text.length() - 1; index++) {          //for (int index = 0; index < text.length(); index++)
            char currentSymbol = text.charAt(index);

            if (currentSymbol == 'a') {
                value = 1;
                sumOfVowels = sumOfVowels + 1;
            } else if (currentSymbol == 'e') {
                value = 2;
                sumOfVowels = sumOfVowels + 2;
            } else if (currentSymbol == 'i') {
                value = 3;
                sumOfVowels = sumOfVowels + 3;
            } else if (currentSymbol == 'o') {
                value = 4;
                sumOfVowels = sumOfVowels + 4;
            } else if (currentSymbol == 'u') {
                value = 5;
                sumOfVowels = sumOfVowels + 5;
            }
        }


        System.out.println(sumOfVowels);
        //System.out.printf("%d", sumOfVowels);
    }
}
