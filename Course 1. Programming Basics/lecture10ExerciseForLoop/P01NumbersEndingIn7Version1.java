package lecture10ExerciseForLoop;

public class P01NumbersEndingIn7Version1 {
    public static void main(String[] args) {


        //програма, която отпечатва числата в диапазона от 1 до 1000, които завършват на 7

        for (int currentNumber = 1; currentNumber <= 1000; currentNumber++) {
            if (currentNumber % 10 == 7) {
                //System.out.println(currentNumber);
                System.out.printf("%d%n", currentNumber);
            }
        }

    }
}
