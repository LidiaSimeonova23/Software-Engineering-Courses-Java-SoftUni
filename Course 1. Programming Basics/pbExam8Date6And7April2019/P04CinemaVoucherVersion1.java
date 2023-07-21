package pbExam8Date6And7April2019;

import java.util.Scanner;

public class P04CinemaVoucherVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Първоначално се чете един ред:
        int valueOfVoucher = Integer.parseInt(scanner.nextLine());    //Стойността на ваучера (първоначална налична сума) – цяло число в интервала [1…100000]

        //След това до получаване на команда "End" или до изчерпването на ваучера (не знаем колко повторения ще има -> ползваме while цикъл), се чете по един ред:
        int numberOfBoughtTickets = 0;       //създаваме си променлива за брой купени билети
        int numberOfBoughtOtherPurchases = 0;        //създаваме си променлива за брой купени други покупки (различни от билети)

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String currentChosenPurchase = input;      //Покупката, която Любо е избрал – текст


            int priceOfCurrentPurchase = 0;      //създаваме си променлива за цената на текущата дума
            if (currentChosenPurchase.length() > 8) {        //Ако името на покупката съдържа повече от 8 символа, то тя е билет за филм, а нейната цена представлява сумата на ASCII символите от първите ѝ два символа.
                priceOfCurrentPurchase = (int) currentChosenPurchase.charAt(0) + (int) currentChosenPurchase.charAt(1);       //намираме цената на текущата покупка (цената на филма)
                            //currentChosenPurchase.charAt(0) е първият символ от текущата покупка       //currentChosenPurchase.charAt(1) е вторият символ от текущата покупка

                //второ условие за приключване на програмата -> при покупка, чиято стойност е по-голяма от останалите пари от ваучера
                if (valueOfVoucher < priceOfCurrentPurchase) {
                    System.out.printf("%d%n", numberOfBoughtTickets);
                    System.out.printf("%d", numberOfBoughtOtherPurchases);
                    return;        //прекъсваме цялата програма (и няма да се изпълни нито един следващ ред от кода)
                }

                //броят на купените билети се увеличава с единица
                numberOfBoughtTickets++;             //numberOfBoughtTickets = numberOfBoughtTickets + 1;         //numberOfBoughtTickets += 1;
            } else {       //else if (currentChosenPurchase.length() <= 8)           //Ако името на покупката съдържа 8 или по-малко символа, нейната цена е равна на стойността на първия ASCII символ в името.
                priceOfCurrentPurchase = (int) currentChosenPurchase.charAt(0);       //намираме цената на текущата покупка

                //второ условие за приключване на програмата -> при покупка, чиято стойност е по-голяма от останалите пари от ваучера
                if (valueOfVoucher < priceOfCurrentPurchase) {
                    System.out.printf("%d%n", numberOfBoughtTickets);
                    System.out.printf("%d", numberOfBoughtOtherPurchases);
                    return;         //прекъсваме цялата програма (и няма да се изпълни нито един следващ ред от кода)
                }

                //броят на купените други покупки (различни от билети) се увеличава с единица
                numberOfBoughtOtherPurchases++;            //numberOfBoughtOtherPurchases = numberOfBoughtOtherPurchases + 1;       //numberOfBoughtOtherPurchases += 1;
            }

            //намираме наличната сума, която е останала във ваучера след извършените покупки
            valueOfVoucher -= priceOfCurrentPurchase;     //valueOfVoucher = valueOfVoucher - priceOfCurrentPurchase;


            input = scanner.nextLine();       //update
        }

        //ако компилаторът не е срещнал оператор return, все някога входните данни са станали "End" и се принтират следните два реда:
        System.out.printf("%d%n", numberOfBoughtTickets);
        System.out.printf("%d", numberOfBoughtOtherPurchases);
    }
}
