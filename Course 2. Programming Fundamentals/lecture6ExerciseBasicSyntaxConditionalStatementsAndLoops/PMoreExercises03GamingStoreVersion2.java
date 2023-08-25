package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PMoreExercises03GamingStoreVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());          //от първия ред на конзолата четем реално число - текущ баланс (наличните пари)

        //докато входните данни са различни от "Game Time", ще четем входни данни (игри) - не знаем колко пъти -> имаме while цикъл
        double totalSpentMoney = 0;     //създаваме си допълнителна променлива за общо похарчените пари за всички купени книги
        String input = scanner.nextLine();
        while (!input.equals("Game Time")) {
            String currentGame = input;     //на всяка итерация на цикъла ще четем име на текуща игра

            //има два варианта за текущата игра - да е валидна (ако е някоя от изброените по-долу) или да е невалидна
            //ако играта е невалидна, принтираме, че не е намерена и четем следващата игра
            //ако играта е валидна (някоя от изброените), сетваме единична цена

            //създаваме си булава променлива, коята ни държи условието за валидност на текущата игра - играта е валидна ако е някоя от изброените
            boolean isValidGame = currentGame.equals("OutFall 4") || currentGame.equals("CS: OG") || currentGame.equals("Zplinter Zell") || currentGame.equals("Honored 2") || currentGame.equals("RoverWatch") || currentGame.equals("RoverWatch Origins Edition");

            double price = 0;      //създаваме си допълнителна променлива за цената на текущата игра (с начална стойност 0 или 0.0)
            switch (currentGame) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                default:       //ако играта не е нито една от изброените, значи е невалидна
                    isValidGame = false;
                    System.out.println("Not Found");
                    input = scanner.nextLine();      //update   //в случая преди да прекъснем текущата итерация на цикъла (с оператор continue), трябва да прочетем следващия ред с входни данни (иначе няма да се прочетат и ще изпаднем в безкраен цикъл)
                    continue;          //прекъсваме текущата итерация на цикъла и преминаваме на следващата итерация
            }


            //ако играта е валидна, имаме два варианта:
            //вариант 1: ако имаме достатъчно пари, я купуваме (и принтираме, че играта е купена), при което наличните пари намаляват, а общо похарчените пари нарастват
            //вариант 2: ако нямаме достатъчно пари, за да си я купим, не я купуваме; принтираме, че парите са свършили и прекъсваме цялата програма
            if (currentBalance >= price) {        //ако имаме достатъчно пари, за да си я купим
                System.out.println("Bought " + currentGame);
                currentBalance -= price;      //currentBalance = currentBalance - price;
                totalSpentMoney += price;       //totalSpentMoney = totalSpentMoney + price;      //похарчените пари за книги се увеличават с цената на текущата книга
                if (currentBalance == 0) {         //ако в даден момент парите ни свършат, принтираме, че са свършили, и прекъсваме цялата програма (и няма да се изпълни нито един следващ ред от кода - нито в цикъла, нито извън него)
                    System.out.println("Out of money!");
                    return;         //прекъсваме цялата програма
                }
            } else {       //в противен случай (тоест, ако нямаме достатъчно пари, за да си я купим)
                System.out.println("Too Expensive");
                input = scanner.nextLine();      //update   //в случая преди да прекъснем текущата итерация на цикъла (с оператор continue), трябва да прочетем следващия ред с входни данни (иначе няма да се прочетат и ще изпаднем в безкраен цикъл)
                continue;        //прекъсваме текущата итерация на цикъла и преминаваме на следващата итерация
            }


            input = scanner.nextLine();      //update
        }


        //ако парите ни не са свършили (и не сме прекъснали цялата програма), значи все някога входните данни са станали "Game Time" ->  принтираме колко сме похарчили и колко са ни останали:
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpentMoney, currentBalance);
    }
}
