package lecture10ExerciseForLoop;

import java.util.Scanner;

public class P05SalaryVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата четем:
        int numberOfTabs = Integer.parseInt(scanner.nextLine());       //Брой отворени табове в браузъра n - цяло число в интервала [1...10]
        double salary = Double.parseDouble(scanner.nextLine());        //Заплата - число в интервала [500...1500]


        //много пъти ще четем име на сайт и ще проверяваме дали влиза в дадена категория с глоби  -> ще имаме for-цикъл
        for (int i = 1; i <= numberOfTabs; i++) {         //броят на итерациите на цикъла ще е равен на броя на отворените сайтове
            String nameOfSite = scanner.nextLine();      //пхри всяка итерация на цикъла ще четем име на сайт

            if (nameOfSite.equals("Facebook")) {              //ако сайтът е Facebook, ще го глобят със 150 лв, тоест заплатата му ще е равна на заплатата му до момента - 150
                salary = salary - 150;
            } else if (nameOfSite.equals("Instagram")) {      //или ако сайтът е Instagram, ще го глобят със 100 лв, тоест заплатата му ще е равна на заплатата му до момента - 100
                salary = salary - 100;
            } else if (nameOfSite.equals("Reddit")) {         //или ако сайтът е Reddit, ще го глобят с 50 лв, тоест заплатата му ще е равна на заплатата му до момента - 50
                salary = salary - 50;
            }

            if (salary <= 0) {         //Ако по време на проверката заплатата стане по-малка или равна на 0 лева, програмата приключва  - условие за прекратяване на цикъла.
                break;
            }

        }


        if (salary > 0) {                      //Ако остане от заплатата, да се изпише остатъкът от заплатата (да се изпише като цяло число).
            System.out.printf("%.0f", salary);
        } else {                //В противен случай (тоест, ако по време на проверката заплатата е станала по-малка или равна на 0 лева, на конзолата се изписва  "You have lost your salary."
            System.out.println("You have lost your salary.");
        }


    }
}
