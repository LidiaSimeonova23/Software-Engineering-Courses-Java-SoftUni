package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PMoreExercises01SortNumbersVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ЗА ТОВА РЕШЕНИЕ НА ЗАДАЧАТА ПОЛЗВАМЕ МАСИВИ - ТЕ СЕ УЧАТ В ЛЕКЦИЯ 11 и ЛЕКЦИЯ 12

        //1. създаваме си масив от 3 цели числа (засега няма да задаваме конкретни стойности на елементите, затова всичките три елемента са с дефолтна стойност 0 - тя е дефолтна за променливи от тип int)
        int[] numbersArray = new int[3];

        //2. обхождаме всичките му елементи - от първия до последния (т.е., итерираме по масива); присвояваме им като стойности числа, прочетени от конзолата; намираме най-голямото, най-малкото число и сумата от трите числа (тя ще ни трябва, за да намерим средното число)
        int maxNumber = Integer.MIN_VALUE;       //създаваме си променлива за най-голямо число /за да си осигурим, че винаги някое число от конзолата (дори и да са само отрицателни числа) ще е по-голямо от това най-голямо число, задаваме като начална стойност най-малкото цяло число/
        int minNumber = Integer.MAX_VALUE;       //създаваме си променлива за най-малко число /за да си осигурим, че винаги някое число от конзолата (дори и да са само положителни числа) ще е по-малко от това най-малко число, задаваме като начална стойност най-голямото цяло число/
        int sumOfTheThreeNumbers = 0;         //създаваме си променлива за сумата от трите числа
        for (int index = 0; index <= numbersArray.length - 1; index++) {                //обхождаме елементите на масива (чрез техните уникални индекси)
            numbersArray[index] = Integer.parseInt(scanner.nextLine());     //на всяка итерация на цикъла на текущия елемент от масива присвояваме като стойност текущо прочетеното число от конзолата
            int currentNumber = numbersArray[index];      //създаваме си променлива за текущия елемент от масива

            if (currentNumber > maxNumber) {     //намираме най-голямото число
                maxNumber = currentNumber;
            }

            if (currentNumber < minNumber) {     //намираме най-малкото число
                minNumber = currentNumber;
            }

            sumOfTheThreeNumbers += currentNumber;        //sumOfTheThreeNumbers = sumOfTheThreeNumbers + currentNumber;          //намираме сумата от трите числа
        }


        //3. намираме средното по големина число
        int middleNumber = sumOfTheThreeNumbers - (maxNumber + minNumber);       //намираме средното число

        //ще трябва да принтираме числата от най-голямото към най-малкото, затова трябва да ги подредим -> с Arrays.sort(array);   елементите се подреждат в нарастващ ред, затова не ни върши работа
        //4. искаме първият елемент в масива (на индекс 0) да е най-голямото число, вторият елемент (на индекс 1) да е средното число, а последният елемент в масива (на индекс 2) да е най-малкото число:
        numbersArray[0] = maxNumber;
        numbersArray[1] = middleNumber;
        numbersArray[2] = minNumber;

        //5. принтираме елементите на масива:
        for (int element : numbersArray) {
            System.out.println(element);
            //System.out.printf("%d%n", element);
        }

    }
}
