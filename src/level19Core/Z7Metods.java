package level19Core;

//Измени метод printName() так, чтобы он выполнялся для man и woman.
//Реализация метода printName() должна быть одна.
//Requirements:
//1. В классе Solution должен быть реализован только один метод printName().
//2. Метод printName() должен принимать один параметр типа Human.
//3. Класс Man должен быть потомком класса Human.
//4. Класс Woman должен быть потомком класса Human.

/*
1. Вспоминаем, что все классы неявно унаследованы от Object, поэтому убираем лишние наследования от него.
2. Если базовый класс имплементирует интерфейс, то дочерний класс тоже неявно этот интерфейс имплементит по наследству.
3. При отсутствии конструктора у класса, автоматически создаётся конструктор по умолчанию.
4. Ежели мы указали хотя бы одну реализацию конструктора, то теперь если нам нужен конструктор по умолчанию — его нужно создавать вручную.
5. В пустом конструкторе дочернего класса по умолчанию вызывается конструктор super() базового класса-родителя.
6. Всё получится!
 */

public class Z7Metods {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Human human) {

    }

    public static class Human {

    }

    public static class Man extends Human {

    }

    public static class Woman extends Human {

    }
}
/*
public class Solution {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Men men) {

    }

    public static class Human {

    }

    public static class Man {

    }

    public static class Woman {

    }
}
 */