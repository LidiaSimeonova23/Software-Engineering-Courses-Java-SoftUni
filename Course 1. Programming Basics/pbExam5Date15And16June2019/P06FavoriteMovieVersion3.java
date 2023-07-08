package pbExam5Date15And16June2019;

import java.util.Scanner;

public class P06FavoriteMovieVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат редове (не знаем колко пъти -> имаме while цикъл) - до команда "STOP" или до достигането на лимита от 7 филма:
        int numberOfFilms = 0;      //създаваме си променлива за общия брой на прочетените от конзолата филми
        int maxSum = Integer.MIN_VALUE;      //int maxSum = 0;        //създаваме си променлива за максимална сума от числени стойности на символи
        String bestFilm = "";        //създаваме си променлива за най-добър филм (в началото не знаем кой е той, затова му присвояваме стойност празен String)

        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            String nameOfCurrentFilm = input;    //Заглавие на филм  – текст;

            //щом сме прочели филм, веднага (на всяка итерация на цикъла) броят на филмите се увеличава с единица:
            numberOfFilms++;     //numberOfFilms += 1;        //numberOfFilms = numberOfFilms + 1;

            //Най-добрият филм e този, който има най-много точки.
            //Точките се изчисляват като сбор от ASCII стойностите на символите в заглавието на филма.    -> трябва ни числовата стойност на всеки символ от текущия текст (филм) -> for цикъл
            //итерираме по всеки символ на текущия текст (филм), за да вземем числената стойност на текущия символ и да намерим сумата от числените стойности на всичките му символи:
            int sumOfIntegerValuesOfAllSymbolsOfCurrentFilm = 0;   //създаваме си променлива за сумата от числените стойности на всички символи в текущия текст (филм)

            for (int index = 0; index <= nameOfCurrentFilm.length() - 1; index++) {      //for (int index = 0; index < nameOfCurrentFilm.length(); index++)
                char currentSymbol = nameOfCurrentFilm.charAt(index);      //създаваме си променлива за текущия символ
                sumOfIntegerValuesOfAllSymbolsOfCurrentFilm = sumOfIntegerValuesOfAllSymbolsOfCurrentFilm + currentSymbol;     //намираме сумата от числените стойности на всички символи в текущия текст

                //За всяка малка буква в заглавието, от сумата трябва да се извади два пъти дължината на заглавието на филма.
                //За всяка главна буква в заглавието, от сумата трябва да се извади дължината на заглавието на филма.
                int lengthOfCurrentFilm = nameOfCurrentFilm.length();
                if (Character.isLowerCase(currentSymbol)) {
                    sumOfIntegerValuesOfAllSymbolsOfCurrentFilm = sumOfIntegerValuesOfAllSymbolsOfCurrentFilm - 2 * lengthOfCurrentFilm;
                } else if (Character.isUpperCase(currentSymbol)) {
                    sumOfIntegerValuesOfAllSymbolsOfCurrentFilm = sumOfIntegerValuesOfAllSymbolsOfCurrentFilm - lengthOfCurrentFilm;
                }

            }

            //след всеки филм намираме кой е филмът (до момента) с най-голяма сума от числените стойности на символите в името му
            if (sumOfIntegerValuesOfAllSymbolsOfCurrentFilm > maxSum) {
                maxSum = sumOfIntegerValuesOfAllSymbolsOfCurrentFilm;      //намираме най-многото точки
                bestFilm = nameOfCurrentFilm;      //намираме филма с най-много точки
            }


            //второто условие за прекъсване на програмата - достигането на лимита от 7 филма
            if (numberOfFilms == 7) {
                break;         //прекъсваме само цикъла (и отиваме да направим това, което е извън цикъла - проверката)
            }


            input = scanner.nextLine();      //update
        }


        if (input.equals("STOP")) {
            System.out.printf("The best movie for you is %s with %d ASCII sum.", bestFilm, maxSum);
        } else {        //else if (numberOfFilms == 7)
            System.out.println("The limit is reached.");
            System.out.printf("The best movie for you is %s with %d ASCII sum.", bestFilm, maxSum);
        }

    }
}