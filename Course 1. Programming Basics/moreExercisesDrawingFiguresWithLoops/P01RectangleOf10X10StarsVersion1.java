package moreExercisesDrawingFiguresWithLoops;

public class P01RectangleOf10X10StarsVersion1 {
    public static void main(String[] args) {

        //програма, която чертае на конзолата правоъгълник от 10 x 10 звездички

        //искаме да имаме 10 реда и 10 колони (еднакъв брой колони на всички редове) - вложени цикли:
        for (int rows = 1; rows <= 10; rows++) {         //за да си построя външния цикъл, за име на променливата ползвам rows вместо i
            for (int columns = 1; columns <= 10; columns++) {         //за да си построя вътрешния цикъл, за име на променливата ползвам columns вместо j
                System.out.print("*");
                //System.out.printf("%s", "*");      //с форматирано принтиране - ако разглеждаме звездичката като промелива от тип String
                //System.out.printf("%c", '*');           //с форматирано принтиране - ако разглеждаме звездичката като промелива от тип char
            }

            System.out.println();    //за да свалим курсора на нов ред (и всеки ред от 10 звездички да е принтиран на отделен ред)
        }


    }
}
