package lecture10ExerciseForLoop;

import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата четем брой цели числа
        int numbersCount = Integer.parseInt(scanner.nextLine());


        //за да намерим процентните съотношения, трябва да знаем брой числа във всяка една от групите
        //при всяко завъртане на цикъла да се чете число и да се определя в кой диапазон принадлежи
        int p1 = 0;    //създаваме си променлива с нач. стойност 0, с тази променлива ще изчисляваме броя на числата, които са в съответния диапазон, после ще я ползваме в цикъла
        int p2 = 0;    //създаваме си променлива с нач. стойност 0, с тази променлива ще изчисляваме броя на числата, които са в съответния диапазон, после ще я ползваме в цикъла
        int p3 = 0;    //създаваме си променлива с нач. стойност 0, с тази променлива ще изчисляваме броя на числата, които са в съответния диапазон, после ще я ползваме в цикъла
        int p4 = 0;    //създаваме си променлива с нач. стойност 0, с тази променлива ще изчисляваме броя на числата, които са в съответния диапазон, после ще я ползваме в цикъла
        int p5 = 0;    //създаваме си променлива с нач. стойност 0, с тази променлива ще изчисляваме броя на числата, които са в съответния диапазон, после ще я ползваме в цикъла

        for (int i = 1; i <= numbersCount; i++) {   //началото на цикъла е 1, краят е numbersCount, нарастването на стойността на променливата да става през единица
            int currentNumber = Integer.parseInt(scanner.nextLine());     //цели числа в интервала [1…1000]

            //някакъв процент p1 са под 200, друг процент p2 са от 200 до 399, друг процент p3 са от 400 до 599, друг процент p4 са от 600 до 799 и останалите p5 процента са от 800 нагоре
            if (currentNumber >= 1 && currentNumber < 200) {                     //проверяваме дали прочетеното число от конзолата е в този диапазон
                p1++;    //p1 = p1 + 1;                               //ако прочетеното число е в диапазона на група p1, прочетеното число да се добави към групата  //p1++;     p1 = p1 + 1;   инкрементация - стойността на променливата нараства с единица
            } else if (currentNumber <= 399) {                                   //проверяваме дали прочетеното число от конзолата е в този диапазон
                p2++;                                             //ако прочетеното число е в диапазона на група p2, прочетеното число да се добави към групата  //p2++;     p2 = p2 + 1;
            } else if (currentNumber <= 599) {                                   //проверяваме дали прочетеното число от конзолата е в този диапазон
                p3++;                                             //ако прочетеното число е в диапазона на група p3, прочетеното число да се добави към групата  //p3++;     p3 = p3 + 1;
            } else if (currentNumber <= 799) {                                   //проверяваме дали прочетеното число от конзолата е в този диапазон
                p4++;                                             //ако прочетеното число е в диапазона на група p4, прочетеното число да се добави към групата  //p4++;     p4 = p4 + 1;
            } else {                                                             //проверяваме дали прочетеното число от конзолата е в този диапазон
                p5++;                                             //ако прочетеното число е в диапазона на група p5, прочетеното число да се добави към групата  //p5++;     p5 = p5 + 1;
            }

        }


        //искаме процентите да се форматират до 2 знака след десетичната точка - тоест, ще имаме double променлива - шаблон %.2f    //шаблон %% е за процент   //шаблон %numbersCount е за нов ред
        //намираме съответния процент, като делим числата в съответния диахпазон на общия брой числа и умножаваме по 100
        //за да ни се получи double променлива, умножаваме някоя от int променливите по 1.0
        System.out.printf("%.2f%%%n", p1 * 1.0 / numbersCount * 100);     //изчислява и отпечатва процентите p1
        System.out.printf("%.2f%%%n", p2 * 1.0 / numbersCount * 100);     //изчислява и отпечатва процентите p2
        System.out.printf("%.2f%%%n", p3 * 1.0 / numbersCount * 100);     //изчислява и отпечатва процентите p3
        System.out.printf("%.2f%%%n", p4 * 1.0 / numbersCount * 100);     //изчислява и отпечатва процентите p4
        System.out.printf("%.2f%%", p5 * 1.0 / numbersCount * 100);       //изчислява и отпечатва процентите p5
    }
}
