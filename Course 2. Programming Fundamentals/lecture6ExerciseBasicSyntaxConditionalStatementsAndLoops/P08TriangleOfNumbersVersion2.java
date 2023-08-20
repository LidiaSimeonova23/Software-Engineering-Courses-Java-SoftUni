package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P08TriangleOfNumbersVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that receives a number – n and prints a triangle from 1 to n as in the examples.
        //Constraints
        //•	n will be in the interval [1...20].

        int n = Integer.parseInt(scanner.nextLine());       //от конзолата ще прочетем едно цяло число n, което ще е в диапазона от 1 до 20 включително

        //имаме редове и колони -> два вложени цикъла
        //във външния цикъл взимаме текущия ред, а във вътрешния итерираме по всички колони на текущия ред:
        for (int currentRow = 1; currentRow <= n; currentRow++) {         // знаем, че броят на редовете ще е от 1 до прочетеното от конзолата число
            for (int currentColumn = 1; currentColumn <= currentRow; currentColumn++) {        //за текущия ред колоните ще са толкова на брой, колкото е номерът на текущия ред
                System.out.print(currentRow + " ");      //всички колони на текущия ред да се принтират на един ред с разстояние (интервал) между тях
                //System.out.printf("%d ", currentRow);
            }

            System.out.println();        //сваляме курсора на следващия ред, за да може колоните на следващия текущ ред да се принтират на нов ред
        }

    }
}
