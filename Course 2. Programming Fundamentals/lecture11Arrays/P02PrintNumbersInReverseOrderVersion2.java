package lecture11Arrays;

import java.util.Scanner;

public class P02PrintNumbersInReverseOrderVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());   //от първия ред на конзолата четем едно цяло число, което ще е броят на редовете, които ще прочетем

        //n на брой пъти ще четем текущия ред от конзолата -> много пъти ще правим нещо, знаем колко пъти -> ще ползваме for цикъл
        //всички данни, които ще четем, са от един и същи тип -> в задачата се изисква накрая да ги принтираме в обратен ред -> за целта първо трябва да съхраним прочетените данни в структура от данни - масив
        //в конкретната задача ще прочетем числа, но с тях няма да извършваме аритметични операции и/или сравнения - следователно, можем да прочетем числата като текстове (а не като числа) - следователно, създаваме String масив (вместо int масив):
        String[] numbersAsTextsArray = new String[n];   //създаваме масив от текстове от n на брой елемента (тези елементи все още нямат конкретни стойности, всичките елементи в началото ще имат дефолтната стойност на съответния тип данни - в случая елементите/данните са от тип String и ще имат начална стойност null, тоест, нямат никаква стойност)
        //ако в задачата се изискваше да принтираме прочетените числа/текстове в прав ред, нямаше да има нужда да създаваме масив, в който да си съхраняваме числата/текстовете

        //с for цикъл четем всеки ред от конзолата като текст и го присвояваме като стойност на текущия елемент от масива
        //тъй като става въпрос за структура от данни, for цикълът няма да е от 1 до n включително;
        //for цикълът ще е от първия елемент на масива, който е на индекс 0, до последния елемент на масива, който е на индекс дължината на масива - 1 включително (или индекс по-малък от дължината на масива)
        //например, ако в един масив имаме дължина 7 (7 на брой елемента), за да обходим всичките елементи, индексите трябва да са от 0 до 6 включително
        for (int index = 0; index < n; index++) {       //for (int index = 0; index <= n - 1; index++)    //for (int i = 0; i < n; i++)
            String currentNumberAsText = scanner.nextLine();     //на всяка итерация на цикъла четем текущия ред/текст от конзолата
            //numbersAsTextsArray[index]    -> текущия елемент от масива (елемента от масива на текущия индекс)
            numbersAsTextsArray[index] = currentNumberAsText;   //на текущия елемент от масива присвояваме като стойност текущото прочетения текст от конзолата
            //numbersAsTextsArray[index] = scanner.nextLine();   -> можехме така да напишем за по-накратко (вместо предишните два реда код)
            //ако целта на задачата беше да принтираме елементите в прав ред (по реда на присъединяване на стойностите им) - от първия към последния текст -> можехме да го направим още тук в този for цикъл - чрез  System.out.print(currentNumberAsText + " ");   или чрез System.out.printf("%s ", currentNumberAsText);
        }

        //тъй като целта на задачата е да принтираме елементите на масива в обратен ред - от последния текст към първия текст - принтирането трябва да стане чрез нов for цикъл, но този път той е намаляващ (декрементация с единица, защото индексите на елементите намаляват с единица)
        //начало на цикъла ще е последният елемент от масива, който е на индекс дължината на масива - 1; краят на цикъла ще е първият елемент от масива, който е на индекс 0
        for (int index = numbersAsTextsArray.length - 1; index >= 0; index--) {       //for (int i = numbersAsTextsArray.length - 1; i >= 0; i--)
            System.out.printf("%s ", numbersAsTextsArray[index]);   //System.out.print(numbersAsTextsArray[index] + " ");   //на всяка итерация на цикъла принтираме текущия елемент от масива - всички елементи да са на един ред с интервал между тях
        }

    }
}
