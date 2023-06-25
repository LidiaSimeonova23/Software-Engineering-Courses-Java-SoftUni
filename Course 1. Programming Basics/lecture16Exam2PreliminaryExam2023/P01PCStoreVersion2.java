package lecture16Exam2PreliminaryExam2023;

import java.util.Scanner;

public class P01PCStoreVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double processorUnitPriceUSD = Double.parseDouble(scanner.nextLine());    //цената в долари за процесора – реално число в интервала [200.00 … 3000.00]
        double videoCardUnitPriceUSD = Double.parseDouble(scanner.nextLine());       //цената в долари за видео карта – реално число в интервала [100.00 … 1500.00]
        double ramMemoryUnitPriceUSD = Double.parseDouble(scanner.nextLine());    //цената в долари за една RAM памет – реално число в интервала [80.00 ... 500.00]
        int numberOfRamMemories = Integer.parseInt(scanner.nextLine());         //брой RAM памети – цяло число в интервала [1 ... 4]
        double percentOfDiscount = Double.parseDouble(scanner.nextLine());      //процент отстъпка – реално число в интервала [0.01 … 0.1]

        //5 / 100 = 0.05      5%
        double unitPriceOfProcessorBGN = processorUnitPriceUSD * 1.57;
        double unitPriceOfProcessorAfterDiscountBGN = unitPriceOfProcessorBGN - (unitPriceOfProcessorBGN * percentOfDiscount);

        double unitPriceOfVideoCardBGN = videoCardUnitPriceUSD * 1.57;
        double unitPriceOfVideoCardAfterDiscountBGN = unitPriceOfVideoCardBGN - (unitPriceOfVideoCardBGN * percentOfDiscount);

        double unitPriceOfRamMemoryBGN = ramMemoryUnitPriceUSD * 1.57;

        double totalPriceBGN = unitPriceOfProcessorAfterDiscountBGN + unitPriceOfVideoCardAfterDiscountBGN + (numberOfRamMemories * unitPriceOfRamMemoryBGN);
        System.out.printf("Money needed - %.2f leva.", totalPriceBGN);
    }
}
