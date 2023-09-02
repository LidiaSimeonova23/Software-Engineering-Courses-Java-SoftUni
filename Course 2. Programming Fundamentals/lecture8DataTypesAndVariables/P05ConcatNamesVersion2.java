package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P05ConcatNamesVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read two names and a delimiter. Print the names joined by the delimiter.

        String name1 = scanner.nextLine();    //от първия ред на конзолата прочитаме име
        String name2 = scanner.nextLine();      //от втория ред на конзолата прочитаме име
        String delimiter = scanner.nextLine();    //от третия ред на конзолата прочитаме делимитер  - специален символ или последователност от символи  - ще го четем като String (защото той е последователност от символи)

        String result = String.format("%s%s%s", name1, delimiter, name2);   //създаваме си допълнителна променлива от тип String, която да държи цялата информация - за да упражним метода String.format()
        System.out.println(result);   //принтираме променливата, която държи информацията
    }
}
