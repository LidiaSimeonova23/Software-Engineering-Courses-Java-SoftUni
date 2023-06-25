package lecture9ForLoop;

import java.util.Scanner;

public class P05CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете текст (стринг), въведен от потребителя, и печата всеки символ от текста на отделен ред

        String text = scanner.nextLine();

        for (int index = 0; index <= text.length() - 1; index++) {       //for (int index = 0; index < text.length(); index++)
            char currentSymbol = text.charAt(index);
            System.out.println(currentSymbol);
            //System.out.printf("%c%n", currentSymbol);
        }

    }
}
