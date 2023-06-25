package moreExercises9And10ForLoop;

public class P09Clock {
    public static void main(String[] args) {

        //програма, която отпечатва часовете в денонощието от 0:0 до 23:59, всеки на отделен ред. Часовете трябва да се изписват във формат "{час} : {минути}"

        for (int hour = 0; hour <= 23; hour++) {        //за външния цикъл за име на променливата използвам hour вместо i
            for (int minute = 0; minute <= 59; minute++) {       //за вътрешния цикъл за име на променливата използвам minute вместо j
                System.out.printf("%d : %d%n", hour, minute);
            }
        }

    }
}
