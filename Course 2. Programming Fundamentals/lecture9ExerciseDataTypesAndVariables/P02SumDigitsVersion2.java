package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P02SumDigitsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ще прочетем едно цяло число (не знаем колко цифрено е то); трябва да намерим сумата от всичките му цифри

        //не знаем колко цифрено ще е числото -> може и с for loop -> докато има число, ще взимаме последната му цифра (с модулно деление на 10) и после ще я премахваме (с целочислено деление на 10), за да update-нем числото
        int sumOfAllDigits = 0;         //създаваме си променлива за сумата от всички цифри на числото (с начална стойност 0)
        for (int number = Integer.parseInt(scanner.nextLine()); number > 0; number = number / 10) {
            //int number = Integer.parseInt(scanner.nextLine());            -> създаваме си променлива number с начална стойност това, което четем от конзолата (началната стойност на променливата number)
            //number > 0;        -> крайната стойност на променливата number
            //   number = number / 10         -> update на стойността на променливата  (с целочислено деление на 10 на всяка итерация премахваме текущата последна цифра на числото)
            int currentLastDigit = number % 10;           //създаваме си променлива за текущата последна цифра на числото
            sumOfAllDigits += currentLastDigit;     //sumOfAllDigits = sumOfAllDigits + currentLastDigit;      //намираме (след всички итерации на цикъла) сумата от всички цифри на числото
        }

        System.out.printf("%d", sumOfAllDigits);      //извън цикъла принтираме сумата от всички цифри на прочетеното от конзолата число
        // System.out.println(sumOfAllDigits);
    }
}
