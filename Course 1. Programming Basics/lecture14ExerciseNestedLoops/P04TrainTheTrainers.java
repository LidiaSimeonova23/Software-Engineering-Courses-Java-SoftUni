package lecture14ExerciseNestedLoops;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата на първия ред се прочита броят на хората в журито n - цяло число в интервала [1…20]
        int numberOfJudges = Integer.parseInt(scanner.nextLine());

        //за да прочетем следваща презентация, трябва да сме прочели всички оценки за текущата презентация - 2 вложени цикъла ще имаме

        int counterAllGrades = 0;     //създаваме си брояч за броя на всички оценки
        double sumOfAllGrades = 0;   //създаваме си променлива за сумата от абсолютно всички оценки (от всички презентации)

        String input = scanner.nextLine();   //ще четем входни данни до получаване на команда "Finish"
        while (!input.equals("Finish")) {
            String currentPresentation = input;     //осигуряваме си, че щом входните ни данни не са "Finish, значи са име на презентация

            double sumCurrentGrades = 0;   //създаваме си променлива за сумата от получените оценки (после ще я променяме)
            for (int gradesOrder = 1; gradesOrder <= numberOfJudges; gradesOrder++) {        //ще четем многократно оценки за всяка презентация - толкова оценки получава всяка презентация, колкото е броят на членовете на журито
                double currentGrade = Double.parseDouble(scanner.nextLine());   //четенето на оценките - реални числа от 2.00 до 6.00

                counterAllGrades++;    //counterAllGrades = counterAllGrades + 1;    //чрез брояча намираме броя на всички оценки  - всеки път, когато прочетем оценка, я прибавяме към броя на всички оценки
                sumCurrentGrades = sumCurrentGrades + currentGrade;     //sumCurrentGrades += currentGrade;    //намираме сумата от оценките - тя е равна на сумата от оценките до момента + текущата оценка
            }

            sumOfAllGrades = sumOfAllGrades + sumCurrentGrades;      //sumOfAllGrades += sumCurrentGrades;        //намираме сумата от абсолютно всички оценки - тя е равна на сумата от всички оценки до момента + сумата от текущите оценки

            double averageGradeForTheCurrentPresentation = sumCurrentGrades / numberOfJudges;   //намираме средната аритметична оценка на всяка презентация (равна е на сумата от оценките, делено на броя оценки)
            System.out.printf("%s - %.2f.%n", currentPresentation, averageGradeForTheCurrentPresentation);   //принтира се името на презентацията и средната оценка за нея

            input = scanner.nextLine();   //update - подканяме скенера да прочете следващия ред с входни данни (ако не го направим, ще имаме безкраен цикъл)
        }


        double averageFinalGrade = sumOfAllGrades / counterAllGrades;         //намираме средната оценка от абсолютно всички оценки за всички презентации  (равна е на сумата от всички оценки, делено на броя на всички оценки)
        System.out.printf("Student's final assessment is %.2f.", averageFinalGrade);   //принтира се средната аритметична оценка от всички оценки
    }
}
