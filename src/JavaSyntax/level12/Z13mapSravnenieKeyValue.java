package level12;

//Создать словарь (Map) занести в него десять записей по принципу
//«Фамилия» - «Имя». Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

import java.util.HashMap;
import java.util.Map;

public class Z13mapSravnenieKeyValue {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            map.put("LASTNAME" + i, "NAME" + i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int result_name = 0;
        for (Map.Entry x : map.entrySet()) {
            if (x.getValue().equals(name)) {
                result_name++;
            }
        }
        return result_name;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int result_lastname = 0;
        for (Map.Entry x : map.entrySet()) {
            if (x.getKey().equals(lastName)) {
                result_lastname++;
            }
        }
        return result_lastname;
    }

    public static void main(String[] args) {

    }
}
