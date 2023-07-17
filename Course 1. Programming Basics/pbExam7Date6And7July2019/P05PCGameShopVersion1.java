package pbExam7Date6And7July2019;

import java.util.Scanner;

public class P05PCGameShopVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се чете:
        int numberOfSoldGames = Integer.parseInt(scanner.nextLine());    //Брой продадени игри - n - цяло положително число в интервала [1… 100]

        //За следващите n реда се чете по един ред -> знаем колко ще са итерациите > имаме for цикъл:
        int numberOfHearthstoneGames = 0;      //създаваме си променлива за броя на продадените игри Hearthstone
        int numberOfForniteGames = 0;       //създаваме си променлива за броя на продадените игри Fornite
        int numberOfOverwatchGames = 0;       //създаваме си променлива за броя на продадените игри Overwatch
        int numberOfOthersGames = 0;      //създаваме си променлива за броя на останалите (които са различни от Hearthstone/Fornite/Overwatch) продадени игри
        for (int currentGame = 1; currentGame <= numberOfSoldGames; currentGame++) {
            String nameOfCurrentGame = scanner.nextLine();     //Име на игра - текст

            switch (nameOfCurrentGame) {
                case "Hearthstone":      //ако играта е Hearthstone, броят на тези игри се увеличава с единица
                    numberOfHearthstoneGames++;    //numberOfHearthstoneGames = numberOfHearthstoneGames + 1;    //numberOfHearthstoneGames += 1;
                    break;
                case "Fornite":          //или ако играта е Fornite, броят на тези игри се увеличава с единица
                    numberOfForniteGames++;
                    break;
                case "Overwatch":        //или ако играта е Overwatch, броят на тези игри се увеличава с единица
                    numberOfOverwatchGames++;
                    break;
                default:        //във всички останали случаи броят на другите игри (които са различни от Hearthstone/Fornite/Overwatch)  се увеличава с единица
                    numberOfOthersGames++;
                    break;
            }

        }

        //намираме и принтираме процента на продадените игри Hearthstone:
        double percentageOfSoldHearthstoneGames = numberOfHearthstoneGames * 1.0 / numberOfSoldGames * 100;
        System.out.printf("Hearthstone - %.2f%%%n", percentageOfSoldHearthstoneGames);

        //намираме и принтираме процента на продадените игри Fornite:
        double percentageOfSoldForniteGames = numberOfForniteGames * 1.0 / numberOfSoldGames * 100;
        System.out.printf("Fornite - %.2f%%%n", percentageOfSoldForniteGames);

        //намираме и принтираме процента на продадените игри Overwatch:
        double percentageOfSoldOverwatchGames = numberOfOverwatchGames * 1.0 / numberOfSoldGames * 100;
        System.out.printf("Overwatch - %.2f%%%n", percentageOfSoldOverwatchGames);

        //намираме и принтираме процента на останалите продадени игри:
        double percentageOfSoldOthersGames = numberOfOthersGames * 1.0 / numberOfSoldGames * 100;
        System.out.printf("Others - %.2f%%", percentageOfSoldOthersGames);
    }
}
