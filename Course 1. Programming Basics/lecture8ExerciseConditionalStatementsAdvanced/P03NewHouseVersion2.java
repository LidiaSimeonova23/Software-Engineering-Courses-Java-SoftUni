package lecture8ExerciseConditionalStatementsAdvanced;

import java.util.Scanner;

public class P03NewHouseVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFlowers = scanner.nextLine();       //	Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());      //	Брой цветя - цяло число в интервала [10…1000]
        int availableBudget = Integer.parseInt(scanner.nextLine());       //	Бюджет - цяло число в интервала [50…2500]

        //•	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        //•	Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
        //•	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        //•	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        //•	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%

        double unitPrice = 0;
        double totalPrice = 0;
        if (typeOfFlowers.equals("Roses")) {
            unitPrice = 5;
            totalPrice = numberOfFlowers * 5;
            if (numberOfFlowers > 80) {
                totalPrice = totalPrice - (totalPrice * 10 / 100);
            }
        } else if (typeOfFlowers.equals("Dahlias")) {
            unitPrice = 3.80;
            totalPrice = numberOfFlowers * 3.80;
            if (numberOfFlowers > 90) {
                totalPrice = totalPrice - (totalPrice * 15 / 100);
            }
        } else if (typeOfFlowers.equals("Tulips")) {
            unitPrice = 2.80;
            totalPrice = numberOfFlowers * 2.80;
            if (numberOfFlowers > 80) {
                totalPrice = totalPrice - (totalPrice * 15 / 100);
            }
        } else if (typeOfFlowers.equals("Narcissus")) {
            unitPrice = 3;
            totalPrice = numberOfFlowers * 3;
            if (numberOfFlowers < 120) {
                totalPrice = totalPrice + (totalPrice * 15 / 100);
            }
        } else if (typeOfFlowers.equals("Gladiolus")) {
            unitPrice = 2.50;
            totalPrice = numberOfFlowers * 2.50;
            if (numberOfFlowers < 80) {
                totalPrice = totalPrice + (totalPrice * 20 / 100);
            }
        }


        if (availableBudget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, typeOfFlowers, availableBudget - totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - availableBudget);
        }

    }
}
