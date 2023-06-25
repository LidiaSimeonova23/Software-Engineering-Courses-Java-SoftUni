package lecture11WhileLoop;

import java.util.Scanner;

public class P02PasswordVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата веднъж ще прочетем име и парола на потребителски профил
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        //многократно ще се четат някакви входни данни и ще се сравняват с паролата, но не знаем колко точно пъти ще става това -> трябва да ползваме while-цикъл  -> докато паролата е грешна, цикълът ще се върти

        String inputData = scanner.nextLine();
        while (!inputData.equals(password)) {                     //доката условието е вярно, влизаш в цикъла и изпълняваш кода - тоест, четеш входин данни

            inputData = scanner.nextLine();
        }


        System.out.printf("Welcome %s!", username);    //когато условието на цикъла е false (тоест, входните данни са съвпаднали с паролата), принтираш поздрав; тъй като условието вече е false, цикълът се прекъсва
    }
}
