package lecture4ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10RoboticsVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputRobotsArray = scanner.nextLine().split(";");
        String time = scanner.nextLine(); //начално време
        String[] timePartsArray = time.split(":");

        int hours = Integer.parseInt(timePartsArray[0]);
        int minutes = Integer.parseInt(timePartsArray[1]);
        int seconds = Integer.parseInt(timePartsArray[2]);

        long totalSeconds = hours * 3600 + minutes * 60 + seconds;

        Map<String, Integer> robotsMap = splitDataIntoLinkedHashMap(inputRobotsArray);
        int[] workingTimeArray = new int[robotsMap.size()];

        ArrayDeque<String> productsQueue = new ArrayDeque<>();

        String product = scanner.nextLine();
        while (!product.equals("End")) {
            productsQueue.offer(product);
            product = scanner.nextLine();
        }


        while (!productsQueue.isEmpty()) {
            totalSeconds++;
            String currentProduct = productsQueue.poll();
            boolean isAssigned = false;
            decreaseProcessTime(workingTimeArray);
            for (int i = 0; i < workingTimeArray.length; i++) {
                if (workingTimeArray[i] == 0) {
                    int count = 0;
                    for (Map.Entry<String, Integer> robot : robotsMap.entrySet()) {
                        if (count == i) {
                            workingTimeArray[i] = robot.getValue();
                            isAssigned = true;
                            printJob(robot.getKey(), currentProduct, totalSeconds);
                            break;
                        }
                        count++;
                    }

                    break;
                }

            }
            if (!isAssigned) {
                productsQueue.offer(currentProduct);
            }

        }

    }


    private static void decreaseProcessTime(int[] processTimes) {
        for (int i = 0; i < processTimes.length; i++) {
            if (processTimes[i] > 0) {
                --processTimes[i];
            }

        }
    }

    private static void printJob(String name, String product, long totalSeconds) {
        long hours = (totalSeconds / 3600) % 24;
        long minutes = totalSeconds % 3600 / 60;
        long seconds = totalSeconds % 60;
        if (hours >= 24) {
            hours -= 24;
        }
        System.out.printf("%s - %s [%02d:%02d:%02d]%n", name, product, hours, minutes, seconds);
    }

    private static Map<String, Integer> getStartProcessTimes(String[] inputRobotsArray) {
        Map<String, Integer> processTimes = new LinkedHashMap<>();
        for (String input : inputRobotsArray) {
            String name = input.split("-")[0];
            processTimes.put(name, 0);
        }
        return processTimes;
    }

    private static Map<String, Integer> splitDataIntoLinkedHashMap(String[] inputRobots) {
        Map<String, Integer> robotsMap = new LinkedHashMap<>();
        for (String input : inputRobots) {
            String name = input.split("-")[0];
            int time = Integer.parseInt(input.split("-")[1]);
            if (!robotsMap.containsKey(name)) {
                robotsMap.put(name, time);
            }
        }
        return robotsMap;
    }

}
