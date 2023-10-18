package lecture11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumberVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ТОВА РЕШЕНИЕ Е ВЯРНО, но не е много логично, защото се налага да променя дължината на масива (а това не е възможно)
        //за да може да е вярно това решение, се налага в else проверката да създам променлива lengthOfArray (вместо директно да ползвам метода numbersArray.length) //numbersArray.length не може да се променя, докато lengthOfArray може да се променя

        //първо трябва да прочетем от конзолата масив от цели числа (ще извършваме аритметични операции с елементите на масива, затова елементите трябва да са числа, а не текстове)
        int[] numbersArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        //чрез split("\\s+") разделяме прочетения текст по един или няколко интервала  -> има по-широко приложение в сравение със сплитването само по един интервал чрез split(" ")

        //ще обхождаме елементите на масива - в задачата се изисква да събираме два съседни елемента - на всяка итерация на for цикъла ще събираме текущия и следващия елемент
        //следователно, на първата итерация на for цикъла трябва да съберем първия елемент от масива, който да е текущ, и втория елемент, който да е следващ;
        //на последната итерация на for цикъла трябва да съберем предпоследния елемент от масива, който да е текущ, и последния елемент, който да е следващ
        //защото ако на последната итерация на for цикъла се опитаме като текущ елемент да вземем последния елемент от масива, ние реално няма да имаме следващ елемент, който да бъде следващ - кодът ни ще е грешен и ще получим грешка: Index out of bounds exception

        if (numbersArray.length == 1) {    //ако дължината на прочетения масив е равна на 1 (тоест, ако масивът се състои само от един елемент)
            System.out.println(numbersArray[0]);     //принтираме този елемент (няма да извършваме сумиране, защото в масива няма друг елемент, с който да го съберем)
            //System.out.printf("%d", numbersArray[0]);
        } else {      //в противен случай (тоест, ако в прочетения масив има повече от един елемент)     //else if (numbersArray.length > 1)    //else if (numbersArray.length >= 2)
            //ако в while цикъла за дължината на масива ползваме метода numbersArray.length (вместо променливата lengthOfArray), винаги ще взимаме дължината на прочетения от конзолата масив - в случая това не ни върши работа, защото тази дължина не се променя (а аз ще искам да я променя)
            //целта ни е накрая да имаме само един елемент, затова на всяка итерация на цикъла дължината на масива трябва да намалява (по принцип знаем, че дължината на масив не се променя, но в тази задача въображаемо ще я променя)
            int sumOfCurrentAndNextElementOfArray = 0;    //създаваме си допълнителна променлива, която да ни държи сумата от два съседни елемента
            int lengthOfArray = numbersArray.length;      //създаваме си променливата lengthOfArray и като стойност присвояваме дължината на масива, прочетен от конзолата
            while (lengthOfArray > 1) {       //докато дължината на масива е повече от 1 (тоест, докато в масива има повече от 1 елемент), ще събираме два съседни елемента
                //на всяка итерация на външния while цикъл за текущата дължина на масива трябва да обходим всичките му елементи, което ще стане с вложен for цикъл:
                for (int index = 0; index <= lengthOfArray - 2; index++) {   //for (int index = 0; index < lengthOfArray - 1; index++)    //както вече по-горе обясних, ще обходим елементите на масива - от първия до предпоследния елемент (а не до последния) в масива
                    //на всяка итерация на цикъла ще взимаме два съседни елемента:
                    int currentElement = numbersArray[index];     //създаваме променлива за текущия елемент - присвояваме като стойност елемента от масива на текущия индекс
                    int nextElement = numbersArray[index + 1];    //създаваме променлива за следващия елемент - присвояваме като стойност елемента от масива на индекс текущия индекс плюс 1

                    sumOfCurrentAndNextElementOfArray = currentElement + nextElement;    //намираме сумата от текущия и следващия елемент от масива
                    numbersArray[index] = sumOfCurrentAndNextElementOfArray;    //на текущия елемент от масива присвояваме като стойност намерената сума от текущия и следващия елемент
                }

                lengthOfArray = lengthOfArray - 1;     //update    //намаляваме дължината на масива (премахваме от него последния елемент) - нещо, което по принцип не е възможно да направим
                //ако тук се опитаме да ползваме numbersArray.length = numbersArray.length - 1;   IntelliJ Idea ще ни го подчертае в червено (защото дължината на масив не се поменя, не можем да й присвоявае нова стойност)
            }

            System.out.println(sumOfCurrentAndNextElementOfArray);    //принтираме единствения елемент на сгъстения масив, който получихме (това реално е последната намерена сума от два съседни елемента)
            //System.out.printf("%d", sumOfCurrentAndNextElementOfArray);
        }


    }
}
