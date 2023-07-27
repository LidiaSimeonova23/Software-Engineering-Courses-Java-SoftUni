package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P01AgesVersion2 {
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

        String typeOfPersonAccordingToTheirAge = "";      //създаваме си променлива, която можем да ползваме за всяка проверка (в началото не знаем каква ще е стойността, но променливата е от тип String, затова задаваме като начална стойност празен String)
        if (age >= 0 && age <= 2) {
            typeOfPersonAccordingToTheirAge = "baby";
        } else if (age >= 3 && age <= 13) {
            typeOfPersonAccordingToTheirAge = "child";
        } else if (age >= 14 && age <= 19) {
            typeOfPersonAccordingToTheirAge = "teenager";
        } else if (age >= 20 && age <= 65) {
            typeOfPersonAccordingToTheirAge = "adult";
        } else if (age >= 66) {
            typeOfPersonAccordingToTheirAge = "elder";
        }

        System.out.printf("%s", typeOfPersonAccordingToTheirAge);
        //System.out.println(typeOfPersonAccordingToTheirAge);
    }
}
