package level12;

//Создать коллекцию Map (реализация HashMap), занести туда 10 пар строк.
// Вывести содержимое коллекции на экран, каждый элемент с новой строки.
// Пример вывода (тут показана только одна строка): картофель - клубень

import java.util.HashMap;
import java.util.Map;

public class Z2collectionsMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + " - " + value);
        }
    }
}
