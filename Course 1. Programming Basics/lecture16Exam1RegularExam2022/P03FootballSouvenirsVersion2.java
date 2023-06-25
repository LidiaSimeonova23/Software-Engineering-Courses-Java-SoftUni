package lecture16Exam1RegularExam2022;

import java.util.Scanner;

public class P03FootballSouvenirsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата четем 3 реда:
        String nameOfTeam = scanner.nextLine();                 //отбор – текст с възможности: "Argentina", "Brazil", "Croatia", "Denmark"
        String typeOfSouvenir = scanner.nextLine();                 //вид сувенири – текст с възможности: "flags", "caps", "posters", "stickers"
        int numberOfBoughtSouvenirs = Integer.parseInt(scanner.nextLine());            //брой закупени сувенири – цяло число в интервала [1…200]

        double unitPrice = 0;

        if (nameOfTeam.equals("Argentina")) {              //ако отборът е Аржентина
            if (typeOfSouvenir.equals("flags")) {
                unitPrice = 3.25;
            } else if (typeOfSouvenir.equals("caps")) {
                unitPrice = 7.20;
            } else if (typeOfSouvenir.equals("posters")) {
                unitPrice = 5.10;
            } else if (typeOfSouvenir.equals("stickers")) {
                unitPrice = 1.25;
            } else {
                System.out.println("Invalid stock!");
            }
        } else if (nameOfTeam.equals("Brazil")) {          //или ако отборът е Бразилия
            if (typeOfSouvenir.equals("flags")) {
                unitPrice = 4.20;
            } else if (typeOfSouvenir.equals("caps")) {
                unitPrice = 8.50;
            } else if (typeOfSouvenir.equals("posters")) {
                unitPrice = 5.35;
            } else if (typeOfSouvenir.equals("stickers")) {
                unitPrice = 1.20;
            } else {
                System.out.println("Invalid stock!");
            }
        } else if (nameOfTeam.equals("Croatia")) {       //или ако отборът е Хърватия
            if (typeOfSouvenir.equals("flags")) {
                unitPrice = 2.75;
            } else if (typeOfSouvenir.equals("caps")) {
                unitPrice = 6.90;
            } else if (typeOfSouvenir.equals("posters")) {
                unitPrice = 4.95;
            } else if (typeOfSouvenir.equals("stickers")) {
                unitPrice = 1.10;
            } else {
                System.out.println("Invalid stock!");
            }
        } else if (nameOfTeam.equals("Denmark")) {         //или ако отборът е Дания
            if (typeOfSouvenir.equals("flags")) {
                unitPrice = 3.10;
            } else if (typeOfSouvenir.equals("caps")) {
                unitPrice = 6.50;
            } else if (typeOfSouvenir.equals("posters")) {
                unitPrice = 4.80;
            } else if (typeOfSouvenir.equals("stickers")) {
                unitPrice = 0.90;
            } else {
                System.out.println("Invalid stock!");
            }
        } else {                                           //във всички останали случаи (тоест, ако отборът не е никой от вече изброените)
            System.out.println("Invalid country!");
        }

        //след като сме видели от кой отбор е стоката и какъв е видът на стоката, вече знаем единичната цена и ще можем да намерим ценатата за всички купени сувенири
        double totalPrice = numberOfBoughtSouvenirs * unitPrice;


        //Ако страната и стоката са правилно зададени:
        if (nameOfTeam.equals("Argentina") || nameOfTeam.equals("Brazil") || nameOfTeam.equals("Croatia") || nameOfTeam.equals("Denmark")) {
            if (typeOfSouvenir.equals("flags") || typeOfSouvenir.equals("caps") || typeOfSouvenir.equals("posters") || typeOfSouvenir.equals("stickers")) {
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberOfBoughtSouvenirs, typeOfSouvenir, nameOfTeam, totalPrice);
            }
        }

    }
}
