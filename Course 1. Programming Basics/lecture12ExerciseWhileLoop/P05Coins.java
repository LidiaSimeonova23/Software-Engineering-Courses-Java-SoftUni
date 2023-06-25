package lecture12ExerciseWhileLoop;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());     //веднъж ще си прочетем рестото - дробно число

        double changeInCoins = Math.round(change * 100);          //превръщаме рестото в стотинки (от левове в стотинки), за да работим с една мерна единица   - 1 лев има 100 стотинки (10 * 10)

        //има монети от 2 лева (200 стотинки), от 1 лев (100 стотинки), от 50 стотинки, от 20 стотинки, от 10 ст., от 5 ст., от 2 ст., от 1 ст.

        int coinsCount = 0;      //създаваме си променлива за броене на броя на монетите (а не стойността им) - с начална стойност 0
        while (changeInCoins > 0) {                  //докато има ресто, трябва да се връща (има, когато имаме някакви стотинки, които са повече от нула)
            if (changeInCoins >= 200) {                       //ако рестото е повече от 200 стотинки (т.е. 2 лева)  - ще можем да върнем 2 лева, ако рестото е повече или равно на 200 стотинки
                coinsCount++;                                //броим монетите - брояч   това е същото като: coinsCount = coinsCount + 1;   - инкрементация - стойността на променливата нараства с единица
                changeInCoins = changeInCoins - 200;        //щом рестото е повече или равно на 200 стотинки, значи трябва да върнем 200 (тоест, да намалим с 200, за да разлерем колко стотинки са ни останали)
            } else if (changeInCoins >= 100) {                    //ако рестото е повече от 100 стотинки (т.е. 1 лев)  - ще можем да върнем 1 лев, ако рестото е повече или равно на 100 стотинки
                coinsCount++;
                changeInCoins = changeInCoins - 100;
            } else if (changeInCoins >= 50) {                     //ако рестото е повече от 50 стотинки -> ще можем да върнем 50 ст. само ако рестото е повече или равно на 50 стотинки
                coinsCount++;
                changeInCoins = changeInCoins - 50;
            } else if (changeInCoins >= 20) {                      //ако рестото е повече от 20 стотинки -> ще можем да върнем 20 ст. само ако рестото е повече или равно на 20 стотинки
                coinsCount++;
                changeInCoins = changeInCoins - 20;
            } else if (changeInCoins >= 10) {                      //ако рестото е повече от 10 стотинки -> ще можем да върнем 10 ст. само ако рестото е повече или равно на 10 стотинки
                coinsCount++;
                changeInCoins = changeInCoins - 10;
            } else if (changeInCoins >= 5) {                      //ако рестото е повече от 5 стотинки -> ще можем да върнем 5 ст. само ако рестото е повече или равно на 5 стотинки
                coinsCount++;
                changeInCoins = changeInCoins - 5;
            } else if (changeInCoins >= 2) {                      //ако рестото е повече от 2 стотинки -> ще можем да върнем 2 ст. само ако рестото е повече или равно на 2 стотинки
                coinsCount++;
                changeInCoins = changeInCoins - 2;
            } else if (changeInCoins >= 1) {                      //ако рестото е повече от 1 стотинка -> ще можем да върнем 1 ст. само ако рестото е повече или равно на 1 стотинка
                coinsCount++;
                changeInCoins = changeInCoins - 1;
            } else {                                                //в противен случай - ако не е останало ресто, цикълът се прекъсва
                break;
            }
        }


        System.out.println(coinsCount);                //да се принтира броят на монетите (колко на брой монети са върнати)
    }
}
