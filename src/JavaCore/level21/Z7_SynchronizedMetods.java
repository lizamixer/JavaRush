package JavaCore.level21;

/*
Синхронизированные методы
Установить модификатор synchronized только тем методам, которым необходимо.
Объект класса Solution будет использоваться нитями.
 */

public class Z7_SynchronizedMetods {
    /*
       Синхронизировать нужно только методы изменяющие состояние объекта (или класса). Т.е. те, которые меняют поля.
       Все что не внутри методов класса обозначается полями класса, может быть изменено в любом
       методе. А значит это глобальная переменная.
        */
    private double param = Math.random();
    private StringBuilder sb = new StringBuilder();

    private void method0() {  //почему не нужно синхронизировать 0 метод? а зачем? если по
        // итогу все действия производит только 3й метод.
        Double d = method3();
    }

    protected void method1(String param1) {
        /*
        Каждый раз при вызове этого метода будет создаваться новы объект Solution . У каждого потока при кажом
        вызове будет создаваться СВОЙ НОВЫЙ ВНУТРЕННИЙ объект Solution .
        При завершении этого метода, этот НОВЫЙ  ВНУТРЕННИЙ объект   Solution solution будет выкинут в мусор. Т.к. на
        него нет внешних ссылок, а значит другие потоки не смогут изменить его состояние.
        метод 1 не меняет состояние у текущего объекта Solution (не путать с внутр Solution solution), к которому имеют
        доступ несколько потоков.
        метод solution.method0(); вызывается у ВНУТРЕННОГО  Solution solution который у каждого потока при каждом вызове
        метода 1 будет свой новый.
         */
        Z7_SynchronizedMetods solution = new Z7_SynchronizedMetods();
        solution.method0();
    }

    public void method2(int param1) { //метод2 принимает от каждой нити свою переменную и ее
        // изменяет. Данный метод не затрагивает (не изменяет) объекты других нитей.
        param1++;
    }

    synchronized double method3() {
        double random = Math.random();
        param += 40.7;
        return random + param;
    }

    private synchronized void method4() {
        sb.append(1).append(1).append(1).append(1);
    }

    protected void method5(String param2) {
        //поле объекта не меняет, а значит потокобезопасен.
        //При каждом вызове этого метода он возвращает НОВЫЙ объект StringBuffer
        new StringBuffer().append(param2).append(param2).append(param2);
    }

    public synchronized String method6(int param2) {
        System.out.println("Thinking....");
        method7(5e-2);
        sb = new StringBuilder("Got it!.");
        return sb.toString();
    }

    String method7(double param2) {
        return "" + param2;
    }

    public static void main(String[] args) {

    }

}
