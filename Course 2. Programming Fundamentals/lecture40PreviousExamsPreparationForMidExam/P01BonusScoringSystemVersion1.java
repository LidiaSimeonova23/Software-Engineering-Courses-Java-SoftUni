package lecture40PreviousExamsPreparationForMidExam;

import java.util.Scanner;

public class P01BonusScoringSystemVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //трябва да изчисляваме бонус точките на всеки студент, след което да намерим студента с най-многото бонус точки и на колко лекции е присъствал

        int numberOfStudents = Integer.parseInt(scanner.nextLine());    //от първия ред на конзолата четем брой студенти – цяло число в интервала [0…50]
        int lecturesCount = Integer.parseInt(scanner.nextLine());      //от втория ред на конзолата четем брой лекции в курса – цяло число в интервала [0...50]
        int additionalBonus = Integer.parseInt(scanner.nextLine());      //от третия ред на конзолата четем допълнителни бонус точки – цяло число в интервала [0….100]

        //Многократно ще изчисляваме бонус точки (знаем колко пъти - толкова пъти, колкото е броят на студентите) - ще ползваме for цикъл
        //double maxBonusPoints = Double.MIN_VALUE;          //първо пробвах за начална стойност да задам Double.MIN_VALUE (но Judge системата на SoftUni ми даваше 90 от 100 точки)
        //int maxNumberOfAttendances = Integer.MIN_VALUE;      //първо пробвах за начална стойност да задам Integer.MIN_VALUE (но Judge системата на SoftUni ми даваше 90 от 100 точки)
        double maxBonusPoints = 0.0;          //създаваме си допълнителна променлива, която да държи максималния брой бонус точки - като начална стойност й присвояваме 0.0 (или 0)
        int maxNumberOfAttendances = 0;          //създаваме си допълнителна променлива, която да държи максималния брой присъствия на лекции - като начална стойност й присвояваме 0

        for (int currentStudent = 1; currentStudent <= numberOfStudents; currentStudent++) {
            int currentStudentAttendances = Integer.parseInt(scanner.nextLine());     //на всяка итерация на цикъла четем брой присъствия на текущия студент

            //на всяка итерация на цикъла изчисляваме бонус точките на текущия студент по следната формула: {total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
            //определяме бонус точките да са от тип double, тъй като в условието е дадено, че накрая трябва да се закръглят до най-близкото цяло по-голямо число -> закръглят се дробните числа
            double totalBonusPointsOfCurrentStudent = currentStudentAttendances * 1.0 / lecturesCount * (5 + additionalBonus);

            //след всички итерации на цикъла намираме максималния брой бонус точки и максималния брой присъствия на лекции
            if (totalBonusPointsOfCurrentStudent > maxBonusPoints) {       //ако броят бонус точки на текущия студент е по-голям от максималния брой бонус точки
                maxBonusPoints = totalBonusPointsOfCurrentStudent;        //на максималния брой бонус точки му присвояваме като стойност броя бонус точки на текущия студент
                maxNumberOfAttendances = currentStudentAttendances;     //на максималния брой присъствия на лекции присвояваме като стойност брой присъствия на текущия студент
            }

        }


        //накрая само веднъж (извън цикъла) трябва да принтираме максималния брой бонус точки, както и максималния брой присъствия на лекции
        maxBonusPoints = Math.ceil(maxBonusPoints);      //по условие се изисква накрая да закръглим максималния брой бонус точки до най-близкото цяло по-голямо число
        System.out.printf("Max Bonus: %.0f.%n", maxBonusPoints);
        System.out.printf("The student has attended %d lectures.", maxNumberOfAttendances);
    }
}
