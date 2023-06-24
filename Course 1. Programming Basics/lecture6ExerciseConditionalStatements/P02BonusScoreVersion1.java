package lecture6ExerciseConditionalStatements;

import java.util.Scanner;

public class P02BonusScoreVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialScore = Integer.parseInt(scanner.nextLine());

        double bonusScore = 0;
        if (initialScore <= 100) {
            bonusScore = 5;
        } else if (initialScore <= 1000) {    //else if (initialScore > 100 && initialScore <= 1000)
            bonusScore = initialScore * 1.0 * 20 / 100;        //Ако числото е по-голямо от 100, бонус точките са 20% от числото
        } else {          //else if (initialScore > 1000)
            bonusScore = initialScore * 1.0 * 10 / 100;      //Ако числото е по-голямо от 1000, бонус точките са 10% от числото
        }


        if (initialScore % 2 == 0) {           //За четно число  + 1 т.
            bonusScore = bonusScore + 1;
        }

        if (initialScore % 10 == 5) {          //За число, което завършва на 5  + 2 т.
            bonusScore = bonusScore + 2;
        }


        double totalScore = initialScore + bonusScore;

        System.out.println(bonusScore);
        System.out.println(totalScore);
    }
}
