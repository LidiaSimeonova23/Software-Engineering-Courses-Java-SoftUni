package lecture3StacksAndQueues;

import java.util.*;

public class P02SimpleCalculatorVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> numbersStack = new ArrayDeque<>();

        String expression = scanner.nextLine();
        String[] expressionPartsArray = expression.split("\\s+");
        //String[] expressionPartsArray = expression.split("");
        // ["2", "+", "5", "+", "10", "-", "2", "-", "1"]

        List<String> partsList = Arrays.asList(expressionPartsArray);
        // {"2", "+", "5", "+", "10", "-", "2", "-", "1"}

        Collections.reverse(partsList);
        // {"1", "-", "2", "-", "10", "+", "5", "+", "2"}

        //partsList.forEach(element -> numbersStack.push(element));
        for (String element : partsList) {
            numbersStack.push(element);
        }

        //сега трябва да обходим елементите от stack-а  - това става с while цикъл, като премахваме най-горния елемент (защото в stack-а имаме достъп само до най-горния елемент)
        while (numbersStack.size() > 1) {
            int firstNumber = Integer.parseInt(numbersStack.pop());
            String operator = numbersStack.pop();
            int secondNumber = Integer.parseInt(numbersStack.pop());

            int result;  //int result = 0;
            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                default:      //по условие дефолтния случай го няма
                    System.out.println("Unknown operation " + operator);
                    return;     //прекъсваме main метода
            }


            //за да продължим да извършваме аритмет. операции, трябва да върнем получения резултат (който е от тип int) в stack-а от String-ове -> за целта трябва да го превърнем в String
            numbersStack.push("" + result);    //към stack-а от String-ове прибавяме резултата от аритмет. операция като String   //чрез конкатенацията   "" + result   превръщаме числото от int в String (защото stack-ът е от String-ове)
        }


        System.out.println(numbersStack.peek());    //принтираме резултата от изчисленията
    }
}
