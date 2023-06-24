package lecture5ConditionalStatements;

import java.util.Scanner;

public class P07AreaOfFiguresVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        double areaOfFigure = 0;    //създаваме си променлива (с начална стойност 0) за лицето на фигурата (след това ще й присвояваме друга стойност в зависимост от това какъв тип е фигурата)
        switch (figure) {
            case "square":
                double sideOfSquare = Double.parseDouble(scanner.nextLine());
                areaOfFigure = sideOfSquare * sideOfSquare;
                //areaOfFigure = Math.pow(sideOfSquare, 2);
                break;
            case "rectangle":
                double length = Double.parseDouble(scanner.nextLine());
                double width = Double.parseDouble(scanner.nextLine());
                areaOfFigure = length * width;
                break;
            case "circle":
                double radius = Double.parseDouble(scanner.nextLine());
                areaOfFigure = Math.PI * radius * radius;
                //areaOfFigure = Math.PI * Math.pow(radius, 2);
                break;
            case "triangle":
                double side = Double.parseDouble(scanner.nextLine());
                double height = Double.parseDouble(scanner.nextLine());
                areaOfFigure = (side * height) / 2;
                break;
        }

        System.out.printf("%.3f", areaOfFigure);
    }
}
