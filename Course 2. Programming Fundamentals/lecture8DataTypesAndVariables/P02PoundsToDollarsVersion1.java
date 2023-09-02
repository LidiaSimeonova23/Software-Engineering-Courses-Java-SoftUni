package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P02PoundsToDollarsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //convert British pounds to US dollars, formatted to the 3rd decimal point

        //в примерните входни данни са дадени цели числа, но знаем, че сумите (парите) почти винаги са дробни (реални) числа, затова ще си ги определим като реални числа
        //по принцип, когато имаме реални числа, ги определяме като double; но в този случай ни интересува прецизност само до 3-тия знак след десетичната точка - можем да ползваме float (вместо double)
        float pounds = Float.parseFloat(scanner.nextLine());

        //1 British Pound = 1.36 US Dollars
        float dollars = pounds * 1.36f;     //намираме доларите (като умножаваме паундите по стойността на 1 паунд в долари)
        System.out.printf("%.3f", dollars);    //принтираме стойността в долари
    }
}
