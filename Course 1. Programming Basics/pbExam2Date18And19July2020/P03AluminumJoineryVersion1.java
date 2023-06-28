package pbExam2Date18And19July2020;

import java.util.Scanner;

public class P03AluminumJoineryVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата се четат 3 реда:
        int numberOfJoineries = Integer.parseInt(scanner.nextLine());   //Брой дограми – цяло число в интервала [0..1000];
        String typeOfJoineries = scanner.nextLine();   //Вид на дограмите – текст "90X130" или "100X150" или "130X180" или "200X300";
        String shipmentMethod = scanner.nextLine();   //Начин на получаване – текст с възможности: с доставка - "With delivery" или без доставка - "Without delivery"

        //При поръчка под 10 бр. на конзолата да бъде изписано "Invalid order" и да се прекъсне програмата
        if (numberOfJoineries < 10) {
            System.out.println("Invalid order");
            return;       //прекъсваме цялата програма
        }

        //ако поръчката не е била под 10 броя, значи програмата не е прекъсната -> следователно, изпълняваме си действията така, както е описано в задачата
        double unitPriceOf1Joinery = 0;
        switch (typeOfJoineries) {
            case "90X130":
                unitPriceOf1Joinery = 110;

                if (numberOfJoineries > 30 && numberOfJoineries <= 60) {     // Над 30 броя – 5% отстъпка от цената
                    unitPriceOf1Joinery = unitPriceOf1Joinery - (unitPriceOf1Joinery * 5 / 100);
                } else if (numberOfJoineries > 60) {         // Над 60 броя – 8% отстъпка от цената
                    unitPriceOf1Joinery = unitPriceOf1Joinery - (unitPriceOf1Joinery * 8 / 100);
                }

                break;
            case "100X150":
                unitPriceOf1Joinery = 140;

                if (numberOfJoineries > 40 && numberOfJoineries <= 80) {        // Над 40 броя – 6% отстъпка от цената
                    unitPriceOf1Joinery = unitPriceOf1Joinery - (unitPriceOf1Joinery * 6 / 100);
                } else if ((numberOfJoineries > 80)) {        // Над 80 броя – 10% отстъпка от цената
                    unitPriceOf1Joinery = unitPriceOf1Joinery - (unitPriceOf1Joinery * 10 / 100);
                }

                break;
            case "130X180":
                unitPriceOf1Joinery = 190;

                if (numberOfJoineries > 20 && numberOfJoineries <= 50) {        // Над 20 броя – 7% отстъпка от цената
                    unitPriceOf1Joinery = unitPriceOf1Joinery - (unitPriceOf1Joinery * 7 / 100);
                } else if ((numberOfJoineries > 50)) {        // Над 50 броя – 12% отстъпка от цената
                    unitPriceOf1Joinery = unitPriceOf1Joinery - (unitPriceOf1Joinery * 12 / 100);
                }

                break;
            case "200X300":
                unitPriceOf1Joinery = 250;

                if (numberOfJoineries > 25 && numberOfJoineries <= 50) {        // Над 25 броя – 9% отстъпка от цената
                    unitPriceOf1Joinery = unitPriceOf1Joinery - (unitPriceOf1Joinery * 9 / 100);
                } else if ((numberOfJoineries > 50)) {        // Над 50 броя – 14% отстъпка от цената
                    unitPriceOf1Joinery = unitPriceOf1Joinery - (unitPriceOf1Joinery * 14 / 100);
                }

                break;
        }

        //намираме цената на всички поръчани дограми
        double totalPriceOfAllJoineries = numberOfJoineries * unitPriceOf1Joinery;

        //Фирмата предлага също и доставка на поръчките си срещу 60 лв.
        double finalPrice = 0;
        switch (shipmentMethod) {
            case "With delivery":
                finalPrice = totalPriceOfAllJoineries + 60;
                break;
            case "Without delivery":
                finalPrice = totalPriceOfAllJoineries;
                break;
        }

        //Ако поръчката надвишава 99 броя  – върху крайната цена се начисляват допълнителни 4% отстъпка (след като се начисли цената за доставка, ако има такава).
        if (numberOfJoineries > 99) {
            finalPrice = finalPrice - (finalPrice * 4 / 100);
        }


        System.out.printf("%.2f BGN", finalPrice);
    }
}
