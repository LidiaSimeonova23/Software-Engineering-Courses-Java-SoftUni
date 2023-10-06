package lecture11Arrays;

public class LiveDemo6PrintingAllElementsOfStringArray {
    public static void main(String[] args) {

        //създаваме масив от текстове от 4 на брой елемента, като директно посочваме стойностите на тези елементи (тоест, тук всеки елемент си има конкретна стойност, а не дефолтната стойност за съответния тип данни)
        String[] namesArray = {"Ivan", "Nina", "Maria", "Maya"};

        //с foreach цикъл итерираме по елементите от масива и ги принтираме
        for (String name : namesArray) {
            System.out.print(name + " ");
        }

        //втори начин за принтиране на елементите на String масив чрез foreach цикъл:
        /*for (String element : namesArray) {
            System.out.printf("%s ", element);
        }*/

        //втори начин за принтиране на елементите на String масив -> чрез for цикъл:
        /*for (int index = 0; index <= namesArray.length - 1; index++) {    //for (int index = 0; index < numbersArray.length; index++)
            String currentElement = namesArray[index];
            System.out.print(currentElement + " ");
            //System.out.printf("%s ", currentElement);
        }*/


        //трети начин за принтиране на елементите на String масив -> чрез String.join -> така могат да се принтират само String масиви:
        //System.out.println(String.join(" ", namesArray));      //елементите се принтират на един ред с интервал между тях

        //трети начин за принтиране на елементите на String масив -> чрез String.join -> така могат да се принтират само String масиви:
        //System.out.println(String.join(System.lineSeparator(), namesArray));      //елементите се принтират на отделни редове
    }
}
