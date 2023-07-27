package lecture5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P06ForeignLanguagesVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that prints the language that a given country speaks.
        //You can receive only the following combinations: English is spoken in England and USA; Spanish is spoken in Spain, Argentina, and Mexico; for the others, you should print "unknown".
        //You will receive a single country name on a single line.

        String countryName = scanner.nextLine();

        //имаме по няколко случая, на които съответства един и същи код - в проверката ползваме логическото "или"
        if (countryName.equals("England") || countryName.equals("USA")) {
            System.out.println("English");
        } else if (countryName.equals("Spain") || countryName.equals("Argentina") || countryName.equals("Mexico")) {
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }

    }
}
