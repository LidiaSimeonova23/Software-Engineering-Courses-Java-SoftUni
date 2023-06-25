package lecture10ExerciseForLoop;

import java.util.Scanner;

public class P07TrekkingManiaVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата четем:
        int numberOfGroups = Integer.parseInt(scanner.nextLine());            //броя на групите от катерачи – цяло число в интервала [1...1000]

        int peopleClimbingMusala = 0;                  //създаваме си променлива за брой хора, изкачващи съответния връх с нач. стойност 0; после ще я ползваме за изчисления в цикъла и извън него
        int peopleClimbingMonblan = 0;                 //създаваме си променлива за брой хора, изкачващи съответния връх с нач. стойност 0; после ще я ползваме за изчисления в цикъла и извън него
        int peopleClimbingKilimanjaro = 0;             //създаваме си променлива за брой хора, изкачващи съответния връх с нач. стойност 0; после ще я ползваме за изчисления в цикъла и извън него
        int peopleClimbingK2 = 0;                      //създаваме си променлива за брой хора, изкачващи съответния връх с нач. стойност 0; после ще я ползваме за изчисления в цикъла и извън него
        int peopleClimbingEverest = 0;                 //създаваме си променлива за брой хора, изкачващи съответния връх с нач. стойност 0; после ще я ползваме за изчисления в цикъла и извън него

        int totalPeople = 0;         //създаваме си променлива за общ брой хора от всички групи с нач. стойност 0; после ще я ползваме за изчисления в цикъла и извън него

        for (int i = 1; i <= numberOfGroups; i++) {            //цикълът трябва да се завърти толкова пъти, колкото е броят на групите - знаем колко пъти ще се завърти, значи е for-цикъл
            int numberOfPeopleInTheCurrentGroup = Integer.parseInt(scanner.nextLine());    //на всяко завъртане на цикъла ще се чете броят на хората в дадената група  броя на хората в групата – цяло число в интервала [1...1000]

            totalPeople = totalPeople + numberOfPeopleInTheCurrentGroup;                //намираме общия брой хора - той е равен на хората до момента + хората от новата група

            if (numberOfPeopleInTheCurrentGroup <= 5) {                           //Група до 5 човека – изкачват Мусала
                peopleClimbingMusala = peopleClimbingMusala + numberOfPeopleInTheCurrentGroup;
            } else if (numberOfPeopleInTheCurrentGroup <= 12) {                   //Група от 6 до 12 човека – изкачват Монблан
                peopleClimbingMonblan = peopleClimbingMonblan + numberOfPeopleInTheCurrentGroup;
            } else if (numberOfPeopleInTheCurrentGroup <= 25) {                   //Група от 13 до 25 човека – изкачват Килиманджаро
                peopleClimbingKilimanjaro = peopleClimbingKilimanjaro + numberOfPeopleInTheCurrentGroup;
            } else if (numberOfPeopleInTheCurrentGroup <= 40) {                   //Група от 26 до 40 човека –  изкачват К2
                peopleClimbingK2 = peopleClimbingK2 + numberOfPeopleInTheCurrentGroup;
            } else {                                                       //Група от 41 или повече човека – изкачват Еверест
                peopleClimbingEverest = peopleClimbingEverest + numberOfPeopleInTheCurrentGroup;
            }

        }


        //трябва да изчислим процента на хората в съответната група -> процентът на хората в дадена група = брой хора в дадената група / общия брой хора от всички групи * 100
        double peopleClimbingMusalaInPercent = peopleClimbingMusala * 1.0 / totalPeople * 100;
        double peopleClimbingMonblanInPercent = peopleClimbingMonblan * 1.0 / totalPeople * 100;
        double peopleClimbingKilimanjaroInPercent = peopleClimbingKilimanjaro * 1.0 / totalPeople * 100;
        double peopleClimbingK2InPercent = peopleClimbingK2 * 1.0 / totalPeople * 100;
        double peopleClimbingEverestInPercent = peopleClimbingEverest * 1.0 / totalPeople * 100;

        //трябва да принтираме процента хора във всяка от петте групи и резултатът (процентът) да се закръгли до 2 точки след десетичния знак
        System.out.printf("%.2f%%%n", peopleClimbingMusalaInPercent);
        System.out.printf("%.2f%%%n", peopleClimbingMonblanInPercent);
        System.out.printf("%.2f%%%n", peopleClimbingKilimanjaroInPercent);
        System.out.printf("%.2f%%%n", peopleClimbingK2InPercent);
        System.out.printf("%.2f%%", peopleClimbingEverestInPercent);
    }
}

