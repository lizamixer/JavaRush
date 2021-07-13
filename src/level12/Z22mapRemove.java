package level12;

//Создать словарь (Map) и занести в него десять записей по принципу: «фамилия» - «зарплата».
//Удалить из словаря всех людей, у которых зарплата ниже 500.

import java.util.HashMap;
import java.util.Map;

public class Z22mapRemove {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Сталлоне", 5000);
        map.put("Сталлоне1", 20);
        map.put("Сталлоне2", 500);
        map.put("Сталлоне3", 499);
        map.put("Сталлоне4", 350);
        map.put("Сталлоне5", 600);
        map.put("Сталлоне6", 450);
        map.put("Сталлоне7", 1000);
        map.put("Сталлоне8", 230);
        map.put("Сталлоне9", 40);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            Integer i = pair.getValue();
            if (i < 500) {
                map.remove(pair.getKey());
            }
        }
        //System.out.println(map);
    }

    public static void main(String[] args) {
        //removeItemFromMap(createMap());
    }
}
