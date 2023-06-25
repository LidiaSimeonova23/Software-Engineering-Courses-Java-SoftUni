package lecture11WhileLoop;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //много пъти (не знаем колко точно) ще трябва да четем входни данни (числа или текст), за ги сумираме и да ги принтираме  -> while цикъл
        String input = scanner.nextLine();   //прочитаме входните данни  - определяме ги като тип String, за да може да са всичко (и числа, и текст)
        double sum = 0;   //създаваме си променлива с нач. стойност 0; ще я ползваме в цикъла, за да намерим сумата от парите

        while (!input.equals("NoMoreMoney")) {         //докато входните данни са различни от NoMoreMoney, значи ще бъдат числа; щом входните данни ще са числа, искаме да ги превърнем в  реално число и да ги запазим в променлива от тип double
            double currentSum = Double.parseDouble(input);    //имайки предвид горния ред, превръщаме данните от String в double

            if (currentSum < 0) {                                  //ако сумата е отриц. число, се изписва Invalid operation! и се прекъсва цикълът - условие за прекъсване на цикъла
                System.out.println("Invalid operation!");
                break;
            }

            sum = sum + currentSum;      //може да се запише и така: sum += currentSum;  изчисляваме сумата, която се натрупва
            System.out.printf("Increase: %.2f%n", currentSum);     //принтираме сумата/депозита

            input = scanner.nextLine();   //update-ваме си променливата - подканяме скенера да прочете следващия ред
        }


        System.out.printf("Total: %.2f", sum);     //принтираме натрупаната сума/депозит  - това става накрая, след като приключи цикълът
    }
}
