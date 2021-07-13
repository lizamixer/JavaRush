package level12;

//Внутри класса Solution создать public static класс кот – Cat.
//Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
//В методе main удалите одного кота из Set cats.
//Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.

import java.util.HashSet;
import java.util.Set;

public class Z16setRemoveMetods {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.toArray()[0]); //удаление стороннего кота когда не знаю как передать параметр
        //напишите тут ваш код. step 3 - пункт 3
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> set = new HashSet<Cat>();
        for (int i = 0; i < 3; i++) {
            Cat cat = new Cat();
            set.add(cat);
        }
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {

    }
    // step 1 - пункт 1
}
