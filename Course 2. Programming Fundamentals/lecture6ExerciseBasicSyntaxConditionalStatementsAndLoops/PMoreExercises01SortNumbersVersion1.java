package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PMoreExercises01SortNumbersVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ТОВА Е РЕШЕНИЕТО СЪС ЗНАНИЯТА НИ ДО МОМЕНТА

        int maxNumber = Integer.MIN_VALUE;       //създаваме си променлива за най-голямо число /за да си осигурим, че винаги някое число от конзолата (дори и да са само отрицателни числа) ще е по-голямо от това най-голямо число, задаваме като начална стойност най-малкото цяло число/
        int minNumber = Integer.MAX_VALUE;       //създаваме си променлива за най-малко число /за да си осигурим, че винаги някое число от конзолата (дори и да са само положителни числа) ще е по-малко от това най-малко число, задаваме като начална стойност най-голямото цяло число/
        int sumOfTheThreeNumbers = 0;        //създаваме си променлива за сумата от трите числа
        for (int i = 1; i <= 3; i++) {                //ще прочетем 3 цели числа от конзолата -> for-цикъл с 3 итерации
            int currentNumber = Integer.parseInt(scanner.nextLine());     //на всяка итерация на цикъла четем число от конзолата

            if (currentNumber > maxNumber) {     //намираме най-голямото число
                maxNumber = currentNumber;
            }

            if (currentNumber < minNumber) {     //намираме най-малкото число
                minNumber = currentNumber;
            }

            sumOfTheThreeNumbers += currentNumber;        //sumOfTheThreeNumbers = sumOfTheThreeNumbers + currentNumber;          //намираме сумата от трите числа
        }

        System.out.println(maxNumber);        //принтираме най-голямото число

        int middleNumber = sumOfTheThreeNumbers - (maxNumber + minNumber);       //намираме средното число
        System.out.println(middleNumber);     //принтираме средното число

        System.out.println(minNumber);        //принтираме най-малкото число
    }
}
