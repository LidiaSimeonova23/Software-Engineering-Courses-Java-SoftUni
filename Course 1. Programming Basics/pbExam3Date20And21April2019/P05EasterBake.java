package pbExam3Date20And21April2019;

import java.util.Scanner;

public class P05EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се чете 1 ред:
        int numberOfEasterLoavesOfBread = Integer.parseInt(scanner.nextLine());      //Броят на козунаците – цяло число в интервала [1 ... 100]


        //За всеки козунак се чете количество използвана захар и брашно  -> знаем колко са козунаците -> имаме for цикъл
        int totalQuantityOfSugarInGrams = 0;
        int totalQuantityOfFlourInGrams = 0;
        int maxSugar = Integer.MIN_VALUE;       //в случая може и това:  int maxSugar = 0;
        int maxFlour = Integer.MIN_VALUE;       //в случая може и това:  int maxFlour = 0;
        for (int currentLoafOfBread = 1; currentLoafOfBread <= numberOfEasterLoavesOfBread; currentLoafOfBread++) {
            int gramsOfSugarForCurrentBread = Integer.parseInt(scanner.nextLine());      //Количество изразходвана захар (грамове) – цяло число в интервала [1 … 10000]
            int gramsOfFlourForCurrentBread = Integer.parseInt(scanner.nextLine());      //Количество изразходвано брашно (грамове) – цяло число в интервала [1 … 10000]

            totalQuantityOfSugarInGrams = totalQuantityOfSugarInGrams + gramsOfSugarForCurrentBread;       //намираме общата захар в грамове за всички козунаци
            totalQuantityOfFlourInGrams = totalQuantityOfFlourInGrams + gramsOfFlourForCurrentBread;       //намираме общото брашно в грамове за всички козунаци

            //чрез проверка намираме най-голямото количество захар
            if (gramsOfSugarForCurrentBread > maxSugar) {
                maxSugar = gramsOfSugarForCurrentBread;
            }

            //чрез проверка намираме най-голямото количество брашно
            if (gramsOfFlourForCurrentBread > maxFlour) {
                maxFlour = gramsOfFlourForCurrentBread;
            }

        }


        //Пакетите захар и брашно да бъдат закръглени към най-близкото цяло число нагоре.   -> променливите за пакетите трябва да са от тип double
        //Един пакет захар е 950 грама.
        double numberOfPackagesOfSugar = totalQuantityOfSugarInGrams * 1.0 / 950;
        numberOfPackagesOfSugar = Math.ceil(numberOfPackagesOfSugar);
        //Един пакет брашно е 750 грама.
        double numberOfPackagesOfFlour = totalQuantityOfFlourInGrams * 1.0 / 750;
        numberOfPackagesOfFlour = Math.ceil(numberOfPackagesOfFlour);

        System.out.printf("Sugar: %.0f%n", numberOfPackagesOfSugar);
        System.out.printf("Flour: %.0f%n", numberOfPackagesOfFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
