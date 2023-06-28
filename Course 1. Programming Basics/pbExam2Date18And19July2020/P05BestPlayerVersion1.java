package pbExam2Date18And19July2020;

import java.util.Scanner;

public class P05BestPlayerVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат по два реда до въвеждане на команда "END":        -> while loop
        //•	Име на играч – текст
        //•	Брой вкарани голове  – цяло положително число в интервала [1 … 10000]

        int maxNumberOfGoals = Integer.MIN_VALUE;        //създаваме си променлива за максимален брой голове
        String bestPlayer = "";        //създаваме си променлива за най-добър играч (не знаем кой е, но променливата е от тип String, затова задаваме като начална стойност празен String)
        String nameOfCurrentPlayer = scanner.nextLine();
        while (!nameOfCurrentPlayer.equals("END")) {
            int numberOfGoalsOfCurrentPlayer = Integer.parseInt(scanner.nextLine());

            if (numberOfGoalsOfCurrentPlayer > maxNumberOfGoals) {         //ако броят голове на текущия играч е по-голям от максималния брой голове
                maxNumberOfGoals = numberOfGoalsOfCurrentPlayer;        //на максималния брой голове присвояваме като стойност броя голове на текущия играч
                bestPlayer = nameOfCurrentPlayer;       //намираме кой е най-добрият футболист (текущият играч)
            }

            if (maxNumberOfGoals >= 10) {           //Ако най-добрият футболист е вкарал 10 или повече гола, програмата трябва да спре.
                break;
            }

            nameOfCurrentPlayer = scanner.nextLine();   //update
        }


        System.out.printf("%s is the best player!%n", bestPlayer);    //принтираме кой е играчът с най-много голове

        boolean hasTheBestPlayerMadeHatTrick = maxNumberOfGoals >= 3;       //създаваме си булева променлива дали най-добрият футболист е направил хет-трик (когато броят на головете е по-голям или равен на три)
        if (hasTheBestPlayerMadeHatTrick) {        //Ако най-добрият футболист е направил хеттрик (когато футболистът е вкарал 3 или повече гола)
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxNumberOfGoals);
        } else {       //в противен случай (ако най-добрият футболист не е направил хеттрик)
            System.out.printf("He has scored %d goals.", maxNumberOfGoals);
        }

    }
}
