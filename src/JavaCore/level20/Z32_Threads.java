package JavaCore.level20;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Клубок
//1. Создай 5 различных своих нитей (наследников класса Thread):
//1.1. Нить 1 должна бесконечно выполняться;
//1.2. Нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
//1.3. Нить 3 должна каждые полсекунды выводить "Ура";
//1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
//1.5. Нить 5 должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
//2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
//3. Нити не должны стартовать автоматически.
//Подсказка:
//Нить 4 можно проверить методом isAlive()
//Requirements:
//1. Статический блок класса Solution должен создавать и добавлять 5 нитей в список threads.
//2. Нити из списка threads не должны стартовать автоматически.
//3. Нить 1 из списка threads должна бесконечно выполняться.
//4. Нить 2 из списка threads должна выводить "InterruptedException" при возникновении исключения InterruptedException.
//5. Нить 3 из списка threads должна каждые полсекунды выводить "Ура".
//6. Нить 4 из списка threads должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться.
//7. Нить 5 из списка threads должна читать с консоли числа пока не введено слово "N", а потом вывести в
// консоль сумму введенных чисел.

public class Z32_Threads {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new TestThread1());
        threads.add(new TestThread2());
        threads.add(new TestThread3());
        threads.add(new TestThread4());
        threads.add(new TestThread5());
    }

    public static class TestThread1 extends Thread {

        public void run() {
            while (true) {
            }

        }
    }

    public static class TestThread2 extends Thread {
        public void run() {
            try {
                sleep(0);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }

    }

    public static class TestThread3 extends Thread {
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class TestThread4 extends Thread implements Message {
        boolean exit = false;

        public void run() {
            while (!exit) {
            }
        }

        @Override
        public void showWarning() {
            exit = true;
        }
    }

    public static class TestThread5 extends Thread {
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    String s = reader.readLine();
                    if ("N".equals(s)) {
                        System.out.println(sum);
                        break;
                    } else {
                        sum += Integer.parseInt(s);
                    }
                }
            } catch (IOException e) {

            }
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).start();
        }
        threads.get(1).interrupt();

    }
}

/*
public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {
    }
}
 */