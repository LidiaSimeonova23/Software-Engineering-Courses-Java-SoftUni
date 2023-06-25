package moreExercises9And10ForLoop;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());        //броя на студентите, явили се на изпит – цяло число в интервала [1...1000]


        double totalSumOfAllGrades = 0;
        int numberOfPoorGrades = 0;      //брой двойки
        int numberOfAverageGrades = 0;     //брой тройки
        int numberOfGoodGrades = 0;      //брой четворки
        int numberOfVeryGoodAndExcellentGrades = 0;      //брой петици и шестици
        for (int student = 1; student <= numberOfStudents; student++) {         //за да си построя цикъла, ще ползвам като име на променлива student вместо i
            double gradeOfCurrentStudent = Double.parseDouble(scanner.nextLine());        //За всеки един студент на отделен ред – оценката от изпита – реално число в интервала [2.00...6.00]

            totalSumOfAllGrades = totalSumOfAllGrades + gradeOfCurrentStudent;

            if (gradeOfCurrentStudent >= 2 && gradeOfCurrentStudent <= 2.99) {          //оценка между 2.00 и 2.99
                numberOfPoorGrades++;       //numberOfPoorGrades = numberOfPoorGrades + 1;       //numberOfPoorGrades += 1
            } else if (gradeOfCurrentStudent <= 3.99) {           //оценка между 3.00 и 3.99
                numberOfAverageGrades++;
            } else if (gradeOfCurrentStudent <= 4.99) {           //оценка между 4.00 и 4.99
                numberOfGoodGrades++;
            } else if (gradeOfCurrentStudent >= 5) {        //else if (gradeOfCurrentStudent > 4.99)   //оценка 5.00 или повече
                numberOfVeryGoodAndExcellentGrades++;
            }

        }


        //процентът на дадена оценка е равен на броя на тези оценти, делено на общия брой на всички оценки (а броят на оценките е равен на броя на студентите), умножено по 100
        double percentageOfVeryGoodAndExcellentGrades = numberOfVeryGoodAndExcellentGrades * 1.0 / numberOfStudents * 100;
        System.out.printf("Top students: %.2f%%%n", percentageOfVeryGoodAndExcellentGrades);

        double percentageOfGoodGrades = numberOfGoodGrades * 1.0 / numberOfStudents * 100;
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentageOfGoodGrades);

        double percentageOfAverageGrades = numberOfAverageGrades * 1.0 / numberOfStudents * 100;
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentageOfAverageGrades);

        double percentageOfPoohGrades = numberOfPoorGrades * 1.0 / numberOfStudents * 100;
        System.out.printf("Fail: %.2f%%%n", percentageOfPoohGrades);

        //средноаритмет. оценка е равна на сумата от всички оценки, делено на техния брой  (а броят на оценките е равен на броя на студентите)
        double averageGrade = totalSumOfAllGrades / numberOfStudents;
        System.out.printf("Average: %.2f", averageGrade);
    }
}
