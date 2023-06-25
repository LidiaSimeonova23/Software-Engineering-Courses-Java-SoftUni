package lecture15ExamPreparation2DateFebruary2023;

import java.util.Scanner;

public class P04FitnessCenterVersion2 {
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

            if (fitnessActivity.equals("Back")) {
                peopleMakingBack += 1;       //peopleMakingBack = peopleMakingBack + 1;    //peopleMakingBack++;
            } else if (fitnessActivity.equals("Chest")) {
                peopleMakingChest += 1;       //peopleMakingChest = peopleMakingChest + 1;
            } else if (fitnessActivity.equals("Legs")) {
                peopleMakingLegs += 1;       //peopleMakingLegs = peopleMakingLegs + 1;
            } else if (fitnessActivity.equals("Abs")) {
                peopleMakingAbs += 1;       //peopleMakingAbs = peopleMakingAbs + 1;
            } else if (fitnessActivity.equals("Protein shake")) {
                peopleForProteinShake += 1;       //peopleForProteinShake = peopleForProteinShake + 1;
            } else if (fitnessActivity.equals("Protein bar")) {
                peopleForProteinBar += 1;       //peopleForProteinBar = peopleForProteinBar + 1;
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
        double percentOfPeopleBuyingProtein = allPeopleBuyingProtein * 1.0 / numberOfVisitors * 100;

        System.out.printf("%.2f%% - work out%n", percentOfTrainingPeople);
        System.out.printf("%.2f%% - protein", percentOfPeopleBuyingProtein);
    }
}
