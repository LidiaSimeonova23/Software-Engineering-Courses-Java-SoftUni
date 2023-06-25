package lecture13NestedLoops;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която проверява всички възможни комбинации от двойка числа в интервала от две дадени числа

        //от конзолата ще прочетем веднъж тези числа:
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());  //магическо число - ще искаме то да е равно на сумата от двете числа

        int iterationsCount = 0;       //създаваме си променлива за броене на итерациите
        boolean isValid = false;            //създаваме си булева променлива - ще ни трябва за прекъсване на цикъла - защото ни трябва само 1 валидна комбинация (а те са повече - ако не го прекъснем, ще амери всичките)

        for (int currentNumber1 = firstNumber; currentNumber1 <= secondNumber; currentNumber1++) {           //за име на променливата в цикъла ползвам currentNumber1 вместо i
            for (int currentNumber2 = firstNumber; currentNumber2 <= secondNumber; currentNumber2++) {            //за име на променливата в цикъла currentNumber2 вместо j
                iterationsCount++;           //брояч на итерациите     iterationsCount = iterationsCount + 1;
                int sum = currentNumber1 + currentNumber2;        //така намираме сумата от двете числа
                if (sum == magicNumber) {               //ако сумата от двете числа (първото и второто) е равна на магическото число (третото в конзолата), значи сме открили вярната комбинация, принтираме това, което трябва, и прекъсваме цикъла
                    isValid = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", iterationsCount, currentNumber1, currentNumber2, sum);
                    break;               //прекъсваме изпълнението на цикъла, като намерим първата валидна комбинация
                }
            }

            if (isValid) {      //прекъсваме и външния цикъл, за да прекъснем целия цикъл
                break;
            }
        }

        if (!isValid) {                     //ако не сме открили нито една валидна комбинация
            System.out.printf("%d combinations - neither equals %d", iterationsCount, magicNumber);
        }

    }
}
