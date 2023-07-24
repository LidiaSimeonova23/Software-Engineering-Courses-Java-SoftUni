package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P04BackIn30MinutesVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //The input will be on two lines. On the first line, you will receive the hours, and on the second, you will receive the minutes.
        int startHour = Integer.parseInt(scanner.nextLine());       //•	The hours will be between 0 and 23
        int startMinutes = Integer.parseInt(scanner.nextLine());       //•	The minutes will be between 0 and 59

        //Print on the console the time after 30 minutes.
        //трябва да работим в една и съща мерна единица, за да си направим изчисленията (1 hour = 60 minutes)
        int timeInMinutesAfter30Minutes = (startHour * 60) + startMinutes + 30;   //намираме колко ще е часът (в минути като мерна единица) след 30 минути

        //накрая времето трябва да се принтира като час:минути, следователно трябва да намерим всичките минути колко часа са и колко минути
        int endHour = timeInMinutesAfter30Minutes / 60;    //с целочислено деление намираме цялата част (часовете)
        int endMinutes = timeInMinutesAfter30Minutes % 60;    //с модулно деление намираме остатъка (минутите)

        if (endHour == 24) {       // if (endHour >= 24)   ако часовете станат повече от 23, нека се занулят
            endHour = 0;         //на променливата endHour присвояваме стойност 0
        }

        //The result should be in the format "hh:mm". The hours have one or two numbers, and the minutes always have two numbers (with leading zero).
        if (endMinutes >= 0 && endMinutes <= 9) {         //правим си проверка за минутите и ако се състоят само от една цифра, пред нея да има водеща 0
            System.out.printf("%d:0%d", endHour, endMinutes);
        } else if (endMinutes > 9) {                                        //в противен случай (ако мин. са повече от 9, тоест, състоят се от две цифри) - да се принтират директно (без водеща нула отпред)
            System.out.printf("%d:%d", endHour, endMinutes);    //принтираме час:минути
        }

    }
}
