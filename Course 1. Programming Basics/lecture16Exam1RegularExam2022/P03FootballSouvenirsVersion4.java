package lecture16Exam1RegularExam2022;

import java.util.Scanner;

public class P03FootballSouvenirsVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        String nameOfTeam = scanner.nextLine();         //отбор – текст с възможности: "Argentina", "Brazil", "Croatia", "Denmark"
        String typeOfSouvenir = scanner.nextLine();        //вид сувенири – текст с възможности: "flags", "caps", "posters", "stickers"
        int numberOfBoughtSouvenirs = Integer.parseInt(scanner.nextLine());        //брой купени сувенири – цяло число в интервала [1…200]

        //•	Ако страната не е правилно зададена:  	"Invalid country!"
        //•	Ако  стоката не е правилно зададена:   "Invalid stock!"

        double unitPrice = 0;   //създаваме си променлива за цената на един сувенир с начална стойност 0 (после ще й сетваме различни стойности)

        switch (typeOfSouvenir) {
            case "flags":                                   //ако сувенирите са флагчета
                if (nameOfTeam.equals("Argentina")) {
                    unitPrice = 3.25;
                } else if (nameOfTeam.equals("Brazil")) {
                    unitPrice = 4.20;
                } else if (nameOfTeam.equals("Croatia")) {
                    unitPrice = 2.75;
                } else if (nameOfTeam.equals("Denmark")) {
                    unitPrice = 3.10;
                } else {
                    System.out.println("Invalid country!");
                }
                break;
            case "caps":                                    //ако сувенирите са шапки
                if (nameOfTeam.equals("Argentina")) {
                    unitPrice = 7.20;
                } else if (nameOfTeam.equals("Brazil")) {
                    unitPrice = 8.50;
                } else if (nameOfTeam.equals("Croatia")) {
                    unitPrice = 6.90;
                } else if (nameOfTeam.equals("Denmark")) {
                    unitPrice = 6.50;
                } else {
                    System.out.println("Invalid country!");
                }
                break;
            case "posters":                                //ако сувенирите са плакати
                if (nameOfTeam.equals("Argentina")) {
                    unitPrice = 5.10;
                } else if (nameOfTeam.equals("Brazil")) {
                    unitPrice = 5.35;
                } else if (nameOfTeam.equals("Croatia")) {
                    unitPrice = 4.95;
                } else if (nameOfTeam.equals("Denmark")) {
                    unitPrice = 4.80;
                } else {
                    System.out.println("Invalid country!");
                }
                break;
            case "stickers":                              //ако сувенирите са стикери
                if (nameOfTeam.equals("Argentina")) {
                    unitPrice = 1.25;
                } else if (nameOfTeam.equals("Brazil")) {
                    unitPrice = 1.20;
                } else if (nameOfTeam.equals("Croatia")) {
                    unitPrice = 1.10;
                } else if (nameOfTeam.equals("Denmark")) {
                    unitPrice = 0.90;
                } else {
                    System.out.println("Invalid country!");
                }
                break;
            default:
                System.out.println("Invalid stock!");
                break;
        }

        //след като сме видели каква е стоката и на кой отбор е, вече знаем единичната цена и ще можем да намерим ценатата за всички купени сувенири
        double totalPrice = numberOfBoughtSouvenirs * unitPrice;

        //Ако страната и стоката са правилно зададени:
        if (typeOfSouvenir.equals("flags") || typeOfSouvenir.equals("caps") || typeOfSouvenir.equals("posters") || typeOfSouvenir.equals("stickers")) {
            if (nameOfTeam.equals("Argentina") || nameOfTeam.equals("Brazil") || nameOfTeam.equals("Croatia") || nameOfTeam.equals("Denmark")) {
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfBoughtSouvenirs, typeOfSouvenir, nameOfTeam, totalPrice);
            }
        }

        //Втори начин да напишем условието (Ако страната и стоката са правилно зададени:)
//        if ((typeOfSouvenir.equals("flags") || typeOfSouvenir.equals("caps") || typeOfSouvenir.equals("posters") || typeOfSouvenir.equals("stickers")) &&
//                (nameOfTeam.equals("Argentina") || nameOfTeam.equals("Brazil") || nameOfTeam.equals("Croatia") || nameOfTeam.equals("Denmark"))) {
//            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfBoughtSouvenirs, typeOfSouvenir, nameOfTeam, totalPrice);
//        }


    }
}
