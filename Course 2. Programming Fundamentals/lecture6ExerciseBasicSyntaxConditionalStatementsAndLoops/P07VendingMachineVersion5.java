package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P07VendingMachineVersion5 {
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

            //създаваме си булева променлива, която ни държи условието за валидност на парите, които трябва да се вкарат в машината:
            boolean isCurrentCoinValid = currentCoin == 0.1 || currentCoin == 0.2 || currentCoin == 0.5 || currentCoin == 1 || currentCoin == 2;

            if (isCurrentCoinValid) {            //ако монените са валидни, машината ги приема и ги сумира
                sumOfInsertedCoins += currentCoin;       //sumOfInsertedCoins = sumOfInsertedCoins + currentCoin;
            } else {       //if (!isCurrentCoinValid)     //ако монетите, които се пускат, са различни от дадените, машината няма да ги приеме
                System.out.printf("Cannot accept %.2f%n", currentCoin);
            }

            input = scanner.nextLine();   //update на входните данни (в противен случай всеки път ще четем само първия ред и ще имаме безкраен цикъл)
        }


        //във втория while цикъл четем продукт, проверяваме валидността му, ако е валиден, сетваме единична цена, проверяваме дали сумата е достатъчна, за да го купим - ако е достатъчна, го купуваме и ни остават по-малко пари, а ако не е достатъчна, принтираме, че няма толкова пари
        boolean isValidProduct = true;         //създаваме си булева променлива, която да ни държи истината (задаваме й начална стойност true - тоест, по подразбиране продуктът е валиден)
        input = scanner.nextLine();
        while (!input.equals("End")) {           //докато входните данни са различни от "End", ще четем име на продукт
            String currentProduct = input;      //определяме си, че прочетените входни данни, щом са различни от "End", значи са име на продукт (стока)

            double unitPrice = 0;      //създаваме си променлива за цената на продукта (за 1 брой)
            //ще проверяваме входните данни, за да разберем кой е продуктът и каква е цената
            if (currentProduct.equals("Nuts")) {
                unitPrice = 2.0;
            } else if (currentProduct.equals("Water")) {
                unitPrice = 0.7;
            } else if (currentProduct.equals("Crisps")) {
                unitPrice = 1.5;
            } else if (currentProduct.equals("Soda")) {
                unitPrice = 0.8;
            } else if (currentProduct.equals("Coke")) {
                unitPrice = 1.0;
            } else {        //във всички останали случаи (тоест, когато продуктът не е никой от изброените)
                isValidProduct = false;      //булевата променлива става false (тоест, продуктът е невалиден)
                System.out.println("Invalid product");
            }


            if (isValidProduct) {        //ако продуктът е валиден - има 2 варианта: да можем да си го купим и да не можем да си го купим
                if (sumOfInsertedCoins >= unitPrice) {        //ако можем да си го купим (тоест, ако сумата, която сме вкарали в машината, е поне толкова, колкото струва продуктът), си го купуваме
                    System.out.printf("Purchased %s%n", input);
                    sumOfInsertedCoins -= unitPrice;       // sumOfInsertedCoins = sumOfInsertedCoins - unitPrice;            //вкараната в машината сума става домоментната сума минус цената на продукта
                } else {       //else if (sumOfInsertedCoins < unitPrice)      //в противен случай (ако не можем да си го купим, защото сумата, вкарана в машината, не е достатъчна)
                    System.out.println("Sorry, not enough money");
                }
            }


            input = scanner.nextLine();    //update на входните данни (в противен случай всеки път ще четем само първия ред и ще имаме безкраен цикъл)
        }


        //извън циклите проверяваме дали след купуването на продуктите са останали някакви пари
        if (sumOfInsertedCoins >= 0) {          //ако във вендинг машината е останала някаква сума (тоест, ако сумата е по-голяма от 0), да се принтира колко е рестото, което машината трябва да ни върне
            System.out.printf("Change: %.2f", sumOfInsertedCoins);
        }

    }
}
