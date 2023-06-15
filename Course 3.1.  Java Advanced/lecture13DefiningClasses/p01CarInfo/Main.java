package lecture13DefiningClasses.p01CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());    //четем от първия ред на конзолата брой обекти в класа (брой коли)

        for (int currentCar = 1; currentCar <= numberOfCars; currentCar++) {
            String dataOfCurrentCar = scanner.nextLine();     //на всяка итерация четем данните за текущия обект (текущата кола)   // "{brand} {model} {horsePower}"
            String[] partsOfCurrentCarArray = dataOfCurrentCar.split("\\s+");       //["brand", "model", "horsePower"]
            String brandOfCurrentCar = partsOfCurrentCarArray[0];
            String modelOfCurrentCar = partsOfCurrentCarArray[1];
            int horsePowerOfCurrentCar = Integer.parseInt(partsOfCurrentCarArray[2]);

            //създаваме нов обект (който е празен) в класа Car
            Car car = new Car();

            //на създадения от нас обект му сетваме данните, които сме прочели от конзолата
            car.setBrand(brandOfCurrentCar);
            car.setModel(modelOfCurrentCar);
            car.setHorsePower(horsePowerOfCurrentCar);

            System.out.println(car.toString());      //отпечатваме обекта под формата на текст
            //System.out.println(car);
        }

    }
}
