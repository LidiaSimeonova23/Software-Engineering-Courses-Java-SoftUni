package lecture12ExerciseWhileLoop;

import java.util.Scanner;

public class P04WalkingVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSteps = 0;        //създаваме си променлива за всички извървени стъпки - с начална стойност 0

        while (totalSteps < 10000) {
            String input = scanner.nextLine();    //на всяко завъртане на цикъла ще четем някакви входни данни - цяло число (за брой стъпки) или текст (за команда)

            if (input.equals("Going home")) {                  //ако въведе Going home, вървейки към вкъщи, извървява стъпки - трябва да прочетем колко стъпки ще извърви и да ги добавим към извървените до момента
                int steps = Integer.parseInt(scanner.nextLine());
                totalSteps = totalSteps + steps;       //всички стъпки са равни на извървените до момента всички стъпки + текущите стъпки
                break;                //след като се добавят и тези стъпки, да се прекъсне цикълът
            } else {
                int steps = Integer.parseInt(input);            //ако входните данни не са Going home, значи са брой стъпки - превръщаме ги в цяло число и ги запазваме в променлива от тип int
                totalSteps = totalSteps + steps;    //totalSteps += steps;
            }

        }


        int differenceBetweenSteps = Math.abs(totalSteps - 10000);
        if (totalSteps >= 10000) {                                             //в противен случай (тоест, когато е извървяла 10000 крачки)
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", differenceBetweenSteps);
        } else {
            System.out.printf("%d more steps to reach goal.", differenceBetweenSteps);
        }

    }
}
