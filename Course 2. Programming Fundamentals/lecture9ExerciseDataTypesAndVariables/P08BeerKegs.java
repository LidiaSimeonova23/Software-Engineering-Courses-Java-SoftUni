package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numberOfKegs = Byte.parseByte(scanner.nextLine());    //от първия ред на конзолата четем цяло число за брой кегове  - ще е в интервала [1…10].
        //може и така да го прочетем: int numberOfKegs = Integer.parseInt(scanner.nextLine());

        //многократно (знаем колко пъти -> for цикъл) за всеки отделен кег ще четем по 3 реда данни, ще му намираме обем, ща търсим най-голям обем и кой е моделът кегове с най-голям обем:
        double maxVolume = Double.MIN_VALUE;    //създаваме си променлива, която ще държи кега с максимален обем - с начална стойност най-малката възможна от тип double
        String modelOfKegsWithMaxVolume = "";      //създаваме си променлива, която ще държи модела кегове с максимален обем - с начална стойност празен String

        for (int currentKeg = 1; currentKeg <= numberOfKegs; currentKeg++) {    //цикълът ще се повтаря толкова пъти, колкото е броят кегове, инкрементация с единица
            String modelOfCurrentKeg = scanner.nextLine();    //за всеки кег четем модел - текст
            double radiusOfCurrentKeg = Double.parseDouble(scanner.nextLine());   //за всеки кег четем радиус - дробно число в интервала [1…3.402823E+38].
            int heightOfCurrentKeg = Integer.parseInt(scanner.nextLine());   //за всеки кег четем височина - цяло число в интервала [1…2147483647].

            //Дадено ни е, че обемът на кег се намира по формулата:   π * r^2 * h
            //тъй като радиусът е double променлива, ясно е, че обемът (който в случая е произведение) също е double променлива
            double currentKegVolume = Math.PI * Math.pow(radiusOfCurrentKeg, 2) * heightOfCurrentKeg;    //намираме обема на текущия кег

            //проверка - ако обемът на текущия кег е по-голям от максималния обем, значи максимален обем става обемът на текущия кег
            if (currentKegVolume > maxVolume) {
                maxVolume = currentKegVolume;
                modelOfKegsWithMaxVolume = modelOfCurrentKeg;    //щом текущият кег е с максимален обем, то неговият модел е моделът кегове с максимален обем
            }

        }

        //накрая извън цикъла принтираме кой е моделът кегове с максимален обем
        System.out.println(modelOfKegsWithMaxVolume);
        //System.out.printf("%s", modelOfKegsWithMaxVolume);
    }
}
