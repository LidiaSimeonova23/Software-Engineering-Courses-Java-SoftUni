package lecture4ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P05BalancedParenthesesVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Deque<Character> openBracketsStack = new ArrayDeque<>();

        //ако дължината на входните данни е нечетно число, ясно е, че скобите не са балансирани
        if (input.length() % 2 != 0) {        //if (input.length() % 2 == 1)
            System.out.println("NO");
            return;
        }


        //но ако дължината не е нечетно число, значи е четно - в такъв случай скобите могат да са балансирани, но могат и да не са балансирани
        boolean areBalancedBrackets = false;   //с нач. стойност false, защото не знаем дали са балансирани и ще проверяваме

        for (int index = 0; index <= input.length() - 1; index++) {      //for (int index = 0; index < input.length(); index++)
            char currentSymbol = input.charAt(index);

            if (currentSymbol == '(' || currentSymbol == '{' || currentSymbol == '[') {      //ако текущият символ е един от трите вида отварящи скоби, го добавяме към Stack-а
                openBracketsStack.push(currentSymbol);
            } else if (currentSymbol == ')' || currentSymbol == '}' || currentSymbol == ']') {        //или ако текущият символ е един от трите вида затварящи скоби, премахваме последния елемент в Stack-а (ако Stack-ът не е празен)
                if (openBracketsStack.isEmpty()) {     //ако Stack-ът е празен, значи за текущата затваряща скоба няма съответна отваряща скоба - следователно, скобите не са балансирани и прекъсваме цикъла
                    areBalancedBrackets = false;
                    break;
                }
                //ако if проверката е върнала отговор false, значи Stack-ът не е празен - и премахваме последния елемент
                char lastOpenBracket = openBracketsStack.pop();

                //проверка дали премахнатият символ (отваряща скоба) съвпада по вид с текущия символ (затваряща скоба) - ако съвпадат, скобите са балансирани
                if (lastOpenBracket == '(' && currentSymbol == ')') {
                    areBalancedBrackets = true;
                } else if (lastOpenBracket == '{' && currentSymbol == '}') {
                    areBalancedBrackets = true;
                } else if (lastOpenBracket == '[' && currentSymbol == ']') {
                    areBalancedBrackets = true;
                } else {     //във всички останали случаи (ако няма съвпадение) не са балансирани и прекъсваме цикъла
                    areBalancedBrackets = false;
                    break;
                }
            }

        }


        if (areBalancedBrackets) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
