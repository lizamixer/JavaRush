package level15;

//Исправь код, чтобы программа компилировалась.
//Подсказка: метод getChild должен остаться абстрактным.
//Requirements:
//1. Класс Pet должен быть статическим.
//2. Класс Pet должен иметь два метода.
//3. Метод getChild() должен быть абстрактным.
//4. Класс Pet должен быть объявлен с модификатором, который запрещает создавать конкретные объекты этого класса.

public class Z9Abstract {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}
/*
было
public static void main(String[] args) {

    }

    public static class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}

 */