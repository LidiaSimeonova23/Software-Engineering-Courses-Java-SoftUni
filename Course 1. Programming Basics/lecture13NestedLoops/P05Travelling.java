package lecture13NestedLoops;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();          //в началото пишем, че входните данни са текст, защото са от различен тип
        while (!input.equals("End")) {                 //докато входните данни са различни от End, цикълът ще се върти - тя ще събира пари
            String destination = input;             //Щом входните данни са текст, но различен от end, значи са дестинация
            double necessaryBudget = Double.parseDouble(scanner.nextLine());       //ако входните данни не са текст, превърни ги в реално число

            double totalSum = 0;                  //създаваме си променлива за събраната сума с нач. стойност 0 - създаваме я тук, за да ни се трупа сумата само за конкретната дестинация (ако я създадем над външния цикъл, ще ни се трупа сумата за всичките дестинации)
            while (totalSum < necessaryBudget) {                        //докато събраната сума е по-малко от нужната, ще продължава да събира - цикълът ще се върти
                double currentAmount = Double.parseDouble(scanner.nextLine());     //на всяко завъртане на цикъла да се четат входни данни - за събраната сума
                totalSum += currentAmount;         //изчисляваме събраната сума   totalSum = totalSum + currentAmount;
            }

            System.out.printf("Going to %s!%n", destination);

            input = scanner.nextLine();         //update - подканяме скенера да чете следващия ред (иначе ще чете само първия ред и ще имаме безкраен цикъл)
        }

    }
}

