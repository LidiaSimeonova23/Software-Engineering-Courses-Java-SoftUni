package pbExam4Date9And10March2019;

import java.util.Scanner;

public class P03GymnasticsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Входът се чете от конзолата и се състои от два реда:
        String country = scanner.nextLine();    //държава – текст ("Russia", "Bulgaria" или "Italy")
        String device = scanner.nextLine();     //уред - текст ("ribbon", "hoop" или "rope")

        double difficultyAssessment = 0;     //създаваме си променлива за оценка за трудност
        double performanceAssessment = 0;    //създаваме си променлива за оценка за изпълнение
        switch (country) {
            case "Russia":         //ако държавата е Русия
                if (device.equals("ribbon")) {             //ако уредът е лента
                    difficultyAssessment = 9.100;
                    performanceAssessment = 9.400;
                } else if (device.equals("hoop")) {        //ако уредът е обръч
                    difficultyAssessment = 9.300;
                    performanceAssessment = 9.800;
                } else if (device.equals("rope")) {        //ако уредът е въже
                    difficultyAssessment = 9.600;
                    performanceAssessment = 9.000;
                }
                break;
            case "Bulgaria":        //ако държавата е България
                if (device.equals("ribbon")) {             //ако уредът е лента
                    difficultyAssessment = 9.600;
                    performanceAssessment = 9.400;
                } else if (device.equals("hoop")) {        //ако уредът е обръч
                    difficultyAssessment = 9.550;
                    performanceAssessment = 9.750;
                } else if (device.equals("rope")) {        //ако уредът е въже
                    difficultyAssessment = 9.500;
                    performanceAssessment = 9.400;
                }
                break;
            case "Italy":         //ако държавата е Италия
                if (device.equals("ribbon")) {             //ако уредът е лента
                    difficultyAssessment = 9.200;
                    performanceAssessment = 9.500;
                } else if (device.equals("hoop")) {        //ако уредът е обръч
                    difficultyAssessment = 9.450;
                    performanceAssessment = 9.350;
                } else if (device.equals("rope")) {        //ако уредът е въже
                    difficultyAssessment = 9.700;
                    performanceAssessment = 9.150;
                }
                break;
        }

        //намираме общия резултат на отбора
        double totalScoreOfTeam = difficultyAssessment + performanceAssessment;

        //колко процента не им достигат, за да имат максималната оценка, която е 20
        double maxScore = 20;
        double missingPoints = maxScore - totalScoreOfTeam;    //намираме колко точки не им достигат (до максималния резултат)

        //намираме missingPoints какъв процент са от 20
        double percentageOfMissingPoints = missingPoints / 20 * 100;

        System.out.printf("The team of %s get %.3f on %s.%n", country, totalScoreOfTeam, device);
        System.out.printf("%.2f%%", percentageOfMissingPoints);
    }
}
