package lecture40PreviousExamsPreparationForMidExam;

import java.util.Scanner;

public class P01SoftUniReceptionVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudentsTheFirstEmployeeHelpsPer1Hour = Integer.parseInt(scanner.nextLine());    //брой обслужени студенти от първия служител за 1 час -  цяло число в интервала [1 - 100]
        int numberOfStudentsTheSecondEmployeeHelpsPer1Hour = Integer.parseInt(scanner.nextLine());    //брой обслужени студенти от втория служител за 1 час -  цяло число в интервала [1 - 100]
        int numberOfStudentsTheThirdEmployeeHelpsPer1Hour = Integer.parseInt(scanner.nextLine());    //брой обслужени студенти от третия служител за 1 час -  цяло число в интервала [1 - 100]
        int totalNumberOfStudentsThatShouldBeHelped = Integer.parseInt(scanner.nextLine());         //общ брой студенти, които трябва да бъдат обслужени (от всичките служители) – цяло число в интервала [0 – 10000]

        //служителите многократно ще обслужват студенти - не знаем колко пъти -> докато има студенти, нуждаещи се от съдействие, служителите ще ги обслужват -> while цикъл
        //в момента, в който не останат студенти за обслужване (те са станали 0 или отрицателно число), служителите спират с обслужването (престават да работят)
        int numberOfHours = 0;      //създаваме си променлива за необходимите часове (работно време) за обслужване на всички студенти от всичките трима служители
        while (totalNumberOfStudentsThatShouldBeHelped > 0) {    //докато има студенти, нуждаещи се от съдействие (докато студентите, нуждаещи се от съдействие са повече от 0)

            //щом все още има студенти за обслужване, значи служителите ще работят поне още 1 час -> броят на работните часове се увеличава с единица
            numberOfHours++;      //numberOfHours += 1;       //numberOfHours = numberOfHours + 1;

            //на всеки четвърти час (четвърти, осми, дванадесети и т. нат.) служителите си почиват 1 час, без да обслужват студенти
            if (numberOfHours % 4 == 0) {    //ако часът модулно се дели на 4 с остатък 0 (тоест, без остатък), значи часът е кратен на 4 (часът е четвърти, осми, дванадесети и т. нат.)
                continue;        //прекъсваме текущата итерация на цикъла (и оставащият код вътре в цикъла няма да се изпълни на текущата итерация - няма да се обслужват студенти през текущия час и броят на студентите, които си чакат реда за обслужване, няма да намалее)
            }

            //определяме максималния брой обслужени студенти (от всичките трима служители) за текущия 1 час
            int studentsHelpedPer1HourByAllThreeEmployees = numberOfStudentsTheFirstEmployeeHelpsPer1Hour + numberOfStudentsTheSecondEmployeeHelpsPer1Hour + numberOfStudentsTheThirdEmployeeHelpsPer1Hour;

            //намираме/ъпдейтваме броя на студентите, които чакат реда си за обслужване - на всяка итерация на цикъла броят на чакащите обслужване студенти ще намалява с броя на току-що обслужените студенти през текущия 1 час
            totalNumberOfStudentsThatShouldBeHelped -= studentsHelpedPer1HourByAllThreeEmployees;     //totalNumberOfStudentsThatShouldBeHelped = totalNumberOfStudentsThatShouldBeHelped - studentsHelpedPer1HourByAllThreeEmployees;    //update
        }

        //след като са обслужени всички студенти и сме намерили броя на необходимите за това обслужване часове, ги принтираме (принтирането е само веднъж, извън цикъла е)
        System.out.printf("Time needed: %dh.", numberOfHours);
    }
}
