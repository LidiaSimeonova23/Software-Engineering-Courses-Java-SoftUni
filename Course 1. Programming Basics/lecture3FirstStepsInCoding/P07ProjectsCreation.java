package lecture3FirstStepsInCoding;

import java.util.Scanner;

public class P07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int numberOfProjects = Integer.parseInt(scanner.nextLine());

        int timeFor1Project = 3;

        int timeForAllProjects = numberOfProjects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, timeForAllProjects, numberOfProjects);
        //System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, numberOfProjects * timeFor1Project, numberOfProjects);
    }
}
