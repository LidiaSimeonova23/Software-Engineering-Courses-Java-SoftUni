package lecture11WhileLoop;

import java.util.Scanner;

public class P04Sequence2kPlus1Version2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четем цяло число n, въведено от потребителя
        int number = Integer.parseInt(scanner.nextLine());

        int currentNumber = 1;   //създаваме си променлива за текущо число с начална стойност 1, защото винаги това ще е първата стойност, която ще се принтира
                                 //начална стойност 1, защото ще участва в аритметична операция умножение (за да не влияе на резултата)  //ако е 0, винаги ще е 0 и задачата ще е грешна

        //много пъти ще трябва да се принтират разни числа, но не знаем колко пъти точно -> имаме цикъл - while-цикъл
        while (currentNumber <= number) {                   //докато условието е вярно, влизай в тялото на цикъла и изпълнявай кода - тоест, принтирай текущото число

            System.out.println(currentNumber);
            //System.out.printf("%d%n", currentNumber);

            currentNumber = currentNumber * 2 + 1;   //по условие ни е дадено, че текущото число = текущото число * 2 + 1
        }

    }
}

