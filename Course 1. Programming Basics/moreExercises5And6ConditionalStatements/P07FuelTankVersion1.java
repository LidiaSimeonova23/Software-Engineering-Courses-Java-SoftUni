package moreExercises5And6ConditionalStatements;

import java.util.Scanner;

public class P07FuelTankVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFuel = scanner.nextLine();         //типът на горивото – текст с възможности: "Diesel", "Gasoline" или "Gas"
        double litresOfFuel = Double.parseDouble(scanner.nextLine());        //литрите гориво (реално число), които има в резервоара


        switch (typeOfFuel) {
            case "Diesel":
            case "Gasoline":
            case "Gas":
                if (litresOfFuel >= 25) {
                    System.out.printf("You have enough %s.", typeOfFuel.toLowerCase());
                } else if (litresOfFuel < 25) {
                    System.out.printf("Fill your tank with %s!", typeOfFuel.toLowerCase());
                }
                break;
            default:
                System.out.println("Invalid fuel!");
                break;
        }


    }
}
