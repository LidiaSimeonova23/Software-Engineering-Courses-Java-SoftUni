package lecture11WhileLoop;

import java.util.Scanner;

public class P01ReadTextVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String word = scanner.nextLine();           //четем някакъв текст от конзолата
        while (!word.equals("Stop")) {                 //условие за изпълнение на цикъла - докато прочетената дума не е Stop, влизай в тялото на цикъла и изпълнявай кода

            System.out.println(word);              //принтираме прочетения от конзолата текст
            //System.out.printf("%s%n", word);

            word = scanner.nextLine();   //update-ваме стойността на променливата - подканяма скенера да прочете нов ред от конзолата (ако не го направим, винаги ще чете един и същи ред и ще имаме безкраен цикъл)
        }

    }
}
