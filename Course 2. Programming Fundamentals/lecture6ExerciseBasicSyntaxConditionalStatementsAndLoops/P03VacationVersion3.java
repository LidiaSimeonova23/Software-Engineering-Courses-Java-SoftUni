package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P03VacationVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You are given a group of people, type of the group, on which day of the week they will stay.
        //Based on that information, calculate how much they must pay and print that price on the console.
        //Use the table below. In each cell is the price for a single person.
        //The output should look like that: "Total price: {price}". The price should be formatted to the second decimal point.

        //There are also discounts based on some conditions:
        //•	Students – if the group is bigger than or equal to 30 people, you should reduce the total price by 15%.
        //•	Business – if the group is bigger than or equal to 100 people, 10 of them can stay for free.
        //•	Regular – if the group is bigger than or equal to 10 and less than or equal to 20, reduce the total price by 5%.

        int numberOfPeople = Integer.parseInt(scanner.nextLine());       //брой хора в дадената група
        String typeOfGroup = scanner.nextLine();   //вида на групата  (Students / Business / Regular)
        String dayOfWeek = scanner.nextLine();   //кой ден от седмицата ще отседне групата (Friday / Saturday /	Sunday)

        //вложени проверки - ако влезем в главното условие, проверяваме подусловията - намираме единичната цена, като я умножим по брой хора - намираме общата цена, после правим проверка - ако отговаря на определен брой хора, може да има отстъпка от цената и в такъв случай крайната цена е равна на крайната цена минус отстъпката (а отстъпката е процент от крайната цена)
        double priceFor1Person = 0;        //създаваме си променлива за цената на нощувката за 1 човек
        double totalPrice = 0;      //създаваме си променлива за цената на нощувката за всички хора (за цялата група)
        if (dayOfWeek.equals("Friday")) {
            if (typeOfGroup.equals("Students")) {
                priceFor1Person = 8.45;
                totalPrice = numberOfPeople * priceFor1Person;
                if (numberOfPeople >= 30) {
                    totalPrice = totalPrice - (totalPrice * 15 / 100);
                }
            } else if (typeOfGroup.equals("Business")) {
                priceFor1Person = 10.90;
                totalPrice = numberOfPeople * priceFor1Person;
                if (numberOfPeople >= 100) {
                    totalPrice = totalPrice - (10 * priceFor1Person);        // totalPrice = (numberOfPeople - 10) * priceFor1Person;
                }
            } else if (typeOfGroup.equals("Regular")) {
                priceFor1Person = 15;
                totalPrice = numberOfPeople * priceFor1Person;
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    totalPrice = totalPrice - (totalPrice * 5 / 100);
                }
            }
        } else if (dayOfWeek.equals("Saturday")) {
            if (typeOfGroup.equals("Students")) {
                priceFor1Person = 9.80;
                totalPrice = numberOfPeople * priceFor1Person;
                if (numberOfPeople >= 30) {
                    totalPrice = totalPrice - (totalPrice * 15 / 100);
                }
            } else if (typeOfGroup.equals("Business")) {
                priceFor1Person = 15.60;
                totalPrice = numberOfPeople * priceFor1Person;
                if (numberOfPeople >= 100) {
                    totalPrice = totalPrice - (10 * priceFor1Person);        // totalPrice = (numberOfPeople - 10) * priceFor1Person;
                }
            } else if (typeOfGroup.equals("Regular")) {
                priceFor1Person = 20;
                totalPrice = numberOfPeople * priceFor1Person;
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    totalPrice = totalPrice - (totalPrice * 5 / 100);
                }
            }
        } else if (dayOfWeek.equals("Sunday")) {
            if (typeOfGroup.equals("Students")) {
                priceFor1Person = 10.46;
                totalPrice = numberOfPeople * priceFor1Person;
                if (numberOfPeople >= 30) {
                    totalPrice = totalPrice - (totalPrice * 15 / 100);
                }
            } else if (typeOfGroup.equals("Business")) {
                priceFor1Person = 16;
                totalPrice = numberOfPeople * priceFor1Person;
                if (numberOfPeople >= 100) {
                    totalPrice = totalPrice - (10 * priceFor1Person);        // totalPrice = (numberOfPeople - 10) * price;
                }
            } else if (typeOfGroup.equals("Regular")) {
                priceFor1Person = 22.50;
                totalPrice = numberOfPeople * priceFor1Person;
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    totalPrice = totalPrice - (totalPrice * 5 / 100);
                }
            }
        }


        System.out.printf("Total price: %.2f", totalPrice);   //принтираме крайната цена за съответната група от хора (за 1 нощувка)
    }
}
