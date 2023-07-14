package pbExam6Date2And3May2019;

import java.util.Scanner;

public class P03MobileOperatorVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 4 реда:
        String durationOfContract = scanner.nextLine();        //Срок на договор – текст – "one", или "two"
        String typeOfContract = scanner.nextLine();       //Тип на договор – текст – "Small",  "Middle", "Large" или "ExtraLarge"
        String presenceOfInternetService = scanner.nextLine();       //Добавен мобилен интернет – текст – "yes" или "no"
        int numberOfMonths = Integer.parseInt(scanner.nextLine());      //Брой месеци за плащане - цяло число в интервала [1 … 24]

        double feePerMonth = 0;         //създаваме си променлива за месечната такса
        if (typeOfContract.equals("Small")) {
            if (durationOfContract.equals("one")) {
                feePerMonth = 9.98;
            } else if (durationOfContract.equals("two")) {
                feePerMonth = 8.58;
            }
        } else if (typeOfContract.equals("Middle")) {
            if (durationOfContract.equals("one")) {
                feePerMonth = 18.99;
            } else if (durationOfContract.equals("two")) {
                feePerMonth = 17.09;
            }
        } else if (typeOfContract.equals("Large")) {
            if (durationOfContract.equals("one")) {
                feePerMonth = 25.98;
            } else if (durationOfContract.equals("two")) {
                feePerMonth = 23.59;
            }
        } else if (typeOfContract.equals("ExtraLarge")) {
            if (durationOfContract.equals("one")) {
                feePerMonth = 35.99;
            } else if (durationOfContract.equals("two")) {
                feePerMonth = 31.79;
            }
        }


        //Ако не е добавен мобилен интернет, няма промяна в месечната такса - няма нужда да пишем това като проверка
        //При добавен мобилен интернет, към таксата за един месец се добавя:
        if (presenceOfInternetService.equals("yes")) {
            if (feePerMonth <= 10.00) {         //при такса по-малка или равна на 10.00 лв.  5.50 лв.
                feePerMonth = feePerMonth + 5.50;
            } else if (feePerMonth <= 30.00) {       //else if (feePerMonth > 10.00 &&  feePerMonth <= 30.00)       //при такса по-малка или равна на 30.00 лв.  4.35 лв.
                feePerMonth = feePerMonth + 4.35;
            } else {       //else if (feePerMonth > 30)        //при такса по-голяма от 30.00 лв.  3.85 лв.
                feePerMonth = feePerMonth + 3.85;
            }
        }


        //намираме общата сума за определен брой месеци, прочетен от конзолата:
        double totalPriceForAllMonths = numberOfMonths * feePerMonth;

        //ако договорът e за две години, общата сума се намалява с 3.75%  -> това означава, че общата сума е 96.25% от общата сума
        if (durationOfContract.equals("two")) {
            totalPriceForAllMonths = totalPriceForAllMonths * 96.25 * 0.01;
        }

        //принтираме общата сума за всички месеци:
        System.out.printf("%.2f lv.", totalPriceForAllMonths);
    }
}
