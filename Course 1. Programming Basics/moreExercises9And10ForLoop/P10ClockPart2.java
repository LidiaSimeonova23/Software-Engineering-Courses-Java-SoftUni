package moreExercises9And10ForLoop;

public class P10ClockPart2 {
    public static void main(String[] args) {

        //програма, която да отпечатва часовете в денонощието от 0:0:0 до 23:59:59, всеки на отделен ред.
        //Часовете да се изписват във формат "{час} : {минути} : {секунди}".

        //1 hour = 60 min          //1 min = 60 sec
        for (int hour = 0; hour <= 23; hour++) {          //за да си построя цикъла, използвах като име на променливата hour вместо i
            for (int minute = 0; minute <= 59; minute++) {          //за да си построя цикъла, използвах като име на променливата minute вместо j
                for (int second = 0; second <= 59; second++) {           //за да си построя цикъла, използвах като име на променливата second вместо k
                    System.out.printf("%d : %d : %d%n", hour, minute, second);
                }
            }
        }

    }
}
