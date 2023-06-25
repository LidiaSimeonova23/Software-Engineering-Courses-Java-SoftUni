package lecture15ExamPreparation2DateFebruary2023;

import java.util.Scanner;

public class P04FitnessCenterVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfVisitors = Integer.parseInt(scanner.nextLine());          //броят на посетителите във фитнеса – цяло число в интервала [1...1000]

        //•	За всеки един посетител на отделен ред – дейността във фитнеса – текст ("Back", "Chest", "Legs", "Abs", "Protein shake" или "Protein bar")
        int peopleMakingBack = 0;
        int peopleMakingChest = 0;
        int peopleMakingLegs = 0;
        int peopleMakingAbs = 0;
        int peopleForProteinShake = 0;
        int peopleForProteinBar = 0;

        for (int currentVisitor = 1; currentVisitor <= numberOfVisitors; currentVisitor++) {
            String fitnessActivity = scanner.nextLine();

            switch (fitnessActivity) {
                case "Back":
                    peopleMakingBack++;       //peopleMakingBack = peopleMakingBack + 1;    //peopleMakingBack+=1;
                    break;
                case "Chest":
                    peopleMakingChest++;       //peopleMakingChest = peopleMakingChest + 1;
                    break;
                case "Legs":
                    peopleMakingLegs++;       //peopleMakingLegs = peopleMakingLegs + 1;
                    break;
                case "Abs":
                    peopleMakingAbs++;       //peopleMakingAbs = peopleMakingAbs + 1;
                    break;
                case "Protein shake":
                    peopleForProteinShake++;       //peopleForProteinShake = peopleForProteinShake + 1;
                    break;
                case "Protein bar":
                    peopleForProteinBar++;       //peopleForProteinBar = peopleForProteinBar + 1;
                    break;
            }

        }


        System.out.printf("%d - back%n", peopleMakingBack);
        System.out.printf("%d - chest%n", peopleMakingChest);
        System.out.printf("%d - legs%n", peopleMakingLegs);
        System.out.printf("%d - abs%n", peopleMakingAbs);
        System.out.printf("%d - protein shake%n", peopleForProteinShake);
        System.out.printf("%d - protein bar%n", peopleForProteinBar);

        int totalNumberOfTrainingPeople = peopleMakingBack + peopleMakingChest + peopleMakingLegs + peopleMakingAbs;
        int allPeopleBuyingProtein = peopleForProteinShake + peopleForProteinBar;

        double percentOfTrainingPeople = totalNumberOfTrainingPeople * 1.0 / numberOfVisitors * 100;
        System.out.printf("%.2f%% - work out%n", percentOfTrainingPeople);

        double percentOfPeopleBuyingProtein = allPeopleBuyingProtein * 1.0 / numberOfVisitors * 100;
        System.out.printf("%.2f%% - protein", percentOfPeopleBuyingProtein);
    }
}
