package lecture11Arrays;

import java.util.Scanner;

public class P02PrintNumbersInReverseOrderVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());   //от първия ред на конзолата четем едно цяло число, което ще е броят на редовете, които ще прочетем

        //n на брой пъти ще четем текущия ред от конзолата -> много пъти ще правим нещо, знаем колко пъти -> ще ползваме for цикъл
        //всички данни, които ще четем, са от един и същи тип -> в задачата се изисква накрая да ги принтираме в обратен ред -> за целта първо трябва да съхраним прочетените данни в структура от данни - масив
        int[] numbersArray = new int[n];   //създаваме целочислен масив (масив от цели числа) от n на брой елемента (тези елементи все още нямат конкретни стойности, всичките елементи в началото ще имат дефолтната стойност на съответния тип данни - в случая елементите/данните са от тип int и ще имат начална стойност 0)
        //ако в задачата се изискваше да принтираме прочетените числа в прав ред, нямаше да има нужда да създаваме масив, в който да си съхраняваме числата

        //с for цикъл четем всеки ред от конзолата като текст, превръщаме го в число и го присвояваме като стойност на текущия елемент от масива
        //тъй като става въпрос за структура от данни, for цикълът няма да е от 1 до n включително; 
        //for цикълът ще е от първия елемент на масива, който е на индекс 0, до последния елемент на масива, който е на индекс дължината на масива - 1 включително (или индекс по-малък от дължината на масива)
        //например, ако в един масив имаме дължина 7 (7 на брой елемента), за да обходим всичките елементи, индексите трябва да са от 0 до 6 включително
        for (int index = 0; index < n; index++) {       //for (int index = 0; index <= n - 1; index++)    //for (int i = 0; i < n; i++)
            int currentNumber = Integer.parseInt(scanner.nextLine());     //на всяка итерация на цикъла четем текущия ред/число от конзолата
            //numbersArray[index]    -> текущия елемент от масива (елемента от масива на текущия индекс)            
            numbersArray[index] = currentNumber;   //на текущия елемент от масива присвояваме като стойност текущото прочетеното число от конзолата 
            //numbersArray[index] = Integer.parseInt(scanner.nextLine());   -> можехме така да напишем за по-накратко (вместо предишните два реда код)
            //ако целта на задачата беше да принтираме елементите в прав ред (по реда на присъединяване на стойностите им) - от първото към последното число -> можехме да го направим още тук в този for цикъл - чрез  System.out.print(currentNumber + " ");   или чрез System.out.printf("%d ", currentNumber);  
        }

        //тъй като целта на задачата е да принтираме елементите на масива в обратен ред - от последното число към първото число - принтирането трябва да стане чрез нов for цикъл, но този път той е намаляващ (декрементация с единица, защото индексите на елементите намаляват с единица)
        //начало на цикъла ще е последният елемент от масива, който е на индекс дължината на масива - 1; краят на цикъла ще е първият елемент от масива, който е на индекс 0
        for (int index = numbersArray.length - 1; index >= 0; index--) {       //for (int i = numbersArray.length - 1; i >= 0; i--)
            System.out.printf("%d ", numbersArray[index]);   //System.out.print(numbersArray[index] + " ");   //на всяка итерация на цикъла принтираме текущия елемент от масива - всички елементи да са на един ред с интервал между тях
        }

    }
}