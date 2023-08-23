package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P10PadawanEquipmentVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableMoney = Double.parseDouble(scanner.nextLine());    //парите, с които Джордж разполага
        int numberOfStudents = Integer.parseInt(scanner.nextLine());    //брой ученици
        double saberPrice = Double.parseDouble(scanner.nextLine());    //цената на 1 меч
        double robePrice = Double.parseDouble(scanner.nextLine());       //цената на 1 роба
        double beltPrice = Double.parseDouble(scanner.nextLine());     //цената на 1 колан

        //Джордж трябва да купи мечове, роби и колани за всички ученици, които тренират

        //в идеалния случай Джордж трябва да купи толкова мечове, колкото са учениците - но в случая не е така
        //понеже мечовете понякога се чупят, Джордж трябва да купи 10% повече (отколкото са учениците), закръглено до следващото цяло число

        //намираме цената на всички мечове - първо изчисляваме броя на мечовете и после умножаваме този брой по единичната цена
        //броят мечове би трябвало да е int, но по условие трябва да го закръглим, затова ще е double (само double може да се закръгля)
        double priceOfAllSabers = (Math.ceil(numberOfStudents + (numberOfStudents * 10 * 0.01))) * saberPrice;

        //намираме цената на робите - умножаваме броя им (а той е равен на броя на учениците) по единичната цена
        double priceOfAllRobes = numberOfStudents * robePrice;

        //намираме цената на коланите
        //делим целочислено (а не модулно) брой ученици на 6, за да разберем колко е броят на безплатните колани; след това от всичките колани (те са толкова, колкото са учениците) вадим безплатните, за да разберем колко са коланите, които трябва да се платят
        double priceOfAllBelts = (numberOfStudents - (numberOfStudents / 6)) * beltPrice;

        //намираме общата цена за всичкото оборудване, което трябва да се купи
        double totalPriceOfEquipment = priceOfAllSabers + priceOfAllRobes + priceOfAllBelts;  //намираме общата цена за всичкото оборудване, което трябва да се купи

        //проверяваме (и принтираме) дали парите, с които Джордж разполага, са достатъчни, или не:
        if (availableMoney >= totalPriceOfEquipment) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPriceOfEquipment);
        } else {        //if (availableMoney < totalPriceOfEquipment)
            System.out.printf("George Lucas will need %.2flv more.", totalPriceOfEquipment - availableMoney);
        }


    }
}
