package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P04TownInfoVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Use the correct data types and print the result in the following format: "Town {town name} has population of {population} and area {area} square km."

        String town = scanner.nextLine();    //от първия ред на конзолата четем име на град
        int population = Integer.parseInt(scanner.nextLine());   //от втория ред на конзолата четем население - броят хора е цяло число (по принцип ползваме данни от тип int)
        double area = Double.parseDouble(scanner.nextLine());       //от третия ред на конзолатачетем четем площ - тя може да е и цяло, и дробно число, затова се застраховаме с double променлива

        //вместо директно принтиране на резултата, можем първо да си създадем променлива, в която да съхраним цялата информация ->
        String result = String.format("Town %s has population of %d and area %.0f square km.", town, population, area);   //създаваме си нова променлина от тип String, в която съхраняваме цялата информация - чрез метода String.format
        System.out.println(result);  //принтираме променливата, която ни съхранява цялата информация
    }
}
