package pbExam4Date9And10March2019;

import java.util.Scanner;

public class P06HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //На първия ред се прочита желаната от Тихомир Иванов височина в сантиметри - цяло число в интервала [100…300]
        int targetHeight = Integer.parseInt(scanner.nextLine());

        //Тихомир Иванов започва тренировката си, като поставя летвата на височина 30 см по-ниско от целта
        int currentHeightOfBar = targetHeight - 30;      //намираме първоначалната (текущата) височина, на която Тихомир поставя летвата

        //На всеки следващ ред до приключване на програмата се прочита височината от скока на Иванов  - цяло число в интервала [100…300]   (ще имаме while цикъл)
        int totalNumberOfJumps = 0;      //създаваме си променлива за общия брой извършени скокове (и успешни, и неуспешни)
        int numberOfUnsuccessfulJumps = 0;        //създаваме си променлива само за брой неуспешни скокове

        while (currentHeightOfBar <= targetHeight) {       //докато текущата височина на летвата е по-малка или равна на целевата височина, Тихомир ще скача
            int heightOfCurrentJumpOfTihomir = Integer.parseInt(scanner.nextLine());        //височината от скока на Иванов  - цяло число в интервала [100…300]

            //и след прочитане височината на текущия скок инкрементираме (увеличаваме) броя на скоковете:
            totalNumberOfJumps++;         //totalNumberOfJumps += 1;       //totalNumberOfJumps = totalNumberOfJumps + 1;

            //проверка дали скокът е успешен, или е неуспешен:
            if (heightOfCurrentJumpOfTihomir > currentHeightOfBar) {       //При успешен скок (над летвата), височината й се вдига с 5 сантиметра (вдига се само ако текущата височина е под целевата височина)
                //при успешен скок имаме два варианта:
                if (currentHeightOfBar < targetHeight) {      //ако текущата височина на летвата е под целевата височина
                    currentHeightOfBar += 5;         //currentHeightOfBar = currentHeightOfBar + 5;       //височината на летвата се вдига с 5 сантиметра
                } else {      //в противен случай (тоест, ако текущата височина на летвата е равна на или е по-голяма от целевата височина), принтираме, че Тихомир е успял, и прекъсваме цялато програма
                    System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", currentHeightOfBar, totalNumberOfJumps);
                    return;        //прекъсваме цялата програма (целия main метод)
                }

                //ако сме имали неуспешен опит или два последователни неуспешни опита, но след него/тях имаме текущ успешен опит, трябва да занулим неуспешните опити
                if (numberOfUnsuccessfulJumps > 0) {
                    numberOfUnsuccessfulJumps = 0;     //зануляваме броя на неуспешните опити
                }

            } else {       //else if (heightOfCurrentJumpOfTihomir <= currentHeightOfBar)     //при неуспешен скок броят на неуспешните скокове се увеличава с единица
                numberOfUnsuccessfulJumps++;

                if (numberOfUnsuccessfulJumps == 3) {       //При три неуспешни скока НА ЕДНА И СЪЩА ВИСОЧИНА тренировката приключва с неуспех.   (ВАЖНОТО Е ДА СА 3 ПОСЛЕДОВАТЕЛНИ НА ЕДНА И СЪЩА ВИСОЧИНА)
                    System.out.printf("Tihomir failed at %dcm after %d jumps.", currentHeightOfBar, totalNumberOfJumps);
                    return;         //прекъсваме цялата програма (целия main метод)
                }

            }

        }

    }
}
