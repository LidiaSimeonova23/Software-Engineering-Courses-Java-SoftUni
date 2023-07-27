package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P01StudentInformationVersion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //you will be given 3 lines of input – student name, age, and average grade:
        String name = scanner.nextLine();
        double age = Integer.parseInt(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());

        //Your task is to print all the info about the student in the following format: "Name: {student name}, Age: {student age}, Grade: {student grade}".
        System.out.printf("Name: %s, Age: %.0f, Grade: %.2f", name, age, averageGrade);   //форматирах оценката до 2 знака след десетичната точка -> с %.2f
    }
}
