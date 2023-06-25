package moreExercises11And12WhileLoop;

import java.util.Scanner;

public class P03StreamOfLettersVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Думите, скрити в потока, са разделени от тайна команда от три букви – "c", "o" и "n".
        //При първото получаване на една от тези букви, тя се маркира като срещната, но не се запазва в думата.

        String word = "";
        // int count = 0;
        String letter = "";
        // булевите променливи помнят дали даден символ е сращнат вече веднъж
        boolean oIsNotTheFirstO = false;
        boolean cIsNotTheFirstC = false;
        boolean nIsNotTheFirstN = false;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            char currentSymbol = input.charAt(0);
            if ((currentSymbol >= 'a' && currentSymbol <= 'z') || (currentSymbol >= 'A' && currentSymbol <= 'Z')) {
                // когато има 'o' 'c' 'n' влиза в дадения case
                if (input.equals("o")) {
                    // при първо среща на 'о' променливата о = false и не влиза в if, след което о = true и при следваща среща о = true
                    // и вече влиза в if и се преибавя към текущата дума
                    if (oIsNotTheFirstO) {
                        word += input;
                    }
                    oIsNotTheFirstO = true;
                } else if (input.equals("c")) {
                    if (cIsNotTheFirstC) {
                        word += input;
                    }
                    cIsNotTheFirstC = true;
                } else if (input.equals("n")) {
                    if (nIsNotTheFirstN) {
                        word += input;
                    }
                    nIsNotTheFirstN = true;
                } else {
                        word += input;
                }
//                if (input.equals("o") || input.equals("c") || input.equals("n")) {
//                    if (input.equals(letter) && count > 0) {
//                        word += input;
//                    } else {
//                        count++;
//                        letter = input;
//                        word += "";
//                    }
//                } else {
//                    word += input;
//                }
                // когато сме срещнали и трите символа по веднъж, влиза в if, където печата и отново 'o'=false 'c'=false 'n'=false
                if (oIsNotTheFirstO && cIsNotTheFirstC && nIsNotTheFirstN) {
                    System.out.print(word + " ");
                    oIsNotTheFirstO = false;
                    cIsNotTheFirstC = false;
                    nIsNotTheFirstN = false;
                    // letter = "";
                    word = "";
                }
            }
            input = scanner.nextLine();


        }


    }
}
