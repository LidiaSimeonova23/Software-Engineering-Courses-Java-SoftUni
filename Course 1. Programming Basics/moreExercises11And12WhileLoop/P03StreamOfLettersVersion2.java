package moreExercises11And12WhileLoop;

import java.util.Scanner;

public class P03StreamOfLettersVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Думите, скрити в потока, са разделени от тайна команда от три букви – "c", "o" и "n".
        //При първото получаване на една от тези букви, тя се маркира като срещната, но не се запазва в думата.

        String word = "";
        // int count = 0;
        String letter = "";
        // булевите променливи помнят дали даден символ е сращнат вече веднъж
        boolean o = false;
        boolean c = false;
        boolean n = false;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            char valid = input.charAt(0);
            if ((valid >= 'a' && valid <= 'z') || (valid >= 'A' && valid <= 'Z')) {
                // когато има 'o' 'c' 'n' влиза в дадения case
                switch (input) {
                    case "o":
                        // при първо среща на 'о' променливата о = false и не влиза в if, след което о = true и при следваща среща о = true
                        // и вече влиза в if и се преибавя към текущата дума
                        if (o) {
                            word += input;
                        }
                        o = true;
                        break;
                    case "c":
                        if (c) {
                            word += input;
                        }
                        c = true;
                        break;
                    case "n":
                        if (n) {
                            word += input;
                        }
                        n = true;
                        break;
                    default:
                        word += input;
                        break;
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
                // когато сме срещнали и трите символа по веднъв влиза в if, където печата и отново 'o'=false 'c'=false 'n'=false
                if (o && c && n) {
                    System.out.print(word + " ");
                    o = false;
                    c = false;
                    n = false;
                    // letter = "";
                    word = "";
                }
            }
            input = scanner.nextLine();


        }


    }
}
