package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P02DivisionVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You will be given an integer
        //you have to print on the console whether that number is divisible by the following numbers: 2, 3, 6, 7, 10.
        //You should always take the bigger division.
        //If the number is divisible by both 2 and 3, it is also divisible by 6, and you should print only the division by 6.
        //If a number is divisible by 2, it is sometimes also divisible by 10, and you should print the division by 10.
        //If the number is not divisible by any given number, print "Not divisible". Otherwise, print "The number is divisible by {number}".

        int number = Integer.parseInt(scanner.nextLine());    //1 цяло число, което ще прочетем от конзолата

        //You should always take the bigger division. -> следователно трябва да почнем проверката от най-големия делител към най-малкия делител - 10, 7, 6, 3, 2
        //След като открием едно вярно условие, следващите под него изобщо не се проверяват (така си гарантираме, че винаги ще принтираме най-големия делител)
        String divisor = "";     //създаваме си допълнителна променлива за делителя (не знаем кой е той в началото, затова задаваме като начална стойност празен String)
        boolean isValidDivisor = true;      //създаваме си допълнителна променлива, на която задаваме дефолтна стойност, че е истина (тоест, че делителят е валиден)
        if (number % 10 == 0) {            //ако числото се дели на десет (точно, без остатък)
            divisor = "10";
        } else if (number % 7 == 0) {
            divisor = "7";
        } else if (number % 6 == 0) {
            divisor = "6";
        } else if (number % 3 == 0) {
            divisor = "3";
        } else if (number % 2 == 0) {
            divisor = "2";
        } else {
            isValidDivisor = false;      //променяме стойността на булевата променлива
        }


        if (isValidDivisor) {       //ако делителят е валиден
            System.out.printf("The number is divisible by %s", divisor);
        } else {    //в противен случай (когато делителят е невалиден)
            System.out.println("Not divisible");
        }

    }
}
