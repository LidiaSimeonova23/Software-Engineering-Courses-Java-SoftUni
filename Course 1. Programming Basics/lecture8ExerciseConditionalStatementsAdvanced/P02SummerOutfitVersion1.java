package lecture8ExerciseConditionalStatementsAdvanced;

import java.util.Scanner;

public class P02SummerOutfitVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());         //•	Градусите - цяло число в интервала [10…42]
        String time = scanner.nextLine();          //•	Текст, време от денонощието - с възможности - "Morning", "Afternoon", "Evening"

        String outfit = "";
        String shoes = "";
        switch (time) {
            case "Morning":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (degrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else {       //else if (degrees >= 25)
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else {       //else if (degrees >= 25)
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else {       //else if (degrees >= 25)
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }

        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
