package lecture4ExerciseFirstStepsInCoding;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int periodInMonths = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());

        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

        double totalSum = deposit + periodInMonths * ((deposit * annualInterestRate / 100) / 12);
        System.out.println(totalSum);
        //System.out.println(deposit + periodInMonths * ((deposit * annualInterestRate / 100) / 12));
    }
}
