package lecture7ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P12TradeCommissionsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String town = scanner.nextLine();
        double volumeOfSales = Double.parseDouble(scanner.nextLine());

        boolean isValidData = true;
        double result = 0;

        if (town.equals("Sofia")) {
            if (volumeOfSales >= 0 && volumeOfSales <= 500) {
                result = volumeOfSales * 5 * 0.01;
            } else if (volumeOfSales > 500 && volumeOfSales <= 1000) {
                result = volumeOfSales * 7 * 0.01;
            } else if (volumeOfSales > 1000 && volumeOfSales <= 10000) {
                result = volumeOfSales * 8 * 0.01;
            } else if (volumeOfSales > 10000) {
                result = volumeOfSales * 12 * 0.01;
            } else {
                isValidData = false;
            }
        } else if (town.equals("Varna")) {
            if (volumeOfSales >= 0 && volumeOfSales <= 500) {
                result = volumeOfSales * 4.5 * 0.01;
            } else if (volumeOfSales > 500 && volumeOfSales <= 1000) {
                result = volumeOfSales * 7.5 * 0.01;
            } else if (volumeOfSales > 1000 && volumeOfSales <= 10000) {
                result = volumeOfSales * 10 * 0.01;
            } else if (volumeOfSales > 10000) {
                result = volumeOfSales * 13 * 0.01;
            } else {
                isValidData = false;
            }
        } else if (town.equals("Plovdiv")) {
            if (volumeOfSales >= 0 && volumeOfSales <= 500) {
                result = volumeOfSales * 5.5 * 0.01;
            } else if (volumeOfSales > 500 && volumeOfSales <= 1000) {
                result = volumeOfSales * 8 * 0.01;
            } else if (volumeOfSales > 1000 && volumeOfSales <= 10000) {
                result = volumeOfSales * 12 * 0.01;
            } else if (volumeOfSales > 10000) {
                result = volumeOfSales * 14.5 * 0.01;
            } else {
                isValidData = false;
            }
        } else {
            isValidData = false;
        }


        if (isValidData) {
            System.out.printf("%.2f", result);
        } else {
            System.out.println("error");
        }


    }
}
