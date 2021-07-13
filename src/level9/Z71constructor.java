package level9;//Внутри класса Solution создай public static классы Man и Woman.
//У классов должны быть поля: name(String), age(int), address(String).
//Создай конструкторы, в которые передаются все возможные параметры.
//Создай по два объекта каждого класса со всеми данными, используя конструктор.
//Объекты выведи на экран в таком формате: name + " " + age + " " + address

public class Z71constructor {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man = new Man("Bob", 18, "Moscow");
        Woman woman = new Woman("Liza", 23, "Kaluga");
        Man man1 = new Man("Karl", 8, "Ufa");
        Woman woman1 = new Woman("Lera", 20, "Klin");

        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    //напишите тут ваш код
}

