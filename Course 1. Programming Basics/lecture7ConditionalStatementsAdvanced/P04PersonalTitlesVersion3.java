package lecture7ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P04PersonalTitlesVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());     //възраст (десетично число)
        String gender = scanner.nextLine();            //пол ("m" или "f")

        //•	"Mr." - мъж (пол "m") на 16 или повече години
        //•	"Master" - момче (пол "m") под 16 години
        //•	"Ms." - жена (пол "f") на 16 или повече години
        //•	"Miss" - момиче (пол "f") под 16 години

        switch (gender) {
            case "m":
                if (age >= 16) {
                    System.out.println("Mr.");
                } else if (age < 16) {
                    System.out.println("Master");
                }
                break;
            case "f":
                if (age >= 16) {
                    System.out.println("Ms.");
                } else if (age < 16) {
                    System.out.println("Miss");
                }
                break;
        }


    }
}
