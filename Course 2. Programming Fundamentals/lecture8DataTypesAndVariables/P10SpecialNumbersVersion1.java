package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P10SpecialNumbersVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата четем едно цяло число и проверяваме дали числата от 1 до това число са специални, или не
        //числото е специално, ако сумата от цифрите му е или 5, или 7, или 11

        int number = Integer.parseInt(scanner.nextLine());   //от първия ред на конзолата ще прочетем една цяло число

        //ще имаме два вложени цикъла:
        //във външния (знаем колко са итерациите -> for цикъл) взимаме текущото число в диапазона от 1 до прочетеното от конзолата число
        //във вътрешния (не знаем колко цифрено число ще прочетем -> докато числото има цифри -> while цикъл) намираме всяка цифра на текущото число и сумата от всичките цифри на текущото число
        for (int i = 1; i <= number; i++) {

            int currentNumber = i;   //създаваме си променлива (тя ще ни трябва за while цикъла), за да си запазим текущото число във for цикъла     //текущо число на всяко завъртане на цикъла е стойността на променливата i
            //ако няма такава променлива, на следващата итерация текущото число във for цикъла ще бъде объркано с текущото число в while цикъла - това ще доведе до безкраен цикъл (в началото на for цикъла текущото число винаги ще е 1)

            int sumOfDigitsOfCurrentNumber = 0;    //създаваме си променлива за сумата от всички цифри на текущото число - тази променлива ще ни трябва и вътре в while цикъла, и извън него, затова я създаваме над while цикъла (живот на променлива)
            while (currentNumber > 0) {         //докато има число (докато има цифри в числото) - типичен while-цикъл
                int currentLastDigit = currentNumber % 10;  //създаваме си променлива за текущата последна цифра на текущото число (последната цифра от една число я намираме с модулно деление на 10)
                sumOfDigitsOfCurrentNumber += currentLastDigit;      //sumOfDigitsOfCurrentNumber = sumOfDigitsOfCurrentNumber + currentLastDigit;      //след всички итерации на while цикъла намираме сумата от всичките цифри на текущото число

                currentNumber = currentNumber / 10;     //update на числото в while цикъла   //с целочислено деление на 10 премахваме последната цифра от едно число -> напр.: ако числото е било трицифрено, вече става двуцифрено
            }

            //проверка дали намерената вече сума от цифрите на текущото число е специално число (тоест, дали е 5, или 7 или 11)
            if (sumOfDigitsOfCurrentNumber == 5 || sumOfDigitsOfCurrentNumber == 7 || sumOfDigitsOfCurrentNumber == 11) {
                System.out.printf("%d -> True%n", i);
            } else {       //else if (sumOfDigitsOfCurrentNumber != 5 && sumOfDigitsOfCurrentNumber != 7 && sumOfDigitsOfCurrentNumber != 11)       // в противен случай (ако сумата от цифрите на текущото число не е нито 5, нито 7, нито 11)
                System.out.printf("%d -> False%n", i);
            }

        }


        /* ТОЕСТ, АКО при тези вложени цикли ВМЕСТО С 2 ПРОМЕНЛИВИ (currentNumber и i) ПОЛЗВАМЕ САМО currentNumber, ЩЕ ИЗПАДНЕМ В БЕЗКРАЕН ЦИКЪЛ (защото в началото на for цикъла currentNumber винаги ще е 1, а след while цикъла currentNumber винаги ще става 0)
        //ТОВА Е ГРЕШНО:
        int number = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = 1; currentNumber <= number; currentNumber++) {

            int sumOfDigitsOfCurrentNumber = 0;
            while (currentNumber > 0) {
                int currentLastDigit = currentNumber % 10;
                sumOfDigitsOfCurrentNumber = sumOfDigitsOfCurrentNumber + currentLastDigit;
                currentNumber = currentNumber / 10;
            }

            if (sumOfDigitsOfCurrentNumber == 5 || sumOfDigitsOfCurrentNumber == 7 || sumOfDigitsOfCurrentNumber == 11) {
                System.out.printf("%d -> True%n", currentNumber);
            } else {
                System.out.printf("%d -> False%n", currentNumber);
            }

        } */


    }
}
