package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P11SnowballsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //ако целта е да пестим памет, вместо int за цели числа можем да ползваме byte или short, когато е възможно (в тази задача това е възможно на няколко места)

        byte numberOfSnowballs = Byte.parseByte(scanner.nextLine());   //от първия ред на конзолата четем едно цяло число в интервала [0, 100] - за брой снежни топки

        //трябва да сравняваме снежните топки и да намерим/принтираме тази с най-високата стойност (snowballValue)
        //многократно ще правим едно и също нещо - знаем колко пъти (колкото е броят на топките) -> ще ползваме for цикъл
        //ще се повтарят следните действия: четене на входни данни (за всяка текуща топка ще се четат по 3 реда входни данни), изчисляване (по дадената формула), сравнение
        //изчисляване стойността на снежната топка по формула, дадена в условието - (snowballSnow / snowballTime) ^ snowballQuality

        double maxValue = Double.MIN_VALUE;     //създаваме си променлива за максимална стойност, като й даваме нач. стойност най-малката възможна стойност
        int snowballSnowBiggest = 0;   //създаваме си променлива за снежната топка с най-много сняг
        int snowballTTimeBiggest = 0;   //създаваме си променлива за снежната топка, отнела най-много време
        int snowballQualityBiggest = 0;   //създаваме си променлива за снежната топка с най-високо качество

        for (int currentSnowball = 1; currentSnowball <= numberOfSnowballs; currentSnowball++) {         //for (int i = 1; i <= numberOfSnowballs; i++)
            short currentSnowballSnow = Short.parseShort(scanner.nextLine());      //за текущата топка четем snowballSnow – цяло число в интервала [0, 1000]
            short currentSnowballTime = Short.parseShort(scanner.nextLine());      //за текущата топка четем snowballTime – цяло число в интервала [1, 500]
            byte currentSnowballQuality = Byte.parseByte(scanner.nextLine());   //за текущата топка четем snowballQuality – цяло число в интервала [0, 100].

            //изчисляваме стойността на текущата снежна топка по формулата: (snowballSnow / snowballTime) ^ snowballQuality         //знакът ^  е за степенуване
            double currentSnowballValue = Math.pow((currentSnowballSnow * 1.0 / currentSnowballTime), currentSnowballQuality);

            //сравняваме стойността на текущата снежна топка с най-голямата възможна стойност на снежна топка
            //и след всички итерации намираме коя е снежната топка с най-голяма стойност; а щом дадена топка е с най-голяма стойност, то същата тази топка е с най-много сняг, с най-много време, с най-високо качество
            if (currentSnowballValue > maxValue) {
                maxValue = currentSnowballValue;
                snowballSnowBiggest = currentSnowballSnow;
                snowballTTimeBiggest = currentSnowballTime;
                snowballQualityBiggest = currentSnowballQuality;
            }

        }


        //принтираме данните на снежната топка с най-високата стойност (snowballValue)
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowBiggest, snowballTTimeBiggest, maxValue, snowballQualityBiggest);
    }
}
