package lecture11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();      //от цял ред на конзолата четем масив от цели числа - чрез функционално програмиране  (не можем да четем масив от текстове, тъй като ще трябва да извършваме аритметични операции с елементите на масива)
        //чрез scanner.nextLine() четем цял ред от конзолата като текст; чрез split(" ") разделяме прочетения текст на отделни текстове и получаваме масив от текстове;
        //чрез Arrays.stream пускаме поток от данни; чрез mapToInt взимаме всеки един елемент от масива; чрез Integer::parseInt го (елемента) превръщаме в цяло число; чрез toArray() го връщаме в масива


        //чрез foreach цикъл (а може и чрез for цикъл) ще обходим всеки елемент от масива и ще проверим дали е четно или нечетно число -> ако е четно, го присъединяваме към сумата от четните числа; ако е нечетно, го присъединяваме към сумата от нечетните числа
        int sumOfEvenNumbers = 0;   //създаваме си променлива за сумата от четните числа в масива - с начална стойност 0
        int sumOfOddNumbers = 0;    //създаваме си променлива за сумата от нечетните числа в масива - с начална стойност 0
        for (int element : numbersArray) {
            if (element % 2 == 0) {      //ако елементът е четно число  (ако елементът модулно се дели на 2 с остатък 0 /тоест, без остатък/)
                sumOfEvenNumbers += element;     //sumOfEvenNumbers = sumOfEvenNumbers + element;
            } else {   //else if (element % 2 != 0)  //else if (element % 2 == 1)     //в противен случай (ако елементът е нечетно число)
                sumOfOddNumbers += element;      //sumOfOddNumbers = sumOfOddNumbers + element;
            }
        }

        //така след всички итерации на foreach цикъла сме намерили сумата от четните и сумата от нечетните числа в масива

        //накрая извън цикъла от сумата от четните числа трябва да извадим сумата от нечетните числа, за да намерим разликата между двете суми:
        int differenceBetweenSums = sumOfEvenNumbers - sumOfOddNumbers;
        System.out.println(differenceBetweenSums);    //System.out.printf("%d", differenceBetweenSums);   //принтираме намерената разлика
        //вместо предишните два реда принтирането можеше да стане и само с един ред код:    System.out.println(sumOfEvenNumbers - sumOfOddNumbers);
    }
}
