package lecture13DefiningClasses.p02Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carsNumber = Integer.parseInt(scanner.nextLine());    //от първия ред на конзолата четем брой обекти (коли) в класа

        for (int car = 1; car <= carsNumber; car++) {
            String[] carPartsArray = scanner.nextLine().split(" ");     //на всяка итерация четем данни (от конзолата) за текущия обект (текущата кола)

            Car currentCar = new Car();

            if (carPartsArray.length == 3) {     //ако елементите в прочетения масив са точно 3
                currentCar = new Car(carPartsArray[0], carPartsArray[1], Integer.parseInt(carPartsArray[2]));       //информация и за марка, и за модел, и за конски сили
            } else {       //в противен случай (ако елементите в прочетения масив не са 3)
                currentCar = new Car(carPartsArray[0]);        //информация само марката
            }

            System.out.println(currentCar.toString());    //отпечатваме обекта под формата на текст
            //или просто    System.out.println(currentCar);
        }

    }
}
