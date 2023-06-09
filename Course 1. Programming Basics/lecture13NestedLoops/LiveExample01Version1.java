package lecture13NestedLoops;

public class LiveExample01Version1 {
    public static void main(String[] args) {

        //за конкретния час искаме да принтираме всичките му минути (от 0 до 59)
        //минутите трябва да се извъртят 60 пъти - от 0 до 59, за да се премине към следващия час
        //За да се премине към следваща итерация на външния цикъл, трябва да са се извършили всички итерации (завъртания) на вътрешния цикъл
        for (int hour = 0; hour <= 23; hour++) {
            for (int min = 0; min <= 59; min++) {
                System.out.printf("%d:%02d%n", hour, min);            //тук за принтирането на минутите ползваме готовия шаблон %02d  (искаме минутите да се състоят от 2 цифри, като ако минутите са от 0 до 9, да се принтират с водеща 0 отпред)
            }
        }

    }
}

