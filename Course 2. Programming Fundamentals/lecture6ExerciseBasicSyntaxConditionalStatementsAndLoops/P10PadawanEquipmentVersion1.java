package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P10PadawanEquipmentVersion1 {
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

        //броят мечове би трябвало да е int, но става дума за проценти (а освен това е дадено в условието, че трябва да закръгляме до най-близкото цяло по-голямо число), затова определяме променливата като double (вместо int)
        double numberOfSabers = numberOfStudents + (numberOfStudents * 1.0 * 10 / 100);
        numberOfSabers = Math.ceil(numberOfSabers);


        //дадено е, че всеки шести колан е безплатен - значи в зависимост от броя на учениците, трябва да знаем колко пъти ще имаме безплатен колан
        int freeBelts = numberOfStudents / 6;    //делим целочислено (а не модулно) брой ученици на 6, за да разберем колко пъти ще са безплатните колани (тоест, колко ще е броят на безплатните колани)
        int numberOfPaidBelts = numberOfStudents - freeBelts;    //намираме броя на коланите, които трябва да се платят (от броя на хората вадим безплатните колани)

        //намираме общата цена за всичкото оборудване, което трябва да се купи
        double totalPriceOfEquipment = (numberOfSabers * saberPrice) + (numberOfStudents * robePrice) + (numberOfPaidBelts * beltPrice);
        //написах numberOfStudents * robePrice защото  робите, които трябва да се купят, са толкова, колкото са и учениците -> брой роби = брой ученици

        //проверяваме (и принтираме) дали парите, с които Джордж разполага, са достатъчни, или не:
        if (availableMoney >= totalPriceOfEquipment) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPriceOfEquipment);
        } else {          //else if (availableMoney < totalPriceOfEquipment)
            double differenceInMoney = Math.abs(availableMoney - totalPriceOfEquipment);     //  може да се запише и така double neededMoney = totalPriceOfEquipment - availableMoney;
            System.out.printf("George Lucas will need %.2flv more.", differenceInMoney);
        }


    }
}
