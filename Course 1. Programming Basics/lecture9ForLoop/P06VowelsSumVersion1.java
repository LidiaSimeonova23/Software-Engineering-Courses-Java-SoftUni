package lecture9ForLoop;

import java.util.Scanner;

public class P06VowelsSumVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете текст (стринг), въведен от потребителя, изчислява и отпечатва сумата от стойностите на гласните букви според таблицата

        String text = scanner.nextLine();

        int value = 0;
        int sumOfVowels = 0;
        for (int index = 0; index <= text.length() - 1; index++) {          //for (int index = 0; index < text.length(); index++)
            char currentSymbol = text.charAt(index);

            switch (currentSymbol) {
                case 'a':
                    value = 1;
                    sumOfVowels = sumOfVowels + 1;
                    break;
                case 'e':
                    value = 2;
                    sumOfVowels = sumOfVowels + 2;
                    break;
                case 'i':
                    value = 3;
                    sumOfVowels = sumOfVowels + 3;
                    break;
                case 'o':
                    value = 4;
                    sumOfVowels = sumOfVowels + 4;
                    break;
                case 'u':
                    value = 5;
                    sumOfVowels = sumOfVowels + 5;
                    break;
            }
        }


        System.out.println(sumOfVowels);
        //System.out.printf("%d", sumOfVowels);
    }
}
