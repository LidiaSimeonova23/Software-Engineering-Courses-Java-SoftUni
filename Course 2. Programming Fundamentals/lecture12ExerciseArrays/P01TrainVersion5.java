package lecture12ExerciseArrays;

import java.util.Scanner;

public class P01TrainVersion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата ще прочетем число n и n на брой пъти ще направим нещо -> типичен for цикъл

        //в тази задача като входни данни ще четем само цели числа - за четенето на входните данни можем да ползваме метода scanner.nextInt()

        int numberOfWagons = scanner.nextInt();    //от първия ред на конзолата четем едно цяло число, което е броят на вагоните във влака

        //многократно ще четем брой хора в даден вагон на влака - ще четем толкова пъти, колкото е броят на вагоните -> с for цикъл
        //в задачата се иска да разберем колко хора има във всеки отделен вагон на влака, както и колко общо хора има в целия влак
        int totalNumberOfPeopleInTheTrain = 0;     //създаваме допълнителна променлива, която да държи/съхранява общия брой хора в целия влак (с начална стойност 0)
        for (int currentWagon = 1; currentWagon <= numberOfWagons; currentWagon++) {    //вместо променливата currentWagon можехме да ползваме i
            int numberOfPeopleInTheCurrentWagon = scanner.nextInt();       //на всяка итерация на цикъла четем брой хора в текущия вагон на влака

            //на всяка итерация на цикъла принтираме брой хора в текущия вагон на влака:
            System.out.print(numberOfPeopleInTheCurrentWagon + " ");     //System.out.printf("%d ", numberOfPeopleInTheCurrentWagon);      //всички принтирания са на един ред с интервал между тях

            //на всяка итерация на цикъла към домоментния общ брой хора във влака добавяме хората от текущия вагон:
            totalNumberOfPeopleInTheTrain += numberOfPeopleInTheCurrentWagon;    //totalNumberOfPeopleInTheTrain = totalNumberOfPeopleInTheTrain + numberOfPeopleInTheCurrentWagon;
        }

        System.out.println();    //сваляме курсора на следващия ред (тъй като предишните принтирания - тези във for цикъла - са на един ред, а искаме следващото принтиране да е на нов/отделен ред)
        System.out.println(totalNumberOfPeopleInTheTrain);     //System.out.printf("%d", totalNumberOfPeopleInTheTrain);     //извън for цикъла принтираме общия брой хора в целия влак (от всички вагони)
    }
}
