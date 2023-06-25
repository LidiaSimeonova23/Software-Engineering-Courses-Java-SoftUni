package moreExercises9And10ForLoop;

import java.util.Scanner;

public class P02HospitalVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = Integer.parseInt(scanner.nextLine());      //периода, за който трябва да направите изчисления. Цяло число в интервала [1 ... 1000]

        //болницата пристигат пациенти за преглед. Тя разполага първоначално със 7 лекари
        int healersCount = 7;

        //Всеки лекар може да преглежда само по един пациент на ден

        int numberOfTreatedPatientsPerDay = 0;
        int numberOfUntreatedPatientsPerDay = 0;
        int totalNumberOfTreatedPatients = 0;
        int totalNumberOfUntreatedPatients = 0;

        for (int day = 1; day <= numberOfDays; day++) {         //променливата day е вместо i
            int patientsWhoHaveCome = Integer.parseInt(scanner.nextLine());  //На следващите редове (равни на броя на дните) – броя пациенти, които пристигат за преглед за текущия ден. Цяло число в интервала [0…10 000]

            if (day % 3 == 0 && totalNumberOfUntreatedPatients > totalNumberOfTreatedPatients) {    //Всеки трети ден болницата прави изчисления
                healersCount++;     //healersCount = healersCount + 1;   //healersCount += 1;
            }

            if (patientsWhoHaveCome <= healersCount) {          //ако пациентите, които са дошли, са по-малко или равни на лекарите, всички дошли пациенти ще бъдат прегледани
                numberOfTreatedPatientsPerDay = patientsWhoHaveCome;
                numberOfUntreatedPatientsPerDay = 0;
            } else {           //else if (patientsWhoHaveCome > healersCount)      //ако пациентите, които са дошли, са повече от лекарите, ще бъдат прегледани само толкова пациенти, колкото са лекарите
                numberOfTreatedPatientsPerDay = healersCount;
                numberOfUntreatedPatientsPerDay = patientsWhoHaveCome - numberOfTreatedPatientsPerDay;
            }

            totalNumberOfTreatedPatients = totalNumberOfTreatedPatients + numberOfTreatedPatientsPerDay;
            totalNumberOfUntreatedPatients = totalNumberOfUntreatedPatients + numberOfUntreatedPatientsPerDay;
        }


        System.out.printf("Treated patients: %d.%n", totalNumberOfTreatedPatients);
        System.out.printf("Untreated patients: %d.", totalNumberOfUntreatedPatients);
    }
}

