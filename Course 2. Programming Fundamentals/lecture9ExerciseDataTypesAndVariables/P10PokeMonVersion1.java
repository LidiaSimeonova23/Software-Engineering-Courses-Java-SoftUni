package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P10PokeMonVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());       //първоначалната налична сила на покемона (N)
        int distanceBetweenTargets = Integer.parseInt(scanner.nextLine());      //разстойнието между две съседни цели (M)   //разстоянието между всички съседни цели е едно и също
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());     //фактор на изтощение (Y)

        //целта на покемона е да пробожда целите си (други покемони)
        //много пъти ще правим нещо, не знаем колко точно пъти, но имаме абстрактно условие - докато покемонът има достатъчно сила, за да измине разстоянието до целта си -> имаме while цикъл
        //покемончето трябва да има достатъчно сила, за да измине разстоянието до другото покемонче и да го прободе - ако има достатъчно сила, изминава разстоянието, силата му намалява с големината на разстоянието, пробожда друго покемонче и броят на пробожданията нараства с единица
        int initialPower = power;     //създаваме си променлива, в която да запазим първоначалната сила (в while цикъла силата непрекъснато ще намалява), та когато ни потрябва за сравнението, да можем да си я вземем
        //ако нямаме такава променлива, задачата ни ще е грешна (защото ще ползваме останалата сила, а не първоначалната сила)
        int counterOfPokes = 0;     //създаваме си променлива за броя на пробожданията с нач. стойност 0  (после всеки път когато покемонът прободе някой покемон, броят на пробожданията ще се увеличава с единица)
        while (power >= distanceBetweenTargets) {
            power -= distanceBetweenTargets;         //power = power - distanceBetweenTargets;     //update на променливата power  (иначе ще имаме безкраен цикъл)      //слез изминаването на разстоянието силата на покемона намалява (с големината на разстоянието)
            counterOfPokes++;     //counterOfPokes = counterOfPokes + 1;           //counterOfPokes += 1;      //броят на пробожданията се увеличава с единица

            //ако в даден момент силата стане точно половината от първоначалната сила, трябва да разделим силата на фактора на изтощение, ако е възможно (не е възможно, ако факторът на изтощение е 0, защото на 0 не се дели - ако разделим на 0, ще получим грешка/exception)
            if (power == initialPower / 2) {     //ето тук ползваме първоночалната сила initialPower (а не power)
                if (exhaustionFactor != 0) {       //това е условието делението да се извърши (факт. на изтощение трябва да е различен от 0, защото на нула не се дели)
                    power = power / exhaustionFactor;     //делим силата на фактора на изтощение и намираме оставащата налична сила    //в условието е казано, че делението е целочислено (а не модулно)
                }
            }

        }


        //извън цикъла принтираме на два отделни реда оставащата налична сила и броя на пробожданията (намушкванията):
        System.out.println(power);         //System.out.printf("%d%n", power);
        System.out.println(counterOfPokes);      //System.out.printf("%d", counterOfPokes);
    }
}
