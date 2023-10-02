package lecture40PreviousExamsPreparationForMidExam;

import java.util.Scanner;

public class P01CounterStrikeVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //ТАЗИ ЗАДАЧА Е ПОДОБНА НА ЗАДАЧА 10 (PokeMon) ОТ ЛЕКЦИЯ 9

        int availableEnergy = Integer.parseInt(scanner.nextLine());      //първоначалната енергия - цяло число в интервала [1-10000]

        //целта на задачата е да броим всяка победа

        //многократно (не знаем колко пъти) ще четем разстояние до врага -> ще ползваме while цикъл (Докато входните данни са различни от "End of battle")
        int numberOfWonBattles = 0;         //създаваме си променлива за броя на спечелените битки
        String input = scanner.nextLine();
        while (!input.equals("End of battle")) {
            int distanceFromCurrentEnemy = Integer.parseInt(input);       //на всяка итерация на цикъла ще четем разстояние до текущия враг - разстоянието е цяло число в интервала [1-10000]

            //енергията, която ни е необходима, за да достигнем до текущия враг, е равна на разстоянието, прочетено от конзолата на текущата итерация на цикъла

            //ако нямаме достатъчно енергия, за да достигнем текущия враг, програмата приключва, като преди това принтираме: "Not enough energy! Game ends with {count} won battles and {energy} energy".
            if (availableEnergy < distanceFromCurrentEnemy) {      //ако наличната енергия е по-малка от разстоянието (от необходимата енергия)
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", numberOfWonBattles, availableEnergy);
                return;   //прекъсваме цялата програма (и няма да се изпълни нито един следващ ред код - нито вътре в цикъла, нито извън него)
            }

            //ако не сме попаднали в условието, при което наличната енергия е по-малка от разстоянието, значи наличната енергия е по-голяма или равна на разстоянието -> следователно, преминаваме успешно разстоянието ->
            //достигаме текущия враг, което означава, че печелим текущата битка и енергията ни намалява с изминатото разстояние до текущия враг
            numberOfWonBattles++;         //numberOfWonBattles += 1;      //numberOfWonBattles = numberOfWonBattles + 1;        //броят спечелени битки нараства с единица (инкрементация)
            availableEnergy -= distanceFromCurrentEnemy;       //availableEnergy = availableEnergy - distanceFromCurrentEnemy;     //наличната енергия намалява с изминатото разстояние до текущия враг

            //всяка трета спечелена битка (тоест, ако текущо спечелената битка е трета, шеста, девета ...) увеличава наличната към момента енергия със стойността на текущия брой спечелени битки
            if (numberOfWonBattles % 3 == 0) {        //ако броят (до момента) на спечелените битки е кратен на три (тоест, ако броят на спечелените битки модулно се дели на три с остатък 0 /без остатък/), означава, че битката е трета поред
                availableEnergy += numberOfWonBattles;       //availableEnergy = availableEnergy + numberOfWonBattles;         //наличната към момента енергия нараства със стойността на текущия брой спечелени битки
            }


            input = scanner.nextLine();     //update на входните данни (за да не изпаднем в безкраен цикъл)
        }


        //щом не сме стигнали до оператор return, значи все някога входните данни са станали "End of battle" и директно (няма нужда от проверка) принтираме (извън цикъла) брой победи и налична енергия:
        System.out.printf("Won battles: %d. Energy left: %d", numberOfWonBattles, availableEnergy);
    }
}
