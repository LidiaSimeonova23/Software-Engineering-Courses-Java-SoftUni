package pbExam7Date6And7July2019;

import java.util.Scanner;

public class P03TravelAgencyVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 4 реда:
        String town = scanner.nextLine();      //Име на града - текст с възможности: "Bansko",  "Borovets", "Varna" или "Burgas"
        String typeOfService = scanner.nextLine();      //Вид на пакета - текст с възможности: "noEquipment",  "withEquipment", "noBreakfast" или "withBreakfast"
        String ownershipOfVipDiscount = scanner.nextLine();    //Притежание на VIP отстъпка - текст с възможности:  "yes" или "no"
        int numberOfDays = Integer.parseInt(scanner.nextLine());      //Дни за престой - цяло число в интервала [-10000 … 10000]

        double pricePerDay = 0;       //създаваме си променлива за цената за 1 ден престой
        if (town.equals("Bansko") || town.equals("Borovets")) {        //в случай че градът е Банско или Боровец:
            if (typeOfService.equals("withEquipment")) {
                pricePerDay = 100;       //цената (без отстъпка)
                if (ownershipOfVipDiscount.equals("yes")) {
                    pricePerDay = pricePerDay * 90 * 0.01;      //VIP отстъпка 10%   ->  цената е 90% от цената      //цената (след отстъпката, когато има такава)
                }
            } else if (typeOfService.equals("noEquipment")) {
                pricePerDay = 80;        //цената (без отстъпка)
                if (ownershipOfVipDiscount.equals("yes")) {
                    pricePerDay = pricePerDay * 95 * 0.01;      //VIP отстъпка 5%   ->  цената е 95% от цената       //цената (след отстъпката, когато има такава)
                }
            }
        } else if (town.equals("Varna") || town.equals("Burgas")) {    //в случай че градът е Варна или Бургас:
            if (typeOfService.equals("withBreakfast")) {
                pricePerDay = 130;         //цената (без отстъпка)
                if (ownershipOfVipDiscount.equals("yes")) {
                    pricePerDay = pricePerDay * 88 * 0.01;      //VIP отстъпка 12%  ->  цената е 88% от цената        //цената (след отстъпката, когато има такава)
                }
            } else if (typeOfService.equals("noBreakfast")) {
                pricePerDay = 100;         //цената (без отстъпка)
                if (ownershipOfVipDiscount.equals("yes")) {
                    pricePerDay = pricePerDay * 93 * 0.01;      //VIP отстъпка 7%    ->  цената е 93% от цената            //цената (след отстъпката, когато има такава)
                }
            }
        }


        //намираме цената на всичките дни престой:
        double totalPriceForAllDays = numberOfDays * pricePerDay;

        //Ако клиентът е заявил престой повече от 7 дни, получава единия ден безплатно.
        if (numberOfDays > 7) {
            totalPriceForAllDays = totalPriceForAllDays - pricePerDay;
        }


        //създаваме си променлива за валидност на града:
        boolean isValidTown = town.equals("Bansko") || town.equals("Borovets") || town.equals("Varna") || town.equals("Burgas");

        //създаваме си променлива за валидност на вида на услугата:
        boolean isValidTypeOfService = typeOfService.equals("withEquipment") || typeOfService.equals("noEquipment") || typeOfService.equals("withBreakfast") || typeOfService.equals("noBreakfast");


        if (numberOfDays < 1) {     //Ако потребителят е въвел по-малко от 1 ден за престой
            System.out.println("Days must be positive number!");
        } else if (isValidTown && isValidTypeOfService) {      //ако градът е валиден и ако видът на услугата е валиден
            System.out.printf("The price is %.2flv! Have a nice time!", totalPriceForAllDays);
        } else {      //ако градът е невалиден или ако видът на услугата е невалиден
            System.out.println("Invalid input!");
        }

    }
}
