package level15Core;

//Необходимо расставить правильно ключевые слова abstract, чтобы программа компилировалась.
//Добавь там, где нужно, и удали там, где они не нужны.
//Requirements:
//1. Класс Pegasus должен реализовывать интерфейс CanFly.
//2. Класс Pegasus должен наследоваться от класса Horse.
//3. Класс SwimmingPegasus должен наследоваться от класса Pegasus.
//4. Обьект класса Horse создать можно.
//5. Обьект класса Pegasus создать можно.
//6. Метод swim() класса SwimmingPegasus не должен иметь реализации.

public class Z23Metods {
    public static void main(String[] args) {
        Horse1 horse = new Pegasus();
        horse.run();
    }

    public static interface CanFly {
        public abstract void fly();
    }

    public static class Horse1 {
        public void run() {
        }
    }

    public static class Pegasus extends Horse1 implements CanFly {
        public void fly() {

        }
    }

    public static abstract class SwimmingPegasus extends Pegasus {
        public abstract void swim();
    }

}
