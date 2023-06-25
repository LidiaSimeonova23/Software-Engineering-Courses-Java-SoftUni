package moreExercises7And8ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P08PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входните данни се четат от конзолата и се състоят от 6 реда, въведени от потребителя: десетичните числа x1, y1, x2, y2, x и y (като се гарантира, че x1 < x2 и y1 < y2).
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        //точката лежи на някоя от страните, ако е изпълнено едно от следните условия:
        //•	x съвпада с x1 или x2 и същевременно y е между y1 и y2
        //•	y съвпада с y1 или y2 и същевременно x е между x1 и x2

        if (((x == x1 || x == x2) && (y >= y1 && y <= y2)) || ((y == y1 || y == y2) && (x >= x1 && x <= x2))) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }

    }
}
