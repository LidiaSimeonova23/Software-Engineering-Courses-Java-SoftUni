package lecture8DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //трябва да намерим точния сбор (без никакви закръгляния) от n на брой числа  (n е цяло число, прочетено от конзолата)
        //подсказано ни е, че трябва да ползваме класа BigDecimal (за пълна прецизност)

        int n = Integer.parseInt(scanner.nextLine());     //от първия ред на конзолата прочитаме цяло число n (броя на числата, които ще трябва да сумираме)

        //n на брой пъти ще четем входни данни и ще ги прибавяме към сумата -> знаем колко ще са повторенията -> имаме for цикъл (от 1 до n вкл.)
        //виждаме, че в примерните входни данни имаме доста големи числа, част от които са дробни числа  ->
        //ако числата бяха само цели, чожехме да ползваме класа BigInteger (за много големи числа), но в случая има и дробни числа, затова ще ползваме класа BigDecimal
        BigDecimal sum = new BigDecimal(0);           //създаваме си променлива/обект за сумата от числата - с нач. стойност 0, после ще се променя
        for (int i = 1; i <= n; i++) {
            BigDecimal currentNumber = new BigDecimal(scanner.nextLine());     //на всяка итерация на цикъла ще прочетем една голямо число (може да е цяло, може да е дробно)
            //new BigDecimal(scanner.nextLine())   -> създаваме нов обект в паметта от прочетения ред с входни данни

            //тъй като прочетеното число може да е много голямо, сумата от много големи числа също е мого голямо число   -> и за сумата ще ползваме класа BigDecimal
            //по принцип при сумиране ползваме това: sum = sum + currentNumber;  но когато имаме клас BigDecimal, при сумиране ползваме готовия метод .add()  ->
            sum = sum.add(currentNumber);       //тъй като и sum, и currentNumber са BigDecimal (референтен тип данни), няма да ползваме метода .valueOf()   //тоест, няма да ползваме това:   sum = sum.add(BigDecimal.valueOf(currentNumber));
        }

        System.out.println(sum);   //извън цикъла (само веднъж) принтираме сумата от прочетените от конзолата числа
    }
}
