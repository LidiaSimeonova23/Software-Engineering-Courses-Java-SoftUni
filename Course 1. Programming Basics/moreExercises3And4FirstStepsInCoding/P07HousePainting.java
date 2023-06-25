package moreExercises3And4FirstStepsInCoding;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double x = Double.parseDouble(scanner.nextLine());     //x – височината на къщата – реално число в интервала [2...100]
        double y = Double.parseDouble(scanner.nextLine());     //y – дължината на страничната стена – реално число в интервала [2...100]
        double h = Double.parseDouble(scanner.nextLine());     //h – височината на триъгълната стена на прокрива – реално число в интервала [2...100]

        double areaOfSideWall = x * y;

        //o	и на двете странични стени има по един квадратен прозорец със страна 1.5 м
        double areaOfWindow = 1.5 * 1.5;

        double areaForPaintingOfSideWall = areaOfSideWall - areaOfWindow;

        double areaForPaintingOf2SideWalls = 2 * areaForPaintingOfSideWall;

        double areaOfBackWall = x * x;

        //на предната стена има правоъгълна врата с широчина 1.2 м и височина 2 м
        double areaOfDoor = 1.2 * 2;

        double areaOfFrontWall = areaOfBackWall - areaOfDoor;

        double areaForPaintingOfFrontAndBackWall = areaOfFrontWall + areaOfBackWall;

        double totalAreaForPaintingWithGreenPaint = areaForPaintingOf2SideWalls + areaForPaintingOfFrontAndBackWall;

        //Разходът на зелената боя е 1 литър за 3.4 м2
        double litersOfGreenPaint = totalAreaForPaintingWithGreenPaint / 3.4;

        double areaOfRectangularWallOfRoof = x * y;
        double areaOfTriangularWallOfRoof = x * h / 2;


        double totalAreaForPaintingWithRedPaint = (areaOfRectangularWallOfRoof * 2) + (areaOfTriangularWallOfRoof * 2);

        //Разходът на червената боя – 1 литър за 4.3 м2.
        double litersOfRedPaint = totalAreaForPaintingWithRedPaint / 4.3;

        System.out.printf("%.2f%n", litersOfGreenPaint);
        System.out.printf("%.2f", litersOfRedPaint);
    }
}
