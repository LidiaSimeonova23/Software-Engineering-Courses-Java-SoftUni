package lecture12ExerciseArrays;

import java.util.Scanner;

public class P01TrainVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата ще прочетем число n и n на брой пъти ще направим нещо -> типичен for цикъл

        int numberOfWagons = Integer.parseInt(scanner.nextLine());    //от първия ред на конзолата четем едно цяло число, което е броят на вагоните във влака

        //1.създаваме масив
        //в задачата се иска да разберем колко хора има във всеки отделен вагон на влака, както и колко общо хора има в целия влак
        //всички входни данни са от един и същи тип - само цели числа -> можем да ползваме колекция/структура от данни -> масив от цели числа [данните ни трябват като числа (а не като текстове), защото ще извършваме аритметични операции с тях]
        //за да съхраняваме броя на хората, които се качват във всеки отделен вагон на влака, ще създадем целочислен (int) масив с толкова на брой елементи, колкото е броят на вагоните, прочетен от конзолата:
        int[] wagonsArray = new int[numberOfWagons];     //при създаването на масива не сме задали конкретни стойности на елементите в масива, следователно, всичките елементи са с начална стойност 0, тъй като тя е дефолтна за данни от тип int
        //например масивът за момента ще изглежда така: [0, 0, 0]  - с първите входни данни

        //2. присвояваме стойности (които четем от конзолата) на елементите от масива
        //трябва да обходим всеки елемент от създадения вече масив и да му присвоим стойност (която четем от конзолата) ->
        //универсалният начин за итериране/обхождане на масив е чрез for цикъл (чрез for цикъл достъпваме текущия елемент чрез неговия уникален индекс)
        //тъй като става въпрос за колекция от данни, при обхождането й почваме от първия елемент в масива, който е на индекс 0, и достигаме до последния елемент, който е на индекс дължината на масива (броя вагони) минус 1 включително
        for (int currentWagon = 0; currentWagon < numberOfWagons; currentWagon++) {        // for (int currentWagon = 0; currentWagon < wagonsArray.length; currentWagon++)    //вместо променливата currentWagon можехме да ползваме i
            //още варианти на условието във цикъла:  for (int currentWagon = 0; currentWagon <= numberOfWagons - 1; currentWagon++)     или   for (int currentWagon = 0; currentWagon <= wagonsArray.length - 1; currentWagon++)
            int numberOfPeopleInTheCurrentWagon = Integer.parseInt(scanner.nextLine());   //на всяка итерация на цикъла създаваме променлива, която да държи броя хора в текущия вагон на влака (четем броя хора от конзолата - броят хора е цяло число)
            wagonsArray[currentWagon] = numberOfPeopleInTheCurrentWagon;   //на всяка итерация на цикъла на текущия елемент от масива (на текущия вагон от влака) присвояваме като стойност прочетения от конзолата брой хора в текущия вагон на влака
            //предишните 2 реда код могат да се запишат и само с един ред код така:   wagonsArray[currentWagon] = Integer.parseInt(scanner.nextLine());     - на текущия елемент от масива му присвояваме като стойност текущо прочетеното от конзолата число
        }
        //и след всички итерации на for цикъла вече всички елементи на масива имат конкретни стойности, които бяха прочетени от конзолата
        //ако в началото масивът беше такъв: [0, 0, 0], то сега вече същият масив има такъв вид: [13, 24, 8]

        //3. принтираме елементите на масива и намираме сумата от всички елементи
        //Вече елементите в масива (вагоните във влака) имат конкретни стойности (брой хора в съответния вагон). Сега трябва да принтираме брой хора във всеки вагон, както и да намерим общия брой хора в целия влак.
        //принтирането може да стане с for или с foreach цикъл - най-лесно е с foreach цикъл (тъй като за него не ни интересуват индексите на елементите)
        int totalNumberOfPeopleInTheTrain = 0;    //създаваме допълнителна променлива, която да държи/съхранява общия брой хора в целия влак (с начална стойност 0)
        for (int element : wagonsArray) {     //вместо element можем да пишем например wagon
            System.out.print(element + " ");     //System.out.printf("%d ", element);    //на всяка итерация на foreach цикъла принтираме елемента (брой хора във вагона) и интервал след него  (всички елементи са на един ред с интервал между тях)
            totalNumberOfPeopleInTheTrain += element;      //totalNumberOfPeopleInTheTrain = totalNumberOfPeopleInTheTrain + element;     //на всяка итерация на foreach цикъла към домоментния общ брой хора във влака добавяме хората от текущия вагон
        }

        //4. принтираме сумата от всички елементи на масива
        System.out.println();   //сваляме курсора на следващия ред (тъй като предишните принтирания - тези във foreach цикъла - са на един ред, а искаме следващото принтиране да е на нов/отделен ред)
        System.out.println(totalNumberOfPeopleInTheTrain);     //System.out.printf("%d", totalNumberOfPeopleInTheTrain);     //само веднъж (извън foreach цикъла) принтираме общия брой хора в целия влак (от всички вагони)
    }
}
