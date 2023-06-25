package lecture9ForLoop;

import java.util.Scanner;

public class P04EvenPowersOf2Version2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете число n, въведено от потребителя, и печата четните степени на 2 ≤ 2n: 20, 22, 24, 26, …, 2n

        int power = Integer.parseInt(scanner.nextLine());

        //има готов метод Math.pow(нещото, което повдигаме на степен, след него е степента, на която повдигаме);

        for (int currentPower = 0; currentPower <= power; currentPower += 2) {        //почваме от 0 и пишем currentPower += 2   - за да итерираме само по четните степени (0, 2, 4, 6, 8 и т. нат.), а нечетните (1, 3, 5, 7 и т нат.) да ги пропускаме
            int result = (int) Math.pow(2, currentPower);
            System.out.println(result);
            //System.out.printf("%d%n", result);
        }

    }
}



