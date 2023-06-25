package lecture15ExamPreparation1DateAugust2022;

import java.util.Scanner;

public class P05Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат следните редове:
        int height = Integer.parseInt(scanner.nextLine());       //Височина на стената - цяло число [0… 100]
        int width = Integer.parseInt(scanner.nextLine());        //Ширина на стената - цяло число [0… 100]
        int percentUnpaintedArea = Integer.parseInt(scanner.nextLine());   //Процент от общата площ на стените, който няма да бъде боядисан - цяло число [5… 95] - тоест, това е площта на прозорците и вратите

        //условието е площта за боядисване да бъде закръглена нагоре до най-близкото цяло число - за да закръгляме тази площ, тя трябва да е реално число - double.
        double wholeArea = Math.ceil(height * width * 4);     //площта е равна на вис. по широч. (и умножаваме по 4, защото по условие има 4 еднакви стени за боядисване)
        double areaForPainting = wholeArea - (wholeArea * percentUnpaintedArea / 100);   //намираме колко квадратни метра е площта за боядисване (равна е на цялата площ - площта, която няма да бъде боядисана  - а тази площ, която няма да бъде боядисана, е процент от цялата площ)


        //На следващите редове до получаване на командата "Tired!" или докато не бъдат боядисани всички стени, се чете по едно число:
        //•	Литри боя – цяло число [0…100]:

        String input = scanner.nextLine();             //първоначално определяме входните данни като текст (String)
        while (!input.equals("Tired!")) {             //докато входните данни са различни от Tired!, ще четем литри боя
            int currentLitresOfPaint = Integer.parseInt(input);  //щом входните данни не са Tired!, значи са число - превърни ги в число и ги запази в променлива от тип int

            //с един литър боя се боядисва един квадратен метър от стената -> колкото са литрите боя, толкова кв. метра е успял да боядиса
            areaForPainting = areaForPainting - currentLitresOfPaint;    //намираме колко кв. метра остават за боядисване (от площта за боядисване вадим литрите боя, тъй като те всъщност са равни на боядисаните кв. метри)

            if (areaForPainting <= 0) {            //ако сме боядисали цялата площ (тоест, ако площта за боядисване е по-малка или равна на 0)
                break;
            }

            input = scanner.nextLine();      //update на входните данни
        }

        if (areaForPainting == 0) {             //ако е боядисал цялата площ
            System.out.println("All walls are painted! Great job, Pesho!");
        } else if (areaForPainting > 0) {       //ако му е останала площ за боядисване
            System.out.printf("%.0f quadratic m left.", areaForPainting);
        } else {
            System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(areaForPainting));
        }


    }
}
