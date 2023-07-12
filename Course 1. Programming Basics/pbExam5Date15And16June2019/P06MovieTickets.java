package pbExam5Date15And16June2019;

import java.util.Scanner;

public class P06MovieTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());       //a1 – цяло число в интервала [65… 89]
        int a2 = Integer.parseInt(scanner.nextLine());       //a2 – цяло число в интервала [66… 91]
        int n = Integer.parseInt(scanner.nextLine());        //n – цяло число в интервала [1… 10]


        //искаме да се генерират билети, като всеки билет да се състои от 4 символа - значи имаме 4 вложени for цикъла:
        //•	Символ 1: символ с ASCII код от а1 до а2 - 1
        //•	Символ 2: цифра от 1 до n - 1
        //•	Символ 3: цифра от 1 до n / 2 - 1
        //•	Символ 4: цифрова репрезентация (ASCII код) на символ 1
        //След като са изпълнени условията, се генерира следният билет:
        //"{Символ 1}-{Символ 2}{Символ 3}{Символ  4}"
        int sum = 0;    //създаваме си променлива за сумата от символ 2, символ 3 и символ 4
        for (int currentValueOfFirstSymbol = a1; currentValueOfFirstSymbol <= a2 - 1; currentValueOfFirstSymbol++) {
            for (int currentValueOfSecondSymbol = 1; currentValueOfSecondSymbol <= n - 1; currentValueOfSecondSymbol++) {
                for (int currentValueOfThirdSymbol = 1; currentValueOfThirdSymbol <= n / 2 - 1; currentValueOfThirdSymbol++) {
                    for (int currentValueOfFourthSymbol = (int) currentValueOfFirstSymbol; currentValueOfFourthSymbol <= (int) currentValueOfFirstSymbol; currentValueOfFourthSymbol++) {

                        //да се отпечатат всички билетни номера, на които числовата репрезентация на символ 1 е нечетна и сборът на символ 2, символ 3 и символ 4 е нечетен
                        sum = currentValueOfSecondSymbol + currentValueOfThirdSymbol + currentValueOfFourthSymbol;
                        if (currentValueOfFirstSymbol % 2 != 0 && sum % 2 != 0) {
                            //на символ 1 (променлива, която е от тип int) трябва да вземем символната стойност, а не целочислената -> чрез (char) currentValueOfFirstSymbol
                            System.out.printf("%c-%d%d%d%n", (char) currentValueOfFirstSymbol, currentValueOfSecondSymbol, currentValueOfThirdSymbol, currentValueOfFourthSymbol);    //"{Символ 1}-{Символ 2}{Символ 3}{Символ  4}"
                        }

                    }
                }
            }
        }


    }
}