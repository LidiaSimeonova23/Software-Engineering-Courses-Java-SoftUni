package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P02PoundsToDollarsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //convert British pounds to US dollars, formatted to the 3rd decimal point

        double pounds = Double.parseDouble(scanner.nextLine());      //British pounds

        //1 British Pound = 1.36 US Dollars   ->
        double dollars = pounds * 1.36;
        System.out.printf("%.3f", dollars);
    }
}
