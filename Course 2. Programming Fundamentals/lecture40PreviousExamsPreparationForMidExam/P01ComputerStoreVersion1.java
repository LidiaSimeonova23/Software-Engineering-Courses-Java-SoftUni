package lecture40PreviousExamsPreparationForMidExam;

import java.util.Scanner;

public class P01ComputerStoreVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Докато входните данни са различни от "special" и "regular", ще четете входни данни, които ще са цени (без ДДС) -> ще ползваме while цикъл

        double totalPriceOfAllPartsWithoutTax = 0;    //създаваме си променлива за общата цена (без ДДС) на всички части на компютъра (с начална стойност 0/0.0)
        double totalValueOfTaxesOfAllParts = 0;        //създаваме си променлива за общата стойност на данъците (ДДС) на всички части на компютъра (с начална стойност 0/0.0)

        String input = scanner.nextLine();
        while (!input.equals("special") && !input.equals("regular")) {
            double priceOfCurrentPartWithoutTax = Double.parseDouble(input);      //на всяка итерация на цикъла ще четем цената (без ДДС) на текущата част за компютър

            //Ако прочетената цена не е положително число, да се принтира "Invalid price!" и да се прочете следващата цена.
            if (priceOfCurrentPartWithoutTax <= 0) {         //Ако прочетената цена е отрицателно число или 0
                System.out.println("Invalid price!");
                input = scanner.nextLine();       //update       //преди да прекъснем текущата итерация на цикъла, трябва да прочетем следващия ред с входни данни (иначе ще изпаднем в безкраен цикъл)
                continue;      //прекъсваме текущата итерация на цикъла (следващите редове от кода вътре в цикъла няма да се изпълнят) и преминаваме към следващата итерация
            }

            //намираме общата цена (без ДДС) на всички части на компютъра
            totalPriceOfAllPartsWithoutTax += priceOfCurrentPartWithoutTax;        //totalPriceOfAllPartsWithoutTax = totalPriceOfAllPartsWithoutTax + priceOfCurrentPartWithoutTax;      //на всяка итерация на цикъла към домоментната обща цена (без ДДС) на всички части на компютъра добавяме цената (без ДДС) на текущата част

            //данъкът на всяка част за компютъра е 20% от цената на тази част -> можем да изчислим стойността на данъка на текущата част
            double valueOfTaxOfCurrentPart = priceOfCurrentPartWithoutTax * 20 / 100;        //намираме стойността на данъка на текущата част
            //double valueOfTaxOfCurrentPart = priceOfCurrentPartWithoutTax * 20 * 0.01;

            //намираме стойността на ДДС (данъка) общо на всичките части на компютъра
            totalValueOfTaxesOfAllParts += valueOfTaxOfCurrentPart;      //totalValueOfTaxesOfAllParts = totalValueOfTaxesOfAllParts + valueOfTaxOfCurrentPart;     //на всяка итерация на цикъла към домоментната обща стойност на данъците на всички части на компютъра добавяме стойността на данъка на текущата част


            input = scanner.nextLine();       //update на входните данни (ако не го направим, ще изпаднем в безкраен цикъл)
        }


        //Ако общата цена на всички части на компютъра е 0, да се принтира "Invalid order!"
        //за проверката тук е най-подходящо да ползваме totalPriceOfAllPartsWithoutTax (а не totalPriceOfAllPartsWithTaxes) - ако цената без ДДС е 0, ясно е, че данъкът ще е 0, следователно и цената с ДДС също ще е 0
        //ако решим все пак за проверката да ползваме totalPriceOfAllPartsWithTaxes, ще имаме няколко излишни изчисления (а ние искаме да си ги спистим, тъй като са безсмислени)
        //МНОГО Е ВАЖНО ТАЗИ ПРОВЕРКА ДА Е ТОЧНО ТУК - ПРЕДИ ОСТАНАЛИТЕ ПРИНТИРАНИЯ - АКО УСЛОВИЕТО НА ТАЗИ ПРОВЕРКА Е ВЯРНО, ПРОСТО НЯМА ДА СЕ СТИГНЕ ДО СЛЕДВАЩИТЕ ПРИНТИРАНИЯ (КОЕТО Е ЦЕЛТА В СЛУЧАЯ)
        if (totalPriceOfAllPartsWithoutTax == 0) {
            System.out.println("Invalid order!");
            return;       //прекъсваме цялата програма (и няма да се изпълни нищо друго - нито вътре в цикъла, нито извън него
        }

        //принтиранията при валидни входни данни
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", totalPriceOfAllPartsWithoutTax);
        System.out.printf("Taxes: %.2f$%n", totalValueOfTaxesOfAllParts);
        System.out.println("-----------");

        //намираме общата цена (с ДДС) на всички части на компютъра
        double totalPriceOfAllPartsWithTaxes = totalPriceOfAllPartsWithoutTax + totalValueOfTaxesOfAllParts;
        //double totalPriceOfAllPartsWithTaxes = totalPriceOfAllPartsWithoutTax + (totalPriceOfAllPartsWithoutTax * 20 / 100);

        //Ако клиентът е специален, ще получи отстъпка 10% от общата цена (с ДДС) на всички части
        //тоест, първо трябва да сме намерили (направили сме го) общата цена (с ДДС) на всички части
        if (input.equals("special")) {
            totalPriceOfAllPartsWithTaxes = totalPriceOfAllPartsWithTaxes - (totalPriceOfAllPartsWithTaxes * 10 / 100);
            //totalPriceOfAllPartsWithTaxes = totalPriceOfAllPartsWithTaxes * 90 / 100;         //щом отстъпката е 10% от общата цена (с ДДС) на всички части, значи трябва да плати 90% от общата цена (с ДДС) на всички части
        }

        //още едно принтиране при валидни входни данни
        System.out.printf("Total price: %.2f$", totalPriceOfAllPartsWithTaxes);
    }
}
