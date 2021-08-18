package JavaCore.level20;

//Отдебажим все на свете
//Разобраться, что делает программа.
//Почитать про UncaughtExceptionHandler - это важно.
//Еще раз внимательно посмотреть программу.
//Разобраться - продебажить - почему наш OurUncaughtExceptionHandler не срабатывает.
//Исправить ошибку, т.е. все должно работать. :)
//Ожидаемый результат в произвольном порядке:
//Нить 1: My exception message
//Нить 2: My exception message
//Requirements:
//1. Метод main должен создавать нить с параметрами: commonThread и "Нить 1".
//2. Метод main должен создавать нить с параметрами: commonThread и "Нить 2".
//3. Метод main должен запускать две созданные нити типа Thread.
//4. Метод main должен прерывать две созданные нити типа Thread.
//5. Программа с помощью метода uncaughtException класса OurUncaughtExceptionHandler должна вывести 2 сообщения.
//6. Метод uncaughtException класса OurUncaughtExceptionHandler явно не вызывать.
//7. Вывод программы должен содержать строки: "Нить 1: My exception message" и "Нить 2: My exception message".

public class Z30_UncaughtExceptionHandler {
    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();

    public static void main(String[] args) {
        TestedThread commonThread = new TestedThread(handler);

        Thread threadA = new Thread(commonThread, "Нить 1");
        Thread threadB = new Thread(commonThread, "Нить 2");

        threadA.start();
        threadB.start();

        //threadA.setUncaughtExceptionHandler(handler);             задачу можно решить либо так
        //threadB.setUncaughtExceptionHandler(handler);

        threadA.interrupt();
        threadB.interrupt();
    }

    public static class TestedThread extends Thread {
        public TestedThread(Thread.UncaughtExceptionHandler handler) {
            setUncaughtExceptionHandler(handler);
            start();
        }

        public void run() {
            try {
                Thread.currentThread().setUncaughtExceptionHandler(handler); //либо так
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");
            }
        }
    }

    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }
    }
}
/*
Судя по методу main к объекту по ссылке commonThread не применяется метод interrupt(); А это значит, что
данная дочерняя нить, проспав 3 секунды спокойно завершается без всяких исключений. Давайте попробуем
прервать эту нить аналогично прерыванию нитей А и В, вызвав у этого объекта метод interrupt();
Получили сообщение:

Thread-0: My exception message

Не совсем то, что нужно, но теперь становится понятно, что обработчик работает согласно заданию.
При прерывании нити в которой запущен этот самый обработчик, сообщение выдается нужного формата.
Теперь посмотрим, что же не так с нитями А и В, ведь в отличии от нулевой нити, эти нити мы прерываем
сразу после старта и они явно не успевают доработать до конца.
Обратите внимание, что при объявлении переменных threadA и threadВ для их инициализации мы используем
конструкцию new Thread(). То есть мы создаем объекты относящиеся к классу Thread, а в конструкторах
данного класса отсутствует метод setUncaughtExceptionHandler(), значит и не происходит автоматической
 установки обработчика не перехваченных исключений.
То, что мы в качестве одного из параметров при создании новых нитей передаем в конструктор ссылку на
нить которая имеет этот обработчик, ничего нам не дает, ведь как я уже писал выше.
При вызове метода setUncaughtExceptionHandler() обработчик устанавливается у конкретного экземпляра
класса. Используя уже про инициализированную переменную в качестве параметра, мы указываем нити на
 то, что хотим использовать метод run() этой переменной.
И что же мы в итоге получаем? А в итоге получается, что есть 2 нити А и В которые используют метод
run() класса TestedThread. Которые стартуют и которые мы прерываем, но ни у одной из них
не вызван метод  setUncaughtExceptionHandler(), чтобы обработать исключение согласно заданному шаблону,
 находящемуся по ссылке переменной handler.
 */
