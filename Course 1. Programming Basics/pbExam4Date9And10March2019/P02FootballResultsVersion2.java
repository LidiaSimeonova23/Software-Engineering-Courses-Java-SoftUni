package pbExam4Date9And10March2019;

import java.util.Scanner;

public class P02FootballResultsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //отборът играе три мача като домакин   //Резултатите ще са в следния формат: "2:0", "0:1", "1:1" и т.н.
        //по-доброто решение на задачата е това (използваме for цикъл, защото знаем колко ще са итерациите - колкото е броят на мачовете - 3 мача):

        int winsCount = 0;        //създаваме си променлива за брой победи на домакина
        int lossesCount = 0;      //създаваме си променлива за брой загуби на домакина
        int drawsCount = 0;       //създаваме си променлива за брой равенства на домакина
        for (int currentGame = 1; currentGame <= 3; currentGame++) {
            String resultOfCurrentGame = scanner.nextLine();        //на всяка итерация на цикъла четем (от конззолата) резултата от текущата игра

            //Отборът винаги е домакин, следователно първата цифра от резултата съответства на головете, вкарани от него.
            //казано е, че броят голове винаги ще бъде едноцифрено число  -> дължината на текста ще е от 3 символа -> броят голове на първия отбор (домакин) винаги ще е на индекс 0, а броят голове на втория отбор (гост) винаги ще е на индекс 2
            char resultOfHostCurrentGame = resultOfCurrentGame.charAt(0);      //създаваме променлива за резултата на домакина от текущата игра
            char resultOfGuestCurrentGame = resultOfCurrentGame.charAt(2);     //създаваме променлива за резултата на госта от текущата игра

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
