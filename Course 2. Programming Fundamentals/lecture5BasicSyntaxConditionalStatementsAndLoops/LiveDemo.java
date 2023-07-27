package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class LiveDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());   //четем от конзолата някаква възраст - цяло число

        //чрез метода .format (от класа String) събираме различни данни в една променлива (използваме шаблони и аргументи, които да заместят шаблоните, както при форматираното принтиране)
        String resultText = String.format("Veronika, %d", age);

        //принтираме променливата resultText:
        System.out.println(resultText);
    }
}
