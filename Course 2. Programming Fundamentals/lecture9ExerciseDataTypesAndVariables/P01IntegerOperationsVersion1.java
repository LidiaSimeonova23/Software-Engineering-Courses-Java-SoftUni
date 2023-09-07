package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P01IntegerOperationsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read four integer numbers. Add first to the second, divide (integer) the sum by the third number, and multiply the result by the fourth number. Print the result.
        //Constraints: the four numbers from the input are in the range [-2,147,483,648… 2,147,483,647].    -> int

        //ако всеки път извършвахме само една аритметична операция (или само събиране, или само изваждане, или само умножение, или само деление), задачата можеше да се реши и чрез for цикъл
        //но в случая имаме различни аритметични операции (и събиране, и деление, и умножение), затова не можем да ползваме цикъл

        int number1 = Integer.parseInt(scanner.nextLine());    //от първия ред на конзолата прочитаме едно цяло число
        int number2 = Integer.parseInt(scanner.nextLine());    //от втория ред на конзолата прочитаме едно цяло число
        int number3 = Integer.parseInt(scanner.nextLine());    //от третия ред на конзолата прочитаме едно цяло число
        int number4 = Integer.parseInt(scanner.nextLine());    //от четвъртия ред на конзолата прочитаме едно цяло число

        //в случая всички аритметични операции могат да се извършат с един ред код - делението е целочислено (ако има остатък, той ще се загуби)
        int result = (number1 + number2) / number3 * number4;       //чрез скобите указваме приоритета (последователността) на действията
        System.out.println(result);
        //System.out.printf("%d", result);
    }
}
