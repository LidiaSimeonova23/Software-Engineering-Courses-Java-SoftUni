package pbExam8Date6And7April2019;

import java.util.Scanner;

public class P04CinemaVoucherVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Първоначално се чете един ред:
        int valueOfVoucher = Integer.parseInt(scanner.nextLine());    //Стойността на ваучера (първоначална налична сума) – цяло число в интервала [1…100000]

        //След това до получаване на команда "End" или до изчерпването на ваучера, се чете по един ред:
        int numberOfBoughtTickets = 0;       //създаваме си променлива за брой купени билети
        int numberOfBoughtOtherPurchases = 0;        //създаваме си променлива за брой купени други покупки (различни от билети)

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String currentChosenPurchase = input;      //Покупката, която Любо е избрал – текст

            //намираме дължината (брой символи) на текущата покупка
            int lengthOfCurrentChosenPurchase = currentChosenPurchase.length();

            char firstSymbolOfCurrentPurchase = currentChosenPurchase.charAt(0);      //намираме първия символ от текущата покупка
            if (lengthOfCurrentChosenPurchase > 8) {        //Ако името на покупката съдържа повече от 8 символа, то тя е билет за филм, а нейната цена представлява сумата на ASCII символите от първите ѝ два символа.
                char secondSymbolOfCurrentPurchase = currentChosenPurchase.charAt(1);      //намираме втория символ от текущата покупка  (символите имат целочислени стойности, следователно техният сбор е цяло число)
                int priceOf1TicketForFilm = (int) firstSymbolOfCurrentPurchase + (int) secondSymbolOfCurrentPurchase;       //намираме цената на текущата покупка (цената на филма)

                //второ условие за приключване на програмата -> при покупка, чиято стойност е по-голяма от останалите пари от ваучера
                if (valueOfVoucher < priceOf1TicketForFilm) {
                    System.out.printf("%d%n", numberOfBoughtTickets);
                    System.out.printf("%d", numberOfBoughtOtherPurchases);
                    return;        //прекъсваме цялата програма (и няма да се изпълни нито един следващ ред от кода)
                }

                //броят на купените билети се увеличава с единица
                numberOfBoughtTickets++;             //numberOfBoughtTickets = numberOfBoughtTickets + 1;         //numberOfBoughtTickets += 1;

                //намираме наличната сума, която е останала във ваучера след извършената покупка
                valueOfVoucher -= priceOf1TicketForFilm;     //valueOfVoucher = valueOfVoucher - priceOf1TicketForFilm;
            } else {       //else if (lengthOfCurrentChosenPurchase <= 8)           //Ако името на покупката съдържа 8 или по-малко символа, нейната цена е равна на стойността на първия ASCII символ в името.
                double priceOfOtherPurchase = (int) firstSymbolOfCurrentPurchase;       //намираме цената на текущата покупка

                //второ условие за приключване на програмата -> при покупка, чиято стойност е по-голяма от останалите пари от ваучера
                if (valueOfVoucher < priceOfOtherPurchase) {
                    System.out.printf("%d%n", numberOfBoughtTickets);
                    System.out.printf("%d", numberOfBoughtOtherPurchases);
                    return;         //прекъсваме цялата програма (и няма да се изпълни нито един следващ ред от кода)
                }

                //броят на купените други покупки (различни от билети) се увеличава с единица
                numberOfBoughtOtherPurchases++;            //numberOfBoughtOtherPurchases = numberOfBoughtOtherPurchases + 1;       //numberOfBoughtOtherPurchases += 1;

                //намираме наличната сума, която е останала във ваучера след извършената покупка
                valueOfVoucher -= priceOfOtherPurchase;     //valueOfVoucher = valueOfVoucher - priceOfOtherPurchase;
            }

            input = scanner.nextLine();       //update
        }

        //ако компилаторът не е срещнал оператор return, все някога входните данни са станали "End" и се принтират следните два реда:
        System.out.printf("%d%n", numberOfBoughtTickets);
        System.out.printf("%d", numberOfBoughtOtherPurchases);
    }
}
