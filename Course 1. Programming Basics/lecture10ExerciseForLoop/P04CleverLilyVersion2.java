package lecture10ExerciseForLoop;

import java.util.Scanner;

public class P04CleverLilyVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата четем
        int ageN = Integer.parseInt(scanner.nextLine());               //Възрастта на Лили - цяло число в интервала [1...77]
        double priceOfWashingMachine = Double.parseDouble(scanner.nextLine());         //Цената на пералнята - число в интервала [1.00...10 000.00]
        int priceOf1Toy = Integer.parseInt(scanner.nextLine());        //Единична цена на играчка - цяло число в интервала [0...40]

        int numberOfToys = 0;     //създаваме си променлива с нач. стойност 0 - това ще е броят играчки, които Лили е получила
        double money = 0;         //създаваме си променлива с нач. стойност 0 - това ще са пари, които Лили е получила за съответния рожден ден    double променливата може да е дробно/реално/десетично число, но може и да е цяло число
        double allMoney = 0;      //създаваме си променлива с нач. стойност 0 - това ще е общата сума пари, които Лили е получила за всички рождени дни    double променливата може да е дробно/реално/десетично число, но може и да е цяло число
        double moneyTakenByBrother = 0;

        for (int i = 1; i <= ageN; i++) {                   //знаем, че нач. на цикъла е 1, краят е броят години, тоест ageN, стойността на променливата нараства с единица

            if (i % 2 == 0) {                        //ако е четен рожден ден
                money = money + 10;                      //изчисляваме колко пари Лили е получила за съответния рожден ден - на всеки четен рожден ден получава с 10 лв повече
                allMoney = allMoney + money;             //изчисляваме общата сума пари, които Лили е получила от всичките си четни рождени дни - парите, които има до момента + порите от съответния рожден ден
                moneyTakenByBrother++;           //намираме сумата пари, които братът на Лили е взел от нея   - можем да го запишем и така:  moneyTakenByBrother = moneyTakenByBrother + 1;
            } else {                                 //ако е нечетен рожден ден, Лили ще получи играчка
                numberOfToys++;                //намираме брой получени играчки  - можем да го запишем и така:  numberOfToys = numberOfToys + 1;
            }

        }

        double toySum = numberOfToys * priceOf1Toy;        //намираме колко пари е спечелила от продажбата на играчките  - умножаваме брой играчки по еденичнаат им цена
        double totalMoney = allMoney + toySum - moneyTakenByBrother;    //намираме парите, които е събрала Лили - парите от рождените дни + парите от продажбата на игачките - парите, взети от брат й


        if (totalMoney >= priceOfWashingMachine) {                   //ако е събрала достатъчно пари (тоест повече или колкото е пералнята), да се принтира колко са й останали
            System.out.printf("Yes! %.2f", totalMoney - priceOfWashingMachine);
        } else {                                                     //в противен случай - тоест, ако парите не са й стигнали (защото са по-малко от цената на пералнята), да се принтира с колко не са й стигнали
            System.out.printf("No! %.2f", priceOfWashingMachine - totalMoney);        //вместо Math.abs(totalMoney - priceOfWashingMachine)   можем да напишем:     priceOfWashingMachine - totalMoney
        }


    }
}
