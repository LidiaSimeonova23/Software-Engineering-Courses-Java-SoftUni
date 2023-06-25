package lecture9ForLoop;

import java.util.Scanner;

public class P09LeftAndRightSumVersion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //програма, която чете 2 * n-на брой цели числа, подадени от потребителя, и проверява дали сумата на първите n числа (лява сума) е равна на сумата на вторите n числа (дясна сума)

        int n = Integer.parseInt(scanner.nextLine());


        //първи цикъл - само за лявата сума
        int leftSum = 0;    //задаваме си начална стойност 0 на лявата сума

        for (int i = 1; i <= n ; i++) {                 //нач. на цикъла е 1, край на цикъла е n,  искаме итерациите да нарастват с единица
            int currentNumber = Integer.parseInt(scanner.nextLine());   //при всяко завъртане на цикъла ще си четем едно цяло число от конзолата

            leftSum = leftSum + currentNumber;      //сумата е равна на сумата до момента + текущото число
        }



        //втори цикъл - само за дясната сума
        int rightSum = 0;   //задаваме си начална стойност 0 на дясната сума

        for (int i = 1; i <= n ; i++) {                 //нач. на цикъла е 1, край на цикъла е n,  искаме итерациите да нарастват с единица
            int currentNumber = Integer.parseInt(scanner.nextLine());    //при всяко завъртане на цикъла ще си четем едно цяло число от конзолата

            rightSum = rightSum + currentNumber;    //сумата е равна на сумата до момента + текущото число
        }


        if (leftSum == rightSum) {                                       //ако лявата и дясната сума са еднакви, да се принтира една от тях (еднакви са, няма знач. коя ще принтираме)
            System.out.printf("Yes, sum = %d", leftSum);
        } else {                                                                //в противен случай (ако сумите са различни), да се принтира разликата им и да се осигури, че тази разлика е положит. число
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        }


    }
}
