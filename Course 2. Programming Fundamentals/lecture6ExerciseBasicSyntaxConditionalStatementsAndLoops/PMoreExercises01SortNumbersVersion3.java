package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PMoreExercises01SortNumbersVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ЗА ТОВА РЕШЕНИЕ НА ЗАДАЧАТА ПОЛЗВАМЕ ЛИСТОВЕ - ТЕ СЕ УЧАТ В ЛЕКЦИЯ 17 и ЛЕКЦИЯ 18

        //1. създаваме си лист, който за момента е празен (няма елементи в него), за да можем да прибавяме (ако се наложи, също и да премахваме) елементи:
        List<Integer> numbersList = new ArrayList<>();

        //2. ще четем 3 цели числа от конзолата и ще ги добавяме като елементи на листа (т.е., пълним листа с елементи):
        //тъй като листът все още е празен, размерът му за момента е 0 и не можем за краен индекс да ползавме  list.size() - 1
        for (int index = 0; index <= 2; index++) {        //for (int index = 0; index <= 3 - 1; index++)    //for (int index = 0; index < 3; index++)
            int currentNumber = Integer.parseInt(scanner.nextLine());      //на всяка итерация на цикъла четем от конзолата текущото цяло число

            numbersList.add(currentNumber);     //на всяка итерация на цикъла към създадения вече лист добавяме (на последно място в листа) текущо прочетеното от конзолата число
        }

        //листовете имат готови методи - затова вместо в цикъла да правим проверки и да търсим най-голямо и най-малко число, също и сумата от трите числа, много по-лесно е да ползваме готовите методи - сортиране ->
        //3. сортираме (подреждаме) елементите на листа
        Collections.sort(numbersList);      //първо подреждаме елементите в нарастващ ред на числата
        Collections.reverse(numbersList);     //и след това обръщаме реда (става намаляващ ред)


        //4. принтираме елементите на листа:
        for (int element : numbersList) {
            System.out.println(element);
            //System.out.printf("%d%n", element);
        }

    }
}
