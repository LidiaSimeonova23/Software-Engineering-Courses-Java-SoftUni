package pbExam4Date9And10March2019;

import java.util.Scanner;

public class P04DartsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Първоначално се чете един ред:
        String nameOfPlayer = scanner.nextLine();      //Името на играча - текст


        //Първоначално играчът започва с 301 точки.
        int availablePoints = 301;

        //След това до получаване на команда "Retire" се четат многократно по два реда:
        int numberOfSuccessfulStrikes = 0;       //създаваме си променлива за брой успешни удари
        int numberOfUnSuccessfulStrikes = 0;     //създаваме си променлива за брой неуспешни удари

        String input = scanner.nextLine();
        while (!input.equals("Retire")) {
            String field = input;          //Поле – текст ("Single", "Double" или "Triple")
            int currentPoints = Integer.parseInt(scanner.nextLine());      //Точки – цяло число в интервала [0… 100]

            //единичен (Single) сектор, от който се взимат броят точки от полето. Двоен (Double) - от него се взимат удвоените точки от полето и троен (Triple) сектор, точките от който са умножени по 3
            if (field.equals("Double")) {
                currentPoints *= 2;        //currentPoints = 2 * currentPoints;
            } else if (field.equals("Triple")) {
                currentPoints *= 3;        //currentPoints = 3 * currentPoints;
            }

            //При изстрел, даващ повече точки от наличните, той се зачита за неуспешен и играчът трябва да хвърля отново, докато не уцели точки, равни на оставащите или по-малки.
            if (currentPoints <= availablePoints) {         //ако ударът е успешен
                numberOfSuccessfulStrikes++;       //numberOfSuccessfulStrikes = numberOfSuccessfulStrikes + 1;         //numberOfSuccessfulStrikes += 1;
                availablePoints = availablePoints - currentPoints;     //availablePoints -= currentPoints;     //Получените точки от всеки изстрел се изваждат от началните точки, до достигане на 0.

                //второто условие за прекъсване на цикъла
                if (availablePoints == 0) {      //Ако играчът е спечелил лега:   /тоест, когато точките му са станали 0/
                    System.out.printf("%s won the leg with %d shots.", nameOfPlayer, numberOfSuccessfulStrikes);
                    break;       //прекъсваме само цикъла (а не цялата програма) и се изпълнява това, което е под него /в случая под цикъла има проверка/
                }

            } else {        //else if (currentPoints > availablePoints)          //в противен случай (ако ударът е неуспешен)
                numberOfUnSuccessfulStrikes++;
            }

            input = scanner.nextLine();      //update
        }


        //ако играчът се е отказал от играта (тоест, получили сме вхони данни "Retire")
        if (input.equals("Retire")) {
            System.out.printf("%s retired after %d unsuccessful shots.", nameOfPlayer, numberOfUnSuccessfulStrikes);
        }

    }
}
