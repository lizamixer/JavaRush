package JavaCore.level20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Только по-очереди!
//1. В классе Solution создать public static класс нити Read3Strings унаследовавшись от Thread.
//2. В методе run реализовать чтение с консоли трех строк.
//3. Три подряд введенных строки должны считываться в одной нити и объединяться в одну строку через пробел.
//4. В методе main вывести результат для каждой нити.
//5. Используй join.
//Пример:
//Входные данные:
//a
//b
//c
//d
//e
//f
//Выходные данные:
//a b c
//d e f
//Requirements:
//1. Объяви в классе Solution public static класс Read3Strings.
//2. Класс Read3Strings должен быть унаследован от Thread.
//3. Метод run класса Read3Strings должен считывать три строки.
//4. Класс Read3Strings должен содержать публичный метод printResult.
//5. Метод printResult должен выводить в консоль 3 считанные строки, разделив их пробелами.
//6. Метод main должен вызывать методы start у созданных нитей.
//7. Метод main должен вызывать методы join у созданных нитей.
//8. Вывод программы должен отображать, что потоки считывали строки последовательно, а не параллельно.

public class Z31_JoinConsole {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        String d;

        public void run() {

            try {
                String a = reader.readLine();
                String b = reader.readLine();
                String c = reader.readLine();
                d = String.join(" ", a, b, c);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void printResult() {
            System.out.println(d);
        }
    }
}

/*
public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
}
 */