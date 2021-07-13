package level15Core;

//Напиши метод, который определяет, объект какого класса ему передали, и
//возвращает результат: одно из значений — «Корова», «Кит», «Собака», «Неизвестное животное».

public class Z6ParametrReturn {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        if(o instanceof Cow) {
            return "Корова";
        }
        if(o instanceof Whale) {
            return "Кит";
        }
        if(o instanceof Dog) {
            return "Собака";
        } else
            return "Неизвестное животное";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
