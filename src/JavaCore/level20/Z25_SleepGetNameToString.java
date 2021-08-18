package JavaCore.level20;

//Создание по образцу
//Разберись, как работает программа.
//По образу и подобию CountdownRunnable создай нить CountUpRunnable, которая выводит
// значения в нормальном порядке - от 1 до number.
//Requirements:
//1. Класс CountUpRunnable должен реализовывать интерфейс Runnable.
//2. Класс CountUpRunnable должен иметь публичный метод run без параметров.
//3. Метод run класса CountUpRunnable должен работать примерно 2,5 секунды.
//4. Метод run класса CountUpRunnable должен каждые полсекунды выводить имя потока,
// двоеточие и значение счетчика от 1 до 5 (например: "Увеличиваем: 1").
//5. Метод run класса CountUpRunnable должен вызывать Thread.sleep(500).

public class Z25_SleepGetNameToString {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start(); //Thread(Runnable target, String name),
        // это один из конструкторов класса тхреда, вторым параметром можно указать имя
    }

    public static class CountUpRunnable implements Runnable {
        //Add your code here - добавь код тут
        private int countIndexUp = 1;

        public void run() {
            while (countIndexUp <= Z25_SleepGetNameToString.number) {
                System.out.println(toString());
                countIndexUp += 1;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp; //и тут в гетнейме мы как раз получаем
            //то имя которое указали в конструкторе в мейне
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Z25_SleepGetNameToString.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}

/*
public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable {
        //Add your code here - добавь код тут
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
 */