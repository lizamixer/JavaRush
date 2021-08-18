package level12;

//Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
//Реализовать метод createCats, который должен возвращать множество с 4 котами.
//Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
//Реализовать метод join, который должен возвращать объединенное множество всех животных — всех котов и собак.
//Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
//Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки.

import java.util.HashSet;
import java.util.Set;

public class Z17setMetodsAddRemove {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        //напишите тут ваш код
        for (int i = 0; i < 4; i++) {
            Cat cats = new Cat();
            result.add(cats);
        }
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> result2 = new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            Dog dogs = new Dog();
            result2.add(dogs);
        }
        return result2;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> pets = new HashSet<Object>(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object x : pets) {
            System.out.println(x);
        }
    }

    //напишите тут ваш код
    public static class Cat {
    }

    public static class Dog {
    }
}
