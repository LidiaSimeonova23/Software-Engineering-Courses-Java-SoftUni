package lecture7ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P12TradeCommissionsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double volumeOfSales = Double.parseDouble(scanner.nextLine());

        double commission = 0;

        switch (town) {
            case "Sofia":
                if (volumeOfSales >= 0 && volumeOfSales <= 500) {
                    commission = volumeOfSales * 5 / 100;
                } else if (volumeOfSales <= 1000) {
                    commission = volumeOfSales * 7 / 100;
                } else if (volumeOfSales <= 10000) {
                    commission = volumeOfSales * 8 / 100;
                } else if (volumeOfSales > 10000) {
                    commission = volumeOfSales * 12 / 100;
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (volumeOfSales >= 0 && volumeOfSales <= 500) {
                    commission = volumeOfSales * 4.5 / 100;
                } else if (volumeOfSales <= 1000) {
                    commission = volumeOfSales * 7.5 / 100;
                } else if (volumeOfSales <= 10000) {
                    commission = volumeOfSales * 10 / 100;
                } else if (volumeOfSales > 10000) {
                    commission = volumeOfSales * 13 / 100;
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (volumeOfSales >= 0 && volumeOfSales <= 500) {
                    commission = volumeOfSales * 5.5 / 100;
                } else if (volumeOfSales <= 1000) {
                    commission = volumeOfSales * 8 / 100;
                } else if (volumeOfSales <= 10000) {
                    commission = volumeOfSales * 12 / 100;
                } else if (volumeOfSales > 10000) {
                    commission = volumeOfSales * 14.5 / 100;
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }

        if ((town.equals("Sofia") || town.equals("Varna") || town.equals("Plovdiv")) && !(volumeOfSales < 0)) {
            System.out.printf("%.2f", commission);
        }


    }
}
