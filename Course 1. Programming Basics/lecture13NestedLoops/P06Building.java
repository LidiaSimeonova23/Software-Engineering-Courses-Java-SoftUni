package lecture13NestedLoops;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //веднъж от конзолата ще се прочете:
        int floorsCount = Integer.parseInt(scanner.nextLine());              //брой етажи
        int roomsCount = Integer.parseInt(scanner.nextLine());             //брой стаи на един етаж

        //комбинации от етажи и стаи
        //за да преминем към следващ етаж, трябва да принтираме всички стаи на текущия етаж
        //имаме for цикли, защото знаем колко ще са итерациите (колкото са етажите и колкото са стаите)
        for (int currentFloor = floorsCount; currentFloor >= 1; currentFloor--) {                     //в низходящ ред   - от най-горния етаж (floor) до най-долния етаж (1), декрементация - стойността на променливата намалява с единица
            for (int currentRoom = 0; currentRoom < roomsCount; currentRoom++) {                       //във възходящ ред - от най-малкия номер на стая (0) до най-галемия (в случая сме го означили като room); инкрементация - стойността на променливата нараства с единица
                if (currentFloor == floorsCount) {                            //ако е последен етаж, да има буквата L (голям апартамент) отпред
                    System.out.printf("L%d%d ", currentFloor, currentRoom);          //искаме всички стаи от текущия етаж да се принтират на 1 ред с разстояние между тях
                } else if (currentFloor % 2 == 0) {                      //или ако е четен етаж, да има буквата О (офис) отпред
                    System.out.printf("O%d%d ", currentFloor, currentRoom);          //искаме всички стаи от текущия етаж да се принтират на 1 ред с разстояние между тях
                } else {          //else if (currentFloor % 2 != 0)             //в противен случай (ако е нечетен етаж), да има буквата А (апартамент) отпред
                    System.out.printf("A%d%d ", currentFloor, currentRoom);          //искаме всички стаи от текущия етаж да се принтират на 1 ред с разстояние между тях
                }
            }

            System.out.println();    //за да свалим курсора на следващия ред (след като всички стаи на текущия етаж се принтират на 1 ред, стаите на следващия етаж да се принтират винаги на нов ред)
        }


    }
}
