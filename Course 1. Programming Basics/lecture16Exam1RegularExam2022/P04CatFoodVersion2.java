package lecture16Exam1RegularExam2022;

import java.util.Scanner;

public class P04CatFoodVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCats = Integer.parseInt(scanner.nextLine());    //броят на котките - цяло число в интервала [1..100]

        int smallCatsCount = 0;   //създаваме си променлива за броя на котките в групата малки котки (с начална стойност 0)
        int bigCatsCount = 0;       //създаваме си променлива за броя на котките в групата големи котки (с начална стойност 0)
        int largeCatsCount = 0;       //създаваме си променлива за броя на котките в групата огромни котки (с начална стойност 0)

        double foodInGrams1 = 0;    //създаваме си променлива за колич. храна (в грамове) на котките от група 1 - с начална стойност 0, после ще се променя
        double foodInGrams2 = 0;    //създаваме си променлива за колич. храна (в грамове) на котките от група 2 - с начална стойност 0, после ще се променя
        double foodInGrams3 = 0;    //създаваме си променлива за колич. храна (в грамове) на котките от група 3 - с начална стойност 0, после ще се променя

        //многократно ще четем входни данни - цикъл - знаем колко пъти ще се завърти - колкото е броят на котките - значи, че ще използваме for-цикъл
        for (int currentCat = 1; currentCat <= numberOfCats; currentCat++) {
            double foodInGrams = Double.parseDouble(scanner.nextLine());             //ще четем коя котка по колко грама храна яде за 1 ден - Х грама храна - реално число в интервала [100.00..400.00]

            //правим проверка, за да определим към коя група принадлежи котката
            if (foodInGrams >= 100 && foodInGrams < 200) {                           //ако котката изяжда от 100 (вкл.)  до 200 грама, то тя попада в група 1: малки котки.
                smallCatsCount++;    //smallCatsCount = smallCatsCount + 1;     //щом котката принадлежи към тази група, значи броят котки от тази група нараства с единица
                foodInGrams1 = foodInGrams1 + foodInGrams;      //foodInGrams1 += foodInGrams;     //общо храната на всички котки в група 1
            } else if (foodInGrams >= 200 && foodInGrams < 300) {                    //ако котката изяжда от 200 (вкл.)  до 300 грама, то тя попада в група 2: големи котки.
                bigCatsCount++;      //bigCatsCount = bigCatsCount + 1;
                foodInGrams2 = foodInGrams2 + foodInGrams;       //foodInGrams2 += foodInGrams;     //общо храната на всички котки в група 2
            } else if (foodInGrams >= 300 && foodInGrams < 400) {                    //ако котката изяжда от 300 (вкл.)  до 400 грама, то тя попада в група 3: огромни котки.
                largeCatsCount++;    //largeCatsCount = largeCatsCount + 1;
                foodInGrams3 = foodInGrams3 + foodInGrams;       //foodInGrams3 += foodInGrams;      //общо храната на всички котки в група 3
            }
        }


        System.out.printf("Group 1: %d cats.%n", smallCatsCount);    //принтираме брой котки в група 1 - малки котки
        System.out.printf("Group 2: %d cats.%n", bigCatsCount);      //принтираме брой котки в група 2 - големи котки
        System.out.printf("Group 3: %d cats.%n", largeCatsCount);    //принтираме брой котки в група 3 - огромни котки

        double totalFoodInGrams = foodInGrams1 + foodInGrams2 + foodInGrams3;   //намираме колко грама храна изяждат всички котки за един ден

        //цената обаче ни е дадена за 1 кг (по условие 1 кг храна = 12.45 лева); 1 кг = 1000 гр
        double foodInKilograms = totalFoodInGrams / 1000;     //намираме колко килограма храна изяждат всички котки (като превърнем грамовете в килограми)

        double totalPriceOfFood = foodInKilograms * 12.45;   //намираме цената на храната за всички котки
        System.out.printf("Price for food per day: %.2f lv.", totalPriceOfFood);         //принтираме цената за храната на всички котки
    }
}
