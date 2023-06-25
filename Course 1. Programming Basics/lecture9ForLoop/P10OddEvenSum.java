package lecture9ForLoop;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете numbersCount-на брой цели числа, подадени от потребителя, и проверява дали сумата от числата на четни позиции е равна на сумата на числата на нечетни позиции

        int numbersCount = Integer.parseInt(scanner.nextLine());


        int evenSum = 0;   //създаваме си променлива за сумата от числата на четните позиции (итерации) и й задаваме нач. стойност 0, после ще й задаваме други стойности
        int oddSum = 0;    //създаваме си променлива за сумата от числата на нечетните позиции (итерации) и й задаваме нач. стойност 0, после ще й задаваме други стойности

        for (int positionOfNumber = 1; positionOfNumber <= numbersCount; positionOfNumber++) {               //числата могат да са от 1 до numbersCount, искаме стойността на променливата positionOfNumber да се увеличава с единица
            int currentNumber = Integer.parseInt(scanner.nextLine());       //на всяко завъртане на цикъла искаме да четем по едно цяло число

            if (positionOfNumber % 2 == 0) {                        //ако позицията (тоест, итерацията) е четна, ще намерим четната сума
                evenSum = evenSum + currentNumber;     //четната сума е равна на четната сума до момента + текущото число (може да се запише и така:  evenSum += currentSum;)
            } else {                                 //ако позицията (тоест, итерацията) е нечетна, ще намерим нечетната сума
                oddSum = oddSum + currentNumber;       //нечетната сума е равна на нечетната сума до момента + текущото число (може да се запише и така:  oddSum += currentSum;)
            }
        }


        if (evenSum == oddSum) {                      //ако двете суми са равни, да се принтира на два отделни реда Yes   и на колко е равна сумата
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenSum);
        } else {                                      //ако двете суми не са равни, да се принтира на два отделни реда No   и на колко е равна разликата, като осигурим, че тя е полож. число
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(evenSum - oddSum));
        }

    }
}
