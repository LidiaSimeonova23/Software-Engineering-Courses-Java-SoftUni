package lecture16Exam1RegularExam2022;

import java.util.Scanner;

public class P01RoomPainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 4 числа:
        int numberOfPaintCans = Integer.parseInt(scanner.nextLine());            //Броя кутии с боя – цяло число в интервала [1 … 10 000]
        int numberOfWallpaperRolls = Integer.parseInt(scanner.nextLine());          //Броя на ролките тапети – цяло число в интервала [1 ... 10 000]
        double priceOf1PairOfGloves = Double.parseDouble(scanner.nextLine());          //Цената за един чифт ръкавици – реално число  в интервала [0.00 ... 1000.00]
        double priceOf1Brush = Double.parseDouble(scanner.nextLine());          //Цената за една четка – реално число  в интервала [0.00 ... 2000.00]

        //цената на една кутия боя е 21.50 лв., а цената на една ролка тапет е 5.20 лв.

        //Вашата задача е да изчислите доставката на всички необходими продукти, която представлява 1 / 15 от общата цена на продуктите.


        double priceOfAllCansOfPaint = numberOfPaintCans * 21.50;   //намираме цената на боята (брой кутии с боя по единичната цена)
        double priceOfAllRollsOfWallpaper = numberOfWallpaperRolls * 5.20;   //намираме цената на тапетите (брой ролки по единичната цена)

        //Броят нужни ръкавици представлява 35% от броя на ролките тапети, закръглени нагоре.
        //брой чифт ръкавици трябва да е цяло число (чифт и половина няма) - обаче по условие трябва да се закръгля, а единствената променлива, която можем да закръгляме, е от тип double (освен това double може да е и реално, и цяло число)
        double numberOfPairsOfGloves = Math.ceil(numberOfWallpaperRolls * 35 * 0.01);   //намираме брой чифтове ръкавици
        double priceOfAllPairsOfGloves = numberOfPairsOfGloves * priceOf1PairOfGloves;   //намираме цената на всички ръкавици (брой чифтове по единична цена за чифт)

        //броят на нужните четки е 48% от броя на кутиите боя, закръглени надолу
        //брой четки трябва да е цяло число (четка и половина няма) - обаче по условие трябва да се закръгля, а единствената променлива, която можем да закръгляме, е от тип double (освен това double може да е и реално, и цяло число)
        double numberOfBrushes = Math.floor(numberOfPaintCans * 48 * 0.01);   //намираме брой четки
        double priceOfAllBrushes = numberOfBrushes * priceOf1Brush;    //намираме цената на четките (брой четки по единична цена)

        double totalSumOfAllProducts = priceOfAllCansOfPaint + priceOfAllRollsOfWallpaper + priceOfAllPairsOfGloves + priceOfAllBrushes;  //намираме общата сума/цена за боята, тапетите, ръкавиците и четките

        double priceOfDelivery = totalSumOfAllProducts * 1 / 15;   //намираме цената на доставката
        System.out.printf("This delivery will cost %.2f lv.", priceOfDelivery);   //принтираме цената за доставката
    }
}
