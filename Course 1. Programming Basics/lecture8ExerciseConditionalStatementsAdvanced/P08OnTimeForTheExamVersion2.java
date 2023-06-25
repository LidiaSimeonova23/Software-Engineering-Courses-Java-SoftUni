package lecture8ExerciseConditionalStatementsAdvanced;

import java.util.Scanner;

public class P08OnTimeForTheExamVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата четем 4 цели числа (по едно на ред):
        int hourOfExam = Integer.parseInt(scanner.nextLine());             //час на изпита – цяло число от 0 до 23
        int minutesOfExam = Integer.parseInt(scanner.nextLine());           //минута на изпита – цяло число от 0 до 59
        int hourOfArrival = Integer.parseInt(scanner.nextLine());          //час на пристигане – цяло число от 0 до 23
        int minutesOfArrival = Integer.parseInt(scanner.nextLine());        //минута на пристигане – цяло число от 0 до 59

        //трябва да работим в една и съща мерна единица - само минути
        int examTimeInMinutes = hourOfExam * 60 + minutesOfExam;                     //намираме минутите на изпита - обръщаме часовете в минути и към тях прибавяме минутите
        int arrivalTimeInMinutes = hourOfArrival * 60 + minutesOfArrival;            //намираме минутите на пристигане - обръщаме часовете в минути и към тях прибавяме минутите

        int difference = Math.abs(examTimeInMinutes - arrivalTimeInMinutes);      //намираме разликата в минути между времето на изпита и времето на пристигане; осигуряваме си да е положит. число

        if (arrivalTimeInMinutes > examTimeInMinutes) {                                         //ако студентът пристига по-късно от часа на изпита
            System.out.println("Late");
            if (difference >= 60) {                                    //за закъснение от 1 час или повече
                int hour = difference / 60;                                    //целочислено делим разликата на 60, за да намерим с колко часа е закъснението
                int minutes = difference % 60;                                 //модулно делим разликата на 60, за да намерим с колко минути е закъснението (с модулно деление търсим остатък - минутите в случая)
                if (minutes < 10) {
                    System.out.printf("%d:0%d hours after the start", hour, minutes);
                } else {
                    System.out.printf("%d:%d hours after the start", hour, minutes);
                }
            } else {                                                   //за закъснение под час
                System.out.printf("%d minutes after the start", difference);
            }
        } else if ((examTimeInMinutes == arrivalTimeInMinutes) || (difference <= 30)) {         //ако студентът пристига точно в часа на изпита или до 30 минути по-рано
            System.out.println("On time");
            if (difference >= 1 && difference <= 30) {    //if (difference > 0 && difference <= 30)
                System.out.printf("%d minutes before the start", difference);
            }
        } else {                                                                                //ако студентът пристига повече от 30 минути преди часа на изпита
            System.out.println("Early");
            if (difference >= 60) {                                  //за подраняване с 1 час или повече
                int hour = difference / 60;                                //целочислено делим разликата на 60, за да намерим с колко часа е подраняването
                int minutes = difference % 60;                             //модулно делим разликата на 60, за да намерим с колко минути е подраняването (с модулно деление търсим остатък - минутите в случая)
                if (minutes < 10) {
                    System.out.printf("%d:0%d hours before the start", hour, minutes);
                } else {
                    System.out.printf("%d:%d hours before the start", hour, minutes);
                }
            } else {                                                 //за подраняване с по-малко от 1 час
                System.out.printf("%d minutes before the start", difference);
            }
        }

    }
}


