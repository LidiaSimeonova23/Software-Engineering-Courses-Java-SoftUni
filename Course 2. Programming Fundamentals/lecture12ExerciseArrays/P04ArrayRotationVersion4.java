package lecture12ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotationVersion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //в тази задача първият елемент на масив, прочетен от конзолата, трябва да стане последен елемент, а останалите елементи в масива трябва да се изместят с един индекс по-напред
        //дължината на масива си остава същата (по принцип дължината на масив не се променя)

        //например: имаме int масив: [51, 47, 32, 61, 21] - ако трябва да направим две завъртания, това означава, че:
        //след първото завъртане масивът ще има следния вид: [47, 32, 61, 21, 51]
        //след второто завъртане масивът ще има следния вид: [32, 61, 21, 51, 47]

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();      //от първия ред на конзолата четем масив от цели числа
        int numberOfRotations = Integer.parseInt(scanner.nextLine());       //от втория ред на конзолата четем едно цяло число (numberOfRotations), което ще ни показва колко ротации/завъртания трябва да се извършат

        //имаме число numberOfRotations /n/ и трябва да извършим numberOfRotations /n/ на брой ротации -> това е типичен for цикъл от 1 до n /numberOfRotations/ включително
        for (int currentRotation = 1; currentRotation <= numberOfRotations; currentRotation++) {      //с този for цикъл броим завъртанията (взимаме текущата ротация) - затова условието е от 1 до n /numberOfRotations/ включително

            //за всяка текуща ротация трябва да разместваме всички елементи на масива - елементите на масив винаги могат да се обходят с for цикъл (понякога може и с foreach цикъл, но в тази задача не може, защото ще са ни нужни индекси, а индекси има само във for цикъл)
            int oldValueOfFirstElement = 0;     //тази променлива ще ни трябва и във вътрешния for цикъл, и ивън него, затова трябва да я създадем тук
            for (int index = 0; index <= array.length - 1; index++) {       //с този for цикъл обхождаме елементите на масива - затова условието е от първия елемент (който е на индекс 0) до последния елемент (който е на индекс дължината на масива минус 1 включително)
                //условието във for цикъла можеше да е и така:   for (int index = 0; index < array.length; index++)

                //първият елемент на масива трябва да стане последен елемент, а останалите елементи в масива трябва да се изместят с един индекс по-напред:
                if (array[index] == (array[0])) {     //ако текущ елемент е първият елемент от масива
                    oldValueOfFirstElement = array[0];      //създаваме си променливата oldValueOfFirstElement, в която да запазим/съхраним старата/началната стойност на първия елемент в масива ->
                    //защото след това на този първи елемент ще му присвоим нова стойност /и ако не си съхраним старата стойност, тази стара стойност просто ще спре да съществува; на нас тази стара стойност на първия елемент ще ни трябва - защото накрая ще я присвоим на последния елемент от масива - точно затова трябва да си я запазим/
                } else {     //else if (array[index] != (array[0]))    //в противен случай (тоест, ако текущ елемент не е първият елемент от масива)   //ако е който и да е друг елемент от масива с изключение на първия елемент
                    array[index - 1] = array[index];    //на предходния елемент от масива му присвояваме като стойност стойността на текущия елемент от масива
                }

            }

            //като приключим с всички итерации на вътрешния for цикъл, на последния елемент от масива му присвояваме като стойност старата/началната стойност на първия елемент от масива:
            array[array.length - 1] = oldValueOfFirstElement;
            //и след като сме изпълнили това, вече отиваме на следващата итерация на външния for цикъл (тоест, трябва да извършим следващата поред ротация, ако има такава)
        }

        //накрая, когато вече сме извършили всички ротации (всички итерации на външния for цикъл), трябва да принтираме обновения вид на масива
        //принтирането на масив (на елементите му) става чрез for цикъл (или чрез foreach цикъл):
        for (int index = 0; index <= array.length - 1; index++) {        // for (int index = 0; index < array.length; index++)
            System.out.print(array[index] + " ");       //всички елементи на масива да са на един ред с интервал между тях
            //System.out.printf("%d ", array[index]);
        }


    }
}
