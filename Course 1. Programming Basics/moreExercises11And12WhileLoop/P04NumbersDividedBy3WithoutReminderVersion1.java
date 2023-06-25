package moreExercises11And12WhileLoop;

public class P04NumbersDividedBy3WithoutReminderVersion1 {
    public static void main(String[] args) {

        //програма, която печата всички числа в интервала от 1 до 100, които се делят на 3 без остатък, по едно на ред

        for (int number = 1; number <= 100; number++) {       //за да си построя цикъла, използвам за име на променливата number вместо i
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }

    }
}
