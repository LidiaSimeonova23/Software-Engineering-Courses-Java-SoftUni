package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P01StudentInformationVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //you will be given 3 lines of input – student name, age, and average grade:
        String name = scanner.nextLine();
        String age = scanner.nextLine();       //не е нужно да превръщаме променливата в число (тоест, може да си остане текст), тъй като няма да извършваме аритметични операции и/или сравнения с нея
        String averageGrade = scanner.nextLine();       //не е нужно да превръщаме променливата в число (тоест, може да си остане текст), тъй като няма да извършваме аритметични операции и/или сравнения с нея

        //Your task is to print all the info about the student in the following format: "Name: {student name}, Age: {student age}, Grade: {student grade}".
        String resultText = String.format("Name: %s, Age: %s, Grade: %s", name, age, averageGrade);   //създаваме си допълнителна променлива от тип String, която да ни държи цялата информация; форматираме оценката до 2 знака след десетичната точка - с %.2f
        System.out.println(resultText);
    }
}
