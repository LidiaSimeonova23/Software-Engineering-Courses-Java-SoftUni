package pbExam6Date2and3May2019;

import java.util.Scanner;

public class P04TouristShopVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се чете:
        double availableBudget = Double.parseDouble(scanner.nextLine());      //бюджетът - реално число в интервала [1.00… 100000.00]

        //След това поредица от два реда (до получаване на команда "Stop" или при заявка за купуване на продукт, чиято стойност е по-висока от наличния бюджет):
        int productInOrder = 0;    //създаваме си променлива за поредност (кой поред продукт е) на продукта
        int numberOfBoughtProducts = 0;     //създаваме си променлива за броя на купените продукти
        double totalSumOfAllBoughtProducts = 0;       //създаваме си променлива за общата сума на всички купени продукти
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String currentProduct = input;       //Име на продукта – текст
            double priceOfCurrentProduct = Double.parseDouble(scanner.nextLine());     //Цена на продукта – реално число в интервала [1.00… 5000.00]

            //поредността на продукта се увеличава с единица
            productInOrder++;
            //Всеки трети продукт е на половин цена. ->
            if (productInOrder % 3 == 0) {        //ако продуктът е трети поред, намаляваме цената му наполовина
                priceOfCurrentProduct /= 2;        //priceOfCurrentProduct = priceOfCurrentProduct / 2;
            }

            if (availableBudget >= priceOfCurrentProduct) {        //ако имаме достатъчно пари, си купуваме текущия продукт  -> броят на купените продукти се увеличава с единица и общата сума на всички купени продукти нараства
                numberOfBoughtProducts++;        //numberOfBoughtProducts = numberOfBoughtProducts + 1;         //numberOfBoughtProducts += 1;
                totalSumOfAllBoughtProducts += priceOfCurrentProduct;       //totalSumOfAllBoughtProducts = totalSumOfAllBoughtProducts + priceOfCurrentProduct;
            } else {          //else if (availableBudget < priceOfCurrentProduct)        //При заявка за покупка на продукт, чиято цена е по-висока от останалите пари
                System.out.println("You don't have enough money!");
                double missingMoney = priceOfCurrentProduct - availableBudget;
                System.out.printf("You need %.2f leva!", missingMoney);
                return;      //прекъсваме цялата програма
            }

            //и наличният бюджет намалява
            availableBudget -= priceOfCurrentProduct;          //availableBudget = availableBudget - priceOfCurrentProduct;

            input = scanner.nextLine();      //update
        }


        //ако компилаторът не е срещнал оператор return, все някога входните данни са станали "Stop"
        System.out.printf("You bought %d products for %.2f leva.", numberOfBoughtProducts, totalSumOfAllBoughtProducts);
    }
}
