package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //в условието на задачата е написан код, в който има грешки и ние трябва да ги поправим
        //това е верният код:

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double volume = (length * width * height) / 3;

        System.out.print("Length: ");
        System.out.print("Width: ");
        System.out.print("Height: ");
        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}
