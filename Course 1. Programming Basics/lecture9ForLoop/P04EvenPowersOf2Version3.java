package lecture9ForLoop;

import java.util.Scanner;

public class P04EvenPowersOf2Version3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете число power, въведено от потребителя, и печата четните степени на 2 ≤ 2n: 20, 22, 24, 26, …, 2n

        int power = Integer.parseInt(scanner.nextLine());

        int result = 1;          //създаваме си променлива от тип int и й задаваме нач. стойност 1 (защото ще участва в аритмет. операция умножение - за да не влияе на резултата); после ще й приравняваме други стойности
        //нач. стойност няма да е 0, защото 0 по което и да е е равно на 0 и сметките ни няма да са верни; а ако умножим нещо по 1, си остава нещото

        //за да си създам цикъла, за име на променливата ще ползвам currentPower вместо i
        for (int currentPower = 0; currentPower <= power; currentPower++) {           //началната четна степен на двойката е 0, крайната четна степен на двойката е power, промяната да става през 1 стъпка
            if (currentPower % 2 == 0) {      //само ако текущата степен е четна, само тогава принтираме резултата от степенуването
                System.out.println(result);                 //да се принтира резултатът от числото 2, повдигнато на четна степен
                result = result * 2 * 2;
            }
        }

    }
}
