package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P09SpiceMustFlowVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int expectedYieldPerCurrentDay = Integer.parseInt(scanner.nextLine());     //очакван добив от полето за деня (или първоначален брой извлечени подправки от полето)

        //стъпка 1  - ако очакваният добив подправки в полето за деня  >= 100  -> полето е изгодно/печелившо  -> работниците ще работят  - броят на работните дни се увеличава с един   - в края на деня работниците ще изядат 26 подправки  - това значи, че останалите неизядени подправки са равни на наличния брой в началото на деня (добива) минус 26
        //на следващия ден очакваният добив подправки пада с 10 броя в сравнение с предходния ден и правим проверка:
        //ако очакваният добив подправки в полето >= 100  - ще повторим стъпка 1  - и след като я повторим, ще съберем останалите неизядени подправки от текущия ден с неизядените от предходния ден
        //ако очакваният добив подправки в полето < 100   -> полето не е изгодно/печелившо -> работниците напускат полето, няма да работят този ден, но в края на деня отново ще изядат 26 подправки (от добитите и неизядени подпрвки от предишните работни дни)
        //в цикъла ще намерим (натрупаме) броя на работните дни и броя на добитите и налични (неизядени) подправки през всичките дни (и работните дни, и последния ден, който не е бил работен)

        //първоначално не знаем колко ще са итерациите на цикъла (защото не знаем колко ще са работните дни  -> условието е докато полето е изгодно/печелившо, тоест, докато очакваният добив е >= 100)   -> ще ползваме while цикъл
        int workingDays = 0;    //брой работни дни
        int totalAvailableSpicesFromAllDays = 0;    //общо количество налични (добити и неизядени) подправки от всички дни
        while (expectedYieldPerCurrentDay >= 100) {     //докато очакваният добив за деня е поне 100
            boolean fieldIsProfitable = true;     //създаваме си булева променлива, че полето е печелившо  //този ред код може и да го няма (не е задължителен) -> ако го няма, кодът на ред 31 също ще трябва да се махне
            workingDays++;    //workingDays = workingDays + 1;    //workingDays += 1;    //броят на работните дни (на текущото поле) нараства с единица
            int availableSpices = expectedYieldPerCurrentDay - 26;     //количеството оставащи (налични/неизядени) подправки (от очаквания/реалния добив вадим изядените в края на деня 26 подправки)
            totalAvailableSpicesFromAllDays += availableSpices;    //totalAvailableSpicesFromAllDays = totalAvailableSpicesFromAllDays + spices;   //намираме сумата от всички оставащи (неизядени) подправки (от всичките работни дни)

            expectedYieldPerCurrentDay -= 10;    //expectedYieldPerCurrentDay = expectedYieldPerCurrentDay - 10;     //update на променливата (иначе ще имаме безкраен цикъл)   //на следващия ден се очаква добивът да е с 10 по-малко в сравнение с предишния ден

            //дори и след като полето стане непечелившо, работниците ще изядат 26 подправки
            if (expectedYieldPerCurrentDay < 100) {        //ако очакваният добив за деня падне под 100
                fieldIsProfitable = false;     //полето вече не е печелившо (отричаме, че полето е печелившо)
                totalAvailableSpicesFromAllDays -= 26;      //totalAvailableSpicesFromAllDays = totalAvailableSpicesFromAllDays - 26;    //намираме сумата от всички оставащи налични (неизядени) подправки (след всичките работни дни и след последния неработен ден)
                break;      //прекъсваме цикъла     //в конкретния случай, дори и да го няма този break, решението ще е вярно
            }

        }


        System.out.println(workingDays);    //извън цикъла се принтира броят на работните дните
        //System.out.printf("%d%n", workingDays);

        System.out.println(totalAvailableSpicesFromAllDays);    //извън цикъла се принтира и общото количество добити и неизядени подправки от всичките дни (работните дни и последния неработен ден, в който работниците са напуснали полето)
        //System.out.printf("%d", totalAvailableSpicesFromAllDays);
    }
}
