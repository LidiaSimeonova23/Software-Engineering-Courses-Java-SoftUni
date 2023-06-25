package lecture11WhileLoop;

import java.util.Scanner;

public class P01ReadTextVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //знаем, че многократно ще четем и принтираме текст, но не знаем колко точно пъти ще повтаряме тези действия  -> имаме цикъл, при това while-цикъл
        //докато условието в скобите е true, влизай в тялото на цикъла и изпълнявай кода - тоест, на всяко завъртане на цикъла чети нов ред от конзолата и принтирай това, което си прочел

        while (true) {
            String word = scanner.nextLine();     //четене на текст от конзолата на всяка итерация на цикъла

            if (word.equals("Stop")) {             //условие за прекратяване на цикъла - ако прочетената дума е Stop, прекъсни цикъла
                break;
            }

            System.out.println(word);             //на всяка итерация на цикъла принтираме прочетения текст
            //System.out.printf("%s%n", word);
        }

    }
}
