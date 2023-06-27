package pbExam1Date28And29March2020;

import java.util.Scanner;

public class P05SuitcasesLoadVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която помага при товаренето на куфари в багажника на самолет

        double capacityForLoad = Double.parseDouble(scanner.nextLine());       //•	Капацитетът на багажника – реално число в диапазона [100.0…6000.0]


        //След това до получаване на команда "End" или до запълване на багажника се чете по един ред:
        boolean noMoreCapacity = false;
        int numberOfLoadedSuitcases = 0;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            double volumeOfCurrentLoad = Double.parseDouble(input);      //Обем на куфар – реално число в диапазона [100.0…6000.0]

            //Обемът на всеки трети куфар трябва да се увеличава с 10% поради загубата на пространство при начина на подреждане.
            if (volumeOfCurrentLoad % 3 == 0) {
                volumeOfCurrentLoad = volumeOfCurrentLoad + (volumeOfCurrentLoad * 10 / 100);
            }

            //ако има място за текущия куфар, го качваме (и броят на натоварените куфари се увеличава с единица)
            if (volumeOfCurrentLoad <= capacityForLoad) {
                numberOfLoadedSuitcases++;
            }

            capacityForLoad = capacityForLoad - volumeOfCurrentLoad;      //на всяка итерация на цикъла проверяваме какъв обем от капацитета е останал незает

            if (capacityForLoad <= 0) {              //ако капацитетът на багажника е изчерпан, в него вече няма място за други куфари
                noMoreCapacity = true;
                break;
            }

            input = scanner.nextLine();    //update
        }


        if (input.equals("End")) {         //•	При получаване на командата "End"
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.", numberOfLoadedSuitcases);
        } else {        //•	Ако обемът на куфара е по-голям от оставащото пространство в багажника       //else if (noMoreCapacity)
            System.out.println("No more space!");
            System.out.printf("Statistic: %d suitcases loaded.", numberOfLoadedSuitcases);
        }


    }
}
