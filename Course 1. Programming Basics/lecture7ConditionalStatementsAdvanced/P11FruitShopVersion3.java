package lecture7ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P11FruitShopVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();         //плод (banana / apple / orange / grapefruit / kiwi / pineapple / grapes),
        String dayOfWeek = scanner.nextLine();     //ден от седмицата (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday)
        double quantity = Double.parseDouble(scanner.nextLine());        //количество (десетично число)

        double price = 0;
        if (fruit.equals("banana")) {
            if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
                price = 2.50;
            } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                price = 2.70;
            } else {
                System.out.println("error");
            }
            double totalSum = quantity * price;
            System.out.printf("%.2f", totalSum);
        } else if (fruit.equals("apple")) {
            if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
                price = 1.20;
            } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                price = 1.25;
            } else {
                System.out.println("error");
            }
            double totalSum = quantity * price;
            System.out.printf("%.2f", totalSum);
        } else if (fruit.equals("orange")) {
            if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
                price = 0.85;
            } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                price = 0.90;
            } else {
                System.out.println("error");
            }
            double totalSum = quantity * price;
            System.out.printf("%.2f", totalSum);
        } else if (fruit.equals("grapefruit")) {
            if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
                price = 1.45;
            } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                price = 1.60;
            } else {
                System.out.println("error");
            }
            double totalSum = quantity * price;
            System.out.printf("%.2f", totalSum);
        } else if (fruit.equals("kiwi")) {
            if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
                price = 2.70;
            } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                price = 3.00;
            } else {
                System.out.println("error");
            }
            double totalSum = quantity * price;
            System.out.printf("%.2f", totalSum);
        } else if (fruit.equals("pineapple")) {
            if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
                price = 5.50;
            } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                price = 5.60;
            } else {
                System.out.println("error");
            }
            double totalSum = quantity * price;
            System.out.printf("%.2f", totalSum);
        } else if (fruit.equals("grapes")) {
            if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
                price = 3.85;
            } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                price = 4.20;
            } else {
                System.out.println("error");
            }
            double totalSum = quantity * price;
            System.out.printf("%.2f", totalSum);
        } else {
            System.out.println("error");
        }


    }
}
