package lecture3FirstStepsInCoding;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни, които четем от конзолата:
        int numberOfPackagesOfDogFood = Integer.parseInt(scanner.nextLine());
        int numberOfPackagesOfCatFood = Integer.parseInt(scanner.nextLine());

        double priceOf1PackageOfDogFood = 2.50;
        double priceOf1PackageOfCatFood = 4;

        double totalPriceOfAllPackages = (numberOfPackagesOfDogFood * priceOf1PackageOfDogFood) + (numberOfPackagesOfCatFood * priceOf1PackageOfCatFood);
        System.out.printf("%f lv.", totalPriceOfAllPackages);     //форматирано принтиране
        //System.out.println(totalPriceOfAllPackages + " lv.");    //конкатенация
    }
}
