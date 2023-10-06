package lecture11Arrays;

public class LiveDemo4PuttingValuesToAllElementsInAnArray {
    public static void main(String[] args) {

        //създаваме целочислен масив от шест елемента (тъй като не сме им задали конкретни стойности, всичките шест елемента имат стойност 0 - тя е дефолтна за данни от тип int)
        int[] numArray = new int[6];

        //намираме дължината на масива (брой елементи в масива)
        int lengthArray = numArray.length;

        //итерираме по масива (обхождаме всеки елемент от масива) и на всяка итерация на цикъла присвояваме стойност на текущия елемент от масива
        for (int index = 0; index <= lengthArray - 1; index++) {      //for (int index = 0; index < lengthArray; index++)
            numArray[index] = 18 + index;    //на текущия елемент от масива му присвояваме като стойност сбора на 18 плюс текущия индекс
        }

    }
}
