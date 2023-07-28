package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P05LoginVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You will be given a string representing a username. The password will be that username reversed.
        //Until you receive the correct password, print on the console "Incorrect password. Try again.".
        //When you receive the correct password, print "User {username} logged in."
        //However, on the fourth try, if the password is still not correct, print "User {username} blocked!" and end the program.

        String username = scanner.nextLine();  //от първия ред на конзолата ще прочетем текст - потребителско име

        //The password will be that username reversed.  -> намираме коя е паролата чрез намаляващ for цикъл (от последния към първия символ в текста)
        String correctPassword = "";       //създаваме си променлива за вярната парола (в началото не знаем коя е тя, затова й присвояваме като стойност празен String - той е дефолтната стойност на променливи от тип String)
        for (int index = username.length() - 1; index >= 0; index--) {
            char currentSymbol = username.charAt(index);      //създаваме си променлива за текущия символ
            //ние не искаме да принтираме текущия символ, а просто да намерим всички символи в обратен ред:
            correctPassword += currentSymbol;        //correctPassword = correctPassword + currentSymbol;      //след всички итерации ще сме намерили коя е паролата     //String + нещо   - операция конкатенация (долепяне) - получава се String
        }


        //ще четем входни данни - не знаем колко пъти (имаме while цикъл) - или до получаване на вярната парола, или докато неуспешните опити станат 4 (на четвъртия неуспешен опит се прекъсва програмата)
        int numberOfIncorrectPasswords = 0;         //създаваме си променлива за броя на неуспешните опити (броя на грешните пароли)
        String input = scanner.nextLine();
        while (!input.equals(correctPassword)) {              //докато входните данни са различно от вярната парола, ще четем нови входни данни и ще проверяваме колко е броят на неуспешните опити

            //след като текущата парола е грешна, броят на грешните пароли се увеличава с единица:
            numberOfIncorrectPasswords++;       //numberOfIncorrectPasswords = numberOfIncorrectPasswords + 1;           //numberOfIncorrectPasswords += 1;

            if (numberOfIncorrectPasswords == 4) {        //ако броят на неуспешните опити (тоест, ако броят на грешните пароли) стане 4, потребителят се блокира и програмата се прекратява
                System.out.printf("User %s blocked!", username);
                break;       //прекъсваме само цикъла (и следва са се изпълни кодът под цикъла - да се извърши проверката)
            }

            //но ако грешните пароли (неуспешните опити) са по-малко от 4, значи има право на следващ опит
            System.out.println("Incorrect password. Try again.");

            input = scanner.nextLine();   //update - подканяме скенера да прочете следващия ред от входни данни (ако не го направим, ще изпаднем в безкраен цикъл)
        }


        if (input.equals(correctPassword)) {                  //ако входните данни съвпаднат с вярната парола, потребителят е логнат (успешно влиза в профила си)
            System.out.printf("User %s logged in.", username);
        }

    }
}
