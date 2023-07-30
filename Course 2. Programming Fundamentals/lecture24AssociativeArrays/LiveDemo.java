package lecture24AssociativeArrays;

import java.util.HashMap;

public class LiveDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> airplanesMap = new HashMap<>();      //създаваме асоциативен масив - в началото е от нула item-а

        //прибавяне на записи към асоц. масив
        airplanesMap.put("Boeing 737", 130);         //към асоциативния масив airplanesMap добавяме 1 item  (и дължината му вече е 1)
        airplanesMap.put("Airbus A320", 260);        //към асоциативния масив airplanesMap добавяме още 1 item  (и дължината му вече е 2)
        airplanesMap.put("Boeing 737", 30);         //към асоциативния масив airplanesMap отново иска ме добавим 1 item  (но знаем, че ключовете са уникални, прогромата вижда, че има такъв ключ, затова не добавя нов item, но пък презаписва стойността на стария - и вече ключ "Boeing 737" е със стойност 30, а не 130)

        //премахване на запис от асоц. масив
        airplanesMap.remove("Boeing 737");       //от асоциативния масив airplanesMap премахваме 1 item - този, който  е с ключ "Boeing 737"  (и дължината на асоциативния масив става 1 има само един item, а именно - този с ключ "Airbus A320")
    }
}
