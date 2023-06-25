package lecture13NestedLoops;

public class LiveExample01Version2 {
    public static void main(String[] args) {

        //за конкретния час искаме да принтираме всичките му минути (от 0 до 59)
        //минутите трябва да се извъртят 60 пъти - от 0 до 59, за да се премине към следващия час
        //За да се премине към следваща итерация на външния цикъл, трябва да са се извършили всички итерации (завъртания) на вътрешния цикъл
        for (int hour = 0; hour <= 23; hour++) {
            for (int min = 0; min <= 59; min++) {
                if (min < 10) {                                      //ако минутите са от 0 до 9, да ги принтираме с водеща 0 отпред, за да се състоят от две цифри
                    System.out.printf("%d:0%d%n", hour, min);
                } else {
                    System.out.printf("%d:%d%n", hour, min);                //ако минутите не са от 0 до 9, а са повече, няма да ги принтираме с водеща 0 отпред
                }
            }
        }


    }
}
