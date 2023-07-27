package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P04BackIn30MinutesVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //The input will be on two lines. On the first line, you will receive the hours, and on the second, you will receive the minutes.
        int startHour = Integer.parseInt(scanner.nextLine());       //•	The hours will be between 0 and 23
        int startMinutes = Integer.parseInt(scanner.nextLine());       //•	The minutes will be between 0 and 59

        //трябва да работим в една и съща мерна единица, за да си направим изчисленията
        int startTimeInMinutes = (startHour * 60) + startMinutes;    //намираме началното време изцяло в минути - превръщаме часовете в минути, за да работим с една и съща мерна единица, и добавяме минутите

        //Print on the console the time after 30 minutes.
        int timeAfter30Minutes = startTimeInMinutes + 30;   //намираме колко ще е часът (в минути като мерна единица) след 30 минути

        //накрая времето трябва да се принтира като час:минути, следователно трябва да намерим всичките минути колко часа са и колко минути
        int endHour = timeAfter30Minutes / 60;    //с целочислено деление намираме цялата част (часовете)
        int endMinutes = timeAfter30Minutes % 60;    //с модулно деление намираме остатъка (минутите)

        if (endHour > 23) {       // if (endHour >= 24)   ако часовете станат повече от 23, нека се занулят
            endHour = 0;         //на променливата endHour присвояваме стойност 0
        }

        //The result should be in the format "hh:mm". The hours have one or two numbers, and the minutes always have two numbers (with leading zero).
        System.out.printf("%d:%02d", endHour, endMinutes);    //принтираме час:минути  - за минутите директно си използваме шаблон %02d (искаме мин. да са двуцифрени, ако цифрите са по-малко, минутите да се принтират с водеща 0 отпред)
    }
}
