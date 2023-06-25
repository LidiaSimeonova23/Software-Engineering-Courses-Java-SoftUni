package lecture12ExerciseWhileLoop;

import java.util.Scanner;

public class P03VacationVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyForVacation = Double.parseDouble(scanner.nextLine());      //Пари нужни за екскурзията - реално число в интервала [1.00…25000.00]
        double availableMoney = Double.parseDouble(scanner.nextLine());      //Налични пари - реално число в интервала [0.00...25000.00]

        //тези променливи си ги създаваме, не предварително, а в момента, в който ни потрябват:
        double totalMoney = availableMoney;      //създаваме си променлива за всичките пари на Джеси  - начална стойност са парите, които има в началото
        int daysCount = 0;        //създаваме си променлива, с която ще броим дните - с начална стойност 0
        int spendStream = 0;         //създаваме си променлива, с която ще броим дните, в които Джеси е харчила пари - с начална стойност 0
        boolean cantSaveMoney = false;      //създаваме си булева променлива, която да ни държи истината - с начална стойност false, за да се върти цикълът  (няма да ги спести, ако е харчил 5 последоват. дни)

        while (totalMoney < moneyForVacation) {                 //докато парите на Джеси са по-малко от необходимите й за ваканцията, тя ще се опитва да спестява
            daysCount++;           //брояч на дните    daysCount = daysCount + 1;    - инкрементация с единица
            String input = scanner.nextLine();        //Вид действие - текст с възможности "spend" и "save"
            double money = Double.parseDouble(scanner.nextLine());    //Сумата, която ще спести/похарчи - реално число в интервала [0.01…25000.00]

            switch (input) {
                case "save":
                    spendStream = 0;         //зануляваме  - ако е успяла този ден да спести пари, то дните, в които е харчила, ги зануляваме (все едно, че не ги броим)
                    totalMoney = totalMoney + money;     //всичките пари = парите до момента + парите, които е прибавила (които е спестила)
                    break;
                case "spend":
                    spendStream++;                 //брояч на дните, в които е харчила    spendStream = spendStream + 1;    - инкрементация с единица
                    totalMoney = totalMoney - money;     //всичките пари = парите до момента - парите, които е похарчила
                    if (totalMoney < 0) {                      //ако е похарчила повече пари, отколкото е имала, да се приеме, че са й останали 0
                        totalMoney = 0;
                    }
                    break;
            }


            if (spendStream == 5) {                //АКО 5 ПОСЛЕДОВАТЕЛНИ ДНИ ДЖЕСИ САМО ХАРЧИ (НЕ СПЕСТЯВА ИЗОБЩО) -> НЯМА ДА СПЕСТИ ПАРИТЕ - НЕ МОЖЕ ДА СПЕСТИ СТАВА ИТИНА - ДА СЕ ПРЕКЪСНЕ ЦИКЪЛЪТ
                cantSaveMoney = true;
                break;
            }

        }


        if (cantSaveMoney) {                     //Ако не успее да спести пари (тоест, ако 5 последователни дни само харчи)
            System.out.println("You can't save the money.");
            System.out.printf("%d", daysCount);
        } else {                               //В противен случай - ако  успее да спести пари
            System.out.printf("You saved the money for %d days.", daysCount);
        }


    }
}



