package lecture6ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P05LoginVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();     //String representing a username


        //The password will be that username reversed.  -> намираме коя е паролата чрез намаляващ for цикъл (от последния към първия символ в текста)
        String correctPassword = "";       //създаваме си променлива за вярната парола (в началото не знаем коя е тя, затова й присвояваме като стойност празен String)
        for (int index = username.length() - 1; index >= 0; index--) {
            char currentSymbol = username.charAt(index);      //създаваме си променлива за текущия символ
            //ние не искаме да принтираме текущия символ, а просто да намерим всички символи в обратен ред:
            correctPassword += currentSymbol;        //correctPassword = correctPassword + currentSymbol;      //след всички итерации ще сме намерили коя е паролата     //String + нещо   - операция конкатенация (долепяне) - получава се String
        }


        //ще четем входни данни - не знаем колко пъти (имаме while цикъл) - или до получаване на вярната парола, или докато неуспешните опити станат 4 (на четвъртия неуспешен опит се прекъсва програмата)
        int numberOfIncorrectPasswords = 0;         //създаваме си променлива за броя на неуспешните опити (броя на грешните пароли)
        String input = scanner.nextLine();
        while (!input.equals(correctPassword)) {

            //след като текущата парола е грешна, броят на грешните пароли се увеличава с единица:
            numberOfIncorrectPasswords++;       //numberOfIncorrectPasswords = numberOfIncorrectPasswords + 1;           //numberOfIncorrectPasswords += 1;

            if (numberOfIncorrectPasswords < 4) {          //ако броят на грешните пароли е по-малък от 4
                System.out.println("Incorrect password. Try again.");
            } else {        //else if (numberOfIncorrectPasswords == 4)         //else if (numberOfIncorrectPasswords >= 4)
                System.out.printf("User %s blocked!", username);
                return;      //прекъсваме цялата програма (и няма да се изпълни нито един следващ ред код - нито вътре в цикъла, нито извън него)
            }

            input = scanner.nextLine();      //update
        }


        System.out.printf("User %s logged in.", username);
    }
}
