package pbExam6Date2And3May2019;

import java.util.Scanner;

public class P01FruitMarketVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 5 реда:
        double strawberriesPricePer1Kg = Double.parseDouble(scanner.nextLine());    //Цена на ягодите в лева – реално число в интервала [0.00 … 10000.00]
        double bananasQuantityInKg = Double.parseDouble(scanner.nextLine());          //Количество на бананите в килограми – реално число в интервала [0.00 … 1 0000.00]
        double orangesQuantityInKg = Double.parseDouble(scanner.nextLine());          //Количество на портокалите в килограми – реално число в интервала [0.00 … 10000.00]
        double raspberriesQuantityInKg = Double.parseDouble(scanner.nextLine());      //Количество на малините в килограми – реално число в интервала [0.00 … 10000.00]
        double strawberriesQuantityInKg = Double.parseDouble(scanner.nextLine());     //Количество на ягодите в килограми – реално число в интервала [0.00 … 10000.00]

        //цената на малините е наполовина по-ниска от тази на ягодите ->
        double raspberriesPricePer1Kg = strawberriesPricePer1Kg * 1 / 2;

        //цената на портокалите е с 40% по-ниска от цената на малините ->
        double orangesPricePer1Kg = raspberriesPricePer1Kg - (raspberriesPricePer1Kg * 40 / 100);

        //цената на бананите е с 80% по-ниска от цената на малините ->
        double bananasPricePer1Kg = raspberriesPricePer1Kg - (raspberriesPricePer1Kg * 80 / 100);

        //намираме и принтираме крайната цена за всички покупки:
        double totalPriceOfAllGoods = (strawberriesQuantityInKg * strawberriesPricePer1Kg) + (raspberriesQuantityInKg * raspberriesPricePer1Kg) + (orangesQuantityInKg * orangesPricePer1Kg) + (bananasQuantityInKg * bananasPricePer1Kg);
        System.out.printf("%.2f", totalPriceOfAllGoods);
    }
}
