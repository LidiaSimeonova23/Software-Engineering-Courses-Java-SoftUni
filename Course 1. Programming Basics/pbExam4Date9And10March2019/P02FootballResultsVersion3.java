package pbExam4Date9And10March2019;

import java.util.Scanner;

public class P02FootballResultsVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //отборът играе три мача като домакин   //Резултатите ще са в следния формат: "2:0", "0:1", "1:1" и т.н.
        //в това решение на задачата използваме for цикъл (защото знаем колко ще са итерациите), масив (който се учи в следващия курс), както и проверки:

        int winsCount = 0;        //създаваме си променлива за брой победи на домакина
        int lossesCount = 0;      //създаваме си променлива за брой загуби на домакина
        int drawsCount = 0;       //създаваме си променлива за брой равенства на домакина
        for (int currentGame = 1; currentGame <= 3; currentGame++) {
            String resultOfCurrentGame = scanner.nextLine();        //на всяка итерация на цикъла четем (от конззолата) резултата от текущата игра

            //на всяка итерация сплитваме текущия текст и получаваме масив от текстове  ->  ако текстът е "3:1"  -> получаваме масив ["3", "1"]
            String[] resultOfCurrentGamePartsArray = resultOfCurrentGame.split(":");
            //Отборът винаги е домакин, следователно първият елемент (на индекс 0) от масива съответства на головете, вкарани от домакина.
            //вторият елемент (на индекс 1) от масива съответства на головете, вкарани от госта
            int resultOfHostCurrentGame = Integer.parseInt(resultOfCurrentGamePartsArray[0]);      //създаваме променлива за резултата на домакина от текущата игра
            int resultOfGuestCurrentGame = Integer.parseInt(resultOfCurrentGamePartsArray[1]);     //създаваме променлива за резултата на госта от текущата игра

            //на всяка итерация на цикъла правим проверка за резултата от текущата игра и съответно отбелязваме, че броят на победите/загубите/равенствата за домакина се увеличава с единица
            if (resultOfHostCurrentGame > resultOfGuestCurrentGame) {
                winsCount++;         //winsCount = winsCount + 1;         //winsCount += 1;
            } else if (resultOfHostCurrentGame < resultOfGuestCurrentGame) {
                lossesCount++;
            } else {           //else if (resultOfHostFirstGame == resultOfGuestFirstGame)
                drawsCount++;
            }

        }

        //на отделни редове принтираме брой победи, брой загуби и брой равенства за първия отбор (домакина)
        System.out.printf("Team won %d games.%n", winsCount);
        System.out.printf("Team lost %d games.%n", lossesCount);
        System.out.printf("Drawn games: %d", drawsCount);
    }
}
