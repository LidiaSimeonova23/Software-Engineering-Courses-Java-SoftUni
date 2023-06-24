package lecture6ExerciseConditionalStatements;

import java.util.Scanner;

public class P04ToyShopVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());      //Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
        int puzzlesCount = Integer.parseInt(scanner.nextLine());       //Брой пъзели - цяло число в интервала [0… 1000]
        int dollsCount = Integer.parseInt(scanner.nextLine());        //Брой говорещи кукли - цяло число в интервала [0 … 1000]
        int teddyBearsCount = Integer.parseInt(scanner.nextLine());       //Брой плюшени мечета - цяло число в интервала [0 … 1000]
        int minionsCount = Integer.parseInt(scanner.nextLine());      //Брой миньони - цяло число в интервала [0 … 1000]
        int trucksCount = Integer.parseInt(scanner.nextLine());      //Брой камиончета - цяло число в интервала [0 … 1000]

        double puzzlePrice = 2.60;      //•	Пъзел - 2.60 лв.
        double dollPrice = 3;           //•	Говореща кукла - 3 лв.
        double teddyBearPrice = 4.10;      //•	Плюшено мече - 4.10 лв.
        double minionPrice = 8.20;       //•	Миньон - 8.20 лв.
        double truckPrice = 2;       //•	Камионче - 2 лв.

        double priceOfAllToys = (puzzlesCount * puzzlePrice) + (dollsCount * dollPrice) + (teddyBearsCount * teddyBearPrice) + (minionsCount * minionPrice) + (trucksCount * truckPrice);

        //Ако поръчаните играчки са 50 или повече, магазинът прави отстъпка 25% от общата цена.
        int numberOfAllToys = puzzlesCount + dollsCount + teddyBearsCount + minionsCount + trucksCount;
        if (numberOfAllToys >= 50) {
            priceOfAllToys = priceOfAllToys - (priceOfAllToys * 25 / 100);
        }

        //От спечелените пари Петя трябва да даде 10% за наема на магазина.
        double availableMoney = priceOfAllToys - (priceOfAllToys * 10 / 100);

        double differenceInMoney = Math.abs(excursionPrice - availableMoney);
        if (availableMoney >= excursionPrice) {       //Ако парите са достатъчни, да се отпечата колко пари са в излишък
            System.out.printf("Yes! %.2f lv left.", differenceInMoney);
        } else {          //В противен случай (Ако парите НЕ са достатъчни), да се отпечата колко пари не достигат
            System.out.printf("Not enough money! %.2f lv needed.", differenceInMoney);
        }

    }
}
