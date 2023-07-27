package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P12EvenNumberVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ще четем входни данни, докато входните данни са нечетни числа; когато се появи четно число, се принтира абсолютната му стойност и програмата приключва
        //ако текущото число е нечетно, да се принтира "Please write an even number."
        //ако текущото число е четно  - да се принтира: "The number is: {absoluteValue}"

        int number = Integer.parseInt(scanner.nextLine());
        while (!(number % 2 == 0)) {                   //може да се запише и така:  while (number % 2 == 1)  или  while (number % 2 != 0)
            System.out.println("Please write an even number.");    //това принтиране е в цикъла - ще се приннтира всеки път, когато числото в конзолата е нечетно

            number = Integer.parseInt(scanner.nextLine());    //update - казваме на скенера да прочете следващия ред с входни данни (ако не го направим, изпадаме в безкраен цикъл)
        }

        //когато горното условие стане false, значи вече числото е четно - да се принтира абсолютната му стойност - това принтиране е извън цикъла - ще е само веднъж и ще прекрати програмата
        number = Math.abs(number);     //на променливата number й присвояваме като стойност абсолютната стойност на числото
        System.out.printf("The number is: %d", number);      //принтираме абсолютната стойност на числото
    }
}
