package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P07WaterOverflowVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //В ТОВА РЕШЕНИЕ НА ЗАДАЧАТА ВИНАГИ ДОЛИВАМЕ ТЕКУЩИТЕ ЛИТРИ ВОДА В ЦИСТЕРНАТА И АКО СА ПОВЕЧЕ ОТ КАПАЦИТЕТА Й, ГИ ПРЕМАХВАМЕ ОТ ЦИСТЕРНАТА (КОЕТО НЕ Е ОСОБЕНО ЛОГИЧНО В РЕАЛНИЯ ЖИВОТ):

        int capacityOfWaterTank = 255;  //по условие ни е дадено, че капацитетът на цистерната с вода е 255 л

        int n = Integer.parseInt(scanner.nextLine());   //от първия ред на конзолата четем цяло число - то показва колко пъти се изсипва вода в цистерната

        //с for-цикъл (от 1 до n) се чете съответното колич. литри вода, които се доливат към досегашното количество, налично в цистерната
        int currentLiters = 0;      //създаваме си променлива за текущите/домоментните литри вода в цистерната - с начална стойност 0 (в началото цистерната е празна), после ще се променя
        for (int i = 1; i <= n; i++) {
            int currentPouredLiters = Integer.parseInt(scanner.nextLine());       //на всяка итерация на цикъла четем текущите литри вода, реално изсипани в цистерната

            currentLiters += currentPouredLiters;    //currentLiters = currentLiters + currentPouredLiters;  //текущите/домоментните литри вода се увеличават с току-що изсипаните литри вода

            //проверка -
            if (currentLiters > capacityOfWaterTank) {   //ако текущото колич. вода е надвишило капацитета, значи капацитетът не е недостатъчен и налетите литри трябва да се върнат обратно
                System.out.println("Insufficient capacity!");   //винаги когато условието е вярно, да се принтира, че капацитетът не е достатъчен
                currentLiters -= currentPouredLiters;     // currentLiters = currentLiters - currentPouredLiters;  //домоментните литри вода намаляват (последно изсипаните литри вода се връщат обратно, тоест, махат се от цистерната)
            }
        }

        System.out.println(currentLiters);  //накрая извън цикъла (само веднъж) се принтира цялото текущо количество вода в цистерната
    }
}
