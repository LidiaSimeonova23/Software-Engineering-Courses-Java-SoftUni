package lecture13NestedLoops;

import java.util.Scanner;

public class P03Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която изчислява колко решения в естествените числа (включително и нулата) има уравнението:
        //x1 + x2 + x3 = n
        //Числото n е цяло число и се въвежда от конзолата

        int n = Integer.parseInt(scanner.nextLine());    //четем цяло число от конзолата

        //комбинация от 3 число - от 0 до n -> значи имаме три вложени цикъла с различни имена на променливите
        int validCombCount = 0;                    //създаваме си променлива от тип int, с която да броим броя на валидните комбинации - с нач. стойност 0

        //всяко от трите числа (х1, х2, х3) трябва да е по-малко или равно на техния сбор (n)
        for (int x1 = 0; x1 <= n; x1++) {
            for (int x2 = 0; x2 <= n; x2++) {
                for (int x3 = 0; x3 <= n; x3++) {
                    int sum = x1 + x2 + x3;                   //намираме сумата от трите числа
                    if (sum == n) {                 //условие за валидност
                        validCombCount++;         //validCombCount = validCombCount + 1;            //брояч на валидните комбинации
                    }
                }
            }
        }

        System.out.println(validCombCount);           //принтира се броят на валидните комбинации на трите числа
    }
}
