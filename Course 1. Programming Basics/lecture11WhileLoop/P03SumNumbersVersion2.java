package lecture11WhileLoop;

import java.util.Scanner;

public class P03SumNumbersVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //чете се 1 цяло число от конзолата
        int initialNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;             //създаваме си променлива с нач. стойност 0, ще я ползваме в цикъла, за да сумираме въведените числа

        //ще четем числа от конзолата и ще ги сумираме,не знаем колко пъти ще става това, но има абстрактно условие - докато сумата им стане >= на първоначално въведеното число   -> имаме while-цикъл
        while (sum < initialNumber) {                         //докато условието е вярно, влизай в тялото на цикъла и изпълнявай кода - тоест, чети числа от конзолата и ги сумирай
            int currentNumber = Integer.parseInt(scanner.nextLine());

            sum = sum + currentNumber;     //всички данни са от тип int  -> може да се запише и така:  sum += currentNumber;
        }

        System.out.println(sum);      //да се принтира получената сума
        //System.out.printf("%d", sum);
    }
}
