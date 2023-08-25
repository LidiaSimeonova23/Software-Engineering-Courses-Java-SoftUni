package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PMoreExercises03GamingStoreVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());          //от първия ред на конзолата четем реално число - текущ баланс (наличните пари)

        //докато входните данни са различни от "Game Time", ще четем входни данни (игри) - не знаем колко пъти -> имаме while цикъл
        double remainingMoney = currentBalance;      //създаваме си допълнителна променлива колко пари ни остават (в началото задаваме, че оставащите пари са прочетеният от конзолата текущ баланс)
        boolean isOutOfMoney = false;      //създаваме си булева променлива, коята ни държи истината - парите ни са свършили е лъжа (тоест, по подразбиране имаме пари)

        String input = scanner.nextLine();
        while (!input.equals("Game Time")) {
            String currentGame = input;     //на всяка итерация на цикъла ще четем име на текуща игра

            //ако играта е валидна (някоя от изброените), сетваме единична цена
            boolean isValidGame = false;   //създаваме си булава променлива, коята ни държи истината - по подразбиране играта е валидна е лъжа (тоест, приемаме, че играта е невалидна)

            double price = 0;      //създаваме си допълнителна променлива за цената на текущата игра (с начална стойност 0 или 0.0)
            switch (currentGame) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    isValidGame = true;
                    break;
                case "CS: OG":
                    price = 15.99;
                    isValidGame = true;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    isValidGame = true;
                    break;
                case "Honored 2":
                    price = 59.99;
                    isValidGame = true;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    isValidGame = true;
                    break;
            }

            //има два варианта за текущата игра - да е валидна (ако е някоя от изброените по-горе) или да е невалидна
            //ако играта е невалидна, принтираме, че не е намерена и четем следващата игра
            //ако играта е валидна, имаме два варианта:
            //вариант 1: ако имаме достатъчно пари, я купуваме (и принтираме, че играта е купена) и наличните пари намаляват
            //вариант 2: ако нямаме достатъчно пари, за да си я купим, не я купуваме; принтираме, че парите са свършили и прекъсваме цикъла
            if (isValidGame) {       //ако текущата игра е валидна
                remainingMoney -= price;      //remainingMoney = remainingMoney - price;
                if (remainingMoney >= 0) {        //ако имаме достатъчно пари, за да си я купим
                    System.out.println("Bought " + currentGame);
                    if (remainingMoney == 0) {         //ако в даден момент парите ни свършат, принтираме, че са свършили, и прекъсваме цикъла (и отиваме да направим това, което е извън цикъла - проверката)
                        isOutOfMoney = true;
                        System.out.println("Out of money!");
                        break;
                    }
                } else {       //в противен случай (тоест, ако нямаме достатъчно пари, за да си я купим)
                    System.out.println("Too Expensive");
                    remainingMoney += price;     //remainingMoney = remainingMoney + price;
                }
            } else {     //в противен случай (ако текущата игра е невалидна)
                System.out.println("Not Found");
            }

            input = scanner.nextLine();      //update
        }


        //ако парите ни не са свършили, принтираме колко сме похарчили и колко са ни останали:
        if (!isOutOfMoney) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", currentBalance - remainingMoney, remainingMoney);
        }


    }
}
