package lecture15ExamPreparation2DateFebruary2023;

import java.util.Scanner;

public class P03TravelAgencyVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();       //Име на града - текст с възможности ("Bansko",  "Borovets", "Varna" или "Burgas")
        String typeOfService = scanner.nextLine();        //Вид на пакета - текст с възможности ("noEquipment",  "withEquipment", "noBreakfast" или "withBreakfast")
        String ownershipOfDiscount = scanner.nextLine();        //Притежание на VIP отстъпка - текст с възможности  "yes" или "no"
        int numberOfDays = Integer.parseInt(scanner.nextLine());        //Дни за престой - цяло число в интервала [1 … 10000]


        double priceFor1Day = 0;

        switch (town) {
            case "Bansko":
            case "Borovets":
                if (typeOfService.equals("withEquipment")) {
                    priceFor1Day = 100;
                    if (ownershipOfDiscount.equals("yes")) {
                        priceFor1Day = priceFor1Day - (priceFor1Day * 10 / 100);
                    }
                } else if (typeOfService.equals("noEquipment")) {
                    priceFor1Day = 80;
                    if (ownershipOfDiscount.equals("yes")) {
                        priceFor1Day = priceFor1Day - (priceFor1Day * 5 / 100);
                    }
                }
                break;
            case "Varna":
            case "Burgas":
                if (typeOfService.equals("withBreakfast")) {
                    priceFor1Day = 130;
                    if (ownershipOfDiscount.equals("yes")) {
                        priceFor1Day = priceFor1Day - (priceFor1Day * 12 / 100);
                    }
                } else if (typeOfService.equals("noBreakfast")) {
                    priceFor1Day = 100;
                    if (ownershipOfDiscount.equals("yes")) {
                        priceFor1Day = priceFor1Day - (priceFor1Day * 7 / 100);
                    }
                }
                break;
        }


        double totalPriceForAllDays = numberOfDays * priceFor1Day;
        if (numberOfDays >= 7) {         //Ако клиентът е заявил престой повече от 7 дни, получава единия ден безплатно.
            totalPriceForAllDays = totalPriceForAllDays - priceFor1Day;
        }

        boolean isValidTown = town.equals("Bansko") || town.equals("Borovets") || town.equals("Varna") || town.equals("Burgas");
        boolean isValidTypeOfService = typeOfService.equals("withEquipment") || typeOfService.equals("noEquipment") || typeOfService.equals("withBreakfast") || typeOfService.equals("noBreakfast");

        if (numberOfDays < 1) {
            System.out.println("Days must be positive number!");
        } else if (isValidTown && isValidTypeOfService) {
            System.out.printf("The price is %.2flv! Have a nice time!", totalPriceForAllDays);
        } else {
            System.out.println("Invalid input!");
        }

    }
}
