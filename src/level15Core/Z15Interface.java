package level15Core;

//Напиши public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
//Добавить в каждый интерфейс по одному методу.
//Requirements:
//1. Класс Solution должен содержать интерфейс CanFly.
//2. Класс Solution должен содержать интерфейс CanRun.
//3. Класс Solution должен содержать интерфейс CanSwim.
//4. Интерфейс CanFly должен содержать один метод.
//5. Интерфейс CanRun должен содержать один метод.
//6. Интерфейс CanSwim должен содержать один метод.

public class Z15Interface {
    public static void main(String[] args) {

    }

    //add interfaces here - добавь интерфейсы тут
    public interface CanFly {
        void fly(String a);
    }

    public interface CanRun {
        void run(String b);
    }

    public interface CanSwim {
        void swim(String c);
    }
}

