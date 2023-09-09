package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Calculate how many courses will be needed to elevate n persons by using an elevator with a capacity of p persons.
        //The input holds two lines: the number of people n and the capacity p of the elevator.

        int realNumberOfPeople = Integer.parseInt(scanner.nextLine());   //ОТ ПЪРВИЯ РЕД НА КОНЗОЛАТА ПРОЧИТАМЕ БРОЙ ХОРА
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());      //ОТ ВТОРИЯ РЕД НА КОНЗОЛАТА ПРОЧИТАМЕ КАПАЦИТЕТ НА АСАНСЬОРА (ТОЕСТ, МАКС. БРОЙ ХОРА, КОИТО ПОБИРА НАВЕДНЪЖ)

        //делим брой хора на капацитет на асансьора (тоест, местата в асансьора) и НАМИРАМЕ БРОЯ НА КУРСОВЕТЕ НА АСАНСЬОРА
        //за курсовете ни трябва реалното число (защото целта е всички хора да се качат), затова ги определяме като double променлива  (ако ги определим като int, ще загубим информация и решението ще е грешно)
        double courses = realNumberOfPeople * 1.0 / elevatorCapacity;
        courses = Math.ceil(courses);        //и понеже не може да има курс и половина, а и целта е всички хора да се качат с асансьора, закръгляме курсовете към най-близкото по-голямо цяло число
        System.out.printf("%.0f", courses);     //принтираме брой курсове (закръгляме ги до 0 знака след десет. точка, тоест до цялото число), които трябва да направи асансьорът, за да качи всички хора
    }
}
