package lecture11Arrays;

import java.util.Scanner;

public class LiveDemo7ComparingTwoStringArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //СРАВНЯВАНЕ НА ДВА String МАСИВА, КОИТО ЧЕТЕМ ОТ КОНЗОЛАТА:

        //например:
        //при входни данни:
        //Ivan Nina Maria Maya
        //Ivan nina Maria Maya
        //съгласно тези входни данни двата масива не са еднакви, тъй като в първия масив Nina е с главна начална буква, а във втория масив nina е с малка начална буква

        //КОГА 2 МАСИВА СА ЕДНАКВИ - когато дължините им са еднакви (имат еднакъв брой елементи) и когато елементите на съответните индекси съвпадат

        String[] firstArray = scanner.nextLine().split("\\s+");      //от първия ред на конзолата четем масив от текстове
        String[] secondArray = scanner.nextLine().split("\\s+");     //от втория ред на конзолата четем масив от текстове

        //най-лесно се открива дали две неща са еднакви или не, като се търси различие -> в момента, в който се открие едно различие, следва, че двете неща са различни; ако никъде не се открие разлика, следва, че двете неща са еднакви
        if (firstArray.length != secondArray.length) {        //ако дължината на първия масив е различна от дължината на втория масив, следва, че масивите не са еднакви
            System.out.println("The given two arrays are not equal.");
        } else {      //else if (firstArray.length == secondArray.length)     //в противен случай (ако дължината на първия масив е равна на дължината на втория масив)
            for (int index = 0; index <= firstArray.length - 1; index++) {        //итерираме по един от двата масива (в случая по първия масив)
                if (!firstArray[index].equals(secondArray[index])) {      //ако текущият елемент от първия масив е различен от текущия елемент от втория масив
                    System.out.println("The given two arrays are not equal.");    //да се принтира, че двата масива не са еднакви
                    return;     //прекъсваме цялата програма
                }
            }

            //ако сме обходили всички елементи от първия масив и сме ги сравнили със съответните им елементи от втория масив и никъде не е намерена разлика (не сме прекъснали програмата), то следва, че двата масива са еднакви
            System.out.println("The given two arrays are equal.");
        }

    }
}
