package lecture16Exam2PreliminaryExam2023;

import java.util.Scanner;

public class P01PCStoreVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double processorUnitPriceUSD = Double.parseDouble(scanner.nextLine());    //цената в долари за процесора – реално число в интервала [200.00 … 3000.00]
        double videoCardUnitPriceUSD = Double.parseDouble(scanner.nextLine());       //цената в долари за видео карта – реално число в интервала [100.00 … 1500.00]
        double ramMemoryUnitPriceUSD = Double.parseDouble(scanner.nextLine());    //цената в долари за една RAM памет – реално число в интервала [80.00 ... 500.00]
        int numberOfRamMemories = Integer.parseInt(scanner.nextLine());         //брой RAM памети – цяло число в интервала [1 ... 4]
        double percentOfDiscount = Double.parseDouble(scanner.nextLine());      //процент отстъпка – реално число в интервала [0.01 … 0.1]

        //5 / 100 = 0.05      5%
        processorUnitPriceUSD = processorUnitPriceUSD - (processorUnitPriceUSD * percentOfDiscount);      //на променливата processorUnitPriceUSD присвояваме нова стойност
        videoCardUnitPriceUSD = videoCardUnitPriceUSD - (videoCardUnitPriceUSD * percentOfDiscount);

        double totalPriceUSD = processorUnitPriceUSD + videoCardUnitPriceUSD + (numberOfRamMemories * ramMemoryUnitPriceUSD);

        //1 долар = 1.57 лева
        double totalPriceBGN = totalPriceUSD * 1.57;
        System.out.printf("Money needed - %.2f leva.", totalPriceBGN);
    }
}
