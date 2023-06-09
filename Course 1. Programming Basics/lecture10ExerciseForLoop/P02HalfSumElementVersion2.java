package lecture10ExerciseForLoop;

import java.util.Scanner;

public class P02HalfSumElementVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());  //от конзолата четем n на брой цели числа

        //трябва да намерим най-голямато число и сумата от всички числа, след което от цялата сума да извадим най-голямото число, за да видим колко остава;
        //това, което остава, го сравняваме с максималното число
        int sum = 0;      //създаваме си променлива, която ще ползваме в цикъла, и й задаваме нач. стойност 0, после в цикъла ще й приравняваме други стойности
        int maxNumber = Integer.MIN_VALUE;      //създаваме си променлива, която ще ползваме в цикъла, и й задаваме за нач. стойност най-малкото цяло число; после в цикъла ще й приравняваме други стойности

        for (int i = 1; i <= n; i++) {                    //началото на цикъла е 1, краят е n, стойността на променливата ще нараства с единица
            int currentNumber = Integer.parseInt(scanner.nextLine());           //на всяка итерация на цикъла скенерът ще чете по едно цяло число от конзолата

            if (currentNumber > maxNumber) {                         //ако текущото число е по-голямо от най-голямото до момента, то най-голямо число става текущото число
                maxNumber = currentNumber;
            }

            sum = sum + currentNumber;                  //сумата на всички числа е равна на досегашната сума + текущото число  (понеже всички променливи са от тип int, може да се запише и така:   sum += currentNumber;)
        }

        sum = sum - maxNumber;                       //сумата на числата (без да се включва най-голямото число) е равна на сумата от всичките числа - най-голямото число


        if (sum == maxNumber) {                           //ако най-голямото число е равно на сумата от останалите числа, в конзолата се печата "Yes" и на нов ред "Sum = "
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNumber);
        } else {                                                          //ако най-голямото число НЕ е равно на сумата от другите числа, това да се принтира, сащо и разликата между тях
            System.out.println("No");
            int Diff = Math.abs(sum - maxNumber);                    //да се осигури, че ако има разлика между най-голямото число и сумата от другите, то тази разлика ще е положително число
            System.out.printf("Diff = %d", Diff);
        }

    }
}
