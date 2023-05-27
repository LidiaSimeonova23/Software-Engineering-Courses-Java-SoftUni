package lecture3StacksAndQueues;

import java.util.*;
import java.util.stream.Collectors;

public class P02SimpleCalculatorVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] expressionPartsArray = (scanner.nextLine().split("\\s+"));
        // ["2", "+", "5", "+", "10", "-", "2", "-", "1"]

        ArrayDeque<String> numbersStack = new ArrayDeque<>();

        Collections.addAll(numbersStack, expressionPartsArray);   //добавяме колекция (масив от текстове) към друга колекция (stack от текстове)

        //сега трябва да обходим елементите от stack-а  - това става с while цикъл, като премахваме най-горния елемент (защото в stack-а имаме достъп само до най-горния елемент)
        while (numbersStack.size() > 1) {
            int firstNumber = Integer.parseInt(numbersStack.pop());
            String operator = numbersStack.pop();
            int secondNumber = Integer.parseInt(numbersStack.pop());

            int result = 0;
            if (operator.equals("+")) {
                result = firstNumber + secondNumber;
            } else if (operator.equals("-")) {
                result = firstNumber - secondNumber;
            }

            //за да продължим да извършваме аритмет. операции, трябва да добавим получения резултат (който е от тип int) в stack-а от String-ове -> за целта трябва да го превърнем в String
            numbersStack.push("" + result);    //чрез конкатенацията   "" + result   превръщаме числото от int в String (защото stack-ът е от String-ове)
            //numbersStack.push(String.valueOf(result));
        }


        //System.out.println(numbersStack.peek());
        System.out.println(numbersStack.pop());
    }
}
