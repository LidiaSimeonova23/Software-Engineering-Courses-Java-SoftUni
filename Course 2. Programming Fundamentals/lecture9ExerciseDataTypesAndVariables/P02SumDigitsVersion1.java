package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P02SumDigitsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ще прочетем едно цяло число (не знаем колко цифрено е то); трябва да намерим сумата от всичките му цифри

        int number = Integer.parseInt(scanner.nextLine());    //от първия ред на конзолата четем едно цяло число

        //не знаем колко цифрено ще е числото -> затова използваме while loop -> докато има число, ще взимаме последната му цифра (с модулно деление на 10) и после ще я премахваме (с целочислено деление на 10), за да update-нем числото
        int sumOfAllDigits = 0;    //създаваме си променлива за сумата от всички цифри на числото (с начална стойност 0)
        while (number > 0) {         //докато има число (тоест, докато числото има цифри)
            int currentLastDigit = number % 10;            //създаваме си променлива за текущата последна цифра на числото
            sumOfAllDigits += currentLastDigit;     //sumOfAllDigits = sumOfAllDigits + currentLastDigit;      //намираме (след всички итерации на цикъла) сумата от всички цифри на числото
            number = number / 10;     //update-ваме числото (напр.: от трицифрено числото става двуцифрено)
        }

        System.out.printf("%d", sumOfAllDigits);   //извън цикъла принтираме сумата от всички цифри на прочетеното от конзолата число
        // System.out.println(sumOfAllDigits);
    }
}
