package pbExam8Date6And7April2019;

import java.util.Scanner;

public class P06CinemaTicketsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входът е поредица от цели числа и текст:
        //До получаване на командата "Finish" (не знаем колко пъти -> имаме while цикъл) ще четем име на филм – текст
        int totalNumberOfBoughtTicketsForAllFilms = 0;      //създаваме си променлива за общ брой купени билети за всички филми
        int numberOfStudentTickets = 0;          //създаваме си променлива за общ брой купени студентски билети (за всички филми)
        int numberOfStandardTickets = 0;          //създаваме си променлива за общ брой купени стандартни билети (за всички филми)
        int numberOfKidTickets = 0;           //създаваме си променлива за общ брой купени детски билети (за всички филми)
        int totalNumberOfBoughtTicketsOnlyForCurrentFilm = 0;        //създаваме си променлива за общ брой купени билети само за текущия филм

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            String nameOfCurrentFilm = input;       //име на филм – текст
            int numberOfAvailableSeatsForCurrentFilm = Integer.parseInt(scanner.nextLine());      //свободните места в салона за всяка прожекция – цяло число [1 … 100]

            //За всеки филм се чете по един ред  - до изчерпване на свободните места в залата или до получаване на командата "End":
            String inputLines = scanner.nextLine();
            while (!inputLines.equals("End")) {
                String typeOfCurrentBoughtTicket = inputLines;      //Тип на купения билет - текст ("student", "standard", "kid")

                //общият брой купени билети (за всички филми) нараства с единица
                totalNumberOfBoughtTicketsForAllFilms++;          //totalNumberOfBoughtTicketsForAllFilms += 1;       //totalNumberOfBoughtTicketsForAllFilms = totalNumberOfBoughtTicketsForAllFilms + 1;

                //проверяваме вида на билета и намираме общ брой купени билети от съответния тип (студентски, стандартни, детски) за всички филми
                switch (typeOfCurrentBoughtTicket) {
                    case "student":
                        numberOfStudentTickets++;     //numberOfStudentTickets = numberOfStudentTickets + 1;       //numberOfStudentTickets += 1;
                        break;
                    case "standard":
                        numberOfStandardTickets++;
                        break;
                    case "kid":
                        numberOfKidTickets++;
                        break;
                }

                //намираме общия брой купени билети (студентски + стандартни + детски) само за текущия филм
                totalNumberOfBoughtTicketsOnlyForCurrentFilm++;       //totalNumberOfBoughtTicketsOnlyForCurrentFilm = totalNumberOfBoughtTicketsOnlyForCurrentFilm + 1;      //totalNumberOfBoughtTicketsOnlyForCurrentFilm += 1;

                //ако в даден момент броят на купените билети за текущия филм стане равен на броя на наличните билети за текущия филм, вече няма останали билети и цикълът се прекъсва
                if (totalNumberOfBoughtTicketsOnlyForCurrentFilm == numberOfAvailableSeatsForCurrentFilm) {
                    break;            //прекъсваме само вътрешния цикъл (за текущия филм) и се изпълнява кодът, който е извън вътрешния цикъл
                }

                inputLines = scanner.nextLine();    //update
            }

            //•	След всеки филм да се отпечата колко процента от кино залата е пълна (тоест, това е процентът на заетите места / процентът на купените билети)
            double percentageOfBoughtTicketsForCurrentFilm = totalNumberOfBoughtTicketsOnlyForCurrentFilm * 1.0 / numberOfAvailableSeatsForCurrentFilm * 100;
            System.out.printf("%s - %.2f%% full.%n", nameOfCurrentFilm, percentageOfBoughtTicketsForCurrentFilm);

            //след като сме принтирали процента заетост на залата за текущия филм, трябва да занулим броя на продадените билети за текущия филм, за да може за следващия филм броенето да почне отначало (от 0)
            totalNumberOfBoughtTicketsOnlyForCurrentFilm = 0;

            input = scanner.nextLine();     //update
        }


        //принтираме общия брой купени билети за всички филми
        System.out.printf("Total tickets: %d%n", totalNumberOfBoughtTicketsForAllFilms);

        //намираме и принтираме процента на купените студентски билети за всички филми
        double percentageOfBoughtStudentTickets = numberOfStudentTickets * 1.0 / totalNumberOfBoughtTicketsForAllFilms * 100;
        System.out.printf("%.2f%% student tickets.%n", percentageOfBoughtStudentTickets);

        //намираме и принтираме процента на купените стандартни билети за всички филми
        double percentageOfBoughtStandardTickets = numberOfStandardTickets * 1.0 / totalNumberOfBoughtTicketsForAllFilms * 100;
        System.out.printf("%.2f%% standard tickets.%n", percentageOfBoughtStandardTickets);

        //намираме и принтираме процента на купените детски билети за всички филми
        double percentageOfBoughtKidTickets = numberOfKidTickets * 1.0 / totalNumberOfBoughtTicketsForAllFilms * 100;
        System.out.printf("%.2f%% kids tickets.", percentageOfBoughtKidTickets);
    }
}
