package lecture6ExerciseConditionalStatements;

import java.util.Scanner;

public class P01SumSecondsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeInSecondsFirstCompetitor = Integer.parseInt(scanner.nextLine());
        int timeInSecondsSecondCompetitor = Integer.parseInt(scanner.nextLine());
        int timeInSecondsThirdCompetitor = Integer.parseInt(scanner.nextLine());

        int totalTimeInSeconds = timeInSecondsFirstCompetitor + timeInSecondsSecondCompetitor + timeInSecondsThirdCompetitor;
        int minutes = totalTimeInSeconds / 60;    //с целочислено деление на 60 (защото 1 мин = 60 сек) намираме цялата част (минутите)
        int seconds = totalTimeInSeconds % 60;       //с модулно деление на 60 (защото 1 мин = 60 сек) намираме остатъка (секундите)

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);    //ако секундите са по-малко от 10, да се изведат с водеща 0 отпред
        } else {         //в противен случай (ако секундите са повече или равни на 10), секундите да се изведат без 0 отпред
            System.out.printf("%d:%d", minutes, seconds);
        }

    }
}
