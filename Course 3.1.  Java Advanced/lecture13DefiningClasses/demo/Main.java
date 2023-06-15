package lecture13DefiningClasses.demo;

import lecture13DefiningClasses.p01CarInfo.Car;

public class Main {
    public static void main(String[] args) {

        //създаваме нов обект от клас Car
        Car car = new Car();

        //setters  -> чрез тях задаваме стойности в съответните полета
        // car е обектът, за който извикваме метода
        car.setBrand("Skoda");
        car.setModel("Karoq");
        car.setHorsePower(150);


        //getters  -> чрез тях взимаме стойностите на съответните полета
        // car е обектът, за който извикваме метода
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getHorsePower());

        System.out.println(car.toString());
        System.out.println(car.hashCode());
    }
}
