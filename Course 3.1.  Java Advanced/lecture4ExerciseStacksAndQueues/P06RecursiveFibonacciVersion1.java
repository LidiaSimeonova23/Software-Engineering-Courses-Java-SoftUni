package lecture4ExerciseStacksAndQueues;

import java.util.Scanner;

public class P06RecursiveFibonacciVersion1 {
    public static long[] memoryForFib;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        memoryForFib = new long[n + 1];
        System.out.println(fib(n));
    }


    public static long fib(int n) {       //метод, който изчислава Fibonacci(n)   //променливата я определяме да е от тип long, защото числото може да е много голямо и да не се побере в int
        if (n <= 1) {           //if (n < 2)    //Fib(0) = 1     //Fib(1) = 1
            return 1;
        }

        if (memoryForFib[n] != 0) {
            return memoryForFib[n];
        }

        return memoryForFib[n] = fib(n - 1) + fib(n - 2);
    }

}
