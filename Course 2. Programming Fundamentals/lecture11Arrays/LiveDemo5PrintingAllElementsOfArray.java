package lecture11Arrays;

public class LiveDemo5PrintingAllElementsOfArray {
    public static void main(String[] args) {

        //създаваме целочислен масив от 5 на брой елемента, като директно посочваме стойностите на тези елементи (тоест, тук всеки елемент си има конкретна стойност, а не дефолтната стойност за съответния тип данни)
        int[] numbersArray = {1, 2, 3, 4, 5};

        //с foreach цикъл итерираме по елементите от масива и ги принтираме
        for (int number : numbersArray) {
            System.out.print(number + " ");
        }

        //втори начин за принтиране на елементите на целочислен масив чрез foreach цикъл:
        /*for (int element : numbersArray) {
            System.out.printf("%d ", element);
        }*/

        //втори начин за принтиране на елементите на целочислен масив - чрез for цикъл:
        /*for (int index = 0; index <= numbersArray.length - 1; index++) {    //for (int index = 0; index < numbersArray.length; index++)
            int currentElement = numbersArray[index];
            System.out.print(currentElement + " ");
            //System.out.printf("%d ", currentElement);
        }*/

    }
}
