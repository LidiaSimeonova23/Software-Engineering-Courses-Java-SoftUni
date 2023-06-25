package lecture11WhileLoop;

import java.util.Scanner;

public class P08GraduationVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfStudent = scanner.nextLine();   //ще прочетем от конзолата името на ученика - това ще стане само веднъж - не е част от цикъла

        //тези променливи си ги създадохме в момента, в който ни потрябваха:
        int year = 1;        //създаваме си променлива за годините/класовете - почваме от първи клас - може да е само цяло число
        int poohGradesCount = 0;       //създаваме си променлива за брояч за слабите оценки  - с начална стойност 0
        boolean isExcluded = false;  //създаваме си булева променлива - по подразбиране не е изключена, за да се върти цикълът
        double sumAllGrades = 0;   //създаваме си променлива за сумата от всички оценки  - с начална стойност 0

        while (year <= 12) {
            if (poohGradesCount > 1) {
                isExcluded = true;         //ако слабите оценки станат повече от 1, изключват ученика (isExcluded става true)
                break;
            }
            double currentGrade = Double.parseDouble(scanner.nextLine());    //на всяко завъртане на цикъла да се чете оценка


            if (currentGrade < 4) {             //ако оценката е под 4, ще броим колко са тези оценки под 4, няма да преминава в следващ клас, ще повтаря този клас
                poohGradesCount++;    //poohGradesCount = poohGradesCount + 1;   //създаваме си брояч за броя на ниските оценки
                continue;
            }

            sumAllGrades += currentGrade;      //sumAllGrades = sumAllGrades + currentGrade;

            year++;     //създаваме си брояч за годините - почваме от първи клас
        }

        if (isExcluded) {            //ако ученикът е изключен
            System.out.printf("%s has been excluded at %d grade", nameOfStudent, year);
        } else {                     //в противен случай (ако ученикът не е бил изключен и е завършил 12-ти клас)
            double averageGrade = sumAllGrades / 12;          //смятаме средната оценка от 12-те години/класове  - тя е сумата от оценките, делено на броя години/класове
            System.out.printf("%s graduated. Average grade: %.2f", nameOfStudent, averageGrade);
        }


    }
}
