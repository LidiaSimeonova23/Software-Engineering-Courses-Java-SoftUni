package lecture16Exam2PreliminaryExam2023;

import java.util.Scanner;

public class P06UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Да се напише програма, която генерира трицифрени PIN кодове, като цифрите на всеки PIN код са в определен интервал. За да бъде валиден един PIN код, той трябва да отговаря на следните условия:
        //•	Първата и третата цифра трябва да бъдат четни.
        //•	Втората цифра трябва да бъде просто число в диапазона [2...7].

        int maxValueOfFirstDigit = Integer.parseInt(scanner.nextLine());     //•	Горната граница на първото число - цяло число в диапазона [1...9]
        int maxValueOfSecondDigit = Integer.parseInt(scanner.nextLine());     //•	Горната граница на второто число - цяло число в диапазона [1...9]
        int maxValueOfThirdDigit = Integer.parseInt(scanner.nextLine());      //•	Горната граница на третото число - цяло число в диапазона [1...9]


        //три вложени цикъла, защото числата са трицифрени
        //Просто число е естествено число, по-голямо от 1, което има точно два естествени делителя – 1 и самото себе си.   (0 и 1 не са прости числа)
        //простите числа между 2 и 7 са     2, 3, 5 и 7
        for (int i = 1; i <= maxValueOfFirstDigit; i++) {
            for (int j = 1; j <= maxValueOfSecondDigit; j++) {
                for (int k = 1; k <= maxValueOfThirdDigit; k++) {

                    //първата и третата цифра от трицифрения код да са четни и втората цифра да е просто число между 2 и 7
                    if ((i % 2 == 0) && (j == 2 || j == 3 || j == 5 || j == 7) && (k % 2 == 0)) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }

                }
            }
        }


    }
}
