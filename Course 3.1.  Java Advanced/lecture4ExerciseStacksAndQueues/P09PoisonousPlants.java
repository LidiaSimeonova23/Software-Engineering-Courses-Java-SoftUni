package lecture4ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P09PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());       //брой растения в градина
        int[] plantsArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();     //растенията

        Deque<Integer> previousPlantsStack = new ArrayDeque<>();

        int[] daysArray = new int[plantsArray.length];
        previousPlantsStack.push(0);
        for (int x = 1; x < plantsArray.length; x++) {
            int maxDays = 0;
            while (previousPlantsStack.size() > 0 && plantsArray[previousPlantsStack.peek()] >= plantsArray[x]) {

                maxDays = Integer.max(daysArray[previousPlantsStack.pop()], maxDays);
            }

            if (previousPlantsStack.size() > 0) {
                daysArray[x] = maxDays + 1;
            }

            previousPlantsStack.push(x);
        }

        System.out.printf("%d", Arrays.stream(daysArray).max().getAsInt());
    }
}
