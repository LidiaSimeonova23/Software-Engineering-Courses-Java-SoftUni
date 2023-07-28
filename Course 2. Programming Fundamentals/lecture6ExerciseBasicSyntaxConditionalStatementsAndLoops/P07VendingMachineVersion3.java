package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P07VendingMachineVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Your task is to calculate the total purchase price from a vending machine.
        //Until you receive "Start" you will be given different coins that are being inserted into the machine. You have to sumOfInsertedCoins them to have the total money inserted.
        //There is a problem though. Your vending machine only works with 0.1, 0.2, 0.5, 1, and 2 coins.
        //If someone tries to insert some other coins, you have to display "Cannot accept {money}", where the value is formatted to the second digit after the decimal point and not add it to the total money.

        //On the next few lines until you receive "End" you will be given products to purchase.
        //Your machine has, however, only "Nuts", "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively.
        //If the person tries to purchase a not existing product, print "Invalid product".
        //Be careful that the person may try to purchase a product for which he doesn't have money. In that case, print "Sorry, not enough money".
        //If the person purchases a product successfully print "Purchased {product name}".
        //After the "End" command, print the money that is left formatted to the second decimal point in the format "Change: {money left}".

        //тази задача е с два отделни един от друг while цикъла

        //в първия while цикъл четем пари, проверяваме валидността им (ако са валидни, ги прибавяме към сумата от парите; ако не са валидни, принтираме, че машината не ги приема)
        double sumOfInsertedCoins = 0;   //създаваме си променлива за сумата от всички (вкарани в машината) монети  - с начална стойност 0, после ще я променяме
        String input = scanner.nextLine();   //първоначално определяме входните данни като текст
        while (!input.equals("Start")) {      //докато входните данни са различни от "Start", ще четем монети (тоест, ще пускаме монети във вендинг машината)
            double currentCoin = Double.parseDouble(input);       //ако входните данни не са текст, превърни ги в реално число и ги запази в променлива double

            //ако монетите, които се пускат във вендинг машината, са различни от споменатите, машината няма да ги приеме
            if (currentCoin != 0.1 && currentCoin != 0.2 && currentCoin != 0.5 && currentCoin != 1 && currentCoin != 2) {
                System.out.printf("Cannot accept %.2f%n", currentCoin);
            } else {            //в противен случай (ако монените са някоя от изброените, машината ги приема и ги сумира)
                sumOfInsertedCoins += currentCoin;       //sumOfInsertedCoins = sumOfInsertedCoins + currentCoin;
            }

            input = scanner.nextLine();   //update на входните данни (в противен случай всеки път ще четем само първия ред и ще имаме безкраен цикъл)
        }


        //във втория while цикъл четем продукт, проверяваме валидността му, ако е валиден, сетваме единична цена, проверяваме дали сумата е достатъчна, за да го купим - ако е достатъчна, го купуваме и ни остават по-малко пари, а ако не е достатъчна, принтираме, че няма толкова пари
        input = scanner.nextLine();    //можем да ползваме създадената вече променлива input (просто й сетваме нова стойност, която се чете от конзолата)
        while (!input.equals("End")) {           //докато входните данни са различни от "End", ще четем име на продукт

            double unitPrice = 0;     //създаваме си променлива за цената на продукта (за 1 брой)
            switch (input) {     //ще проверяваме входните данни, за да разберем кой е продуктът и каква е цената
                case "Nuts":              //ако е вкарал в машината достатъчно пари, ще си купи ядки  (тоест, ако е вкарал поне толкова пари, колкото са ядките)
                    unitPrice = 2.0;
                    if (sumOfInsertedCoins >= 2.0) {        //ако можем да си купим продукта (тоест, ако сумата, която имаме, е поне толкова, колкото струва продуктът, си го купуваме
                        System.out.printf("Purchased %s%n", input);
                        sumOfInsertedCoins -= 2.0;       // sumOfInsertedCoins = sumOfInsertedCoins - 2.0;            //вкараната в машината сума става домоментната сума минус цената на продукта
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":            //ако е вкарал в машината достатъчно пари, ще си купи вода  (тоест, ако е вкарал поне толкова пари, колкото е водата)
                    unitPrice = 0.7;
                    if (sumOfInsertedCoins >= 0.7) {
                        System.out.printf("Purchased %s%n", input);
                        sumOfInsertedCoins -= 0.7;      // sumOfInsertedCoins = sumOfInsertedCoins - 0.7;            //вкараната в машината сума става домоментната сума минус цената на водата
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":            //ако е вкарал в машината достатъчно пари, ще си купи чипс  (тоест, ако е вкарал поне толкова пари, колкото е чипсът)
                    unitPrice = 1.5;
                    if (sumOfInsertedCoins >= 1.5) {
                        System.out.printf("Purchased %s%n", input);
                        sumOfInsertedCoins -= 1.5;       // sumOfInsertedCoins = sumOfInsertedCoins - 1.5;            //вкараната в машината сума става домоментната сума минус цената на чипса
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":               //ако е вкарал в машината достатъчно пари, ще си купи сода  (тоест, ако е вкарал поне толкова пари, колкото е содата)
                    unitPrice = 0.8;
                    if (sumOfInsertedCoins >= 0.8) {
                        System.out.printf("Purchased %s%n", input);
                        sumOfInsertedCoins -= 0.8;       // sumOfInsertedCoins = sumOfInsertedCoins - 0.8;            //вкараната в машината сума става домоментната сума минус цената на содата
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":              //ако е вкарал в машината достатъчно пари, ще си купи кола  (тоест, ако е вкарал поне толкова пари, колкото е колата)
                    unitPrice = 1.0;
                    if (sumOfInsertedCoins >= 1.0) {
                        System.out.printf("Purchased %s%n", input);
                        sumOfInsertedCoins -= 1.0;       // sumOfInsertedCoins = sumOfInsertedCoins - 1.0;            //вкараната в машината сума става домоментната сума минус цената на колата
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:             //във всички останали случаи (тоест, ако продуктът не е никой от изброените)
                    System.out.println("Invalid product");
                    break;
            }

            input = scanner.nextLine();    //update на входните данни (в противен случай всеки път ще четем само първия ред и ще имаме безкраен цикъл)
        }


        //извън циклите проверяваме дали след купуването на продуктите са останали някакви пари
        if (sumOfInsertedCoins >= 0) {          //ако във вендинг машината е останала някаква сума (тоест, ако сумата е по-голяма от 0), да се принтира колко е рестото, което машината трябва да ни върне
            System.out.printf("Change: %.2f", sumOfInsertedCoins);
        }

    }
}
