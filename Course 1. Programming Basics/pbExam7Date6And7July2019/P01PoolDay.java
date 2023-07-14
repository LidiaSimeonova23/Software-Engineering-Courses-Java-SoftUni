package pbExam7Date6And7July2019;

import java.util.Scanner;

public class P01PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 4 числа:
        int numberOfPeople = Integer.parseInt(scanner.nextLine());         //брой на хората - цяло число в интервала [1…100]
        double entranceFee = Double.parseDouble(scanner.nextLine());        //такса вход - реално число в интервала [0.00…50.00]
        double sunBedUnitPrice = Double.parseDouble(scanner.nextLine());      //цена за един шезлонг - реално число в интервала [0.00…50.00]
        double umbrellaUnitPrice = Double.parseDouble(scanner.nextLine());       //цена за един чадър - реално число в интервала [0.00...50.00]

        //При изчислението на броя на чадърите и шезлонгите техният брой да се закръгли до по-голямото цяло число.

        //един чадър стига за двама души ->
        double numberOfUmbrellas = numberOfPeople * 1.0 / 2;
        numberOfUmbrellas = Math.ceil(numberOfUmbrellas);      //за да не остава никой без чадър (в случай че броят хора е нечетно число)

        //само 75% от екипа искат шезлонги ->
        double numberOfSunBeds = numberOfPeople * 1.0 * 75 / 100;
        numberOfSunBeds = Math.ceil(numberOfSunBeds);      //за да не остава никой без чадър (в случай че броят хора е нечетно число)

        //намираме общата сума за всички разходи и я принтираме:
        double totalSum = (numberOfPeople * entranceFee) + (numberOfSunBeds * sunBedUnitPrice) + (numberOfUmbrellas * umbrellaUnitPrice);
        System.out.printf("%.2f lv.", totalSum);
    }
}
