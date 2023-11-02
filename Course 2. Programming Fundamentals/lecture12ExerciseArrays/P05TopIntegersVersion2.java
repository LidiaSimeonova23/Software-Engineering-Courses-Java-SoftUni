package lecture12ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegersVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ТОВА РЕШЕНИЕ Е КАТО ВАРИАНТ 1 - ПРОСТО ТУК ПОЛЗВАМ ДОПЪЛНИТЕЛНИ ПРОМЕНЛИВИ (currentNumber вместо numbersArray[index] и currentNextNumber = numbersArray[currentNextIndex])

        //в тази задача трябва да прочетем един целочислен масив и да принтираме тези цели числа от масива, които са топ (top integer)
        //top integer - цяло число, което е по-голямо от всяко следващо число
        //за целта трябва да вземем всяко едно число от дадения масив и да проверим дали вдясно от това число има по-голямо или равно на текущото - ако няма, значи текущото число е топ (top integer)

        //ще сравняваме кой от елементите в масива е по-голям -> тези елементи трябва да са числа, а не текстове
        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();   //от първия ред на конзолата четем масив от цели числа
        //"1 4 3 2".split(" ") -> ["1", "4", "3", "2"].map -> [1, 4, 3, 2]

        //1 4 3 2   - ще проверяваме: дали 1 > 4,  дали 1 > 3,  дали 1 > 2              дали 4 > 3,  дали 4 > 2            дали 3 > 2       2 е последно число в дадения масив и ще е топ (защото вдясно от него няма други числа, с които да го сравним)
        //за целта ще имаме два вложени for цикъла -> във външния for цикъл ще итерираме по всеки елемент от прочетения масив, а във вътрешния for цикъл ще взимаме последователно всеки следващ елемент и ще сравняваме текущия елемент със следващия
        for (int index = 0; index <= numbersArray.length - 1; index++) {     // for (int index = 0; index < numbersArray.length; index++)     //на всяка итерация на цикъла взимаме текущ елемент от масива (от първия ... до последния)

            //има два основни случая - 1. ако текущият елемент е последен, той е топ (защото няма други след него, с които да го сравним); 2. ако текущият елемент не е последен, ще го сравняваме с тези след него
            int currentNumber = numbersArray[index];    //създаваме променлива за текущото число от масива - присвояваме й като стойност елемента от масива, който е на текущия индекс
            if (index == numbersArray.length - 1) {        //ако текущият индекс е точно последният индекс в масива
                System.out.print(currentNumber);     //System.out.printf("%d", currentNumber);    //принтираме текущия/последния елемент (защото той е топ, тъй като няма други елементи след него, с които да го сравним)
                //тъй като е последното принтиране, може и така: System.out.println(currentNumber);         //System.out.printf("%d%n", currentNumber);
                break;   //прекъсваме целия външен for цикъл    //в случая можем да ползваме и оператор continue;   - за прекъсване само на текущата итерация на цикъла   //можем да ползваме и return;  - за прекъсване на цялата програма
            }

            //ако if проверката ни е върнала false, значи, че текущият елемент не е последният елемент в масива - следователно, ще трябва да сравняваме текущия елемент с всеки след него:
            boolean isTop = false;    //създаваме си булева променлива, която да държи истината - като начална стойност задаваме, че "е топ" (най-голямо) е лъжа (тоест, поначало числото не е топ)
            for (int currentNextIndex = index + 1; currentNextIndex <= numbersArray.length - 1; currentNextIndex++) {          //ще обхождаме последователно всеки елемент от масива, който се намира вдясно от текущия елемент (почваме от следващия елемент и стигаме до последния)
                int currentNextNumber = numbersArray[currentNextIndex];        //създаваме променлива за текущото следващо число от масива - присвояваме й като стойност елемента от масива, който е на текущия следващ индекс
                if (currentNumber > currentNextNumber) {    //ако текущият елемент от масива (този елемент, който е текущ във външния цикъл) е по-голям от текущия следващ елемент (този елемент, който е текущ във вътрешния цикъл), то текущият елемент (във външния цикъл) за момента е топ (най-голям)
                    isTop = true;      //булевата променлива isTop вече става истина (тоест, потвърждаваме, че числото е топ)
                } else {     //else if (currentNumber <= currentNextNumber)      //в противен случай (тоест, ако текущият елемент от масива /този елемент, който е текущ във външния цикъл/ е по-малък или равен на текущия следващ елемент /този елемент, който е текущ във вътрешния цикъл/), то текущият елемент не е топ
                    isTop = false;    //булевата променлива isTop е лъжа (тоест, потвърждаваме, че числото не е топ)
                    break;    //и прекъсваме вътрешния for цикъл (тоест, щом сме открили поне едно следващо число, което е по-голямо или равно на текущото, няма смисъл да проверяваме по-следващите числа, ясно е, че текущото не е топ)
                }
            }


            if (isTop) {      //ако текущият елемент (този елемент, който е текущ във външния цикъл) е топ (тоест, това значи, че никъде след него не сме намерили по-голям или равен на него и не сме прекъснали вътрешния цикъл)
                System.out.print(currentNumber + " ");     //да се принтира текущият елемент (всички топ числа да са на един ред с интервал между тях)
                //System.out.printf("%d ", currentNumber);
            }
        }


    }
}
