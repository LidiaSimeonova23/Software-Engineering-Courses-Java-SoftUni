package lecture4ExerciseFirstStepsInCoding;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //по условие е дадено:
        //Предпазен найлон - 1.50 лв. за кв. метър
        //Боя - 14.50 лв. за литър
        //Разредител за боя - 5.00 лв. за литър
        //0.40 лв. за торбички

        int nylonInSquareMeters = Integer.parseInt(scanner.nextLine());     //Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        int paintInLitres = Integer.parseInt(scanner.nextLine());        //Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        int diluentInLitres = Integer.parseInt(scanner.nextLine());     //Количество разредител (в литри) - цяло число в интервала [1…30]
        int workingHours = Integer.parseInt(scanner.nextLine());          //Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]

        double totalLitresOfPaint = paintInLitres + (paintInLitres * 10 * 0.01);    //Румен иска да добави още 10% от количеството боя
        int totalSquareMetersOfNylon = nylonInSquareMeters + 2;     //Румен иска да добави още 2 кв.м. найлон

        double priceOfMaterials = (totalSquareMetersOfNylon * 1.50) + (totalLitresOfPaint * 14.50) + (diluentInLitres * 5.00) + 0.40;

        double priceOf1WorkingHour = priceOfMaterials * 30 / 100;    //Сумата, която се заплаща на майсторите за 1 час работа, е равна на 30% от сбора на всички разходи за материали.
        double totalPriceOfAllWorkingHours = workingHours * priceOf1WorkingHour;

        double finalSumForMaterialsAndWork = priceOfMaterials + totalPriceOfAllWorkingHours;
        System.out.println(finalSumForMaterialsAndWork);
        //System.out.printf("%f", finalSumForMaterialsAndWork);
    }
}
