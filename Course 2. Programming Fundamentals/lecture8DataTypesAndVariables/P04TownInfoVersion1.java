package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P04TownInfoVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Use the correct data types and print the result in the following format: "Town {town name} has population of {population} and area {area} square km."

        String town = scanner.nextLine();    //от първия ред на конзолата четем име на град
        int population = Integer.parseInt(scanner.nextLine());   //от втория ред на конзолата четем население - броят хора е цяло число (по принцип ползваме данни от тип int)
        double area = Double.parseDouble(scanner.nextLine());       //от третия ред на конзолатачетем четем площ - тя може да е и цяло, и дробно число, затова се застраховаме с double променлива

        System.out.printf("Town %s has population of %d and area %.0f square km.", town, population, area);   //принтираме, като закръгляме площта до 0 знака след  десет. точка (тоест, само цялото число)
    }
}
