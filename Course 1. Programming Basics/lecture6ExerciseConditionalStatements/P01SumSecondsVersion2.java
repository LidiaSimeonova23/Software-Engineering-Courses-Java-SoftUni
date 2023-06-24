package lecture6ExerciseConditionalStatements;

import java.util.Scanner;

public class P01SumSecondsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeInSecondsFirstCompetitor = Integer.parseInt(scanner.nextLine());
        int timeInSecondsSecondCompetitor = Integer.parseInt(scanner.nextLine());
        int timeInSecondsThirdCompetitor = Integer.parseInt(scanner.nextLine());

        int totalTimeInSeconds = timeInSecondsFirstCompetitor + timeInSecondsSecondCompetitor + timeInSecondsThirdCompetitor;
        int minutes = totalTimeInSeconds / 60;    //с целочислено деление на 60 (защото 1 мин = 60 сек) намираме цялата част (минутите)
        int seconds = totalTimeInSeconds % 60;       //с модулно деление на 60 (защото 1 мин = 60 сек) намираме остатъка (секундите)

        System.out.printf("%d:%02d", minutes, seconds);    //ако секундите са по-малко от 10, да се изведат с водеща 0 отпред
        //%02d  - казваме, че искаме секундите да се състоят от 2 цифри, като ако цифрата е само една, пред нея да се сложи 0
    }
}
