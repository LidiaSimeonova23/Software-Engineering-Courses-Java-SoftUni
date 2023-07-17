package pbExam7Date6And7July2019;

import java.util.Scanner;

public class P06NameGameVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //До получаване на командата "Stop" (не знаем колко ще са итерациите ->  имаме while цикъл) се чете по един ред:
        int maxPoints = Integer.MIN_VALUE;       //създаваме си променлива за максимален брой точки
        String winner = "";         //създаваме си променлива за победител (играч с най-много точки)

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String nameOfCurrentPlayer = input;      //Име на играча с дължина n - текст

            //знаем, че чрез метода .length() винаги можем да намерим дължината на един текст (String)
            //дадено е, че за всяка една буква от името си играчът написва по едно цяло число  -> чрез for цикъл ще итерираме по всеки символ от текста, за да вземем неговата стойност и да я сравним с текущо прочетеното число
            int totalPointsOfCurrentPlayer = 0;       //създаваме си променлива за общия брой точки на текущия играч
            for (int index = 0; index <= nameOfCurrentPlayer.length() - 1; index++) {       //for (int index = 0; index < nameOfCurrentPlayer.length(); index++)
                int currentNumber = Integer.parseInt(scanner.nextLine());          //на всяка итерация четем по едно цяло число в интервала [0…127]

                //създаваме си променлива за текущия символ
                char currentSymbol = nameOfCurrentPlayer.charAt(index);

                //ако числото съвпада с ASCII стойността на съответната буква, играчът получава 10 точки, в противен случай, получава само 2 точки
                int pointsFromCurrentNumber = 0;
                if (currentNumber == (int) currentSymbol) {        //if (currentNumber == currentSymbol)    //ако числото съвпада с ASCII стойността на съответната буква, играчът получава 10 точки
                    pointsFromCurrentNumber = 10;
                } else {      //в противен случай (ако числото не съвпада с ASCII стойността на съответната буква) играчът получава само 2 точки
                    pointsFromCurrentNumber = 2;
                }

                //намираме всички събрани точки на текущия играч:
                totalPointsOfCurrentPlayer += pointsFromCurrentNumber;        //totalPointsOfCurrentPlayer = totalPointsOfCurrentPlayer + pointsFromCurrentNumber;
            }

            //Победител е играчът с най-много точки в края на играта. В случай че двама играчи имат равен брой точки, печели този, който втори е достигнал резултата.
            if (totalPointsOfCurrentPlayer >= maxPoints) {       //в повечето задачи при това условие ползваме само знак >   но в конкретната задача, за да включим и второто условие (В случай че двама играчи имат равен брой точки, печели този, който втори е достигнал резултата.), знакът трябва да е >= (тоест, включваме и равенството)
                maxPoints = totalPointsOfCurrentPlayer;      //намираме кои точки са максимални (най-много)
                winner = nameOfCurrentPlayer;       //намираме играча с най-много събрани точки (той е победител)
            }


            input = scanner.nextLine();     //update
        }


        //принтираме победителя и неговите точки:
        System.out.printf("The winner is %s with %d points!", winner, maxPoints);
    }
}
