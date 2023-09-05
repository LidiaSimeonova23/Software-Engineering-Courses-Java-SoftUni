package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P10SpecialNumbersVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата четем едно цяло число и проверяваме дали числата от 1 до това число са специални, или не
        //числото е специално, ако сумата от цифрите му е или 5, или 7, или 11

        int number = Integer.parseInt(scanner.nextLine());   //от първия ред на конзолата ще прочетем една цяло число

        //ще имаме два вложени цикъла:
        //във външния (знаем колко са итерациите -> for цикъл) взимаме текущото число в диапазона от 1 до прочетеното от конзолата число
        //във вътрешния (ще разглеждаме текущото число като текст и ще итерираме по всички символи от текста -> с for цикъл) намираме всяка цифра на текущото число и сумата от всичките цифри на текущото число
        for (int currentNumber = 1; currentNumber <= number; currentNumber++) {

            String currentNumberAsText = currentNumber + "";     //чрез конкатенация с празен String превръщаме текущото число в текст, за да итерираме по всичките му цифри (които ще са символи в текста)
            int sumOfDigitsOfCurrentNumber = 0;    //създаваме си променлива за сумата от всички цифри на текущото число - тази променлива ще ни трябва и вътре във вътрешния for цикъл, и извън него, затова я създаваме над вътрешния for цикъл (живот на променлива)
            for (int index = 0; index <= currentNumberAsText.length() - 1; index++) {
                char currentSymbol = currentNumberAsText.charAt(index);      //създаваме си променлива за текущия символ от текста

                //целта е да превърнем текущия символ в число, за да го прибавим към сумата от цифрите - за целта първо превръщаме символа в текст, после текста в число:
                String currentSymbolAsText = currentSymbol + "";       //превръщаме текущия символ в текст (чрез конкатенация с празен String)
                int currentSymbolAsNumber = Integer.parseInt(currentSymbolAsText);    //превръщаме текста в число (чрез parse-ване)

                //на всяка итерация на вътр. цикъл към домоментната сума от цифрите на текущото число прибавяме текущата цифра (и след всички итерации намираме цялата сума)
                sumOfDigitsOfCurrentNumber += currentSymbolAsNumber;     //sumOfDigitsOfCurrentNumber = sumOfDigitsOfCurrentNumber + currentSymbolAsNumber;
            }


            //проверка дали намерената вече сума от цифрите на текущото число е специално число (тоест, дали е 5, или 7 или 11)
            if (sumOfDigitsOfCurrentNumber == 5 || sumOfDigitsOfCurrentNumber == 7 || sumOfDigitsOfCurrentNumber == 11) {
                System.out.printf("%d -> True%n", currentNumber);
                //System.out.println(currentNumber + " -> True");          //принтиране чрез конкатенация (долепяне)
            } else {       //else if (sumOfDigitsOfCurrentNumber != 5 && sumOfDigitsOfCurrentNumber != 7 && sumOfDigitsOfCurrentNumber != 11)       // в противен случай (ако сумата от цифрите на текущото число не е нито 5, нито 7, нито 11)
                System.out.printf("%d -> False%n", currentNumber);
                //System.out.println(currentNumber + " -> False");         //принтиране чрез конкатенация (долепяне)
            }

        }


    }
}
