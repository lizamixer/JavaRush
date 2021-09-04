package JavaCore.level21;

public class MyFirstThread extends Thread {

    @Override
    public void run() {
        System.out.println("Выполнен поток " + getName());
    }


    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            MyFirstThread thread = new MyFirstThread();
            thread.start();
        }
        /*
         long start = System.currentTimeMillis();

        Thread.sleep(3000);

        System.out.println(" - Сколько я проспал? \n - " + ((System.currentTimeMillis()-start)) / 1000 + " секунды");
         */

    }

}