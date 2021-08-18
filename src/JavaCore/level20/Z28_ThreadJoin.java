package JavaCore.level20;

public class Z28_ThreadJoin {
    public static MyThread t = new MyThread();
    static String message = "inside main ";

    public static void main(String a[]) throws Exception {
        t.start();
        t.join();                               //nут тупо добавила это
        for (int i = 0; i < 10; i++) {
            System.out.println(message + i);
            sleep();
        }
    }

    public static void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    static class MyThread extends Thread {
        String message = "inside MyThread ";

        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(message + i);
                Z28_ThreadJoin.sleep();
            }
        }
    }
}
