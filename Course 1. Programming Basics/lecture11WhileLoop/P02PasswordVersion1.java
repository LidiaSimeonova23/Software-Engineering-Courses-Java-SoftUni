package lecture11WhileLoop;

import java.util.Scanner;

public class P02PasswordVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата веднъж ще прочетем име и парола на потребителски профил
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        //многократно ще се четат някакви входни данни и ще се сравняват с паролата, но не знаем колко точно пъти ще става това -> трябва да ползваме while-цикъл  -> докато паролата е грешна, цикълът ще се върти

        while (true) {                                          //доката условието е вярно, влизаш в цикъла и изпълняваш кода - тоест, четеш входин данни
            String inputData = scanner.nextLine();

            if (inputData.equals(password)) {                   //ако входните данни съвпаднат с паролата, да се принтира поздрави и да се прекъсне цикълът
                System.out.printf("Welcome %s!", username);
                break;
            }
        }


    }
}
