package lecture8ExerciseConditionalStatementsAdvanced;

import java.util.Scanner;

public class P03NewHouseVersion1 {
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
        switch (typeOfFlowers) {
            case "Roses":
                unitPrice = 5;
                totalPrice = numberOfFlowers * unitPrice;
                if (numberOfFlowers > 80) {
                    totalPrice = totalPrice - (totalPrice * 10 / 100);
                }
                break;
            case "Dahlias":
                unitPrice = 3.80;
                totalPrice = numberOfFlowers * unitPrice;
                if (numberOfFlowers > 90) {
                    totalPrice = totalPrice - (totalPrice * 15 / 100);
                }
                break;
            case "Tulips":
                unitPrice = 2.80;
                totalPrice = numberOfFlowers * unitPrice;
                if (numberOfFlowers > 80) {
                    totalPrice = totalPrice - (totalPrice * 15 / 100);
                }
                break;
            case "Narcissus":
                unitPrice = 3;
                totalPrice = numberOfFlowers * unitPrice;
                if (numberOfFlowers < 120) {
                    totalPrice = totalPrice + (totalPrice * 15 / 100);
                }
                break;
            case "Gladiolus":
                unitPrice = 2.50;
                totalPrice = numberOfFlowers * unitPrice;
                if (numberOfFlowers < 80) {
                    totalPrice = totalPrice + (totalPrice * 20 / 100);
                }
                break;
        }


        double differenceInMoney = Math.abs(availableBudget - totalPrice);
        if (availableBudget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, typeOfFlowers, differenceInMoney);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", differenceInMoney);
        }

    }
}
