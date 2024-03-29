package lecture9ExerciseDataTypesAndVariables;

import java.util.Arrays;
import java.util.Scanner;

public class PMoreExercises02FromLeftToTheRightVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ЗА РЕШЕНИЕТО НА ТАЗИ ЗАДАЧА ПОЛЗВАМЕ МАСИВИ - В ЛЕКЦИЯ 11 СЕ УЧАТ

        int numberOfLines = Integer.parseInt(scanner.nextLine());     //от първия ред на конзолата четем едно цяло число, което е броят редове, които ще трябва да прочетем

        //ще имаме повторения -> знаем колко пъти ще са те (толкова пъти, колкото е числото, прочетено от първия ред на конзолата) -> ще ползваме for цикъл:
        for (int currentLine = 1; currentLine <= numberOfLines; currentLine++) {     //за име на променлива ползваме currentLine вместо i
            String currentInput = scanner.nextLine();     //на всяка итерация на цикъла ще четем текущия ред с входни данни (първоначално ще ги четем като текст)

            //в случая прочетеният текст трябва да бъде превърнат в 2 числа, тъй като ще извършваме аритметични операции и/или сравнения - ще намираме сумата от цифрите и на двете числа и после ще сравняваме двете числа на текущия ред
            //като прегледаме входните данни, виждаме, че има само цели числа, някои от които са много големи числа - извън обхвата на int - следователно, за типа на числата ще ползваме long
            long[] numbersArray = Arrays.stream(currentInput.split(" ")).mapToLong(Long::parseLong).toArray();       //на всяка итерация на цикъла създаваме един long масив (масив от много големи цели числа), в който ще съхраняваме прочетените две числа от текущия ред на конзолата


            long leftElement = numbersArray[0];     //създаваме си променлива за първия елемент от масива (отляво на текущия ред)
            long rightElement = numbersArray[1];      //създаваме си променлива за втория елемент от масива (отдясно на текущия ред)

            //ОСОБЕНОТО В ТАЗИ ЗАДАЧА Е, ЧЕ ПЪРВО ТРЯБВА ДА НАМЕРИМ СУМАТА ОТ ВСИЧКИ ЦИФРИ И НА ЛЕВИЯ ЕЛЕМЕНТ, И НА ДЕСНИЯ ЕЛЕМЕНТ И ЧАК СЛЕД ТОВА ДА СРАВНИМ ЛЕВИЯ И ДЕСНИЯ ЕЛЕМЕНТ  (А ПО-ЛОГИЧНОТО БИ БИЛО ПЪРВО ДА СРАВНИМ ДВАТА ЕЛЕМЕНТА, ДА ВИДИМ КОЙ ОТ ТЯХ Е ПО-ГОЛЯМ И ДА НАМЕРИМ СУМАТА ОТ ЦИФРИТЕ НА ПО-ГОЛЕМИЯ ОТ ДВАТА ЕЛЕМЕНТА)

            //по-надолу (в while циклите) ще търсим сумата от цифрите на двата елемента и тези два елемента ще се модифицират на всяка итерация, докато накрая станат 0
            //затова трябва да си съхраним първоначално прочетените (оригиналните) числа на всеки текущ ред в променливи:
            long originalLeftElement = leftElement;      //създаваме си променлива, в която да си съхраним оригинално прочетената стойност на левия елемент на текущия ред
            long originalRightElement = rightElement;      //създаваме си променлива, в която да си съхраним оригинално прочетената стойност на десния елемент на текущия ред

            //трябва да намерим сумата от всички цифри на левия елемент -> не знаем колко цифрено ще е числото, затова в случая можем да ползваме while цикъл:
            leftElement = Math.abs(leftElement);   //тъй като във входните данни има и отрицателни числа, с метода Math.abs() си осигуряваме, че числото е положително (за да премахнем минуса и да съберем всичките цифри)
            long leftSum = 0;      //създаваме си променлива за сумата от всички цифри на лявото число (тоест, на първия елемент от масива)
            while (leftElement > 0) {     //докато има число (докато лявото число има цифри)
                long currentLastDigit = leftElement % 10;        //с модулно деление на 10 намираме текущата последна цифра на текущото ляво число
                leftSum += currentLastDigit;      //leftSum = leftSum + currentLastDigit;         //на всяка итерация на цикъла към домоментната сума добавяме текущата последна цифра (и след всички итерации намираме сумата от всички цифри на лявото число)
                leftElement = leftElement / 10;      //update      //с целочислено деление на 10 премахваме последната цифра от текущото число (и ако например числото е било четирицифрено, вече става трицифрено)
            }


            //трябва да намерим сумата от всички цифри на десния елемент -> не знаем колко цифрено ще е числото, затова в случая можем да ползваме while цикъл:
            rightElement = Math.abs(rightElement);    //тъй като във входните данни има и отрицателни числа, с метода Math.abs() си осигуряваме, че числото е положително (за да премахнем минуса и да съберем всичките цифри)
            long rightSum = 0;    //създаваме си променлива за сумата от всички цифри на дясното число (тоест, на втория елемент от масива)
            while (rightElement > 0) {       //докато има число (докато дясното число има цифри)
                long currentLastDigit = rightElement % 10;          //с модулно деление на 10 намираме текущата последна цифра на текущото дясно число
                rightSum += currentLastDigit;        //rightSum = rightSum + currentLastDigit;      //на всяка итерация на цикъла към домоментната сума добавяме текущата последна цифра (и след всички итерации намираме сумата от всички цифри на дясното число)
                rightElement = rightElement / 10;      //update      //с целочислено деление на 10 премахваме последната цифра от текущото число (и ако например числото е било четирицифрено, вече става трицифрено)
            }


            //сравняваме двата елемента (ляв и десен), намираме кой от тях е по-голям и принтираме сумата от всичките му цифри:
            if (originalLeftElement > originalRightElement) {     //ако левият (първоначално прочетеният ляв елемент от конзолата) елемент от масива е по-голям от десния (първоначално прочетения десен елемент от конзолата) елемент от масива
                System.out.println(leftSum);        //принтираме намерената сума от всички цифри на левия елемент
            } else {      //else if (originalLeftElement <= originalRightElement)         // в противен случай (тоест, ако левият елемент от масива не е по-голям от десния елемент от масива)
                System.out.println(rightSum);      //принтираме намерената сума от всички цифри на десния елемент
            }
        }


    }
}
