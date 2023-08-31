package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P01ConvertMetersToKilometersVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int meters = Integer.parseInt(scanner.nextLine());      //от първия ред на конзолата четем 1 цяло число (разстояние в метри) - обикновено за цяло число ползваме променлива от тип int

        //трябва да превърнем метрите в километри -> знаем, че 1 км = 1000 м  -> когато превръщаме по-малката мерна единица в по-голяма, трябва да делим ->
        //в случая целта е да намерим реалното число (без да губим информация); а и в условието е казано, че трябва да закръглим резултата до 2 знака след десетичната точка - затова променливата ще е от тип double
        double kilometers = meters * 1.0 / 1000;
        System.out.printf("%.2f", kilometers);   //принтираме километрите, закръглени до 2 знака след десет. точка
    }
}
