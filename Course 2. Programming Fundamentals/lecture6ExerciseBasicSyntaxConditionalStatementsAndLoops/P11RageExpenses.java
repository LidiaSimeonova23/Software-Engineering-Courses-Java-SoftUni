package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counterLostGames = Integer.parseInt(scanner.nextLine());    //lost games count – integer in the range [0, 1000]
        double headsetPrice = Double.parseDouble(scanner.nextLine());     //headset price - the floating-point number in the range [0, 1000]
        double mousePrice = Double.parseDouble(scanner.nextLine());    //mouse price - the floating-point number in the range [0, 1000]
        double keyboardPrice = Double.parseDouble(scanner.nextLine());   //keyboard price - the floating-point number in the range [0, 1000]
        double displayPrice = Double.parseDouble(scanner.nextLine());      //display price - the floating-point number in the range [0, 1000]

        //с целочислено деление (делим брой изгубени игри на поредността на играта) намираме колко пъти Петър си е счупил съответната вещ (тоест, намираме колко е броят на счупените вещи):
        int numberOfHeadsets = counterLostGames / 2;      //на всяка втора изгубена игра Петър чупи слушалки -> като разделим целочислено брой изгуб. игри на 2, намираме колко пъти е счупил слушалки
        int numberOfMouses = counterLostGames / 3;        //на всяка трета изгубена игра Петър чупи мишка -> като разделим целочислено брой изгуб. игри на 3, намираме колко пъти е счупил мишка
        int numberOfKeyboards = counterLostGames / 6;  //когато счупи и мишка, и слушалки, той чупи и клавиатура (2 * 3 = 6  -> значи на 6-ия път чупи клавиатура)
        int numberOfDisplays = counterLostGames / 12;    //всеки втори път, когато счупи клавиатура, той чупи и дисплей - знаем, че на шестата игра чупи клавиатура, значи 2 * 6 = 12  -> тоест, на 12-ия път чупи дисплей

        //намираме и принтираме общата цена на всички вещи (умножаваме броя им по единичната им цена):
        double totalSum = (numberOfHeadsets * headsetPrice) + (numberOfMouses * mousePrice) + (numberOfKeyboards * keyboardPrice) + (numberOfDisplays * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}
