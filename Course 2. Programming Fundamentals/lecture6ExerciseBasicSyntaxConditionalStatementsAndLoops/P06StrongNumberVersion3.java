package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P06StrongNumberVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program to check whether or not a given number is strong. A number is strong if the sum of the Factorial of each digit is equal to the number.
        //For example 145 is a strong number, because 1! + 4! + 5! = 145.
        //Print "yes" if the number is strong and "no" if the number is not strong.
        //примери за факториел на число -> 5! = 5 * 4 * 3 * 2 * 1 = 120             2! = 2 * 1 = 2        7! = 7 * 6 * 5 * 4 * 3 * 2 * 1 = 5040

        String numberAsText = scanner.nextLine();       //веднъж ще прочетем от конзолата една цяло число   //но в случая можем да го прочетем и като текст (няма да извършваме аритм. операции и/или сравнения с него)


        //В ТОЗИ ВАРИАНТ НА ЗАДАЧАТА НАМИРАМЕ ФАКТОРИЕЛ НА ДАДЕНА ЦИФРА ОТ ЧИСЛОТО ЧРЕЗ НАМАЛЯВАЩ FOR ЦИКЪЛ
        //трябва да намерим всяка цифра от числото, тоест, всеки символ от текста (чрез for цикъл), след това да намерим нейния факториел (чрез for цикъл) и накрая да намерим сумата от факториелите на всичките цифри на числото, за да можем да я сравним със самото число
        int sumFactorials = 0;    //създаваме си променлива за сумата от факториелите на всички цифри от числото
        for (int index = 0; index <= numberAsText.length() - 1; index++) {
            char currentSymbol = numberAsText.charAt(index);       //създаваме си променлива за текущия символ от текста (числото като текст)

            String currentDigitAsText = "" + currentSymbol;        //превръщаме символа в текст - чрез конкатенация
            int currentDigit = Integer.parseInt(currentDigitAsText);      //превръщаме текста в цяло число - по най-лесния начин чрез метода .parseInt от класа Integer
            //int currentDigit = Integer.valueOf(currentDigitAsText);      //превръщаме текста в цяло число (за да намерим факториела му) - чрез метода .valueOf от класа Integer

            int factorialOfCurrentDigit = 1;   //създаваме си променлива за факториел с начална стойност 1, защото ще участва в умножение (в случая не може да е 0, защото ще искаме да умножаваме и да намираме произведението, а 0 по което и да е е 0 и задачата ни ще е грешна) - като умножим едно число по 1, получаваме същото число
            for (int currentMultiplier = currentDigit; currentMultiplier >= 1; currentMultiplier--) {          // с for-цикъл ще намерим факториела на всяка цифра от числото - умножаваме числото по всяко число преди него, докато стигнем до 1 - напр. 5! = 5 * 4 * 3 * 2 * 1 = 120
                factorialOfCurrentDigit *= currentMultiplier;     //factorialOfCurrentDigit = factorialOfCurrentDigit * currentMultiplier;       //на всяка итерация произведението става все по-голямо
            }

            //намираме сумата от факториелите на всяка от цифрите на даденото число
            sumFactorials = sumFactorials + factorialOfCurrentDigit;      // sumFactorials += factorialOfCurrentDigit;
        }


        //извън цикъла правим проверка дали сумата от факториелите на всички цифри на дадено число е равна на самото число
        //if (sumFactorials == numberAsText)  -> не може да е така условието, защото sumFactorials е int, а numberAsText е String  -> или трябва да превърнем текста в число, или числото - в текст, за да сравняваме променливи от един и същи тип
        if (sumFactorials == Integer.parseInt(numberAsText)) {     //- превръщаме текста в число и го сравняваме с число        //if ((sumFactorials + "").equals(numberAsText))   - превръщаме числото в текст и го сравняваме с текст
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
