package lecture16Exam1RegularExam2022;

import java.util.Scanner;

public class P05ChristmasGiftsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //многократно ще четем входни данни, ще правим проверки, ще броим - не знаем колко пъти, но знаем, че докато входните данни са различни от "Christmas" - значи имаме while-цикъл

        int counterKids = 0;    //създаваме си променлива за брояч на броя на децата - с начална стойност 0 (после ще я променяме)
        int counterAdults = 0;     //създаваме си променлива за брояч на броя на възрастните - с начална стойност 0 (после ще я променяме)

        //входните данни могат да са или Christmas, или число
        String input = scanner.nextLine();     //първоначално ще си определим входните данни като текст (String)
        while (!input.equals("Christmas")) {
            int ageOfCurrentRelative = Integer.parseInt(input);     //ще четем многократно годините на всеки член от семейството - цяло число в интервала [1 … 130]

            if (ageOfCurrentRelative <= 16) {            //ако възрастта е до 16 (вкл.) години, човекът се считат за дете и ще получи играчка
                counterKids++;      //counterKids = counterKids + 1;    броят на децата нараства с единица
            } else {                    //ако възрастта е над 16 години, човекът се считат за възрастен и ще получи коледен пуловер
                counterAdults++;    //counterAdults = counterAdults + 1;  броят на възрастните нараства с единица
            }

            input = scanner.nextLine();   //update - подканяме скенера да прочете следващия ред с входни данни (ако не го направим, всеки път ще чете само първия ред и ще имаме безкраен цикъл)
        }


        System.out.printf("Number of adults: %d%n", counterAdults);
        System.out.printf("Number of kids: %d%n", counterKids);

        //колкото е броят на децата, толкова ще е броят на играчките;  колкото е броят на възрастните, толкова ще е броят на пуловерите
        //•	Цената на всяка играчка е 5 лв., а цената на един пуловер е 15 лв.
        double priceOfAllToys = counterKids * 5;     //намираме цената на всички играчки
        System.out.printf("Money for toys: %.0f%n", priceOfAllToys);

        double priceOfAllSweaters = counterAdults * 15;    //намираме цената на всички пуловери
        System.out.printf("Money for sweaters: %.0f", priceOfAllSweaters);
    }
}
