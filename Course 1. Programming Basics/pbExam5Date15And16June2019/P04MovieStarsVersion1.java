package pbExam5Date15And16June2019;

import java.util.Scanner;

public class P04MovieStarsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата първо се чете един ред:
        double availableBudget = Double.parseDouble(scanner.nextLine());      //Бюджет за актьори - реално число в интервала [1000.0... 2 100 000.0]

        //След това се четат многократно (не знаем колко пъти -> имаме while цикъл)по един или два реда - до команда "ACTION" или до изчерпване на бюджета:
        String input = scanner.nextLine();
        while (!input.equals("ACTION")) {
            //на всяка итерация на цикъла четем име на текущия актьор
            String nameOfCurrentActor = input;      //•	Име на актьор - текст
            //Ако името на актьора съдържа по-малко или равно на 15 броя символи, от конзолата прочитаме възнаграждението му - реално число в интервала [250.0… 1 000 000.0]
            double remunerationOfCurrentActor;
            if (nameOfCurrentActor.length() <= 15) {
                remunerationOfCurrentActor = Double.parseDouble(scanner.nextLine());
            } else {          //else if (nameOfCurrentActor.length() > 15)
                remunerationOfCurrentActor = availableBudget * 20 / 100;         //Ако името на актьора е по-дълго от 15 символа, възнаграждението му ще е 20 % от останалия бюджет до момента
            }


            if (availableBudget <= remunerationOfCurrentActor) {         //Ако бюджетът в даден момент свърши, програмата трябва да прекъсне.
                double missingMoney = remunerationOfCurrentActor - availableBudget;      //намираме недостигащите пари
                System.out.printf("We need %.2f leva for our actors.", missingMoney);
                return;     //прекъсваме цялата програма (и няма да се изпълни нито един следващ ред - нито в цикъла, нито извън него)
            } else {        //else if (availableBudget > remunerationOfCurrentActor)      //Ако бюджетът е достатъчен, се плаща на текущия актьор и бюджетът намалява
                availableBudget -= remunerationOfCurrentActor;       //availableBudget = availableBudget - remunerationOfCurrentActor;      //намираме остатъка от наличния бюджет
            }


            input = scanner.nextLine();         //update
        }


        //щом програмата не е била прекъсната (компилаторът не е срещнал оператор return), значи все някога са получени входни данни "ACTION" и принтираме каква сума от бюджета е останала:
        System.out.printf("We are left with %.2f leva.", availableBudget);
    }
}