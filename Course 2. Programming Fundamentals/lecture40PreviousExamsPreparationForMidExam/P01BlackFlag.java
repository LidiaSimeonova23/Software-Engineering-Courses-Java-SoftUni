package lecture40PreviousExamsPreparationForMidExam;

import java.util.Scanner;

public class P01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Пирати плячкосват кораби в морето. Задачата ни е да проверим дали са успели да плячкосат/заграбят поне толкова плячка, колкото им е била целта.

        int numberOfDaysForPirating = Integer.parseInt(scanner.nextLine());     //от първия ред на конзолата четем брой дни за плячкосване/пиратстване – цяло число в интервала [0…100000]
        int dailyPlunder = Integer.parseInt(scanner.nextLine());    //от втория ред на конзолата четем дневната плячка (плячката за 1 ден) – цяло число в интервала [0…50]
        double targetedPlunderAfterAllDaysOfPirating = Double.parseDouble(scanner.nextLine());    //от третия ред на конзолата четем очакваната (целевата) плячка (след всичките дни пиратстване) – реално число в интервала [0.0…10000.0]

        //имаме действия (плячкосване и трупане на плячката), които ще се повтарят многократно (знаем колко ще са повторенията - толкова, колкото са дните за пиратстване, прочетени от конзолата) -> ще ползваме for цикъл
        double totalPlunderFromAllDays = 0.0;      //създаваме си променлива, която да държи цялата заграбена плячка през всичките дни на пиратстване (задаваме като начална стойност 0.0 /или 0/)
        //определихме променливата totalPlunderFromAllDays да е от тип double, тъй като в условието е дадено, че накрая трябва да я закръглим до 2 знака след десетичната точка (закръглят се дробните числа), както и ще става дума за проценти
        for (int currentDayOfPirating = 1; currentDayOfPirating <= numberOfDaysForPirating; currentDayOfPirating++) {

            //обичайната дневна плячка (стига денят да не е трети или пети поред) е прочетеното число от втория ред на конзолата
            totalPlunderFromAllDays += dailyPlunder;        //totalPlunderFromAllDays = totalPlunderFromAllDays + dailyPlunder;  //на всяка итерация на цикъла към цялата заграбена плячка до момента прибавяме плячката от текущия ден

            //всеки трети ден към плячката се печели допълнителна плячка, която е 50% от дневната плячка
            if (currentDayOfPirating % 3 == 0) {       //ако денят е трети поред (тоест, ако денят модулно се дели на 3 с остатък 0 /без остатък/, значи е трети поред - тоест, трети, шести, девети ...)
                totalPlunderFromAllDays += dailyPlunder * 1.0 * 50 / 100;    //totalPlunderFromAllDays = totalPlunderFromAllDays + (dailyPlunder * 1.0 * 50 / 100);   //към заграбената до момента плячка добавяме допълнителната плячка
                //totalPlunderFromAllDays += dailyPlunder * 50 * 0.01;    //totalPlunderFromAllDays = totalPlunderFromAllDays + (dailyPlunder * 50 * 0.01);
            }

            //всеки пети ден пиратите се бият с военен кораб и губят 30% от общо спечелената плячка за всички дни до момента
            if (currentDayOfPirating % 5 == 0) {      //ако денят е пети поред (тоест, ако денят модулно се дели на 5 с остатък 0 /без остатък/, значи е пети поред - тоест, пети, десети, петнадесети ...)
                totalPlunderFromAllDays -= totalPlunderFromAllDays * 30 / 100;       //totalPlunderFromAllDays = totalPlunderFromAllDays - (totalPlunderFromAllDays * 30 / 100);    //от заграбената до момента плячка вадим загубената в петия поред ден плячка
            }

        }


        //накрая извън цикъла проверяваме дали пиратите са постигнали целта си:
        if (totalPlunderFromAllDays >= targetedPlunderAfterAllDaysOfPirating) {    //ако цялата спечелена плячка за всички дни пиратстване е поне толкова (тоест, по-голяма или равна), колкото е била целта, принтираме, че целта е постигната
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunderFromAllDays);
        } else {      //else if (totalPlunderFromAllDays < targetedPlunderAfterAllDaysOfPirating)      //в противен случай (ако цялата спечелена плячка за всички дни пиратстване е по-малко, отколкото е била целта), трябва да изчислим и принтираме какъв процент е спечелената плячка спрямо целевата плячка
            double percentageOfCollectedPlunderFromAllDays = totalPlunderFromAllDays / targetedPlunderAfterAllDaysOfPirating * 100;   //намираме процента на спечелената плячка за всички дни (равен е на стойността на спечелената плячка за всички дни, делено на целевата плячка, умножено по 100)
            System.out.printf("Collected only %.2f%% of the plunder.", percentageOfCollectedPlunderFromAllDays);    //принтираме процента на спечелената плячка
        }

    }
}
