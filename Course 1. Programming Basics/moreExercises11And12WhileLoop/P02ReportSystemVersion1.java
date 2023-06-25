package moreExercises11And12WhileLoop;

import java.util.Scanner;

public class P02ReportSystemVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetedSum = Integer.parseInt(scanner.nextLine());     //Сумата, която се очаква да бъде събрана от продажбите - цяло число в интервала [1 ... 10000]

        //плащанията за закупените продукти винаги се редуват: плащане в брой и плащане с карта. Установени са следните правила за плащане:
        //•	Ако продуктът надвишава 100 лв., за него не може да се плати в брой
        //•	Ако продуктът е на цена под 10 лв., за него не може да се плати с кредитна карта

        int payment = 0;
        String typeOfPayment = "";
        int numberOfPaymentsInCash = 0;
        int numberOfPaymentsWithCreditCard = 0;
        boolean isPaymentSuccessful = true;
        int totalGatheredSum = 0;

        int totalSumPaidInCash = 0;
        int totalSumPaidWithCreditCard = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int priceOfCurrentStuff = Integer.parseInt(input);     //На всеки следващ ред, до получаване на командата "End" или докато не се съберат нужните средства: цените на предметите, които ще бъдат закупени - цяло число в интервала [1 ... 500]

            payment++;         //payment = payment + 1;       //payment += 1;

            if (payment % 2 != 0) {         //if (payment % 2 == 1)       //ако плащането е нечетно поред (първо, трето, пето и т. нат.) - значи трябва да е в брой
                typeOfPayment = "cash";
            } else {            //if (payment % 2 == 0)             //ако плащането е четно поред (второ, четвърто, шесто и т. нат.) - значи трябва да е в брой
                typeOfPayment = "credit card";
            }

            if (priceOfCurrentStuff > 100 && typeOfPayment.equals("cash")) {        //Ако продуктът надвишава 100 лв., за него не може да се плати в брой
                isPaymentSuccessful = false;
                System.out.println("Error in transaction!");
            } else if (priceOfCurrentStuff < 10 && typeOfPayment.equals("credit card")) {        //Ако продуктът е на цена под 10 лв., за него не може да се плати с кредитна карта
                isPaymentSuccessful = false;
                System.out.println("Error in transaction!");
            } else {      //във всички останали случаи (когато цената на продукта е между 10 и 100 лв) плащането ще е винаги успешно
                System.out.println("Product sold!");
                totalGatheredSum = totalGatheredSum + priceOfCurrentStuff;  //намираме общата събрана сума
                if (payment % 2 != 0) {
                    numberOfPaymentsInCash++;       //намираме брой плащания в брой    //numberOfPaymentsInCash = numberOfPaymentsInCash + 1;     //numberOfPaymentsInCash += 1;
                    totalSumPaidInCash = totalSumPaidInCash + priceOfCurrentStuff;         //намираме общата сума на всички плащания в брой
                } else {         //if (payment % 2 == 0)
                    numberOfPaymentsWithCreditCard++;        //намираме брой плащания с кредитна карта
                    totalSumPaidWithCreditCard = totalSumPaidWithCreditCard + priceOfCurrentStuff;       //намираме общата сума на всички плащания с кредитна карта
                }
            }


            if (totalGatheredSum >= targetedSum) {     //ако събраната сума стане повече или равна на целевата сума, цикълът се прекъсва
                break;
            }

            input = scanner.nextLine();    //update-ваме входните данни (в противен случай всеки път ще четем само първия ред с входни данни и ще имаме безкраен цикъл)
        }


        double averagePaymentInCashPerPerson = totalSumPaidInCash * 1.0 / numberOfPaymentsInCash;     //намираме средно плащане в кеш на човек (намираме сбора на сумата в кеш и делим този сбор на брой плащания в кеш)
        double averagePaymentWithCreditCardPerPerson = totalSumPaidWithCreditCard * 1.0 / numberOfPaymentsWithCreditCard;     //намираме средно плащане с кредитна карта на човек
        if (totalGatheredSum >= targetedSum) {         //•	Ако сумата на всички закупени продукти надвиши или достигне очакваната сума
            System.out.printf("Average CS: %.2f%n", averagePaymentInCashPerPerson);
            System.out.printf("Average CC: %.2f", averagePaymentWithCreditCardPerPerson);
        }


        if (input.equals("End")) {      //•	При получаване на команда "End"
            System.out.println("Failed to collect required money for charity.");
        }


    }
}
