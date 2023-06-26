package pbExam1Date28And29March2020;

import java.util.Scanner;

public class P04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = Integer.parseInt(scanner.nextLine());        //•	Брой дни – цяло число в диапазона [1…30]
        double availableTotalAmountOfFood = Double.parseDouble(scanner.nextLine());       //•	Общо количество храна – реално число в диапазона [0.00…10000.00]


        double biscuitsPerAllDays = 0;
        int foodEatenForAllDays = 0;
        int foodEatenByDogForAllDays = 0;
        int foodEatenByCatForAllDays = 0;
        for (int day = 1; day <= numberOfDays; day++) {          //за име на променливата ползвам day вместо i
            int foodEatenByDogPerCurrentDay = Integer.parseInt(scanner.nextLine());       //Количество изядена храна от кучето – цяло число в диапазона [10…500]
            int foodEatenByCatPerCurrentDay = Integer.parseInt(scanner.nextLine());        //Количество изядена храна от котката – цяло число в диапазона [10…500]

            foodEatenByDogForAllDays = foodEatenByDogForAllDays + foodEatenByDogPerCurrentDay;     //Количество изядена храна от кучето за всички дни
            foodEatenByCatForAllDays = foodEatenByCatForAllDays + foodEatenByCatPerCurrentDay;     //Количество изядена храна от котката за всички дни

            int foodPerDayEatenByPets = foodEatenByDogPerCurrentDay + foodEatenByCatPerCurrentDay;      //намираме колко храна са изели двете животни за текущия ден
            foodEatenForAllDays = foodEatenForAllDays + foodPerDayEatenByPets;    //намираме колко храна са изели двете животни общо за всички дни

            //ако денят е трети, получават награда бисквитки - Количеството на бисквитките е 10% от общо изядената храна за деня.
            double biscuitsPerDay = 0;
            if (day % 3 == 0) {
                biscuitsPerDay = foodPerDayEatenByPets * 1.0 * 10 / 100;       //намираме колич. изядени бисквитки за текущия ден
            }

            biscuitsPerAllDays = biscuitsPerAllDays + biscuitsPerDay;        //намираме общото колич. изядени бисквитки за всички дни
        }

        //Количеството изядени бисквитки трябва да бъде закръглено до най–близкото цяло число
        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuitsPerAllDays);

        //колко процента от първоначалното количество обща храна са изяли
        double percentageOfEatenFoodForAllDays = foodEatenForAllDays * 100 / availableTotalAmountOfFood;
        System.out.printf("%.2f%% of the food has been eaten.%n", percentageOfEatenFoodForAllDays);


        //колко процента от изядената храна е изяло кучето
        double percentageOfFoodEatenByDogForAllDays = foodEatenByDogForAllDays * 1.0 * 100 / foodEatenForAllDays;
        System.out.printf("%.2f%% eaten from the dog.%n", percentageOfFoodEatenByDogForAllDays);

        //колко процента от изядената храна е изяла котката
        double percentageOfFoodEatenByCatForAllDays = foodEatenByCatForAllDays * 1.0 * 100 / foodEatenForAllDays;
        System.out.printf("%.2f%% eaten from the cat.", percentageOfFoodEatenByCatForAllDays);
    }
}
