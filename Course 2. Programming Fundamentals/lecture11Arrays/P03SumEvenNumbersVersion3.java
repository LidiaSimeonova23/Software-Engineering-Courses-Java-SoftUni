package lecture11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbersVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //в тази задача ще извършваме аритметични операции -> следователно, длъжни сме да ползваме данните като числа (не можем да ги ползваме като текстове) ->
        //всички данни ще са от един и същи тип - можем да ги съхраним в масив (в случая от цели числа) - създаваме масива:
        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();     //от първия ред на конзолата четем масив от цели числа     //функционално програмиране
        //чрез scanner.nextLine() четем цял ред от конзолата като String (текст), чрез split(" ") разделяме прочетения текст на масив от отделни текстове, чрез Arrays.stream пускаме поток от данни, чрез mapToInt взимаме всеки елемент от масива, чрез Integer::parseInt го превръщаме в цяло число и чрез toArray() го връщаме в масива

        //трябва да проверим всеки елемент от масива дали е четно число и ако е четно - да го прибавим към сумата от четните числа - чрез foreach цикъл (може и чрез for цикъл)
        int sumOfEvenNumbers = 0;     //създаваме си променлива, която да държи сумата от всички четни числа в int масива - като начална стойност й задаваме 0
        for (int element : numbersArray) {   //за всеки елемент от целочисления масив
            if (element % 2 == 0) {      //ако текущият елемент от int масива модулно се дели на 2 с остатък 0 (тоест, без остатък), значи е четно число
                sumOfEvenNumbers += element;     //sumOfEvenNumbers = sumOfEvenNumbers + element;    //щом текущият елемент е четно число, го прибавяме към домоментната сума от четните числа
            }
        }

        //след като вътре във foreach цикъла сме намерили сумата от всички четни числа, накрая само веднъж (извън foreach цикъла) принтираме тази сума:
        System.out.println(sumOfEvenNumbers);
        //System.out.printf("%d", sumOfEvenNumbers);
    }
}
