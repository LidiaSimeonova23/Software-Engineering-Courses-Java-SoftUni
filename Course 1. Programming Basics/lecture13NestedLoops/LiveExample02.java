package lecture13NestedLoops;

import java.util.Scanner;

public class LiveExample02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която изчислява колко решения в естествените числа (включително и нулата) има уравнението:
        //x1 + x2 + x3 = n
        //Числото n е цяло число и се въвежда от конзолата

        int n = Integer.parseInt(scanner.nextLine());

        //комбинация от 3 числа - от 0 до n   -> значи имаме три вложени цикъла с различни имена на променливите
        int totalCount = 0;                 //създаваме си брояч за всички възможни комбинации - с начална стойност 0
        int validCombCount = 0;             //създаваме си брояч за всички вълидни комбинации - с начална стойност 0
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    totalCount++;                  //брояч за всички възможни комбинации
                    int sum = i + j + k;
                    if (sum == n) {                     //условие за валидност на комбинацията
                        validCombCount++;          //брояч за валидните комбинации
                    }
                }
            }
        }

        System.out.println(totalCount);                //принтира се броят на всички възможни комбинации
        System.out.println(validCombCount);          //принтира се броят на валидните комбинации
    }
}
