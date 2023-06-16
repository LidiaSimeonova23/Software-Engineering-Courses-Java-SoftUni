package lecture13DefiningClasses.p03BankAccount;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bankAccountsMap = new HashMap<>();

        while (true) {
            String[] inputPartsArray = scanner.nextLine().split(" ");      //String[] inputPartsArray = scanner.nextLine().split("\\s+");
            if ("end".equalsIgnoreCase(inputPartsArray[0])) {
                break;
            }

            switch (inputPartsArray[0]) {       //проверките ще правим спрямо първия елемент (който е на индекс 0) от прочетения масив
                case "Create":
                    createBankAccount(bankAccountsMap);   //извикваме си метода, който създадохме извън main метода, но в рамките на класа
                    break;
                case "Deposit":
                    depositSum(Integer.parseInt(inputPartsArray[1]), Double.parseDouble(inputPartsArray[2]), bankAccountsMap);
                    break;
                case "SetInterest":
                    setInterest(Double.parseDouble(inputPartsArray[1]));
                    break;
                case "GetInterest":
                    getInterest(Integer.parseInt(inputPartsArray[1]), Integer.parseInt(inputPartsArray[2]), bankAccountsMap);
                    break;
            }
        }

    }


    //създаваме си 4 отделни метода, които ще извикваме в main метода, когато ни потрябват:

    private static void createBankAccount(Map<Integer, BankAccount> bankAccountsMap) {
        BankAccount ba = new BankAccount();
        bankAccountsMap.put(ba.getId(), ba);
        System.out.println("Account ID" + ba.getId() + " created");
    }


    private static void depositSum(int id, double amount, Map<Integer, BankAccount> bankAccountsMap) {
        if (bankAccountsMap.containsKey(id)) {
            bankAccountsMap.get(id).deposit(amount);
            System.out.printf("Deposited %.0f to ID%d%n", amount, id);
        } else {
            System.out.println("Account does not exist");
        }
    }


    private static void setInterest(double interest) {
        BankAccount.setInterestRate(interest);
    }


    private static void getInterest(int id, int years, Map<Integer, BankAccount> bankAccountsMap) {
        if (bankAccountsMap.containsKey(id)) {
            System.out.printf("%.2f%n", bankAccountsMap.get(id).getInterestRate(years));
        } else {
            System.out.println("Account does not exist");
        }
    }

}
