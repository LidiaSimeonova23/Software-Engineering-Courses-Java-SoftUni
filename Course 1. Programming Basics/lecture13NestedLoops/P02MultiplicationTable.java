package lecture13NestedLoops;

public class P02MultiplicationTable {
    public static void main(String[] args) {

        //firstMultiplier * secondMultiplier = product
        //първият множител може да е от 1 до 10;   вторият множител може да е от 1 до 10;
        //първият цикъл (външният) има 10 итерации, вторият (вътрешният/вложеният) има 10 итерации, общо имаме 100 итерации за целия цикъл
        //действията, които ще се повтарят на всяка итерация на цикъла, са умножение и принтиране - тоест, те ще са вътре в цикъла
        for (int firstMultiplier = 1; firstMultiplier <= 10; firstMultiplier++) {             //итерациите за първия множител
            for (int secondMultiplier = 1; secondMultiplier <= 10; secondMultiplier++) {                    //итерациите за втория множител
                int product = firstMultiplier * secondMultiplier;                     //намираме произведението на двата множителя
                System.out.printf("%d * %d = %d%n", firstMultiplier, secondMultiplier, product);
            }
        }

    }
}
