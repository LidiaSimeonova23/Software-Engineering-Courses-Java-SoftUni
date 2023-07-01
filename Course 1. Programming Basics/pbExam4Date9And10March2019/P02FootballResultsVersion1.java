package pbExam4Date9And10March2019;

import java.util.Scanner;

public class P02FootballResultsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        String resultFirstGame = scanner.nextLine();    //Резултат от първия мач – текст
        String resultSecondGame = scanner.nextLine();  //Резултат от втория мач – текст
        String resultThirdGame = scanner.nextLine();   //Резултат от третия мач – текст

        //отборът играе три мача като домакин   //Резултатите ще са в следния формат: "2:0", "0:1", "1:1" и т.н.

        //ако използваме само проверки (тоест, със знанията до момента) задачата може да се реши така:

        //Отборът винаги е домакин, следователно първата цифра от резултата съответства на головете, вкарани от него.
        //казано е, че броят голове винаги ще бъде едноцифрено число  -> дължината на текста ще е от 3 символа -> броят голове на първия отбор (домакин) винаги ще е на индекс 0, а броят голове на втория отбор (гост) винаги ще е на индекс 2

        char resultOfHostFirstGame = resultFirstGame.charAt(0);      //създаваме променлива за резултата на домакина от първата игра
        char resultOfGuestFirstGame = resultFirstGame.charAt(2);     //създаваме променлива за резултата на госта от първата игра

        int winsCount = 0;       //създаваме си променлива за брой победи на домакина
        int lossesCount = 0;     //създаваме си променлива за брой загуби на домакина
        int drawsCount = 0;      //създаваме си променлива за брой равенства на домакина

        //правим проверка за резултата от първата игра и съответно отбелязваме, че броят на победите/загубите/равенствата за домакина се увеличава с единица
        if (resultOfHostFirstGame > resultOfGuestFirstGame) {
            winsCount++;         //winsCount = winsCount + 1;         //winsCount += 1;
        } else if (resultOfHostFirstGame < resultOfGuestFirstGame) {
            lossesCount++;
        } else {           //else if (resultOfHostFirstGame == resultOfGuestFirstGame)
            drawsCount++;
        }


        char resultOfHostSecondGame = resultSecondGame.charAt(0);     //създаваме променлива за резултата на домакина от втората игра
        char resultOfGuestSecondGame = resultSecondGame.charAt(2);    //създаваме променлива за резултата на госта от втората игра

        //правим проверка за резултата от втората игра и съответно отбелязваме, че броят на победите/загубите/равенствата за домакина се увеличава с единица
        if (resultOfHostSecondGame > resultOfGuestSecondGame) {
            winsCount++;         //winsCount = winsCount + 1;         //winsCount += 1;
        } else if (resultOfHostSecondGame < resultOfGuestSecondGame) {
            lossesCount++;
        } else {           //else if (resultOfHostFirstGame == resultOfGuestFirstGame)
            drawsCount++;
        }


        char resultOfHostThirdGame = resultThirdGame.charAt(0);       //създаваме променлива за резултата на домакина от третата игра
        char resultOfGuestThirdGame = resultThirdGame.charAt(2);      //създаваме променлива за резултата на госта от третата игра

        //правим проверка за резултата от третата игра и съответно отбелязваме, че броят на победите/загубите/равенствата за домакина се увеличава с единица
        if (resultOfHostThirdGame > resultOfGuestThirdGame) {
            winsCount++;         //winsCount = winsCount + 1;         //winsCount += 1;
        } else if (resultOfHostThirdGame < resultOfGuestThirdGame) {
            lossesCount++;
        } else {           //else if (resultOfHostFirstGame == resultOfGuestFirstGame)
            drawsCount++;
        }


        //на отделни редове принтираме брой победи, брой загуби и брой равенства за първия отбор (домакина)
        System.out.printf("Team won %d games.%n", winsCount);
        System.out.printf("Team lost %d games.%n", lossesCount);
        System.out.printf("Drawn games: %d", drawsCount);
    }
}
