package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P06ForeignLanguagesVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that prints the language that a given country speaks.
        //You can receive only the following combinations: English is spoken in England and USA; Spanish is spoken in Spain, Argentina, and Mexico; for the others, you should print "unknown".
        //You will receive a single country name on a single line.

        String countryName = scanner.nextLine();

        //имаме по няколко случая, на които съответства един и същи код -> каскадно пропадане:
        switch (countryName) {
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}
