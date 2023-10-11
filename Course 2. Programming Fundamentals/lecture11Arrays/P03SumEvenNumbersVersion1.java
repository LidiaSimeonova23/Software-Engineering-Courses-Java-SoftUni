package lecture11Arrays;

import java.util.Scanner;

public class P03SumEvenNumbersVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();    //четем цял ред от конзолата като текст   //например: "1 2 3 4 5 6"
        String[] inputArray = input.split(" ");   //разделяме прочетения текст на отделни текстове и го запазваме в масив от String-ове (текстове)    //["1", "2", "3", "4", "5", "6"]
        //тези два реда от кода могат да се напишат и съкратено така:    String[] inputArray = scanner.nextLine().split(" ");

        //в тази задача ще извършваме аритметични операции -> следователно, длъжни сме да ползваме данните като числа (не можем да ги ползваме като текстове) ->
        //за целта си създаваме един нов масив - целочислен, в който да запазим елементите от String масива, но този път като числа (а не като текстове):
        int[] numbersArray = new int[inputArray.length];    //с [inputArray.length] определяме, че дължината (броят елементи) на целочисления масив е равна на дължината (броя елементи) на String масива

        //трябва да обходим всеки елемент от String масива и да го присвоим като стойност на текущия елемент от int масива ->
        //тъй като знаем каква е дължината на String масива (тоест, брой повторения, които трябва да извършим), ще ползваме for цикъл:
        int sumOfEvenNumbers = 0;    //създаваме си променлива, която да държи сумата от всички четни числа в int масива - като начална стойност й задаваме 0
        for (int index = 0; index < inputArray.length; index++) {    //с for цикъл обхождаме всеки елемент на String масива        //for (int index = 0; index <= inputArray.length - 1; index++)
            numbersArray[index] = Integer.parseInt(inputArray[index]);    //на текущия елемент от целочисления масив присвояваме като стойност текущия елемент от String масива, превърнат в цяло число

            //проверяваме дали текущият елемент от int масива е четно число
            if (numbersArray[index] % 2 == 0) {      //ако текущият елемент от int масива модулно се дели на 2 с остатък 0 (тоест, без остатък), значи е четно число
                sumOfEvenNumbers += numbersArray[index];       //sumOfEvenNumbers = sumOfEvenNumbers + numbersArray[index];     //щом текущият елемент е четно число, го прибавяме към домоментната сума от четните числа
            }

        }

        //по-подробно записан, for цикълът щеше да бъде така:
        /*for (int index = 0; index < inputArray.length; index++) {    //с for цикъл обхождаме всеки елемент на String масива        //for (int index = 0; index <= inputArray.length - 1; index++)
            String currentElementOfStringArray = inputArray[index];     //създаваме променлива за текущия елемент на String масива
            int currentElementOfIntegerArray = numbersArray[index];     //създаваме променлива за текущия елемент на int масива
            currentElementOfIntegerArray = Integer.parseInt(currentElementOfStringArray);    //на всяка итерация на цикъла на текущия елемент от int масива присвояваме като стойност текущия елемент от String масива, превърнат в цяло число

            if (currentElementOfIntegerArray % 2 == 0) {     //ако текущият елемент от int масива модулно се дели на 2 с остатък 0 (тоест, без остатък), значи е четно число
                sumOfEvenNumbers += currentElementOfIntegerArray;      //щом текущият елемент е четно число, го прибавяме към домоментната сума от четните числа
            }

        }*/

        //след като вътре във for цикъла сме намерили сумата от всички четни числа, накрая само веднъж (извън for цикъла) принтираме тази сума:
        System.out.println(sumOfEvenNumbers);
        //System.out.printf("%d", sumOfEvenNumbers);
    }
}
