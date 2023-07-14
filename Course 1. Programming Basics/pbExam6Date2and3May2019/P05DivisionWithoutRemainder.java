package pbExam6Date2and3May2019;

import java.util.Scanner;

public class P05DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());         //цяло число n – брой числата, които ще се прочетат

        //На следващите n-на брой реда стои по едно цяло число в интервала [1…1000] – числата, които да бъдат проверени на колко се делят.
        int countOfNumbersThatAreDivisibleBy2 = 0;        //създаваме си променлива за броя на числата, които се делят на 2 без остатък
        int countOfNumbersThatAreDivisibleBy3 = 0;        //създаваме си променлива за броя на числата, които се делят на 3 без остатък
        int countOfNumbersThatAreDivisibleBy4 = 0;        //създаваме си променлива за броя на числата, които се делят на 4 без остатък
        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());      //на всяка итерация четем текущото число

            //тъй като ще има числа, които се делят точно и на 2, и на 3, и на 4, следователно трябва да са три отделни една от друга проверки
            //ако числото се дели на 2 без остатък, броят на числата, които точно се делят на 2 нараства с единица
            if (currentNumber % 2 == 0) {
                countOfNumbersThatAreDivisibleBy2++;     //countOfNumbersThatAreDivisibleBy2 = countOfNumbersThatAreDivisibleBy2 + 1;      //countOfNumbersThatAreDivisibleBy2 += 1;
            }

            //ако числото се дели на 3 без остатък, броят на числата, които точно се делят на 3 нараства с единица
            if (currentNumber % 3 == 0) {
                countOfNumbersThatAreDivisibleBy3++;
            }

            //ако числото се дели на 4 без остатък, броят на числата, които точно се делят на 4 нараства с единица
            if (currentNumber % 4 == 0) {
                countOfNumbersThatAreDivisibleBy4++;
            }

        }

        //намираме и принтираме процента на числата, които се делят без остатък на 2
        double percentageOfNumbersThatAreDivisibleBy2 = countOfNumbersThatAreDivisibleBy2 * 1.0 / n * 100;
        System.out.printf("%.2f%%%n", percentageOfNumbersThatAreDivisibleBy2);

        //намираме и принтираме процента на числата, които се делят без остатък на 3
        double percentageOfNumbersThatAreDivisibleBy3 = countOfNumbersThatAreDivisibleBy3 * 1.0 / n * 100;
        System.out.printf("%.2f%%%n", percentageOfNumbersThatAreDivisibleBy3);

        //намираме и принтираме процента на числата, които се делят без остатък на 4
        double percentageOfNumbersThatAreDivisibleBy4 = countOfNumbersThatAreDivisibleBy4 * 1.0 / n * 100;
        System.out.printf("%.2f%%", percentageOfNumbersThatAreDivisibleBy4);
    }
}
