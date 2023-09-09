package lecture9ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P03ElevatorModifiedByMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ТУК СИ ПРОМЕНИХ ЦЕЛТА НА ЗАДАЧАТА, ЗА ДА СЕ УПРАЖНЯ - НАПРАВИХ ТАКА, ЧЕ ДА СЕ ПРАВЯТ ПРОВЕРКИ И ДА СЕ ПРИНТИРА ОБЯСНЕНИЕТО КЪМ ЗАДАЧАТА, А НЕ ИЗХОДЪТ - В WORD ФАЙЛА СЕ ВИЖДАТ ОБЯСНЕНИЯТА

        int realNumberOfPeople = Integer.parseInt(scanner.nextLine());   //ОТ ПЪРВИЯ РЕД НА КОНЗОЛАТА ПРОЧИТАМЕ БРОЙ ХОРА
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());      //ОТ ВТОРИЯ РЕД НА КОНЗОЛАТА ПРОЧИТАМЕ КАПАЦИТЕТ НА АСАНСЬОРА (ТОЕСТ, МАКС. БРОЙ ХОРА, КОИТО ПОБИРА НАВЕДНЪЖ)

        int courses = realNumberOfPeople / elevatorCapacity;      //НАМИРАМЕ БРОЯ НА КУРСОВЕТЕ НА АСАНСЬОРА, КОГАТО Е С ПЪЛЕН КАПАЦИТЕТ (С ТОЛКОВА ХОРА, КОЛКОТО МОЖЕ ДА ПОБЕРЕ)
        int remainingPeople = realNumberOfPeople % elevatorCapacity;   //РАЗБИРАМЕ КОЛКО ДУШИ ОСТАВАТ (С МОДУЛНО ДЕЛЕНИЕ НАМИРАМЕ ОСТАТЪК) ЗА 1 ДОПЪЛНИТЕЛЕН КУРС, ПРИ КОЙТО КАПАЦ. НА АСАНСЬОРА НЕ Е ЗАПЪЛНЕН

        if (elevatorCapacity >= realNumberOfPeople) {      //АКО КАПАЦИТ. НА АСАНСЬОРА Е >= хората, ВСИЧКИ ЩЕ СЕ КАЧАТ НАВЕДНЪЖ САМО С ЕДИН КУРС НА АСАНСЬОРА
            System.out.println("All the people fit inside the elevator. Only one course is needed.");
        } else {    //else if (elevatorCapacity < realNumberOfPeople)    //В ПРОТИВЕН СЛУЧАЙ (ТОЕСТ, АКО КАПАЦ. НА АСАНСЬОРА Е ПО-МАЛЪК ОТ БРОЯ НА ХОРАТА), АСАНСЬОРЪТ ЩЕ КАЧИ ХОРАТА НА НЯКОЛКО КУРСА
            if (realNumberOfPeople % elevatorCapacity == 0) {   //АКО БРОЙ ХОРА СЕ ДЕЛИ МОДУЛНО НА КАПАЦ. НА АСАНС. БЕЗ ОСТАТЪК, ЗНАЧИ ВСИЧКИ КУРСОВЕТЕ НА АСАНСЬОРА ЩЕ СА ПЪЛНИ - С ТОЛКОВА ХОРА, КОЛКОТО Е КАПАЦИТЕТЪТ НА АСАНСЬОРА
                System.out.printf("%d courses * %d people", courses, elevatorCapacity);
            } else if (realNumberOfPeople % elevatorCapacity != 0) {        //може и само else    //АКО БРОЙ ХОРА СЕ ДЕЛИ МОДУЛНО НА КАПАЦ. НА АСАНСЬОРА С ОСТАТЪК, РАЗЛИЧЕН ОТ 0 (ТОЕСТ, ИМА НЯКАКЪВ ОСТАТЪК), ЗНАЧИ АСАНСЬОРЪТ ЩЕ НАПРАВИ И 1 ДОПЪЛНИТЕЛЕН КУРС, ПРИ КОЙТО КАПАЦИТЕТЪТ МУ НЯМА ДА Е ЗАПЪЛНЕН
                System.out.printf("%d courses * %d people + 1 course * %d persons", courses, elevatorCapacity, remainingPeople);
            }
        }

    }
}
