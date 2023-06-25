package lecture10ExerciseForLoop;

public class P01NumbersEndingIn7Version3 {
    public static void main(String[] args) {


        //програма, която отпечатва числата в диапазона от 1 до 1000, които завършват на 7

        for (int currentNumber = 7; currentNumber <= 997; currentNumber += 10) {
            System.out.println(currentNumber);
            //System.out.printf("%d%n", currentNumber);
        }


    }
}
