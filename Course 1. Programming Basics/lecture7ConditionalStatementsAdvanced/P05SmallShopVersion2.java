package lecture7ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P05SmallShopVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());


        double unitPrice = 0;
        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                unitPrice = 0.50;
            } else if (product.equals("water")) {
                unitPrice = 0.80;
            } else if (product.equals("beer")) {
                unitPrice = 1.20;
            } else if (product.equals("sweets")) {
                unitPrice = 1.45;
            } else if (product.equals("peanuts")) {
                unitPrice = 1.60;
            }
        } else if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                unitPrice = 0.40;
            } else if (product.equals("water")) {
                unitPrice = 0.70;
            } else if (product.equals("beer")) {
                unitPrice = 1.15;
            } else if (product.equals("sweets")) {
                unitPrice = 1.30;
            } else if (product.equals("peanuts")) {
                unitPrice = 1.50;
            }
        } else if (town.equals("Varna")) {
            if (product.equals("coffee")) {
                unitPrice = 0.45;
            } else if (product.equals("water")) {
                unitPrice = 0.70;
            } else if (product.equals("beer")) {
                unitPrice = 1.10;
            } else if (product.equals("sweets")) {
                unitPrice = 1.35;
            } else if (product.equals("peanuts")) {
                unitPrice = 1.55;
            }
        }

        double sum = quantity * unitPrice;
        System.out.printf("%f", sum);        //странно, но ако принтирам със System.out.println(sum);   3 бири в София ги изчислява не както трябва
    }
}

