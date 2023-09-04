package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P09CenturiesToMinutesVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte centuries = Byte.parseByte(scanner.nextLine());    //от конзолата прочитаме едно цяло число за броя на вековете
        //можехме да си ползваме int centuries = Integer.parseInt(scanner.nextLine());

        //трябва да превръщаме вековете в години, годините в дни, дните в часове, часовете в минути ->
        //по условие е дадено, че 1 година = 365.2422 дни (the Tropical year).   -> тоест, един от множителите ни ще е реално (дробно/десетично) число -> резултатът също ще е реално число (double)

        double years = centuries * 100;    // 1 век = 100 години
        double days = years * 365.2422;    //по условие е дадено, че 1 година = 365.2422 дни (the Tropical year)
        double hours = days * 24;       //1 ден = 24 часа
        double minutes = hours * 60;    // 1 час = 60 минути

        //принтираме  резултатите, форматирани до 0 знака след десетичната точка (тоест, само цялата част):
        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hours, minutes);
    }
}
