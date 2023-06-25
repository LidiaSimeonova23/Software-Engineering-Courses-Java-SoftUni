package lecture10ExerciseForLoop;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата четем:
        String nameOfActor = scanner.nextLine();                  //Име на актьора - текст
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());       //Точки от академията - реално число в интервала [2.0... 450.5]
        int numberOfJudges = Integer.parseInt(scanner.nextLine());            //Брой оценяващи n - цяло число в интервала[1… 20]

        double allPoints = pointsFromAcademy;    //създаваме си променлива, която ще ползваме в цикъла и извън него за изчисляване на точките  (живот на променлива) - за начална стойност ще вземем не 0, а точките, които вече има от академията

        for (int i = 1; i <= numberOfJudges; i++) {             //цикълът ще се завърти толкова пъти, колкото е броят на съдиите - от 1 до numberOfJudges
            //на всяко завъртане на цикъла четем име на съдия (текст) и брой точки, които дава (реално число от 1.0 до 50.0)
            String nameOfJudge = scanner.nextLine();
            double pointsFromJudge = Double.parseDouble(scanner.nextLine());

            //Точките, които актьорът получава, се формират от: дължината на името на оценяващия, умножено по точките, които дава, делено на две   - така е по условие.
            int length = nameOfJudge.length();     //намираме дължината на името на съдията - това ще е цяло число (брой символи)
            double totalPointsFromJudge = length * pointsFromJudge / 2;    //изчисляваме точките от определен съдия - дължината на името му * точките, които дава / 2
            allPoints = allPoints + totalPointsFromJudge;               //намираме всички получени точки - това са началните точки от академията + точките от отделните съдии


            //Ако резултатът в някой момент надхвърли 1250.5 - програмата трябва да прекъсне
            if (allPoints > 1250.5) {
                break;
            }

        }


        if (allPoints > 1250.5) {                                               //Ако точките са над 1250.5:   - "Congratulations, {име на актьора} got a nominee for leading role with {точки}!" Резултатът да се форматира до първата цифра след десетичния знак!
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameOfActor, allPoints);
        } else {                                                                //Ако точките не са достатъчни:  -  "Sorry, {име на актьора} you need {нужни точки} more!"
            double necessaryPoints = 1250.5 - allPoints;                        //изчисляваме колко точки не достигат, за да получи номинация
            System.out.printf("Sorry, %s you need %.1f more!", nameOfActor, necessaryPoints);        //Резултатът да се форматира до първата цифра след десетичния знак!
        }


    }
}

