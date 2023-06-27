package pbExam2Date18And19July2020;

import java.util.Scanner;

public class P02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 4 реда:
        double priceOfBagOver20Kg = Double.parseDouble(scanner.nextLine());    //Цената на багаж над 20 кг - реално число в диапазона [10.0…80.0]
        double loadInKilograms = Double.parseDouble(scanner.nextLine());    //Килограми на багажа – реално число в диапазона [1.0…32.0]
        int numberOfDaysBeforeFlying = Integer.parseInt(scanner.nextLine());   //Дни до пътуването – цяло число в диапазона [1…60]
        int numberOfBags = Integer.parseInt(scanner.nextLine());   //Брой багажи – цяло число в диапазона [1…10]


        //Таксите за багаж се изчисляват въз основа на теглото на чекирания багаж:
        double priceOfBag = 0;              //създаваме си променлива за таксата за багажа
        if (loadInKilograms < 10) {         //•	до 10 кг – 20% от цената на багаж над 20 кг
            priceOfBag = priceOfBagOver20Kg * 20 / 100;
        } else if (loadInKilograms >= 10 && loadInKilograms <= 20) {       //•	между 10 кг и 20 кг вкл. – 50% от цената на багаж над 20 кг.
            priceOfBag = priceOfBagOver20Kg * 50 / 100;
        } else if (loadInKilograms > 20) {         //•	над 20 кг – таксата се чете от конзолата
            priceOfBag = priceOfBagOver20Kg;
        }


        //В зависимост от броя на дните, които остават до пътуването, цената се оскъпява:
        if (numberOfDaysBeforeFlying > 30) {        //•	повече от 30 дни - цената на багажа се оскъпява с 10%
            priceOfBag = priceOfBag + (priceOfBag * 10 / 100);
        } else if (numberOfDaysBeforeFlying >= 7) {       //•	между 7 и 30 дни вкл. - цената на багажа се оскъпява с 15%      //else if (numberOfDaysBeforeFlying>= 7 && numberOfDaysBeforeFlying <= 30)
            priceOfBag = priceOfBag + (priceOfBag * 15 / 100);
        } else {           //•	по-малко от 7 дни - цената на багажа се оскъпява с 40%       //else if (numberOfDaysBeforeFlying < 7)
            priceOfBag = priceOfBag + (priceOfBag * 40 / 100);
        }

        //намираме общата цена на всички багажи
        double totalPriceOfAllBags = numberOfBags * priceOfBag;

        System.out.printf("The total price of bags is: %.2f lv.", totalPriceOfAllBags);
    }
}
