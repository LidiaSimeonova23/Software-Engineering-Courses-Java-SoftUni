package lecture8DataTypesAndVariables;

import java.util.Scanner;

public class P01ConvertMetersToKilometersVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short meters = Short.parseShort(scanner.nextLine());      //от първия ред на конзолата четем 1 цяло число (разстояние в метри)
        //в този случай за цяло число можем да ползваме променлива от тип short (обхватът е от -32 768 до 32 767), защото примерните входни данни се побират в диапазона на short

        //трябва да превърнем метрите в километри -> знаем, че 1 км = 1000 м  -> когато превръщаме по-малката мерна единица в по-голяма, трябва да делим ->
        //в случая целта е да намерим реалното число (без да губим информация); а и в условието е казано, че трябва да закръглим резултата до 2 знака след десетичната точка - затова променливата ще е от тип double
        double kilometers = meters * 1.0 / 1000;
        System.out.printf("%.2f", kilometers);   //принтираме километрите, закръглени до 2 знака след десет. точка
    }
}
