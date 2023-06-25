package moreExercises5And6ConditionalStatements;

import java.util.Scanner;

public class P08FuelTankPart2Version2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFuel = scanner.nextLine();       //•	Тип на горивото – текст с възможности: "Gas", "Gasoline" или "Diesel"
        double litresOfFuel = Double.parseDouble(scanner.nextLine());      //•	Количество гориво – реално число в интервала [1.00 … 50.00]
        String ownershipOfClubCard = scanner.nextLine();     //•	Притежание на клубна карта – текст с възможности: "Yes" или "No"

        //•	Бензин – 2.22 лева за един литър,
        //•	Дизел – 2.33 лева за един литър
        //•	Газ – 0.93 лева за литър

        //Ако водачът има карта за отстъпки, той се възползва от следните намаления за литър гориво: 18 ст. за литър бензин, 12 ст. за литър дизел и 8 ст. за литър газ.
        double priceOf1LitreOfFuel = 0;
        double totalPriceOfAllLitresOfFuel = 0;
        //1 лев = 100 стотинки    - трябва да работим в една и съща мерна единица
        if (typeOfFuel.equals("Gas")) {
            priceOf1LitreOfFuel = 0.93;
            totalPriceOfAllLitresOfFuel = litresOfFuel * priceOf1LitreOfFuel;
            if (ownershipOfClubCard.equals("Yes")) {
                totalPriceOfAllLitresOfFuel = litresOfFuel * (priceOf1LitreOfFuel - (8 * 1.0 / 100));       //totalPriceOfAllLitresOfFuel = litresOfFuel * (priceOf1LitreOfFuel - (8 * 0.01));
            }
        } else if (typeOfFuel.equals("Gasoline")) {
            priceOf1LitreOfFuel = 2.22;
            totalPriceOfAllLitresOfFuel = litresOfFuel * priceOf1LitreOfFuel;
            if (ownershipOfClubCard.equals("Yes")) {
                totalPriceOfAllLitresOfFuel = litresOfFuel * (priceOf1LitreOfFuel - (18 * 1.0 / 100));       //totalPriceOfAllLitresOfFuel = litresOfFuel * (priceOf1LitreOfFuel - (18 * 0.01));
            }
        } else if (typeOfFuel.equals("Diesel")) {
            priceOf1LitreOfFuel = 2.33;
            totalPriceOfAllLitresOfFuel = litresOfFuel * priceOf1LitreOfFuel;
            if (ownershipOfClubCard.equals("Yes")) {
                totalPriceOfAllLitresOfFuel = litresOfFuel * (priceOf1LitreOfFuel - (12 * 1.0 / 100));       //totalPriceOfAllLitresOfFuel = litresOfFuel * (priceOf1LitreOfFuel - (12 * 0.01));
            }
        }


        //следващите проверки не зависят от вида гориво, затова ще са извън предишните проверки (тоест, няма значение какъв е видът на горивото)
        //Ако шофьорът е заредил между 20 и 25 литра включително, той получава 8 процента отстъпка от крайната цена, при повече от 25 литра гориво, той получава 10 процента отстъпка от крайната цена.
        if (litresOfFuel > 25) {
            totalPriceOfAllLitresOfFuel = totalPriceOfAllLitresOfFuel - (totalPriceOfAllLitresOfFuel * 10 / 100);
        } else if (litresOfFuel >= 20) {      //else if (litresOfFuel >= 20 && litresOfFuel <= 25)
            totalPriceOfAllLitresOfFuel = totalPriceOfAllLitresOfFuel - (totalPriceOfAllLitresOfFuel * 8 / 100);
        }


        System.out.printf("%.2f lv.", totalPriceOfAllLitresOfFuel);
    }
}
