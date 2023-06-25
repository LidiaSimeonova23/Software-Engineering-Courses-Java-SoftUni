package moreExercises5And6ConditionalStatements;

import java.util.Scanner;

public class P07FuelTankVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFuel = scanner.nextLine();         //типът на горивото – текст с възможности: "Diesel", "Gasoline" или "Gas"
        double litresOfFuel = Double.parseDouble(scanner.nextLine());        //литрите гориво (реално число), които има в резервоара


        boolean isValidFuel = typeOfFuel.equals("Diesel") || typeOfFuel.equals("Gasoline") || typeOfFuel.equals("Gas");      //създавам си булева променлива, която държи условията за валидност на горивото
        if (litresOfFuel >= 25) {
            if (isValidFuel) {
                System.out.printf("You have enough %s.", typeOfFuel.toLowerCase());
            } else {     //else if (!isValidFuel)    //ако горивото е невалидно
                System.out.println("Invalid fuel!");
            }
        } else if (litresOfFuel < 25) {
            if (isValidFuel) {
                System.out.printf("Fill your tank with %s!", typeOfFuel.toLowerCase());
            } else {     //else if (!isValidFuel)
                System.out.println("Invalid fuel!");
            }
        }

    }
}
