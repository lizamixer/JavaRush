package level12;

//Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
//4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
//5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Z15mapRemovePereborValues {
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
//тут решено через запись в лист
    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String, String>> it = map.entrySet().iterator();
        ArrayList<String> name = new ArrayList<String>();
        while (it.hasNext()) {
            HashMap.Entry<String, String> pair = it.next();
            String value = pair.getValue();
            name.add(value);
        }

        for (int i = 0; i < name.size(); i++) {
            String name1 = name.get(i);
            for (int k = i + 1; k < name.size(); k++) {
                if (name1.equals(name.get(k))) {
                    removeItemFromMapByValue(map, name.get(k));
                }
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
/*
        Map<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);

 */
    }
}
/*
ArrayList<String> values = new ArrayList<String>(map.values());
        for(String a: values){
            int count = 0;
            for(int i =0; i < values.size(); i++){
                if(a.equals(values.get(i))){
                     count++;
                }
                if(count>1){
                    removeItemFromMapByValue(map,a);
                }
            }

        }

 */