package level12;

//Есть коллекция Map (реализация HashMap), туда занесли 10 различных строк.
//Вывести на экран список значений, каждый элемент с новой строки.

import java.util.HashMap;
import java.util.Map;

public class Z3collectionMapVivodZnachenii {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {
        //напишите тут ваш код
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String value = pair.getValue();
            System.out.println(value);
        }
    }
}
