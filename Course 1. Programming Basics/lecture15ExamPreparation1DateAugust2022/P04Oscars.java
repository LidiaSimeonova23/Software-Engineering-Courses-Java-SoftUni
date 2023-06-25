package lecture15ExamPreparation1DateAugust2022;

import java.util.Scanner;

public class P04Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от конзолата веднъж ще прочетем:
        String actorName = scanner.nextLine();       //Име на актьора – текст
        double initialPointsFromAcademy = Double.parseDouble(scanner.nextLine());     //Точки от академията - реално число в интервала [2.0... 450.5]
        int numberOfJudges = Integer.parseInt(scanner.nextLine());       //Брой оценяващи n – цяло число в интервала[1… 20]

        double totalPoints = initialPointsFromAcademy;   //създаваме си променлива за общ брой точки и задаваме начална стойност първоначалните точки от Академията
        for (int orderOfJudges = 1; orderOfJudges <= numberOfJudges; orderOfJudges++) {     //колкото е броят на съдиите, толкова пъти ще се завърти цикълът, за да видим кой съдия колко точки ще даде
            String judgeName = scanner.nextLine();    //Име на оценяващия – текст
            double pointsFromJudge = Double.parseDouble(scanner.nextLine());   //Точки от оценяващия – реално число в интервала [1.0... 50.0]

            //Точките, които актьорът получава, се формират от: дължината на името на оценяващия, умножено по точките, които дава, делено на две.
            double currentPoints = (judgeName.length() * pointsFromJudge) / 2;   //така намираме точките, които актьорът получава от конкретен съдия

            totalPoints = totalPoints + currentPoints;    //общият брой точки = общия брой точки до момента + текущите точки

            if (totalPoints >= 1250.5) {   //условие за прекъсване на цикъла - Ако резултатът в някой момент надхвърли 1250.5 - програмата трябва да прекъсне и да се отпечата, че даденият актьор е получил номинация
                break;
            }
        }

        if (totalPoints >= 1250.5) {    //Ако резултатът в някой момент надхвърли 1250.5 - да се отпечата, че даденият актьор е получил номинация
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        } else {                        //в противен случай - да се отпечата колко точки не му достигат
            double necessaryPoints = 1250.5 - totalPoints;
            System.out.printf("Sorry, %s you need %.1f more!", actorName, necessaryPoints);
        }

    }
}
