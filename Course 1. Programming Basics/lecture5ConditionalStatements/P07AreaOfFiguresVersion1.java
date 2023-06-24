package lecture5ConditionalStatements;

import java.util.Scanner;

public class P07AreaOfFiguresVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        double areaOfFigure = 0;   //създаваме си променлива (с начална стойност 0) за лицето на фигурата (след това ще й присвояваме друга стойност в зависимост от това какъв тип е фигурата)
        if (figure.equals("square")) {
            double sideOfSquare = Double.parseDouble(scanner.nextLine());
            //areaOfFigure = sideOfSquare * sideOfSquare;
            areaOfFigure = Math.pow(sideOfSquare, 2);
        } else if (figure.equals("rectangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            areaOfFigure = length * width;
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            //areaOfFigure = Math.PI * radius * radius;
            areaOfFigure = Math.PI * Math.pow(radius, 2);
        } else if (figure.equals("triangle")) {
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            areaOfFigure = (side * height) / 2;
        }

        System.out.printf("%.3f", areaOfFigure);
    }
}
