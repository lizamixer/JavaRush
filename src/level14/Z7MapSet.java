package level14;

//Есть класс кот – Cat, с полем «имя» (String).
//Создать словарь Map<String, Cat> и добавить туда 10 котов в виде «Имя»-«Кот».
//Получить из Map множество (Set) всех котов.
//Вывести множество на экран (уже реализовано).

import java.util.*;

public class Z7MapSet {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        /*
        for (int i=0; i<10; i++){
            map.put("NAME" + i, new Cat());
        }
         */

        map.put("Name", new Cat("Name"));
        map.put("Name2", new Cat("Name2"));
        map.put("Name3", new Cat("Name3"));
        map.put("Name4", new Cat("Name4"));
        map.put("Name5", new Cat("Name5"));
        map.put("Name6", new Cat("Name6"));
        map.put("Name7", new Cat("Name7"));
        map.put("Name8", new Cat("Name8"));
        map.put("Name9", new Cat("Name9"));
        map.put("Name10", new Cat("Name10"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<Cat>();
        for (Map.Entry<String, Cat> copy : map.entrySet()) {
            Cat s = copy.getValue();
            set.add(s);
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        public String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Cat)) {
                return false;
            }
            Cat cat = (Cat) o;
            return Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}