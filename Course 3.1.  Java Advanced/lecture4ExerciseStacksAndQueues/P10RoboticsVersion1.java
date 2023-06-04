package lecture4ExerciseStacksAndQueues;

import java.util.*;

public class P10RoboticsVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //от първия ред на конзолата четем данните за робота
        String[] inputRobotArray = scanner.nextLine().split(";");      //масив от всички роботи със съответните им времена за обработка на продукт
        LinkedHashMap<String, Integer> robotsMap = getLinkedHashMap(inputRobotArray);     //извикваме си метода getLinkedHashMap (който създадохме извън main метода), който ни връща асоциативен масив със записи (искаме да получим nameOfRobot - String и timeForProcessingOf1Product - Integer)

        //от втория ред на конзолата четем времето
        String time = scanner.nextLine();     //"8:00:00"     //час:минути:секунди
        int[] timePartsArray = Arrays.stream(time.split(":")).mapToInt(Integer::parseInt).toArray();   //[8, 00, 00]
        int hours = timePartsArray[0];
        int minutes = timePartsArray[1];
        int seconds = timePartsArray[2];

        //трябва да работим с една и съща мерна единица - секунди      //1 час = 60 мин   //1 мин = 60 сек      // 60 * 60 = 3600 сек
        long totalTimeInSeconds = hours * 3600 + minutes * 60 + seconds;

        Deque<String> productsQueue = new ArrayDeque<>();  //създаваме си опашка - празна; в нея ще слагаме продуктите
        int[] workingTimeArray = new int[robotsMap.size()];

        //с while цикъл четем продуктите и ги прибавяме към опашката
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            productsQueue.offer(product);

            product = scanner.nextLine();    //update
        }

        while (!productsQueue.isEmpty()) {       //докато има елементи в опашката
            String currentProduct = productsQueue.poll();       //премахваме първия елемент от опашката и взимаме неговата стойност
            //увеличим текущото време
            totalTimeInSeconds++;
            boolean isAssigned = false;      //създаваме си променлива (която да ни държи истината) дали роботът е зает
            //намаляме работното време с 1 секунда
            for (int robot = 0; robot < workingTimeArray.length; robot++) {
                if (workingTimeArray[robot] > 0) {
                    --workingTimeArray[robot];     //намаляваме времето
                }
            }

            //обхождане на работното време (то е масив)
            for (int i = 0; i < workingTimeArray.length; i++) {      //for (int i = 0; i <= workingTimeArray.length - 1; i++)
                if (workingTimeArray[i] == 0) {        //ако текущият елемент от масива е 0
                    //свободен -> кой е роботът -> времето
                    int count = 0;
                    for (Map.Entry<String, Integer> robot : robotsMap.entrySet()) {       //за всеки запис от асоц. масив robotsMap
                        if (count == i) {
                            workingTimeArray[i] = robot.getValue();
                            //totalSeconds -> hours, minute, seconds
                            long takenHour = totalTimeInSeconds / 3600 % 24;
                            long takenMinute = totalTimeInSeconds % 3600 / 60;
                            long takenSeconds = totalTimeInSeconds % 60;
                            System.out.printf("%s - %s [%02d:%02d:%02d]%n", robot.getKey(), currentProduct, takenHour, takenMinute, takenSeconds);
                            isAssigned = true;      //роботът е зает става истина
                            break;
                        }
                        count++;
                    }
                    break;
                }
            }

            //проверили всички роботи
            if (!isAssigned) {
                productsQueue.offer(currentProduct);
            }

        }


    }


    private static LinkedHashMap<String, Integer> getLinkedHashMap(String[] inputRobotArray) {       //създаваме си метод, който да ни върне асоциативен масив със записи (искаме да получим nameOfRobot - String и timeForProcessingOf1Product - Integer)
        LinkedHashMap<String, Integer> robotsMap = new LinkedHashMap<>();
        //всеки елемент от масива се състои от nameOfRobot-time; затова ще split-нем всеки от елементите на масива ["ROB-15", "SS2-10", "NX8000-3"]
        for (int index = 0; index < inputRobotArray.length; index++) {       //for (int index = 0; index <= inputRobotArray.length - 1; index++)    //обхождаме елементите на масива, за да ги сплитнем
            String currentElement = inputRobotArray[index];        //създаваме си променлива за текущия елемент от масива

            String[] currentElementsPartsArray = currentElement.split("-");    //на всяка итерация на цикъла сплитваме текущия елемент от масива -> и на всяка итерация се получава масив от два елеменвта ["ROB", "15"]   ["SS2", "10"]   ["NX8000", ["3"]
            String nameOfRobot = currentElementsPartsArray[0];
            int timeForProcessingOf1Product = Integer.parseInt(currentElementsPartsArray[1]);
            robotsMap.put(nameOfRobot, timeForProcessingOf1Product);    //на всяка итерация към асоц. масив добавяме текущия запис, който се състои от ключ (nameOfRobot) и стойност (timeForProcessingOf1Product)
        }
        return robotsMap;
    }

}
