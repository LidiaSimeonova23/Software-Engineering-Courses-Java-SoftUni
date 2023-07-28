package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P06StrongNumberVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program to check whether or not a given number is strong. A number is strong if the sum of the Factorial of each digit is equal to the number.
        //For example 145 is a strong number, because 1! + 4! + 5! = 145.
        //Print "yes" if the number is strong and "no" if the number is not strong.
        //примери за факториел на число -> 5! = 5 * 4 * 3 * 2 * 1 = 120             2! = 2 * 1 = 2        7! = 7 * 6 * 5 * 4 * 3 * 2 * 1 = 5040

        int number = Integer.parseInt(scanner.nextLine());       //веднъж ще прочетем от конзолата една цяло число   //но по-надолу в цикъла ще модифицираме тази стойност

        //необходимо е да си създадем променлива, в която да запазим първоначалната стойност на числото, прочетено от конзолата, защото чрез while цикъла числото ще се update-ва и накрая ще стане 0
        int startNumber = number;
        //ако не си създадем променливата startNumber, накрая в проверката извън цикъла щяхме да имаме if (sumFactorials == number), където number вече щеше да е 0, а не прочетеното от конзолата число и кодът щеше да е грешен

        //В ТОЗИ ВАРИАНТ НА ЗАДАЧАТА НАМИРАМЕ ФАКТОРИЕЛ НА ДАДЕНА ЦИФРА ОТ ЧИСЛОТО ЧРЕЗ НАРАСТВАЩ FOR ЦИКЪЛ
        //трябва да намерим всяка цифра от числото (най-лесно е чрез while цикъл), да намерим нейния факториел (чрез for цикъл) и накрая да намерим сумата от факториелите на всичките цифри, за да можем да я сравним със самото число
        int sumFactorials = 0;     //създаваме си променлива за сумата от факториелите на всички цифри от числото
        while (number > 0) {         //докато има число (докато числото е по-голямо от нула)
            int currentLastDigit = number % 10;    //с модулно деление на 10 намираме последната цифра на дадено число (остатъка)

            int factorialOfLastDigit = 1;   //създаваме си променлива за факториел с начална стойност 1, защото ще участва в умножение (в случая не може да е 0, защото ще искаме да умножаваме и да намираме произведението, а 0 по което и да е е 0 и задачата ни ще е грешна) - като умножим едно число по 1, получаваме същото число
            for (int currentMultiplier = 1; currentMultiplier <= currentLastDigit; currentMultiplier++) {          // с for-цикъл ще намерим факториела на всяка цифра от числото - умножаваме числото по всяко число преди него, докато стигнем до 1 - напр. 5! = 5 * 4 * 3 * 2 * 1 = 120
                factorialOfLastDigit *= currentMultiplier;     //factorialOfLastDigit = factorialOfLastDigit * currentMultiplier;       //на всяка итерация произведението става все по-голямо
            }

            sumFactorials = sumFactorials + factorialOfLastDigit;      // sumFactorials += factorialOfLastDigit;   //намираме сумата от факториелите на всяка от цифрите на даденото число
            number = number / 10;      //update-ваме числото    //с целочислено деление на 10 премахваме последната цифра от дадено число (напр. ако е било четирицифрено, вече става трицифрено)
        }

        //извън цикъла правим проверка дали сумата от факториелите на всички цифри на дадено число е равна на самото число
        if (sumFactorials == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
