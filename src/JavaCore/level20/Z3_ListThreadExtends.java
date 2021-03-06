package JavaCore.level20;

import java.util.ArrayList;
import java.util.List;

//Список и нити
//В методе main добавить в статический объект list 5 нитей. Каждая нить должна быть новым объектом
//класса Thread, работающим со своим объектом класса SpecialThread.
//Requirements:
//1. В методе main создай 5 объектов типа SpecialThread.
//2. В методе main создай 5 объектов типа Thread.
//3. Добавь 5 разных нитей в список list.
//4. Каждая нить из списка list должна работать со своим объектом класса SpecialThread.
//5. Метод run класса SpecialThread должен выводить "it's a run method inside SpecialThread".

public class Z3_ListThreadExtends {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут

        for (int i = 0; i < 5; i++) {
            SpecialThread specialThread = new SpecialThread();
            Thread thread = new Thread(specialThread);
            list.add(thread);
            thread.run();
        }

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}

/*
public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
 */
