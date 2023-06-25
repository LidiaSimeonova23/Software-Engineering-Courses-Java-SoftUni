package moreExercises3And4FirstStepsInCoding;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 2 числа, по едно на ред: w (дължина в метри) и h (широчина в метри).
        double lengthInMeters = Double.parseDouble(scanner.nextLine());   //дължината на правоъгълника (залата)
        double heightInMeters = Double.parseDouble(scanner.nextLine());   //височината/широчината на правоъгълника (залата)


        //трябва да работим в една и съща мерна единица, затова превръщаме метрите в сантиметри
        double lengthInCentimeters = lengthInMeters * 100;    //намираме дължината в сантиметри
        double heightInCentimeters = heightInMeters * 100;    //намираме височината/широчината в сантиметри

        double heightOfCorridor = 100;     //по условие е дадено, че широч. на коридора е 100 см

        double heightWithoutHeightOfCorridor = heightInCentimeters - 100;   //от цялата височина/широчина вадим дължината на коридора

        //Едно работно място заема 70 на 120 cm (маса с размер 70 на 40 cm + място за стол и преминаване с размер 70 на 80 cm).
        double desksPerRow = Math.floor(heightWithoutHeightOfCorridor / 70);          //намираме колко бюра има на 1 ред
        double rows = Math.floor(lengthInCentimeters / 120);                    //намираме колко редове има в залата
        //и в двата случая закръглихме до най-близкото цяло по-малко число (напр. ако са 7.5, ще има място за 7, а не за 8, затова закръгляме към по-малкото число)


        //Изчислено е, че заради входната врата (която е с отвор 160 cm) се губи точно 1 работно място, а заради катедрата (която е с размер 160 на 120 cm) се губят точно 2 работни места.
        double numberOfSeats = desksPerRow * rows - (1 + 2);

        System.out.printf("%.0f", numberOfSeats);
    }
}
