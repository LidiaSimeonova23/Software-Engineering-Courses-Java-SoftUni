package lecture12ExerciseWhileLoop;

import java.util.Scanner;

public class P02ExamPreparationVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumberOfPoohGrades = Integer.parseInt(scanner.nextLine());       //брой незадоволителни оценки - цяло число в интервала [1…5]

        //тези променливи си ги създавам впоследствие, когато ми потрябват
        int problemsCount = 0;     //създаваме си променлива за броя на решените задачи (брояч) - като начална стойност задаваме 0
        String lastProblem = "";     //създаваме си променлива за името на последната задача с начална стойност празен String
        int poohGradesCount = 0;     //създаваме си променлива за броя на слабите оценки (брояч) - като начална стойност задаваме 0
        int sumOfGrades = 0;     //създаваме си променлива за сбора от всички получени оценки - като начална стойност задаваме 0

        String input = scanner.nextLine();            //Име на задача - текст
        while (!input.equals("Enough")) {         //докато входните данни са различни от Enough, цикълът ще се върти - ще се чете задача и оценка, ще се сумират оценките, ще се броят задачите
            String currentProblem = input;     //ако входните ни данни не са Enough, си ги запазваме като променлива от тип String с име currentProblem
            int grade = Integer.parseInt(scanner.nextLine());    //Оценка - цяло число в интервала [2…6]

            problemsCount++;    //problemsCount = problemsCount + 1;    - брояч - инкрементация - стойността на променливата ще нараства с единица

            lastProblem = currentProblem;   //винаги последна за момента задаче е текущата ни задача

            if (grade <= 4) {
                poohGradesCount++;     //poohGradesCount = poohGradesCount + 1;
            }
            sumOfGrades = sumOfGrades + grade;   //sumOfGrades += grade;    - намираме сумата от всички получени оценки - оценките до момента + последната оценка

            if (poohGradesCount >= maxNumberOfPoohGrades) {      //ако броят на слабите оценки стане по-голям или равен на максималния позволен, знаи се нуждае от почивка и цикълът се прекъсва
                break;
            }

            input = scanner.nextLine();     //update-ваме данните - подканяме скенера да прочете следващия ред с входни данни (ако не го направим, ще имаме безкраен цикъл - винаги ще чете само първия ред)
        }


        double averageGrade = sumOfGrades * 1.0 / problemsCount;    //намираме следната оценка от всички получени, като делим сумата на броя  (средната оценка ще е double променлива - реално число)

        if (poohGradesCount >= maxNumberOfPoohGrades) {                   //Ако получи определения брой незадоволителни оценки
            System.out.printf("You need a break, %d poor grades.", poohGradesCount);
        } else {                           //В противен случай - ако Марин стигне до командата "Enough"
            System.out.printf("Average score: %.2f%n", averageGrade);
            System.out.printf("Number of problems: %d%n", problemsCount);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }
}
