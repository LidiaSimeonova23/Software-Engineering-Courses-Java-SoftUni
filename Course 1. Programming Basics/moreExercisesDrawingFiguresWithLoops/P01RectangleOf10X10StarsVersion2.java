package moreExercisesDrawingFiguresWithLoops;

public class P01RectangleOf10X10StarsVersion2 {
    public static void main(String[] args) {

        //програма, която чертае на конзолата правоъгълник от 10 x 10 звездички

        //искаме да имаме 10 реда и 10 колони - вложени цикли (или дадено число на реда и колко пъти да се принтира това число):
        for (int number = 1; number <= 10; number++) {         //за да си построя външния цикъл, за име на променливата ползвам number вместо i
            for (int times = 1; times <= 10; times++) {         //за да си построя вътрешния цикъл, за име на променливата ползвам times вместо j
                System.out.print("*");
                //System.out.printf("%s", "*");      //с форматирано принтиране - ако разглеждаме звездичката като промелива от тип String
                //System.out.printf("%c", '*');           //с форматирано принтиране - ако разглеждаме звездичката като промелива от тип char
            }

            System.out.println();    //за да свалим курсора на нов ред (и всеки ред от 10 звездички да е принтиран на отделен ред)
        }


    }
}
