package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P01AgesVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that determines whether a person is based on the given age: baby, child, teenager, adult, or elder. The bounders are:
        //•	0-2 – baby;
        //•	3-13 – child;
        //•	14-19 – teenager;
        //•	20-65 – adult;
        //•	>=66 – elder;
        //•	All the values are inclusive.

        int age = Integer.parseInt(scanner.nextLine());    //цяло число (за възрастта на човек), което ще прочетем от конзолата

        if (age >= 0 && age <= 2) {
            System.out.println("baby");
        } else if (age >= 3 && age <= 13) {
            System.out.println("child");
        } else if (age >= 14 && age <= 19) {
            System.out.println("teenager");
        } else if (age >= 20 && age <= 65) {
            System.out.println("adult");
        } else if (age >= 66) {
            System.out.println("elder");
        }

    }
}
