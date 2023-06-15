package lecture13DefiningClasses.P01CarInfo;

public class Car {

    //всеки клас има:
    //1. полета - в тях описваме характеристиките на обектите

    private String brand;

    private String model;

    private int horsePower;


    //2. методи - в тях описваме какво правят обектите:

    //a) getters -> чрез тях взимаме стойността на полетата (връщат стойността на полетата) - от тип return са

    //a.1 getter на полето brand (метод, който връща стойността на полето brand)
    public String getBrand() {
        return this.brand;
    }

    //a.2 getter на полето model (метод, който връща стойността на полето model)
    public String getModel() {
        return this.model;
    }

    //a.3 getter на полето horsePower (метод, който връща стойността на полето horsePower)
    public int getHorsePower() {
        return this.horsePower;
    }


    //б) setters -> чрез тях задаваме стойност на полетата - от тип void  са

    //б.1 setter на полето brand (метод, с който задаваме/сетваме стойност на полето brand)
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //б.2 setter на полето model (метод, с който задаваме/сетваме стойност на полето model)
    public void setModel(String model) {
        this.model = model;
    }

    //б.3 setter на полето horsePower (метод, с който задаваме/сетваме стойност на полето horsePower)
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }


    //вградени методи, които притежава всеки клас: .toString()    .equals()    .hashCode()
    //  .toString()   ->   представя обекта под формата на текст  -  по дефолт представянето е във вида "package.Class@address"     //но чрез @Override можем да го презапишем, за да ни върне това, което ни трябва

    @Override
    public String toString() {
        // искаме да отпечатаме обекта в такъв вид:   "The car is: Chevrolet Impala - 390 HP."
        return String.format("The car is: %s %s - %d HP.", this.getBrand(), this.getModel(), this.getHorsePower());      //чрез String.format  събираме всичките данни в един израз - и използваме шаблони и аргументи
        //return String.format("The car is: %s %s - %d HP.", brand, model, horsePower);
        //return String.format("The car is: %s %s - %d HP.", this.brand, this.model, this.horsePower);
    }

}
