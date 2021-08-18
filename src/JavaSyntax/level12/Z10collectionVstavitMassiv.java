package level12;

//Есть класс Cat с полем имя (name, String).
//Создать коллекцию Map<String, Cat>.
//Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
//Вывести результат на экран, каждый элемент с новой строки.

import java.util.HashMap;
import java.util.Map;

public class Z10collectionVstavitMassiv {
    public static void main(String[] args) throws Exception {
        String[] catsArray = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(catsArray);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        Map<String, Cat> map2 = new HashMap<String, Cat>();
        for(String str : cats){
            map2.put(str, new Cat(str));
        }
        return map2;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
