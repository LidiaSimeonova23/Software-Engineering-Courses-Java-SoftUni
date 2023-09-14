package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P07WaterOverflowVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //В ТОВА РЕШЕНИЕ НА ЗАДАЧАТА ПРЕДИ ДА ДОЛЕЕМ ЛИТРИ ВОДА В ЦИСТЕРНАТА, ПРОВЕРЯВАМЕ ДАЛИ ЦИСТЕРНАТА ЩЕ МОЖЕ ДА ГИ ПОБЕРЕ (КОЕТО Е НАЙ-ЛОГИЧНОТО РЕШЕНИЕ):

        //по условие ни е дадено, че капацитетът на цистерната е 255 литра вода

        int capacityOfWaterTank = 255;

        int times = Integer.parseInt(scanner.nextLine());   //от първия ред на конзолата четем цяло число, което е броят пъти, които ще се прави опит да се долива вода в цистерната

        //многократно ще повтаряме следните действия (във for-цикъл):
        //ще четем числа - тоест, текущите литри, които трябва да се добавят в цистерната, и ще проверяваме дали тя ще ги побере или не
        //ако ще ги побере, тогава те ще бъдат изсипани в цистерната и общата вода в цистерната ще се увеличи (ще е равна на досегашната вода + текущо изсипаната), а капацитетът (свободното място в цистерната) ще намалее;
        //ако няма да ги побере, изобщо даже няма да се изсипват в цистерната

        int sum = 0;   //създаваме си променлива за сумата от литрите вода в цистерната - с начална стойност 0, после ще се променя
        for (int i = 1; i <= times; i++) {
            int currentQuantityOfWater = Integer.parseInt(scanner.nextLine());        //на всяка итерация на цикъла четем текущите литри вода

            //проверка дали ще изсипем текущо прочетеното количество вода в цистерната, или няма да го изсипем:
            if (currentQuantityOfWater <= capacityOfWaterTank) {    //ако текущите литри вода са по-малко или равно на капацит. на цист., изсипваме тези литри вода в цистерната и сумата от водата в цистерната ще се увеличи, а свободното място в нея ще намалее
                sum = sum + currentQuantityOfWater;   //sum += currentQuantityOfWater;   //сумата от всичките литри вода в цист. става равна на досегашната сума + текущо изсипаните литри вода
                capacityOfWaterTank = capacityOfWaterTank - currentQuantityOfWater;    //капацитетът (свободното място в цист.) намалява (равен е на домоментния капацитет минус текущо изсипаните литри вода)
            } else {   //в противен случай (тоест, ако текущите прочетени литри вода, които трябва да се изсипят в цист., са повече от капацит. на цист., то този капацитет не е достатъчен) водата изобщо няма да се изсипе в цист.
                System.out.println("Insufficient capacity!");     //винаги когато условието е вярно, да се принтира, че капацитетът не е достатъчен
            }
        }

        System.out.println(sum);   //извън цикъла (само веднъж) принтираме сумата от литрите вода, които реално са в цистерната
    }
}
