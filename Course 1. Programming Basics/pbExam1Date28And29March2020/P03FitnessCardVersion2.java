package pbExam1Date28And29March2020;

import java.util.Scanner;

public class P03FitnessCardVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableBudget = Double.parseDouble(scanner.nextLine());         //•	Сумата, с която разполагаме - реално число в интервала [10.00…1000.00]
        char gender = scanner.nextLine().charAt(0);       //•	Пол - символ ('m' за мъж и 'f' за жена)
        int age = Integer.parseInt(scanner.nextLine());      //•	Възраст - цяло число в интервала [5…105]
        String sport = scanner.nextLine();         //•	Спорт - текст (една от възможностите в таблицата: "Gym", "Boxing", "Yoga", "Zumba", "Dances", "Pilates")

        //програма, която проверява дали първоначално налична сума е достатъчна, за да се заплати карта за месечен достъп във фитнес
        //Цената на картата зависи от пола на клиента и спорта


        double priceOfCard = 0;
        if (sport.equals("Gym")) {
            if (gender == 'm') {
                priceOfCard = 42;
            } else if (gender == 'f') {
                priceOfCard = 35;
            }
        } else if (sport.equals("Boxing")) {
            if (gender == 'm') {
                priceOfCard = 41;
            } else if (gender == 'f') {
                priceOfCard = 37;
            }
        } else if (sport.equals("Yoga")) {
            if (gender == 'm') {
                priceOfCard = 45;
            } else if (gender == 'f') {
                priceOfCard = 42;
            }
        } else if (sport.equals("Zumba")) {
            if (gender == 'm') {
                priceOfCard = 34;
            } else if (gender == 'f') {
                priceOfCard = 31;
            }
        } else if (sport.equals("Dances")) {
            if (gender == 'm') {
                priceOfCard = 51;
            } else if (gender == 'f') {
                priceOfCard = 53;
            }
        } else if (sport.equals("Pilates")) {
            if (gender == 'm') {
                priceOfCard = 39;
            } else if (gender == 'f') {
                priceOfCard = 37;
            }
        }

        //Всички цени на карти за ученици (възраст под 19 години вкл.) са с 20% намаление.
        if (age <= 19) {
            priceOfCard = priceOfCard - (priceOfCard * 20 / 100);
        }


        if (availableBudget >= priceOfCard) {           //•	Ако сумата е достатъчна
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {         //•	Ако сумата не е достатъчна
            double missingMoney = priceOfCard - availableBudget;
            System.out.printf("You don't have enough money! You need $%.2f more.", missingMoney);
        }


    }
}

