package level12;

//Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
//4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
//5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Z15mapRemove {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("a","d");
        map.put("b","d");
        map.put("c","d");
        map.put("d","d");
        map.put("i","i");
        map.put("z","i");
        map.put("f","o");
        map.put("g","o");
        map.put("h","o");
        map.put("j","p");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList();// создаю дополнительный список
        for (HashMap.Entry<String, String> a: map.entrySet()){//перебирает все значения в массиве
            list.add(a.getValue());//по очередно добавляет значения (Value это FirstName) в список
        }
        for (String l : list){//перебирает список
            if (Collections.frequency(list, l)>1){//если в списке значение повторяется, то
                removeItemFromMapByValue(map, l);//запускает данный метод, передавая в него массив и
                //значение Value которое повторяется
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }
}

