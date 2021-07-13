package level15;

//Унаследуй классы Cat и Dog от Pet.
//Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.
//Requirements:
//1. Класс Pet должен быть абстрактным.
//2. Класс Dog не должен быть абстрактным.
//3. Класс Cat не должен быть абстрактным.
//4. Класс Dog должен наследоваться от класса Pet и реализовывать его абстрактные методы.
//5. Класс Cat должен наследоваться от класса Pet и реализовывать его абстрактные методы.

public class Z11Abstract {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();
        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        public String getName() {
            return null;
        }

        public Pet getChild() {
            return null;
        }
    }

    public static class Dog extends Pet {
        public String getName() {
            return null;
        }

        public Pet getChild() {
            return null;
        }
    }
}

/*
было
 public static void main(String[] args) {
    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat {
    }

    public static class Dog {
    }
}
 */