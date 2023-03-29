//В методе main вызывается метод add, который должен увеличить значение поля
// salary класса Solution на переданное значение, но при выводе
// поля salary получаем 0. Сделай так, чтобы программа работала правильно.


/* было
public class Z84iminaperemennix {
    public static int salary;

    public static void add(int increase) {
        int salary = Z84iminaperemennix.salary;
        salary += increase;
    }
    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}
 */

//стало
public class Z84 {
    public static int salary;

    public static void add(int increase) {
        int salary1 = Z84.salary;
        salary = salary1+ increase;
    }
    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}