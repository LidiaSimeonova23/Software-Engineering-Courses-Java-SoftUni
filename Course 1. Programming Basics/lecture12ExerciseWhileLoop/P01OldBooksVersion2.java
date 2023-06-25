package lecture12ExerciseWhileLoop;

import java.util.Scanner;

public class P01OldBooksVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();  //веднъж прочитаме името на търсената книга


        int booksCount = 0;      //създаваме си променлива за броене на броя на проверените книги с начална стойност 0
        String input = scanner.nextLine();    //създаваме си променлива за входните данни, които ще четем многократно в цикъла
        while (!input.equals("No More Books")) {

            if (input.equals(wantedBook)) {            //ако входните данни съвпаднат с търсената книга, значи тя е намерена, следва да се прекъсне цикълът (търсенето)
                break;
            }

            booksCount++;      //booksCount = booksCount + 1;    //брояч за броя на проверените книги - създаваме го под проверката, та последните проверени входни данни да не се броят  (напр. ако намерената книга е четвърта поред, да се отчете, че книгите са 3)

            input = scanner.nextLine();   //update-ваме си променливата (в противен случай ще имаме безкраен цикъл), та на следващата итерация на цикъла скенерът да прочете нов ред, а не винаги да чете само първия ред
        }

        if (input.equals(wantedBook)) {                                     //ако търсената книга е намерена
            System.out.printf("You checked %d books and found it.", booksCount);
        } else {                                           //в противен случай (ако не е намерена)
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", booksCount);
        }

    }
}
