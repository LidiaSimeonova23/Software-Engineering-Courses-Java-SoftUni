package lecture5ConditionalStatements;

import java.util.Scanner;

public class P01ExcellentResultVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.nextLine();     //с оценката, прочетена от конзолата, няма да извършваме аритметична операция, затова може да се прочете като текст (а не като число)

        if (grade.equals("5") || (grade.equals("6"))) {
            System.out.println("Excellent!");
        }

    }
}
