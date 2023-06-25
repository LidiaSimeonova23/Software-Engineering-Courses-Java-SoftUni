package lecture14ExerciseNestedLoops;

import java.util.Scanner;

public class P06CinemaTicketsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред до получаване на командата "Finish" - име на филма – текст
        //•	На втори ред – свободните места в салона за всяка прожекция – цяло число [1 … 100]
        //•	За всеки филм се чете по един ред до изчерпване на свободните места в залата или до получаване на командата "End":
        //o	типът на купения билет - текст ("student", "standard", "kid")


        int counterAllTickets = 0;  //създаваме си променлива за всички продадени билети (за всички филми) - с начална стойност 0, после ще я променяме
        int counterStudentTickets = 0;     //създаваме си променлива за всички продадени студентски билети (за всички филми) - с начална стойност 0, после ще я променяме
        int counterStandardTickets = 0;    //създаваме си променлива за всички продадени стандартни билети (за всички филми) - с начална стойност 0, после ще я променяме
        int counterKidTickets = 0;         //създаваме си променлива за всички продадени детски билети (за всички филми) - с начална стойност 0, после ще я променяме

        String input = scanner.nextLine();        //първоначално си определяме, че входните ни данни са от тип String
        while (!input.equals("Finish")) {     //докато входните ни данни са различни от "Finish", ще четем входни данни (които ще са име на филм и брой свободни места за този филм)
            String currentFilm = input;                  //ако входните данни не са "Finish", то те са име на филм
            int freeSeatsForTheCurrentFilm = Integer.parseInt(scanner.nextLine());       //ако входните данни не са нито "Finish", нито име на филм, то превърни ги в реално число (за да са брой свободни места за съответния филм)

            int counterCurrentTickets = 0;    //създаваме си променлива за брояч на билетите за конкретния филм - с начална стойност 0, после ще я променяме
            String typeOfTicket = scanner.nextLine();    //многократно ще четем тип билет до получаване на "End"
            while (!typeOfTicket.equals("End")) {
                counterCurrentTickets++;     //counterCurrentTickets = counterAllTickets + 1;  //брояч на продадените билети за съответния филм, без знач. от какъв тип са
                counterAllTickets++;       //counterAllTickets = counterAllTickets + 1;       //брояч на всички продадени билети, без знач. от какъв тип са

                switch (typeOfTicket) {
                    case "student":                   //ако продаденият билет е от тип "student", броят на студентските билети нараства с единица
                        counterStudentTickets++;     //counterStudentTickets = counterStudentTickets + 1;
                        break;
                    case "standard":           //ако продаденият билет е от тип "standard", броят на стандартните билети нараства с единица
                        counterStandardTickets++;    //counterStandardTickets = counterStandardTickets + 1;
                        break;
                    case "kid":                //ако продаденият билет е от тип "kid", броят на детските билети нараства с единица
                        counterKidTickets++;         //counterKidTickets = counterKidTickets + 1;
                        break;
                }

                if (counterCurrentTickets >= freeSeatsForTheCurrentFilm) {   //ако свободните места се изчерпат, тоест, ако броят на продадените билети е станал по-голям или равен на свободните места, прекъсваме четенето на тип билет
                    break;
                }

                typeOfTicket = scanner.nextLine();    //update - подканяме скенера да прочете следващия ред от конзолата (в противен случай ще имаме безкраен цикъл)
            }

            double percentageOfFullnessOfTheHall = counterCurrentTickets * 1.0 / freeSeatsForTheCurrentFilm * 100;    //намираме процента запълненост на залата (равен е на брой продадени билети за текущия филм, делено на общ брой билети (тоест, свободни места в залата), умножено по 100
            System.out.printf("%s - %.2f%% full.%n", currentFilm, percentageOfFullnessOfTheHall);   //принтираме филм и процент запълненост на залата

            input = scanner.nextLine();   //update - подканяме скенера да прочете следващия ред от конзолата (в противен случай ще имаме безкраен цикъл)
        }


        System.out.printf("Total tickets: %d%n", counterAllTickets);    //System.out.println("Total tickets: " + counterAllTickets);  - чрез конкатенация (долепяне)   //принтираме броя на всички продадени билети

        double percentOfStudentTickets = counterStudentTickets * 1.0 / counterAllTickets * 100;   //намираме процента на продадените студентски билети (равен е на броя на продадените студентски билети, делено на броя на всички продадени билети, умножено по 100)
        System.out.printf("%.2f%% student tickets.%n", percentOfStudentTickets);       //принтираме процента на продадените студентски билети

        double percentOfStandardTickets = counterStandardTickets * 1.0 / counterAllTickets * 100;   //намираме процента на продадените стандартни билети (равен е на броя на продадените стандартни билети, делено на броя на всички продадени билети, умножено по 100)
        System.out.printf("%.2f%% standard tickets.%n", percentOfStandardTickets);     //принтираме процента на продадените стандартни билети

        double percentOfKidTickets = counterKidTickets * 1.0 / counterAllTickets * 100;           //намираме процента на продадените детски билети (равен е на броя на продадените детски билети, делено на броя на всички продадени билети, умножено по 100)
        System.out.printf("%.2f%% kids tickets.", percentOfKidTickets);                //принтираме процента на продадените детски билети
    }
}



