package lecture11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumberVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //първо трябва да прочетем от конзолата масив от цели числа (ще извършваме аритметични операции с елементите на масива, затова елементите трябва да са числа, а не текстове)
        int[] numbersArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        //чрез split("\\s+") разделяме прочетения текст по един или няколко интервала  -> има по-широко приложение в сравение със сплитването само по един интервал чрез split(" ")

        //ще обхождаме елементите на масива - в задачата се изисква да събираме два съседни елемента - в това решение на задачата на всяка итерация на for цикъла ще събираме текущия и предходния елемент
        //следователно, на първата итерация на for цикъла трябва да съберем втория елемент от масива, който да е текущ, и първия елемент, който да е предходен;
        //защото ако на първата итерация на for цикъла се опитаме като текущ елемент да вземем първия елемент от масива, ние реално няма да имаме предходен елемент, който да бъде предходен - кодът ни ще е грешен и ще получим грешка: Index out of bounds exception
        //на последната итерация на for цикъла трябва да съберем последния елемент от масива, който да е текущ, и предпоследния елемент, който да е предходен

        if (numbersArray.length == 1) {    //ако дължината на прочетения масив е равна на 1 (тоест, ако масивът се състои само от един елемент)
            System.out.println(numbersArray[0]);     //принтираме този елемент (няма да извършваме сумиране, защото в масива няма друг елемент, с който да го съберем)
            //System.out.printf("%d", numbersArray[0]);
        } else {      //в противен случай (тоест, ако в прочетения масив има повече от един елемент)     //else if (numbersArray.length > 1)    //else if (numbersArray.length >= 2)
            //ако в while цикъла за дължината на масива ползваме метода numbersArray.length (вместо променливата lengthOfArray), винаги ще взимаме дължината на прочетения от конзолата масив - в случая това не ни върши работа, защото тази дължина не се променя (а аз ще искам да я променя)
            //целта ни е накрая да имаме само един елемент, затова на всяка итерация на while цикъла дължината на масива трябва да намалява (по принцип знаем, че дължината на масив не се променя, но в тази задача трябва да измислим начин, за да я променим)
            int lengthOfArray = numbersArray.length;      //създаваме си променливата lengthOfArray и като стойност присвояваме дължината на масива, прочетен от конзолата
            while (lengthOfArray > 1) {       //докато дължината на прочетения от конзолата масив е повече от 1 (тоест, докато в масива има повече от 1 елемент), ще събираме два съседни елемента
                //на всяка итерация на външния while цикъл за текущата дължина на масива трябва да обходим всичките му елементи, което ще стане с вложен for цикъл:
                int[] condensedArray = new int[lengthOfArray - 1];    //създаваме нов целочислен масив с име condensedArray, чиято дължина ще е с един елемент по-малка от дължината на прочетения от конзолата масив   (не сме посочили конкретни стойности на елементите в масива condensedArray, затова те имат дефолтна стойност 0 - тя е дефолтна за данни от тип int)
                for (int index = 1; index <= lengthOfArray - 1; index++) {   //for (int index = 1; index < lengthOfArray; index++)    //както вече по-горе обясних, ще обходим елементите на прочетения от конзолата масив - от втория (а не от първия) до последния елемент в масива
                    condensedArray[index - 1] = numbersArray[index] + numbersArray[index - 1];   //на всяка итерация на for цикъла на предходния елемент от масива condensedArray присвояваме като стойност сбора/сумата от текущия и предходния елемент от масива numbersArray
                    //ВАЖНО! - на предишния ред задължително пишем condensedArray[index - 1] (защото ако напишем condensedArray[index], присвояването на стойности на елементите в масив condensedArray ще почне от втория, а не от първия елемент на масива и след run-ването на кода ще получим грешка Index out of bound exception)
                }

                //след като сме преминали през всички итерации на вътрешния for цикъл и сме намерили сумите на всеки два съседни елемента в настоящия вид на масива numbersArray (за текущата му дължина), трябва да обновим/ъпдейтнем масива numbersArray (за да стане с един елемент по-малко)
                numbersArray = condensedArray;   //обновяваме масива numbersArray (тоест, на масив numbersArray присвояваме като стойност новия сгъстен масив condensedArray)  - по този начин намаляваме дължината на масив numbersArray и променяме стойностите на елементите му
                lengthOfArray = lengthOfArray - 1;     //update на условието в while цикъла   //намаляваме дължината на масива - не е възможно чрез numbersArray.length = numbersArray.length - 1;   затова си създадохме променливата lengthOfArray
            }

            //само веднъж (извън while цикъла, но в рамките на else проверката) принтираме единствения елемент на обновения вид на масив numbersArray, който получихме (това реално е последната намерена сума от последните два съседни елемента)
            System.out.println(numbersArray[0]);
            //System.out.printf("%d", numbersArray[0]);
        }


    }
}
