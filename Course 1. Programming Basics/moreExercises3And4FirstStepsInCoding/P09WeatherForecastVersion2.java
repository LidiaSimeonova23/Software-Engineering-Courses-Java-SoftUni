package moreExercises3And4FirstStepsInCoding;

import java.util.Scanner;

public class P09WeatherForecastVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String weather = scanner.nextLine();

        //При въвеждане на "sunny" трябва да се отпечата "It's warm outside!". Във всички останали случаи трябва да се отпечата "It's cold outside!"

        if (weather.equals("sunny")) {
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }

    }
}
